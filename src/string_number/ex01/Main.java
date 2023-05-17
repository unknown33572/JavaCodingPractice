package string_number.ex01;

import java.util.Map;

public class Main {
  public static void main(String[] args) {
//    String str = "aabbccdd";
//    Map<Character, Integer> duplicatesOne = Ex01.countDuplicateCharacters(str);
//    System.out.println(duplicatesOne);

    String str = "aabbccdd";
    Map<Character, Long> duplicatesTwo = StringsTwo.countDuplicateCharacters(str);
    System.out.println(duplicatesTwo);
  }
}
