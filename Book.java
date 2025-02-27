public class Book {
    public static void main(String[] args){
        Book_detail book = new Book_detail("atomic habit","james Clear", 500);
        book.get_detail();
    }
}

class Book_detail{
    String title;
    String author;
    float price;
    Book_detail(String title, String author, float price){
       this.title = title;
       this.author = author;
       this.price = price;
    }
    void get_detail(){
        System.out.println("Details of book");
        System.out.println("Title is "+title);
        System.out.println("Author is "+author);
        System.out.println("Price is "+price);
    }
}