package libraryLab;

import libraryLab.Book;

abstract class LibraryBook extends Book implements Comparable <LibraryBook> {

    protected String callNumber ;
    
    
    LibraryBook(String author, String title, String isbn, String num){
        super(author, title, isbn);
        callNumber = num;
        
    }
    
    public String getCallNumber() {
        return callNumber;
    }
    
    public void setCallNumber (String str) {
        callNumber = str;
    }
    
    abstract void checkout () ;
    abstract void returned () ; 
    abstract String circulationStatus ();
    
    public int compareTo (LibraryBook l) {
        return getIsbn() - l.getIsbn();
    }
    
    public String toString ()
    {
        return ( super.toString() + "\n Call Number: " + getCallNumber()
                                  + "\n Status: " + circulationStatus()); 
    }
}
