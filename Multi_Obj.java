import java.util.*;
public class Multi_Obj {
    public static void main(String[] args){
        Student_detail[] students= new Student_detail[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<students.length; i++){
            students[i] = new Student_detail();
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Reg no: ");
            long reg = scanner.nextLong();
            students[i].detail(name, reg);
        }
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
            System.out.println("Regester No:  "+ reg_no );
        }
}