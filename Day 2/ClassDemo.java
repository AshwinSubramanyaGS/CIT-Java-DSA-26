import java.util.Scanner;

public class ClassDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student Details\nname:");
        String name= sc.nextLine();
        System.out.print("\nUSN: ");
        String usn = sc.next();

        /* Student st= new Student();
        st.setName(name);
        st.setUsn(usn); */
        
        Student st =new Student(name, usn);

        System.out.println(st);


    }
}

class Student{
    private String name;
    private String usn;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsn() {
        return usn;
    }
    public void setUsn(String usn) {
        this.usn = usn;
    }
    

    public Student(String name, String usn) {
        this.name = name;
        this.usn = usn;
    }
    @Override
    public String toString() {
        return "Student Details\nname = " + name + "\nusn = " + usn;
    }
    
    
    
    

}
