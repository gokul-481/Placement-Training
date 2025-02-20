public class Book_price {
    public static void main(String[] args){

        Book book = new Book();
        book.detail();
    }
}

class Book{
    String title;
    float price;
    Book() {
        title = "Java Programming";
        price = 100.0f;
    }
    void detail(){
        System.out.println(title);
        System.out.println("Book price is "+price);
    }
}