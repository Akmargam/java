import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReturnType {

    private int[] marks;
    private int n;
    private String name;

    private void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Name of the student: ");
        name = br.readLine();
        System.out.println("Enter how many subjects " + name + " attempted:");
        n = Integer.parseInt(br.readLine());
        marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks of subject " + (i+1));
            marks[i] = Integer.parseInt(br.readLine());
        }
    }

    private int total() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        System.out.println("Total Marks are: " + sum);
        return sum;
    }

    private double percentage() {
        double totalMarks = n * 100; // Assuming each subject has 100 marks
        double obtainedMarks = total();
        double per = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage " + name + " got is: " + per);
        return per;
    }

    public static void main(String[] args) throws IOException {
        ArrayReturnType student1 = new ArrayReturnType();
        student1.input();
        student1.percentage();
    }
}
