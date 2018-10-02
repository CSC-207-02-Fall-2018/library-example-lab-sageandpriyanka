package libraryLab;

import libraryLab.LibraryBook;

public class CirculatingBook extends LibraryBook{
	String currentHolder;
	String dueDate;
	
	CirculatingBook(String author, String title, String isbn, String callnum){
		super(author, title, isbn, callnum);
		currentHolder = "";
		dueDate = "";
	}
	
	public String getCurrentHolder() {
		return currentHolder;
	}
	
	public void setCurrentHolder(String name) {
		currentHolder = name;
	}
	
	public String getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(String date) {
		dueDate = date;
	}
	
	public void checkout (String name, String date) {
		currentHolder = name;
		dueDate = date;
	}
	
	public void returned() {
		currentHolder = "";
		dueDate = "";
	}
	
	public String circulationStatus() {
		if (currentHolder.equals("")){
			return "book available on shelves";
		}
		else {
			return "\n        Currently checked out by: " + currentHolder +
					"\n        Due back on: " + dueDate;
 	
		}
	}
	
	public static void main(String argv []) {
		CirculatingBook cb = new CirculatingBook("test", "test", "test", "12");
		System.out.println(cb);

		cb.checkout("name", "today");
		
		System.out.println(cb);
		
	}
}
