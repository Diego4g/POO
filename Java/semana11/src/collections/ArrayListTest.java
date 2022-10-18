package collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListTest {
  private static final String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};  
  private static final String[] removeColors = {"RED", "WHITE", "BLUE"};
  
  public ArrayListTest() {
    List<String> list = new ArrayList<String>();
    List<String> removeList = new ArrayList<String>();

    for (String color: colors)
      list.add(color);
    
    
    for (String color: removeColors)
      removeList.add(color);
    
    System.out.println("ArrayList: ");

    for(int count = 0; count < list.size(); count++) {
      System.out.println(list.get(count));
    }
    
    removeColorMethod(list, removeList);
    
    System.out.println("\nArrayList after calling removeColors: ");
    for(int count = 0; count < list.size(); count++) {
      System.out.println(list.get(count));
    }
  }

  public void removeColorMethod(Collection<String> c1, Collection<String>c2) {
    Iterator<String> iterator = c1.iterator();

    while(iterator.hasNext()) {
      if(c2.contains(iterator.next()))
        iterator.remove();
    }
  }

  public Iterator<String> teste(Collection<String>list){

    Iterator<String> i = list.iterator() ;

    return i;
  }
}
