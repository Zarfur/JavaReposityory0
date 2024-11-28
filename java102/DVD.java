public class DVD extends LibraryItem {
    public final double runtime;//child of library
//this is DVD and it stores allat data
    public DVD(String title, String itemId, double runtime) {
        super(title, itemId);//these 2 pieces of data are from libraryitem
        this.runtime = runtime;//this one is exclusive to DVD
    }
//prints DVD data
    @Override
    public String toString() {
        return "DVD: " + title + ", Runtime: " + runtime + " minutes";
    }
}