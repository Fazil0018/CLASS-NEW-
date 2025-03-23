import java.util;
class bile
{
  void car(int a)
  {
    System.out.println("enter first valu");
    System.out.println(a);
  }
  void car(int a,int b)
  {
    System.out.println("enter secord valu");
    System.out.println(a+b);
  }
  void car(int a,int b,int c)
  {System.out.println("enter third valu");
    System.out.println(a+b+c);
  }
  public static void main(String[] args)
  {
   bile sc = new bile();
   sc.car(10);
   sc.car(10+20);
   sc.car(10+20+30);  
  }

}
