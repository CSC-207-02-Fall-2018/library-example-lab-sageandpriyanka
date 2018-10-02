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
    
    public void setCallNumber (String num) {
        callNumber = num;
    }
    
    abstract void checkout (String patron, String dueDate);
    abstract void returned () ; 
    abstract String circulationStatus ();
    
    public int compareTo (LibraryBook l) {
        return (callNumber.compareTo(l.getCallNumber()));
    }
    
    public String toString ()
    {
        return ( super.toString() + "\n        Call Number: " + getCallNumber()
                                  + "\n        Status: " + circulationStatus()); 
    }
}
