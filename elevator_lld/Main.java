package elevator_lld;

import java.util.Arrays;
import java.util.List;

//Main execution
public class Main {
 public static void main(String[] args) {
     ElevatorCar car1 = new ElevatorCar(1, new ElevatorController(null));
     ElevatorCar car2 = new ElevatorCar(2, new ElevatorController(null));
     List<ElevatorController> controllers = Arrays.asList(new ElevatorController(car1), new ElevatorController(car2));

     ExternalDispatcher dispatcher = new ExternalDispatcher(controllers);
     dispatcher.submitRequest(3, Direction.UP);
     dispatcher.submitRequest(7, Direction.DOWN);
 }
}