
import java.util.LinkedHashSet;

public class TestLHSThree {
  public static void main(String[] args) {
      LinkedHashSet<Customer> lhs = new LinkedHashSet<Customer>();
      lhs.add(new Customer(1, "Cheeku", 97000));
      // hashCode()
      // equlas() - when hashCode is duplicate
      lhs.add(new Customer(2, "Peeku", 95000));
      lhs.add(new Customer(3, "Ishu", 65000));
      lhs.add(new Customer(4, "Dishu", 100000));
      lhs.add(new Customer(5, "Vaasu", 87000));
      lhs.add(new Customer(1, "Atul", 97000));
      for(Customer c : lhs)
          System.out.println(c.getId()+" "+c.getName()+" "+c.getSalary());
}
    
}
