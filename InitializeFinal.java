public class InitializeFinal {
    public static void main(String[] args) {
        Display.disp_FinalStatic();
        
    }
}
abstract class Abstract_class{
    final static  int number = get_num();
    static int get_num(){
        return 20;
    }
   
}
class Display extends Abstract_class{
    static void disp_FinalStatic(){
        System.out.println(number);
    }
}