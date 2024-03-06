import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[]args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please choose a number from 1 to 4: ");
        int Input=Integer.parseInt(br.readLine());
        /*String mobileName=switch (Input){
            case 1->"Apple";
            case 2->"Samsung";
            case 3->{
                System.out.println("There are a few Chinese mobile, however");
                System.out.println("They are not good, nevertheless");
                yield "Xiomi";
            }
            case 4->"Google Pixel";
            default -> "Please choose option from 1-4";
        };
        System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: "+mobileName);*/
        if(Input==1){
            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Apple");
        }
        else if (Input==2){
            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Samsung");
        }
        else if (Input==3){
            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Xiomi");
        }
        else if (Input==4){
            System.out.println("Option you chose is: "+Input +"\t"+"Mobile is: Google Pixel");
        }
        else System.out.println("Please choose option from 1-4");
    }
}
