public class Test01 {

    int val1 = 10;
    int val2 = 20;
  
  void func(int val1, int val2)
  {
    this.val1=20;
    this.val2=10;
  }
  
  public static void main(String[] args) {
  
    Test01 t = new Test01();
    System.out.println("결과: "+t.val1+"  "+t.val2);
  
    t.func(t.val1, t.val2);
    System.out.println("결과: "+t.val1+"  "+t.val2);
  
  }
  }
  