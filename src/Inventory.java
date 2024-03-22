import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Inventory {

    String[] array;
    int[] numbers;

    void GetList() throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many products you have in the stock: ");
        int length=Integer.parseInt(br.readLine());
        Product pr=new Product();
        array=pr.Add(length);
        Stocks st=new Stocks();
        numbers=st.Run(length);
        System.out.println("Below is the match:");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(numbers));
    }

    private static class Product{

        String[] Add(int length) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] prodArray =new String[length];
            for(int i=0;i<length;i++){
                System.out.println("Please Enter the product name:");
                prodArray[i]= br.readLine();
            }
            System.out.println("Product are:"+ Arrays.toString(prodArray));
            return prodArray;
        }
    }
    private static class Stocks{

        int[] Run(int length) throws IOException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter stock of the each product entered");
            int[] stockArray =new int[length];
            for(int i=0;i<length;i++){
                System.out.println("Please Enter the product in numbers:");
                stockArray[i]= Integer.parseInt(br.readLine());
            }
            System.out.println("Numbers are:"+ Arrays.toString(stockArray));
            return stockArray;
        }
    }
    public static void main(String[]args) throws IOException {
        Inventory obj= new Inventory();
        obj.GetList();
    }
}
