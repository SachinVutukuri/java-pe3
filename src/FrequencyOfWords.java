import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfWords {
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name:");
        String fName=sc.next();
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(fName)));
        String str=reader.readLine(),total="";
        while(str!=null) {
            total=total+" "+str;
            str=reader.readLine();
        }
        System.out.println(total);
        String[] s=total.split("[^a-zA-Z]");
        int[] count = new int[s.length];
        Arrays.fill(count, 1);
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0)
                for (int j = i + 1; j < count.length; j++) {
                    if (count[j] != 0 && s[i].equals(s[j])) {
                        count[i]++;
                        count[j]--;
                    }
                }
        }
        for (int i = 0; i < count.length; i++)
            if (count[i] != 0 && !s[i].equals(""))
                System.out.println(s[i] + "->" + count[i] + " time");
    }
}
