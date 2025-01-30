package elevator_lld;

public class ElevatorCar {
	private int id;
	private int currentFloor;
	private Direction direction;
	private ElevatorState state;
	private ElevatorController controller;
	private ElevatorDisplay display;
	private ElevatorDoor door;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	public ElevatorState getState() {
		return state;
	}

	public void setState(ElevatorState state) {
		this.state = state;
	}

	public ElevatorController getController() {
		return controller;
	}

	public void setController(ElevatorController controller) {
		this.controller = controller;
	}

	public ElevatorDisplay getDisplay() {
		return display;
	}

	public void setDisplay(ElevatorDisplay display) {
		this.display = display;
	}

	public ElevatorDoor getDoor() {
		return door;
	}

	public void setDoor(ElevatorDoor door) {
		this.door = door;
	}

	public ElevatorCar(int id, ElevatorController controller) {
		this.id = id;
		this.currentFloor = 0;
		this.direction = Direction.IDLE;
		this.state = ElevatorState.IDLE;
		this.controller = controller;
		this.display = new ElevatorDisplay();
		this.door = new ElevatorDoor();
	}

	public void move(int destination) {
		door.closeDoor();
		if (destination > currentFloor) {
			direction = Direction.UP;
		} else {
			direction = Direction.DOWN;
		}
		state = ElevatorState.MOVING;
		System.out.println("Elevator " + id + " moving to floor " + destination);
		currentFloor = destination;
		state = ElevatorState.IDLE;
		direction = Direction.IDLE;
		door.openDoor();
	}
}
