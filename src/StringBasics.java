import java.util.Arrays;

public class StringBasics {
    public static void main(String[]args){
        String name1="arun";
        String name2= new String("ARUN");
        char array[]={'A','r','u','n'};
        String name3=new String(array);
        String name4="With vivd story telling illuminating the huge role of markets";
//        System.out.println(name1);
//        System.out.println(name2);
//        System.out.println(name3);
        System.out.println(name1.length());
        //case changing
        System.out.println(name1.toUpperCase());
        System.out.println(name2.toLowerCase());
        //Concat
        System.out.println(name1.concat(name2.concat(name3)));
        String[] array1;
        array1=name4.split(" ");
        System.out.println(Arrays.toString(array1));
    }
}
