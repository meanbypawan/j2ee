
import java.util.HashSet;

public class TestHashSet {
  public static void main(String[] args) {
      HashSet<Integer> hs = new HashSet<Integer>();
      hs.add(100);
      hs.add(50);
      hs.add(70);
      hs.add(90);
      hs.add(70);
      for(int element : hs)
          System.out.println(element);
}
    
}
