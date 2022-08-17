
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
  public static void main(String[] args) {
      LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
      lhs.add(10);
      lhs.add(50);
      lhs.add(60);
      lhs.add(90);
      lhs.add(50);
      for(Integer element : lhs)
          System.out.println(element);
  }
    
}
