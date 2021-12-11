class MyMath3{

    int add(int a, int b) {
      System.out.print("int add(int a, int b)-");
      return a+b;
    }
    
    double add(int a, double b) {
      System.out.print("double add(int a, double b)-");
      return a+b;
    }
    double add(double a, int b) {
      System.out.print("double add(long a, double b)-");
      return a+b;
    }
    
    

    double add(double a, double b) {
        System.out.print("double add(long a, double b)-");
        return a+b;
      }
      
      int add(int [] a) {
        System.out.print("int add(int[] a)-");
        int result =0;
        for(int i=0;i<a.length;i++) {
        result += a[i];
        }
        return result;
      }
      }
      
      
      public class OverloadingTest {
      
      public static void main(String[] args) {
        MyMath3 mm = new MyMath3();
      
        System.out.println("mm.add(int,int) 결과:"+mm.add(3,3));
        System.out.println("mm.add(Double,int) 결과:"+mm.add(3.2,3));
        System.out.println("mm.add(int,Double) 결과:"+mm.add(3,3.3));
        System.out.println("mm.add(Double,Double) 결  과:"+mm.add(3.5,3.4));
      
        int[] a = {100,200,300};
        System.out.println("mm.add(a) 결과:"+mm.add(a));
      }
      }
      