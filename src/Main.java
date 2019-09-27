import java.io.IOException;
import java.util.Scanner;

class StudentMarks {

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int numOfStudents=sc.nextInt();
        int[] stuGrades=new int[numOfStudents];
        System.out.print("Enter grades of students:");
        int i;
        for(i=0;i<numOfStudents;i++)
            stuGrades[i]=sc.nextInt();
        try {
            for(i=0;i<numOfStudents;i++) {
                if (stuGrades[i] < 0 || stuGrades[i] > 100)
                    throw new Exception();
            }
        }
        catch(Exception e)
        {
            System.out.println("Grade incorrect for student"+(i+1));
        }
    }
}
