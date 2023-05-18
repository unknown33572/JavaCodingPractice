package string_number.ex04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class GatherFind {
  private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  public static Pair<Integer, Integer> countVowelsAndConsonants(String str) {
    str = str.toLowerCase();
    int vowels = 0;
    int consonants = 0;

    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);
      if(allVowels.contains(ch)) {
        vowels++;
      } else if((ch >= 'a' && ch <= 'z')) {
        consonants++;
      }
    }
    return Pair.of(vowels, consonants);
  }
}
