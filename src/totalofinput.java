import java.util.Scanner;
public class totalofinput {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers to be summed");
        n = input.nextInt();


        while (input.hasNext()) {
            if (input.hasNextInt()) {
                n=input.nextInt();
                sum = sum + n;
            }
            else
            {
                break;
            }
        }
        System.out.println(sum);
    }
}
