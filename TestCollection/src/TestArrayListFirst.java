
import java.util.ArrayList;

public class TestArrayListFirst {
  public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      al.add(10);
      al.add(10);
      al.add(20);
      al.add(30);
      System.out.println(al);
      System.out.println("Sizee : "+al.size());
      al.add(4, 1000);
      /*
        public void add(int index, Integer value){
           if(index > this.size())
             throw new IndexOutOfBoundsException();
           else
             // Add Logic
        }
      */
      System.out.println(al);
      
  }
    
}
