public class ClassThree {

    int var1,var2,result;

    ClassThree(int x, int y){
        var1=x;
        var2=y;
    }
    void Multi(){
        result=var1*var2;
        System.out.println(result);
    }
    void Div(){
        result=var1/var2;
        System.out.println(result);
    }
    public static void main(String[]args){
        ClassThree obj1=new ClassThree(20,5);
        obj1.Multi();
        obj1.Div();
    }
}
