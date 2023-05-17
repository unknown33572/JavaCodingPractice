package string_number.ex01;

import java.util.Map;
import java.util.stream.Collectors;

public class StringsTwo {
  public static Map<Character, Long> countDuplicateCharacters(String str) {
    Map<Character, Long> result = str.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c, Collectors.counting()));
  return result;
  }
}
