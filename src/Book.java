
//library management
public class Book {
    String title,author;
    public Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    public String displayInfo(){
        return "The title: " +title+ "The Author: " +author ;
    }
}
