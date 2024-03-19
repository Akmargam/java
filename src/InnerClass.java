import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InnerClass {

    private double balance;
    private double rate;

    InnerClass(double b){
        balance=b;
    }


    void contact(double r) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your password:");
        String pass= br.readLine();
        if(pass.equals("ABC@123")){
            Interest in=new Interest(r);
            in.calculateInterest();
        }
        else System.out.println("You are not authorized");
    }
    private class Interest{
        double rate;
        Interest(double r){
            rate=r;
        }
        void calculateInterest(){
            double interest=balance*rate/100;
            balance=balance+interest;
            System.out.println("Updated Balance is:"+balance);
        }
    }
    public static void main(String[]args) throws IOException {
        InnerClass obj=new InnerClass(10000);
        obj.contact(9.5);
    }
}
