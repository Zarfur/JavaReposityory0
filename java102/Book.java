public class Book extends LibraryItem {//child of library
    public final String author;
    public final int pageCount;
// this is book and it stores allat data
    public Book(String title, String itemId, String author, int pageCount) {
        super(title, itemId);//this 2 pieces of data are from library item
        this.author = author;//these 2 are exclusive to book, unable to access in DVD
        this.pageCount = pageCount;
    }
//prints book data
	@Override
    public String toString() {
        return "Book: " + title + " by " + author + ", " + 
		        pageCount + " pages";
    }
}