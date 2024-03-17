public class ThisExample {
    int a;

   ThisExample(int a){
       this.a=a;
       get(this);
    }
    private void get(ThisExample obj){
        System.out.println(obj.a);
    }
    public static void main(String[]args){
        ThisExample obj=new ThisExample(10);
    }
}
