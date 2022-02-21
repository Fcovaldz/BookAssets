/*
 * @autor Francisco Bañuelos.
 */
package trucos.bookassets;

public class Book {
    int isbn;
    String title;
    float price;

    public Book(int isbn, String title, float price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }
    void displayBook(){
        System.out.println("ISBN : "+isbn);
        System.out.println("Title : "+title);
        System.out.println("Price : $"+price);
    }
}
class Novel extends Book{
    String author;

    Novel(int isbn, String title, float price,String author) {
        super(isbn, title, price);
        this.author = author;
    }
    void displayNovel(){
        super.displayBook();
        System.out.println("Author : "+author);
        System.out.println("---------------------------------");
    }
}
class BookMagazine extends Book{
    String type;

    BookMagazine(int isbn, String title, float price,String type) {
        super(isbn, title, price);
        this.type = type;
    }
    void displayMagazine(){
        super.displayBook();
        System.out.println("Type : "+type);
    }
}
class Main{
    public static void main(String []args){

        Novel novel = new Novel(69645,"Tanenbaum",55000.5f,"Andrew S. Tanenbaum");
        novel.displayNovel();
        

        BookMagazine magazine = new BookMagazine(567,"Gold´s Book",55999.5f,"esoterism");
        magazine.displayMagazine();
    }
}