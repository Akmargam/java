class One{
    int a;
    One(){
        System.out.println("Hello");
    }

}
class Two extends One{
    int i;
    Two(){
        System.out.println("Two");
    }
    void display() {

    }

}



public class InheritanceDemo {
    public static void main(String[]args){
        Two obj=new Two();

    }
}
