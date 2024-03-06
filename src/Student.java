import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the grade of the student in A,B,C and D ");
        char Input=(char) br.read();
        if(Input=='A'){
            System.out.println("Grade of the student is: "+Input +"\t"+" and can say Excellent ");
        }
        else if (Input=='B'){
            System.out.println("Grade of the student is: "+Input +"\t"+" and can say Well Done ");
        }
        else if (Input=='C'){
            System.out.println("Grade of the student is: "+Input +"\t"+" and can say Just Passed ");
        }
        else if (Input=='D'){
            System.out.println("Grade of the student is: "+Input +"\t"+" and can say Take exam and Try again");
        }
        else System.out.println("Please choose from option A,B,C and D");
    }
}
