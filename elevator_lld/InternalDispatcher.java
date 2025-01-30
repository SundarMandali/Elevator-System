package elevator_lld;

class InternalDispatcher implements Dispatcher {
    private ElevatorController controller;

    public InternalDispatcher(ElevatorController controller) {
        this.controller = controller;
    }

    public void submitRequest(int floor, Direction direction) {
        controller.requestFloor(floor);
    }
}