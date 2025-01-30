package elevator_lld;

import java.util.PriorityQueue;

public class ElevatorController {
    private PriorityQueue<Integer> upQueue;
    private PriorityQueue<Integer> downQueue;
    private ElevatorCar elevator;

    public ElevatorController(ElevatorCar elevator) {
        this.elevator = elevator;
        this.upQueue = new PriorityQueue<>();
        this.downQueue = new PriorityQueue(Collections.reverseOrder()));
    }

    public void requestFloor(int floor) {
        if (floor > elevator.getCurrentFloor()) {
            upQueue.add(floor);
        } else {
            downQueue.add(floor);
        }
        processNextRequest();
    }

    private void processNextRequest() {
        if (!upQueue.isEmpty()) {
            elevator.move(upQueue.poll());
        } else if (!downQueue.isEmpty()) {
            elevator.move(downQueue.poll());
        }
    }
}