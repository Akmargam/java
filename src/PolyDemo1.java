public class PolyDemo1 {

    void sum(int i,int j){
        System.out.println("Sum is:"+(i+j));
    }
    void sum(int i,int j,int k){
        System.out.println("Sum is:"+(i+j+k));
    }
    void sum(int i,int j,int k, int l){
        System.out.println("Sum is:"+(i+j+j+l));
    }
  public static void main(String[]args){
     PolyDemo1 obj=new PolyDemo1();
     obj.sum(1,2);
     obj.sum(1,2,3,4);
     obj.sum(1,2,3);
  }

}
