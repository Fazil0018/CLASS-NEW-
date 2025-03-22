import java.util.Scanner;
class bile
{
  void evenorodd(int a)
  {
    if(a%2==0)
    {
      System.out.println("even");
    }else{
      System.out.println("odd");
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number :");
    int a =sc.nextInt();
    
    bile obj =new bile();
    obj.evenorodd(a);
  }
}
