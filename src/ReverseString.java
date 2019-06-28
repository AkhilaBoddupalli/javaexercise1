import java.util.Scanner;
public class Reverse {
    public static void main(String[] args)
    {
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        str=input.nextLine();
        Reverse obj=new Reverse();
        obj.reversestring(str);

    }
    public void reversestring(String str)
    {
        int i;
        String reverse = "";
        int length = str.length();
        for (i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);


        }
        System.out.println(reverse);
    }
}
