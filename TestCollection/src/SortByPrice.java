
import java.util.Comparator;

public class SortByPrice implements Comparator<Vehicle>{

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
       int x =  o1.getPrice() - o2.getPrice();
       if(x==0)
            return 1;
       return x;
    }
    
}
