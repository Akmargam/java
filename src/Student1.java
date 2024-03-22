public class Student1 extends Professor {

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    float marks;
    public static void main(String[]args){
        Student1 stu=new Student1();
        stu.setName("R Sahu");
        stu.setId(1234);
        stu.setSalary(10000);
        stu.setMarks(92);
        System.out.println("name: "+stu.getName());
        System.out.println("id:" +stu.getId());
        System.out.println("Address: "+stu.getAddress());
        System.out.println("Marks: "+stu.getMarks());
    }
}
