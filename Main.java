public class Main {
    static int y=6;
    static double[] piArr = {3.1, 4, 1.5, 9.26, 5, 3};
    static boolean[] boolArr = new boolean[100];
    static int[][] board = new int[3][3]; // 2D Array in which board[row][column] and row&column are int between 0-3
    static double f(double x) {
        return 2*x;
    }

    static String intArrToString(int[] ar) {
        String str = "(";
        for (int i = 0; i < ar.length; i++) {
            str += ar[i];
            if (i != ar.length - 1) {
                str += ", ";
            }
        }
        return str + ")";
    }

    static String boardToString(int[][] board) {
        String str = "";
        for (int i = 0; i < board.length; i++) {
            str += intArrToString(board[i]);
            if (i != board.length - 1) {
                str += "\n";
            }
        }
        return str;
    }

    // "void" if no return type
    public static void main(String[] args) {
        System.out.println("Hello World"); 
        int x = 7;
        System.out.println(x+17);
        System.out.println("y: " + y);
        y = x+y;
        System.out.println("new y: " + y);
        // other basic operations work on x and y
        System.out.println(piArr.length);
        System.out.println(boolArr[0]);
        boolArr[3] = true;
        System.out.println(boolArr[0] || boolArr[3]);
        System.out.println(boolArr.length);
        // playing around with arrays and stuff 
        int firstVal = board[0][0];
        // board[0][0] is the same as:  int[] firstRow = board[0] + int firstVal = firstRow[0];
        System.out.println(firstVal);
        // loops same as programming101 BUT differences in java101 doc        
        // \/ third type of loop "for loop" (not for each loop)
        int[] arr = new int[100];
        for (int index = 0; index < 100; index=index+1) { // iteration var; ending parameter; var update
            arr[index]=2-index%2;
        }
        String s = "";
        for (int i=0; i<3; i++) {
            s += "- - -\n"; // "\n" signifies new line
        }
        System.out.println(s);
        //loops above, functions below
        // fun start w/ "static all functions at top"
        System.out.println("f(7): "+f(x));
        int[] ar = {2,3,4};
        System.out.println(intArrToString(ar));
        System.out.println(boardToString(board));
    }
}