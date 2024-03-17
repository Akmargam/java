public class ThisExample {

    ThisExample(){
        System.out.println("Hello");
    }
    private ThisExample(int a){
        this();
    }
    public static void main(String[]args){

    }
}
