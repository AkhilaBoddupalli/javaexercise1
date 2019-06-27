import java.util.Scanner;
public class Tom {
    public static void main(String[] args)
    {
        int number;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        number=input.nextInt();
        Tom obj=new Tom();
        obj.Jerry(number);

    }
    public void Jerry(int number)
    {
        if((number>=20 )&& (number<=30))
        {
            if(number%2==0)
            {
                System.out.println("Jerry");
            }
            else
            {
                System.out.println("Tom");
            }
        }
        else
        {
            System.out.println("error");
        }
    }
}
