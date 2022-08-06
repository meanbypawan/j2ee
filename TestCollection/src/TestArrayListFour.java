
import java.util.ArrayList;

public class TestArrayListFour {
  public static void main(String[] args) {
      ArrayList<String> al = new ArrayList<String>();
      
      al.add("Cheeku");
      al.add("A");
      al.add("B");
     
      ArrayList<String> al2 = new ArrayList<String>();
      al2.add("Cheeku");
      al2.add("C");
      al2.add("D");
      
      ArrayList<String> al3 = new ArrayList<String>();
      al3.add("Cheeku");
      al3.add("E");
      al3.add("F");
      
      al.addAll(al2);
      al.addAll(al3);
      System.out.println(al);
      
      //al.removeAll(al2);
      al.retainAll(al2);
      System.out.println(al);
      /* 
      al.add("Cheeku");
      al.remove("Cheeku");
      System.out.println(al);
      */
}
    
}
