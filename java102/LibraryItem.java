public class LibraryItem {
    public final String title;
    public final String itemId;
    
    protected boolean isCheckedOut = false;

    public LibraryItem(String title, String itemId) {//baseline for library item
        this.title = title;
        this.itemId = itemId;
    }
//these 3 are pretty self explanitory
	public boolean available() {//if its out, no | if its not out, yes
		return !isCheckedOut;
	}

    public void checkOut() {//out rn
        isCheckedOut = true;
    }

    public void returnItem() {// not out rn
        isCheckedOut = false;
    }
}