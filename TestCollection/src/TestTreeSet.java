
import java.util.TreeSet;


public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("D"));
        ts.add(new StringBuffer("E"));
        ts.add(new StringBuffer("C"));
        ts.add(new StringBuffer("G"));
        ts.add(new StringBuffer("G"));
        for(StringBuffer element : ts)
            System.out.println(element);
    }
    
}
