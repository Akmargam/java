import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word: ");
        String sVar= br.readLine();
        String temp;
        temp=sVar;
        StringBuffer sb= new StringBuffer(temp);
        sb.reverse();
        sVar= sb.toString();
        if(temp.equalsIgnoreCase(sVar)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not a palindrome");
    }
}
