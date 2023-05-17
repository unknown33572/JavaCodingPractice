package string_number.ex01;

import java.util.HashMap;
import java.util.Map;

public class StringsOne {
  public static Map<Character, Integer> countDuplicateCharacters(String str) {
    Map<Character, Integer> result = new HashMap<>();

    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);
      result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
    }
    return result;
  }
}
