import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Student {
    public static void main(String[]args) throws IOException, IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num1=0;
        int num2=1;
        System.out.println("How many Fibonocci numbers to generate:");
        int num3=Integer.parseInt(br.readLine());
        int num4=num1+num2;
        while(num3>0){
            num1=num2;
            num2=num4;
            num4=num1+num2;
            System.out.println(num4);
            num3--;
        }

    }
}
