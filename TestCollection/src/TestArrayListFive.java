
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayListFive {
  public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();
      
      al.add(10); // 0
      al.add(10); // 1
      al.add(50);
      al.add(60);
      al.add(30);
      al.add(40);
      Collections.sort(al);
      ListIterator<Integer> lit = al.listIterator();
      
      while(lit.hasNext()){
          System.out.println(lit.next());
      }
      
      /*
      ListIterator<Integer> lit = al.listIterator(al.size());
      while(lit.hasPrevious()){
          int element = lit.previous();
          System.out.println(element);
      }
      */
      /*
      ListIterator<Integer> lit = al.listIterator(2);
      
      while(lit.hasNext()){
          System.out.println(lit.next());
      }
     */
      
//      Iterator<Integer> itr = al.iterator();
//      while(itr.hasNext()){
//          int element = itr.next();
//          
//          if(element == 60)
//              itr.remove();
//          
//          System.out.println(element);
//      }
//      System.out.println(al);
  }
}
