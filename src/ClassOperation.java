import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BasicOperations{
    //declaring variables in the class
        int var1,var2,result;
        void takeInput() throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter variable one: ");
            var1=Integer.parseInt(br.readLine());
            System.out.println("Enter variable two: ");
            var2=Integer.parseInt(br.readLine());
        }
        void multiplicationOp(){
            result=var1*var2;
            System.out.println("Multiplication of "+var1+" and "+var2+" is "+(result));
        }
        void divisionOp(){
            result=var1/var2;
            System.out.println("Division of "+var1+ " and "+var2+" is "+(result));
        }
    }

    public class ClassOperation {
        public static void main(String[]args) throws IOException {
            BasicOperations obj1=new BasicOperations();
            obj1.takeInput();
            obj1.multiplicationOp();
            obj1.divisionOp();
        }
    }

