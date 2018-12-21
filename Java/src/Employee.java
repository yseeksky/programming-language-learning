public class Employee {
//    实例变量在类中声明，但是它在方法、构造器或者块外。 name 是一个实例对象
//    实例变量有默认值。数字的默认值为零，布尔型默认值为假，对象引用默认值为空。在声明或者构造器内可以进行赋值
//    常量是被作为 public、private, final 和 static 被声明的变量
    public static String name;


    // salary  variable is visible in Employee class only.
    private double salary;

    private static double salary1;
    public static final String DEPARTMENT = "Development ";


    // The name variable is assigned in the constructor.
    public Employee (String empName){
        name = empName;
    }

    // The salary variable is assigned a value.
    public void setSalary(double empSal){
        salary = empSal;
    }

    // This method prints the employee details.
    public void printEmp(){
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]){

      /*  static String dogname;
        System.out.println("dogname=",dogname);
        这两句运行之后，报非法的表达式开始

        */
      System.out.print("     ====" +name);

        salary1 = 1000;
        System.out.println(DEPARTMENT+"average salary:"+salary1);

        Employee empOne = new Employee("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
