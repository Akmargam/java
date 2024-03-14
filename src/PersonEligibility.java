import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EligibilityClass{
    String name;
    int age;
    void Input() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        name= br.readLine();
        System.out.println("Enter Age:");
        age=Integer.parseInt(br.readLine());
    }
    void Check(){
        if(age>=18) System.out.println(name+" is Eligible");
        else System.out.println(name+" is Eligible");
    }

}
class PersonEligibility {
    public static void main(String[]args) throws IOException {
        EligibilityClass p1=new EligibilityClass();
        p1.Input();
        p1.Check();
    }
}
