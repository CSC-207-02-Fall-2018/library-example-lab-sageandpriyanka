package libraryLab;

public class Book {
    protected String author;
    protected String title;
    protected String isbn;
    
    Book(){
        author = "";
        title = "";
        isbn = "";
    }
    
    Book (String auth, String bookName, String num){
        author = auth;
        title = bookName;
        isbn = num;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getIsbn() {
        return isbn;
    }
    
    public void setAuthor(String str) {
        author = str;
    }
    
    public void setIsbn(String str) {
        isbn = str;
    }
    
    public void setTitle(String str) {
        title = str;
    }
    
    public String toString() {
        return title + " by " + author +
                "\nISBN: " + isbn;
    }
}
