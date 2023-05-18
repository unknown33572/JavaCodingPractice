package string_number.ex04;

public class Main {
  public static void main(String[] args) {
    Pair pair = GatherFind.countVowelsAndConsonants("total");
    System.out.println("모음수: "+pair.vowels);
    System.out.println("자음수: "+pair.consonants);
  }
}
