import java.util.ArrayList; //must import inaccessible functions
//Grid has 2 fields, grid(grid and its elements) & sidelength(length)
public class Grid<T> { //T represents generic type(this case string) | grid(not Grid) must be 2D array
	private final ArrayList<ArrayList<T>> grid; //private means can only be accessed by other members of same class
	public final int sideLength; //final var. cannot be ressigned values, but the value of a final can be mutated
//when grid is final, it prevents it from ressigning it to a new arraylist, no prevent mutation
//get&set needed since private | toString to print values
static int maxSideLength = 0;
	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
		}
		if (sideLength > maxSideLength){
			maxSideLength = sideLength;
		}
	}


	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}
	public ArrayList<T> diagonal(){//Practice Diagonal(3)
		ArrayList<T> primaryDiagonal = new ArrayList<>(sideLength);
		for (int i=0; i<sideLength;i++){
			primaryDiagonal.add(grid.get(i).get(i));
		}
		return primaryDiagonal;
	}//(3)
	public static int maxSideLength(){ //Practice maxSideLength(4)
		return maxSideLength;
	}//(4)
}