public class ThisExample {
    private int a;

    ThisExample() {
        this(1000);
        this.get();
    }
    ThisExample(int a){
        this.a=a;
    }

    private void get() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample();
    }
}
