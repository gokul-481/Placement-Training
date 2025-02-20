import java.util.*;
public class Car_rent{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car id:");
        int id = scanner.nextInt();
        System.out.print("Enter car type:");
        String type = scanner.next();
        rent_cal car_detail = new rent_cal();
        float rent = car_detail.get_car(id,type);
        System.out.println("Your rent is: " + rent);
        scanner.close();
    }
}

class rent_cal{
    int id;
    String type;
    float rent;
    float get_car( int car_id, String car_type){
        id = car_id;
        type = car_type;
        if(type.equalsIgnoreCase("small")){
            rent = 1000;
        }
        else if(type.equalsIgnoreCase("medium")){
            rent = 1500;
        }
        else{
            rent = 2000;
        }
        return rent;
    }
}