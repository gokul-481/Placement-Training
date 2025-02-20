import java.util.*;
public class class_object {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.next();
        System.out.print("Enter Reg no: ");
        long reg = scanner.nextLong();

        Student_detail student = new Student_detail();
        student.detail(name, reg);
       scanner.close();
    }
}
    class Student_detail{
        String name;
        long reg_no;
        void detail(String nameOfStudent, long reg){
            name = nameOfStudent;
            reg_no = reg;
            System.out.println("Name: "+name );
            System.out.println("Regester No:  "+ reg_no);
        }
}