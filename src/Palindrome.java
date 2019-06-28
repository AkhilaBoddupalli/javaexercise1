import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        number = input.nextInt();
        palindrome obj = new palindrome();
        obj.palindromenumber(number);
    }

    public void palindromenumber(int number) {
        int n1, sum = 0, temp, rem, rem2, sum2 = 0;
        n1 = number;

        while (n1 != 0) {
            rem = n1 % 10;
            sum = (sum * 10) + rem;
            n1 = n1 / 10;
        }
            if (sum == number) {
                while (n1 > 0) {
                    rem2 = n1 % 10;
                    if (rem2 % 2 == 0) {

                        sum2 = sum2 + rem2;
                    }

                    n1 = n1 / 10;
                }
                if(sum2<25)
                {
                    System.out.println("is a palindrome with sum of even numbers less than 25" );
                }
                else
                {
                    System.out.println("is a palindrome with sum of even numbers greater than 25" );
                }


        }else
                System.out.println( "is not a palindrome");

    }
}






