package monotonicstack.carFleet;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStack {

  public int carFleet(int target, int[] position, int[] speed) {

    int n = position.length;
    Car[] cars = new Car[n];

    for (int i = 0; i < n; i++) {
      cars[i] = new Car(position[i], (double)(target - position[i]) / speed[i]);
    }

    Arrays.sort(cars, (a, b) -> b.pos - a.pos); // sort by position descending

    Stack<Double> stack = new Stack<>();
    for (Car car : cars) {
      if (stack.isEmpty() || car.time > stack.peek()) {
        stack.push(car.time); // new fleet
      }
      // else: merges into fleet ahead
    }

    return stack.size();
  }
  static class Car {
    int pos;
    double time;
    Car(int p, double t) {
      pos = p;
      time = t;
    }
  }

}
