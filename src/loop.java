import java.util.Scanner;
public class loop
{
    public static void main(String[] args)
    {
        int number,i,j;
      Scanner input=new Scanner(System.in);
      System.out.println("input");
      number=input.nextInt();
      for(i=1;i<=number;i++)
      {
         for(j=1;j<=i;j++)
         {
             System.out.println(i);
         }
      }
    }
}
