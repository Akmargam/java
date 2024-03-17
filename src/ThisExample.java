public class ThisExample {
    int a;

    ThisExample(int a) {
        this.a = a;
        get(this); // Passes the current object to the 'get' method
    }

    private void get(ThisExample obj) {
        System.out.println(obj.a); // Prints the value of 'a' from the passed object
    }

    public static void main(String[] args) {
        ThisExample obj = new ThisExample(10); // Creates an instance of ThisExample
    }
}
