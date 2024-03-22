public class AccessorMutator {

    private String name;
    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[]args){
        AccessorMutator obj=new AccessorMutator();
        obj.setName("Arun");
        obj.setAge(29);
        obj.getName();
        obj.getAge();
        System.out.println(obj.getAge());
        System.out.println(obj.getName());
    }
}
