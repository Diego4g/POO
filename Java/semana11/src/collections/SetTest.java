package collections;

import java.util.*;

public class SetTest {
  
  private static final String colors[] = {"black","yellow", "green", "blue", "violet", "silver","green", "black"};

  public SetTest() {
    List<String> list = Arrays.asList(colors);

    System.out.printf("ArrayLits: %s\n", list);
    printNonDuplicates(list);
  }

  private void printNonDuplicates(Collection<String> c) {
    Set<String> set = new HashSet<>(c);

    System.out.println("\nNonduplicates are: ");

    for(String s: set) {
      System.out.printf("%s ", s);
    }

    System.out.println();
  }
}
