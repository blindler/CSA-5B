import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
// Note you are going to be editing the SpellChecker.java file
class SpellChecker_runner {
  public static void main(String[] args) {
    SpellChecker checker = new SpellChecker();
    checker.print10();
    checker.printStartsWith("abash");
    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      if (checker.spellcheck(word) == true)
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
    scan.close();
  }
}
class SpellChecker {
  private String[] dictionary;

  // WRITE Your Methods HERE!

  // Complete the print10 method from Unit 6.2
  public void print10() {
      for ( int i = 0; i < 10; i++){
        System.out.println(dictionary[i]);
      }
  }

  // Complete the printStartsWith() method from Unit 6.2
  public void printStartsWith(String str) {
    for (String word:dictionary) {
         if (word.indexOf(str)==0)
           System.out.println(word);
    }
  }

  public boolean spellcheck(String check) {

    for (String word:dictionary) {
      if (word.equals(check)) return true;

    }
    return false;
  }

  public SpellChecker() {
    try {
      dictionary = readLines("dictionary.txt");
    } catch (IOException e) {
      // Print out the exception that occurred
      System.out.println("Unable to access " + e.getMessage());
    }

  }

  public static String[] readLines(String filename) throws IOException {
    FileReader fileReader = new FileReader(filename);

    BufferedReader bufferedReader = new BufferedReader(fileReader);
    List<String> lines = new ArrayList<String>();
    String line = null;

    while ((line = bufferedReader.readLine()) != null) {
      lines.add(line);
    }

    bufferedReader.close();

    return lines.toArray(new String[lines.size()]);
  }


}