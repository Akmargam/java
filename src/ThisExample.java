public class ThisExample {
    int a;

    ThisExample(int a) {
        this.a = a;
    }

    private void get() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10000);
        obj.get();// Creates an instance of ThisExample
    }
}
