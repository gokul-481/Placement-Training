import java.util.*;
public class SetBrandName {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Set Brand Name:");
        String brand=scanner.nextLine();
        brand car=new brand();
        car.displayBrand();
        car.setBrand(brand);
        scanner.close();
    }
}

class brand{
    String brand;
    brand(){
        brand="Unknown";
    }
    void displayBrand(){
        System.out.println("Default brand:"+brand);
    }
        void setBrand(String brandName){
            brand=brandName;
            System.out.println("Brand name is set to:"+brand);
        }
}