
import java.util.TreeSet;

public class TestTSVehicle {
  public static void main(String[] args) {
      //TreeSet<Vehicle> ts = new TreeSet<Vehicle>(new SortByPrice());
      TreeSet<Vehicle> ts = new TreeSet<Vehicle>(new SortByBrand());
      ts.add(new Vehicle(1, "2", "TVS-Bike", 95000));
      ts.add(new Vehicle(2, "2", "Bajaj-pulser", 95000));
      ts.add(new Vehicle(3, "2", "KTM", 115000));
      ts.add(new Vehicle(4, "2", "Honda Activa", 90000));
      ts.add(new Vehicle(5, "4", "Mahindra-Scorpip", 900000));
      ts.add(new Vehicle(6, "4", "I20", 900000));
      ts.add(new Vehicle(7, "4", "Maruti-Swift", 950000));

     for(Vehicle v : ts)
          System.out.println(v.getId()+" "+v.getType()+" "+v.getBrand()+" "+v.getPrice());
  }
    
}
