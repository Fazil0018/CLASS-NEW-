import java.util;
class bile
{
  void sum(int num1,int num2)
  {
    System.out.println(num1+num2);
  }
  void sub(int num1,int num2)
  {
    System.out.println(num1-num2);
  }
  void mul(int num1,int num2)
  {
    System.out.println(num1*num2);
  }
  void div(int num1,int num2)
  {
    System.out.println(num1/num2);
  }
  public static void main(String[] args)
  {
    bile sc = new bile();
    sc.sum(100,20);
    sc.sub(100,20);
    sc.mul(100,20);
    sc.div(100,20); 
  }
}
