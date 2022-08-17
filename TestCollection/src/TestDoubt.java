interface I{

}
class A implements I{
    
}
class B{
  public void m1(I obj){
      System.out.println("m1-called...");
  }
  public I m2(){
      return new A();
  }
}
public class TestDoubt {
    public static void main(String[] args) {
        B obj = new B();
        //obj.m1(null);
        obj.m1(new A());
    }
}
