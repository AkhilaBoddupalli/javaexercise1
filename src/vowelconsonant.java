import java.util.Scanner;
public class vowelconsonant {
    public static void main(String[] args)
    {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a string");
        String letter=input.nextLine();

        vowelconsonant obj=new vowelconsonant();
        obj.check(letter);
    }
            public void check(String letter)
    {
        int i;
        String str=" ";

        for(i=0;i<=letter.length();i++)
        {
            char[] ch=letter.toCharArray();
            if(ch[i]=='a' || ch[i]=='e'||ch[i]=='i' ||ch[i]=='o'||ch[i]=='u' ||
                    ch[i]=='A' || ch[i]=='E' || ch[i]=='O' || ch[i]=='U')
            {
               System.out.println(ch[i]+" "+"-"+" "+"vowel");
            }
            else
            {
                System.out.println(ch[i]+ " " + "-" + " " + "consonants");
            }
        }
    }
}
