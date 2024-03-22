class One{
    int a;
    One(int a){
        this.a=a;
    }

}
class Two extends One{
    int b;
    Two(int a,int b){
        super(a);
        this.b=b;
    }
    void display() {
        System.out.println("Sub: "+b);
        System.out.println("Super "+super.a);
    }

}



public class InheritanceDemo {
    public static void main(String[]args){
        Two obj=new Two(22,33);
        obj.display();

    }
}
