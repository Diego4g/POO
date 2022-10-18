package collections;

import java.util.Vector;
import java.util.NoSuchElementException;

public class VectorTest {
  private static final String colors[] = {"red", "white", "blue"};
  
  public VectorTest() {
    Vector<String> vector = new Vector<>();
    printVector(vector);
    
    for (String color: colors) {
      vector.add(color);
    }
    
    printVector(vector);

    try {
      System.out.printf("First element: %s\n", vector.firstElement());
      System.out.printf("Last element: %s\n", vector.lastElement());
    } 
    catch(NoSuchElementException e) {
      e.printStackTrace();
    }

    if(vector.contains("red")) {
      System.out.printf("\n red found at index %d\n", vector.indexOf("red"));
    }
    else {
      System.out.printf("\n red not found\n");
    }

    vector.remove("red");

    System.out.println("Red has been removed");

    if(vector.contains("red")) {
      System.out.printf("\n red found at index %d\n", vector.indexOf("red"));
    }
    else {
      System.out.printf("\n red not found\n");
    }

  }

  private void printVector(Vector<String> vectorToOutput) {
    if(vectorToOutput.isEmpty()) {
      System.out.println("Vector is empty");
    }
    else {
      System.out.println("Vector contains: ");

      for(String i: vectorToOutput) {
        System.out.println(i);
      }
    }
    System.out.println();
  }


}
