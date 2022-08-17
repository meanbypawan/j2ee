
import java.util.Enumeration;
import java.util.Vector;

public class TestVector {
  public static void main(String[] args) {
      Vector<Integer> v = new Vector<Integer>(5, 3);
      v.add(10);
      v.add(50);
      v.add(80);
      v.add(40);
      Enumeration<Integer> e = v.elements();
      while(e.hasMoreElements()){
          System.out.println(e.nextElement());
      }
      /*
      for(int element : v)
          System.out.println(element);
      */
   }
    
}
