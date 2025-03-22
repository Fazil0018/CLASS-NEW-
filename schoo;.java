import java.util.Scanner;
class bile
{
  String mark(int n)
  {
    if(n<35)
    {
      return "fail";
    }else{
      return "pass";
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int n = sc.nextInt();

    bile obj = new bile();
    String result = obj.mark(n);
    System.out.println(result);
  }
}
