import java.util.Scanner;

public class EmployeeDemo {
   public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("enter the number of employees");
    int no = scanner.nextInt();
    Employee employees[] = new Employee[no];
    for(int i = 0; i<no; i++){
        System.out.println("enter the name,id,department");
        
        String name = scanner.next();
        int id = scanner.nextInt();
        double dept = scanner.nextDouble();
        employees[i]= new Employee(name, id, dept);
    }

    System.out.println("The employees list: ");

    for(Employee employee: employees){
        System.out.println(employee);
    }

   } 
}


class Employee{
    private String name;
    private int id;
    private double department;
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
    public double getDepartment() {
        return department;
    }
    public void setDepartment(double department) {
        this.department = department;
    }
    public Employee(String name, int id, double department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + "]";
    }

    
    
}