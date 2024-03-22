public class Professor {

    String name;
    int id;
    String address;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[]args){
        Professor prof1=new Professor();
        prof1.setName("R Sahu");
        prof1.setId(1234);
        prof1.setAddress("Basar");
        prof1.setSalary(10000);
        System.out.println(prof1.getName());
        System.out.println(prof1.getId());
        System.out.println(prof1.getAddress());
        System.out.println(prof1.getSalary());

    }
}
