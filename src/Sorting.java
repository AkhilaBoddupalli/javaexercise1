import java.util.Scanner;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        num = input.nextInt();
        Sorting sortobj = new Sorting();
        sortobj.sortingdesc(num);
    }

    public void sortingdesc(int num) {

        int count=0, sum = 0, i, j,n=num;
        int arr[]=new int[40];

        int temp=0;
        while (num > 0) {
            arr[count] = num % 10;
            count++;
            num=num/10;
        }

        for (i = 0; i < count; i++) {
            for (j = i + 1; j < count; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];

                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        int res=0;
        for (i = 0; i < count; i++) {
            res = (res * 10) + arr[i];
        }
           System.out.println(res);
        for(i=0;i<count;i++)
        {
           if(arr[i]%2==0)
           {
               sum=sum+arr[i];

           }
        }
        System.out.println(sum);
        if(sum>15)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

    }
}
