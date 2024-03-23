
    class Sup{

        Sup(){
            System.out.println("Default constructor of super class");
        }
        Sup(int i){
            System.out.println("Parameterized constructor of super class");
        }
    }
    class Sub extends Sup{

        Sub(){
            System.out.println("Default constructor of sub class");
        }
        Sub(int i){
            super(i);
            System.out.println("Param constructor of sub class");
        }
    }
    class grand extends Sub{

        grand(){
            System.out.println("Default constructor of grand class");
        }
        grand(int i){
            super(i);
            System.out.println("Param constructor of grand class");
        }
    }
public class InheritanceDemo2 {
    public static void main(String[]args){
        System.out.println("Flow is:");
        grand obj=new grand(1);
    }
}
