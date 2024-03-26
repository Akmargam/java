class Parent{
    static void sum(int a, int b){
        System.out.println("Sum is:"+(a+b));
    }
    void multi(int a, int b){
        System.out.println("Multiplication is:"+(a*b));
    }
}
class Child1 extends Parent{
    static void sum(int a,int b){
        System.out.println("Sum plus 1 is :"+(a+b+1));
    }
    void divide(int a, int b){
        System.out.println("Division is: "+(a/b));
    }
}
public class DynamicPolyMorphism {
   public static void main(String[]args){
       Child1 obj=new Child1();
       Parent objP=new Child1();
       obj.multi(4,5);
       obj.divide(7,7);
       Parent.sum(4,55);
       System.out.println(objP);
   }

}
