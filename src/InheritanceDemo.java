class One{
    int a;
    public One(){
        a=10;
    }

}
class Two extends One{
    int i;
    public Two(){
        i=20;
    }
    void display() {
        System.out.println(i);
        System.out.println(a);
    }

}



public class InheritanceDemo {
    public static void main(String[]args){
        Two obj=new Two();
        obj.display();
    }
}
