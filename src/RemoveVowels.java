import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of places:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the names of places line by line");
        String[] str=new String[n];
        for (int i=0; i<n; i++)
        {
            str[i]=sc.nextLine();
        }
        for (int i=0; i<n; i++)
        {
            System.out.println("Place Name without Vowels:"+i+" "+str[i].replaceAll("[aeiou]",""));
        }

    }
}
