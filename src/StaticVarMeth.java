public class StaticVarMeth {

    static int i=22;
//    static void set(){
//        i=10;
//    }
    static void get(){
        System.out.println("Integer value is:"+i);
    }
    public static void main(String[]args){
//        StaticVarMeth obj=new StaticVarMeth();
        StaticVarMeth.get();
    }
}
