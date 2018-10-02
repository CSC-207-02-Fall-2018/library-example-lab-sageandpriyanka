package libraryLab;

import libraryLab.LibraryBook;

public class ReferenceBook extends LibraryBook{
    private String collection;
    
    ReferenceBook(String author, String title, String isbn, String num, String coll){
        super(author, title, isbn, num);
        collection = coll;
    }
    
    public String getCollection() {
        return collection;
    }
    
    public void setCollection (String str) {
        collection = str;
    }  
    
    public void checkout (String patron, String dueDate) {
        System.out.println(patron + " cannot check out a reference book");
    }
    
    public void returned() {
        System.out.println("reference book could not have been checked "
                + "out -- return impossible");
    }
    
    public String circulationStatus() {
        return "non-circulating reference book";
    }
    
    public String toString ()
    {
        return super.toString() + "\n        Collection: " + getCollection();  
    }
}
