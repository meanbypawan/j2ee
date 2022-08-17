
import java.util.LinkedHashSet;

public class TestLinkedHashSetTwo {
  public static void main(String[] args) {
      LinkedHashSet<StringBuffer> lhs = new LinkedHashSet<StringBuffer>();
      
      lhs.add(new StringBuffer("A"));
      lhs.add(new StringBuffer("C"));
      lhs.add(new StringBuffer("D"));
      lhs.add(new StringBuffer("B"));
      lhs.add(new StringBuffer("A"));
      
      for(StringBuffer element : lhs)
          System.out.println(element);
  }
    
}
