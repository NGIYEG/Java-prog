public class LibraryBook extends Book{
    int copies_available;
 public LibraryBook(String title,String author,int copies_available){
     super(title,author);
     this.copies_available=copies_available;

 }
 public String borrow(){
     if (copies_available>0){
        copies_available-=1;
        return "The book borrowed is: "+title+ " it's author is: "+author+ " and remaining copies are: "+copies_available;
     }
     else{
         return "The books: "+title+ "by: " +author+ "are not in library";
     }
 }
 public String returned(){
       copies_available+=1;
       return "The book titled: "+title+ "has been returned hence the availbale copies are "+copies_available;
 }
}
