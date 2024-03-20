import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankAccount {

    String name;
    int list;

    BankAccount(int t, String name){
        this.list=t;
        this.name=name;
    }
    void Get() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter how many transaction you want to see:");
        int n=Integer.parseInt(br.readLine());
        Transaction tr= new Transaction();
        tr.Reg(n,name);
        Statement st=new Statement();
        st.Print(8);

    }
    private static class Transaction{
        void Reg(int t, String name) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the password: ");
            String pass= br.readLine();
            if(pass.equals("ABC@123")){
                System.out.println("Transactions of "+name+" are:");
                for(int i=0;i<t;i++){
                    double randomValue= Math.random();
                    System.out.println(randomValue);
                }
            }
            else System.out.println("Please enter correct password");
        }
    }
    private static class Statement{
        void Print(int k){
            System.out.println("Statement is:");
            for(int j=0;j<k;j++){
                double d=Math.random();
                System.out.println(d);
            }

        }
    }
    public static void main(String[]args) throws IOException {
        BankAccount obj=new BankAccount(5,"Arun");
        obj.Get();
    }
}
