import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input number of rows of matrix:");
        int numOfRows=sc.nextInt();
        System.out.print("Input number of columns of matrix:");
        int numOfColumns=sc.nextInt();
        int[][] mat1=new int[numOfRows][numOfColumns], mat2=new int[numOfRows][numOfColumns];
        System.out.print("Input the elements of first matrix:");
        for(int i=0;i<numOfRows;i++)
            for(int j=0;j<numOfColumns;j++)
                mat1[i][j]=sc.nextInt();
        System.out.print("Input the elements of second matrix:");
        for(int i=0;i<numOfRows;i++)
            for(int j=0;j<numOfColumns;j++)
                mat2[i][j]=sc.nextInt();
        System.out.println("Sum of the matrices:-");
        for(int i=0;i<numOfRows;i++) {
            for (int j = 0; j < numOfColumns; j++)
                System.out.print("\t"+(mat1[i][j]+mat2[i][j]));
            System.out.println();
        }

    }
}
