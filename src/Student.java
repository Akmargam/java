import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[]args) throws IOException {
//        String stuName,stuAddress,stuGender;
//        int stuId,stuAge;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Student name:");
        String stuName= br.readLine();

        System.out.println("Enter Student ID:");
        int stuId= Integer.parseInt(br.readLine());

        System.out.println("Enter Student age:");
        int stuAge= Integer.parseInt(br.readLine());

        System.out.println("Enter Student Address:");
        String stuAddress= br.readLine();

        System.out.println("Enter Student Gender:");
        String stuGender= br.readLine();

        System.out.println("Name of the student is: "+stuName);
        System.out.println("ID of the student is: "+stuId);
        System.out.println("Age of the student is: "+stuAge);
        System.out.println("Address of the student is: "+stuAddress);
        System.out.println("Gender of the student is: "+stuGender);

    }
}
