
import java.util.ArrayList;

public class TestArrayListThird {
  public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();
      al.add(5);
      al.add(3);
      al.add(2);
      al.add(6);
      al.add(1);
      System.out.println(al);
      
      //al.remove(1);
      al.remove(new Integer(1));
      System.out.println(al);
      // remove(Object)
      // remove(int)
  }
    
}
