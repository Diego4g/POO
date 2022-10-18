package usingArrays;

import java.util.Arrays;

public class UsingArrays {

  private int intArray[] = {1,2,3,4,5,6};
  private double doubleArray[] = { 8.4 , 9.3 , 0.2 , 7.9 , 3.4 };
  private int filledIntArray[],intArrayCopy[];

  public UsingArrays() {
    filledIntArray = new int[10];
    intArrayCopy = new int[intArray.length];

    Arrays.fill(filledIntArray,7); // prenche com 7s
    Arrays.sort(doubleArray); // ordena crescentemente

    System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
  }

  public void printArrays() {
    System.out.print("doubleArray: ");
    
    for(double doubleValue: doubleArray)
      System.out.println(doubleValue);
      
    System.out.print("\nintArray: ");

    for(int intValue: intArray)
      System.out.println(intValue);

    System.out.print("\nfilledIntArray(usando toString do 'Arrays'): ");
    System.out.println(Arrays.toString(filledIntArray));

    System.out.print("\nintArrayCopy: ");


    for(int intValue: intArrayCopy)
      System.out.println(intValue);

    System.out.println("\n");
  }

  public int searchForInt(int value) {
    return Arrays.binarySearch(intArray, value);
  }

  public void printEquality() {
    boolean b = Arrays.equals(intArray, intArrayCopy);
    System.out.printf("intArray %s filledIntArray\n", (b ? "==": "!="));
  }

}