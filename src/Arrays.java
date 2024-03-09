import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {
    public static void main(String[] args) throws IOException {
        /*BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Number of Subjects: ");
        int totalSubjects=Integer.parseInt(br.readLine());
        int[] subjectMarks = new int[totalSubjects];
        for(int i=0;i<totalSubjects;i++){
            System.out.println("Enter Marks of subject "+(i+1));
            subjectMarks[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array is:"+ java.util.Arrays.toString(subjectMarks));
        int sum=0;
        for(int i=0;i<totalSubjects;i++){
            sum=sum+subjectMarks[i];
        }
        System.out.println("Total number of marks are:"+sum);*/
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter length of the array: ");
        int arrayLength=Integer.parseInt(br.readLine());
        int[] oddEven=new int[arrayLength];
        for(int i=0;i<arrayLength;i++){
            System.out.println("PLease enter numbers: ");
            oddEven[i]=Integer.parseInt(br.readLine());
        }
        System.out.println("Array is: "+java.util.Arrays.toString(oddEven));

        for (int i=0;i<arrayLength;i++){
            if(oddEven[i]%2==0){
                System.out.println("Even:"+oddEven[i]);
            }
            else{
                System.out.println("Odd"+oddEven[i]);
            }
        }

    }
}
