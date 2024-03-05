public class Conditional {
    public static void main(String ... args) {

        int a=1;
        for(a=1;a<=10;a++){
            if(a==3){
                continue;
            }
            if(a==9){
                break;
            }
            System.out.print("\t"+a);
        }

    }
}
