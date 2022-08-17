public class Customer {
  private int id;
  private String name;
  private double salary;

    public Customer(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode()-called.....");
        return id; //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public boolean equals(Object obj) {
        Customer c = (Customer)obj;
        return (this.getId() == c.getId()) && (this.getName().equals(c.getName()));
    }
//
//    @Override
//    public String toString() {
//        System.out.println("called.......");
//        return this.getClass().getName()+"@"+this.hashCode(); //To change body of generated methods, choose Tools | Templates.
//    }

    
   
}
