class One{
    int i=10;
    void display(){
        System.out.println(i);
    }
}
class Two extends One{
    int i=20;
    void display(){
        System.out.println(i);
        super.display();
        System.out.println("Super: "+super.i);
    }
}



public class InheritanceDemo {
    public static void main(String[]args){
        Two obj=new Two();
        obj.display();
    }
}
