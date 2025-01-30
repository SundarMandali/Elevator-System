package elevator_lld;

import java.util.List;

//Dispatchers
public class ExternalDispatcher implements Dispatcher {
 private List<ElevatorController> controllers;

 public ExternalDispatcher(List<ElevatorController> controllers) {
     this.controllers = controllers;
 }

 public void submitRequest(int floor, Direction direction) {
	 ElevatorController bestElevator = controllers.get(0); // Simple assignment logic
	 bestElevator.requestFloor(floor);
 }
}

