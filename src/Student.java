import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the grade of the student in A,B,C and D ");
        char Input=(char) br.read();
        String studentGrade=switch (Input){
            case 'A'->"Excellent";
            case 'B'->"Well Done";
            case 'C'->"Just Passed";
            case 'D'->"Take exam and Try again";
            default -> "Sorry! No result";
        };
        System.out.println("Grade of the student is: "+Input +"\t"+" and can say: "+studentGrade);
//        if(Input==1){
//            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Apple");
//        }
//        else if (Input==2){
//            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Samsung");
//        }
//        else if (Input==3){
//            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Xiomi");
//        }
//        else if (Input==4){
//            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Google Pixel");
//        }
//        else System.out.println("Please choose option from 1-4");
    }
}
