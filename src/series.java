import java.util.Scanner;

public class series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] s=str.split(",");
        int[] nos=new int[s.length];
        int i=0,j=0;
        for(String ex:s)
            nos[i++]=Integer.parseInt(ex);
        int temp=nos[1]-nos[0];
        if(temp==1 || temp==-1)
            for(j=1;j<i-1;j++)
                if(temp != nos[j+1]-nos[j])
                    break;
        if(j==i-1)
            System.out.print(str+" are consecutive numbers");
        else
            System.out.print(str+" are non consecutive numbers");

    }
}
