import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your length of the array: ");
        int i=Integer.parseInt(br.readLine());
        String[] cityArray=new String[i];
        System.out.println("Enter name of the cities: ");
        for(int j=0;j<i;j++){
            cityArray[j]= br.readLine();
        }
        System.out.println(Arrays.toString(cityArray));
        System.out.println("Enter a City to search");
        String searchCity= br.readLine();
        for (int k=0;k<i;k++){
            if(searchCity.equalsIgnoreCase(cityArray[k])) System.out.println("Position is:"+k);
        }
    }
}
