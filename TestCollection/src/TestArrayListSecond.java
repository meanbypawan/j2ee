
import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayListSecond {
  public static void main(String[] args) {
      ArrayList<Integer> al = new ArrayList<>();
      
      al.add(10);
      al.add(20);
      al.add(50);
      al.add(40);
      al.add(30);
      
      Integer obj = al.set(2, 1000);
      System.out.println(obj);
      System.out.println(al);
      /*
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter A Number");
      int element = sc.nextInt();
      
      if(al.contains(element))
          System.out.println("Element Found");
      else
          System.out.println("Element Not Found");
      */
}
    
}




