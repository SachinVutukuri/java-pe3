import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter file name:");
        String fName=sc.next();
//        File path=new File(fName);
//        System.out.println(path.getAbsolutePath());
//        System.out.print((path));
        BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(fName)));
        int x=reader.read(),count=0;
        while(x!=-1)
        {
            if(x>=97 && x<=122)
                System.out.print((char)(x-32));
            else
                System.out.print((char)x);
            x=reader.read();
            count++;
        }
        System.out.print("Length of the file:"+count);

        reader.close();

    }
}
