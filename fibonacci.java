import java.util.Scanner;
public class fibonacci
{
  public static void main(String[] args)
  {
  Scanner input = new Scanner(System.in);
    int a,b,c,e;
    a=0;
    b=1;
    System.out.print("masukkan jumlah nilai : ");
    c=input.nextInt();
    for(int d=3; d<=c; d++)
    {
      e=a+b;
      a=b;
      b=e;
      System.out.println(e);
    }
  }
}
