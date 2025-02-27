public class Automorphic {
    public static void main(String[] args) {
        int n = 11;
        int s = n*n;
        System.out.println(s);
        boolean check = false;
        while(n>0){
            if(n%10 != s%10){
                check = false;
            }
            else{
                check = true;
            }
            n/=10;
            s/=10;
        }
        if(check == true){
            System.out.println("Automorphic number");
        }
        else{
            System.out.println("Not Automorphic number");
        }
    }
}