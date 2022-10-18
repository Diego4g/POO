package collections;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


public class LinkedListTest {
  private static final String colors[] = {"black","yellow", "green", "blue", "violet", "silver"};

  private static final String colors2[] = {"gold","white", "brown", "blue", "gray", "silver"};

  public LinkedListTest() {
    LinkedList<String> list1 = new LinkedList<>();
    List<String> list2 = new LinkedList<String>();

    for (String color: colors) {
      list1.add(color);
    }
    for (String color: colors2) {
      list2.add(color);
    }

    list1.addAll(list2);

    list2 = null;

    printList(list1);

    convertToUppercaseStrings(list1);

    printList(list1);

    System.out.print("\nDeleting elementos 4 to 7");

    removeItems(list1,4,7);

    printList(list1);

    printReversedList(list1);
  }

  public void printList(List<String> l) {
    System.out.println("\nlist: ");

    for( String i:l) {
      System.out.println(i +" ");
    }
    System.out.println();
  }

  private void convertToUppercaseStrings(List<String> list) {
    ListIterator<String> iterator = list.listIterator();

    while(iterator.hasNext()) {
      String color = iterator.next();
      iterator.set(color.toUpperCase());
    }
  }

  private void removeItems(List<String> list, int start, int end) {
    list.subList(start, end).clear();
  }

  private void printReversedList(List<String> list) {
    ListIterator<String> iterator = list.listIterator(list.size());
    System.out.println("\nReversed List: ");
    
    while(iterator.hasPrevious()) {
      System.out.println(iterator.previous());
    }
  }
}
