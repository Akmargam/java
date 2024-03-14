import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Eligibility {
    String name;
    int age;
    void TakeInput() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name:");
        String name= br.readLine();
        System.out.println("Enter Age");
        int age=Integer.parseInt(br.readLine());
    }
    void Check(){
        if(age>=18) System.out.println(name+"is Eligible to take a DL");
        else System.out.println(name+"is Not Eligible to take a DL");
}
class ClassDemo{

    public static void main(String[]args){
    }
}

}

