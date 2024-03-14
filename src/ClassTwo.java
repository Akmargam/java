
class ClassTwoOps{

    int var1=20,var2=20,result;
    void Multi(){
        result=var1*var2;
        System.out.println(result);
    }
    void Div(){
        result=var1/var2;
        System.out.println(result);
    }
}

public class ClassTwo {
    public static void main(String[]args){
        ClassTwoOps obj1=new ClassTwoOps();
//        obj1.var1=20;
//        obj1.var2=10;
        obj1.Multi();
        obj1.Div();
    }
}
