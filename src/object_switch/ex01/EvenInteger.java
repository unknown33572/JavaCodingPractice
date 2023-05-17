package object_switch.ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenInteger {
  public static List<Integer> evenInteger(List<Integer> integers) {
    if(integers == null) {
      return Collections.EMPTY_LIST;
    }

    List<Integer> evens = new ArrayList<>();
    for(Integer integer : integers) {
      if(integer != null && integer % 2 == 0) {
        evens.add(integer);
      }
    }
    return evens;
  }
}
