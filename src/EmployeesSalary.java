public class EmployeesSalary {
    private int baseSalary;
//    private int da;
//    private int hra;
//    private int grossSalary;
//    private String name;

    EmployeesSalary(int baseSalary){
        this.baseSalary=baseSalary;
//        this.da=da;
//        this.hra=hra;
//        this.grossSalary=grossSalary;
//        this.name=name;
    }
//    private double calcDA(){
//
//        return 0;
//    }
//    private double calcHra(){
//
//        return 0;
//    }
//    private double grossSalary(){
//
//
//        return 0;
//    }
    private int get(){
        return baseSalary;
    }

    public static void main(String[]args){

        for (int i=0;i<5;i++){
            EmployeesSalary obj= new EmployeesSalary(i);
            System.out.println(obj.baseSalary);
        }
    }

}

