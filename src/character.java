import java.util.Scanner;
public class character
{
    public static void main(String[] args)
    {
        char ch;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a character");
        ch=input.next().charAt(0);
        character c=new character();
        c.charactercheck(ch);

    }
    public void charactercheck(char ch)
    {

                if((ch>=65)&&(ch<=90)) {
                    System.out.println("Capital");

                }
                else if((ch>=97)&& (ch<=122)) {
                    System.out.println("Small");

                }
                else if((ch>=48)&&(ch<=57)) {
                    System.out.println("Digits");
                }
               else {

                    System.out.println("Special Characters");
                }

        }
    }


