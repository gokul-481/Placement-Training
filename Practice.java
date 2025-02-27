public class Practice {
    public static void main(String[] args) {
        inInnerPratice obj = new inInnerPratice();
        InnerPractice.get_a();
        obj.get_b();
        
    }
}

interface InnerPractice {
    int a = 10;
    int b = 20;
    static void get_a(){
        System.out.println(a);
    }
    void get_b();
    
}
class inInnerPratice implements InnerPractice{
    public void get_b(){
        System.out.println(b);
    }
}