import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args)
    {
        int n;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter a number");
       n=input.nextInt();
       GuessNumber obj=new GuessNumber();
       obj.guess(n);
    }
    public void guess(int n)

    {
        int target=25;
        if(n<target)
        {
            System.out.println("Number guessed is less than the original number");
        }
        else if(n>target)
        {
            System.out.println("Number guessed is more than the target");
        }
        else
        {
            System.out.println("Number guessed mattches the original number");
        }

    }
}
