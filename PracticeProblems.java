public class PracticeProblems { 
    static int countOccurrences(int[] arr, int n) { //Problem #1
        int occurrances = 0;
        for (int i=0; i<arr.length; i++){
            if (n == arr[i]){
                occurrances++;
            }
        }
        return occurrances;
    }

    static String reverseArray(int[] arr) { // Problem #2
        String reverseArr= "{"; // Turned array into string value due to array printing error
        int reversal = arr.length-1;
        for (int i=0; i<arr.length; i++){
            reverseArr += arr[reversal];
            reversal --;
        if (i<arr.length-1) {
            reverseArr = reverseArr +",";
        }
    }
        reverseArr = reverseArr + "}";
        return reverseArr;
    }

    static int sumGrid(int[][] grid){ // Problem #3
        int sum = 0;
        for (int i=0; i<grid.length; i++){
            for (int v=0; v<grid[i].length;v++){
                sum += grid[i][v];
            }
        }
        return sum;
    }
    
    static int fib(int n){ // Problem #4
        if (n==0){
            return 0;
        }
        int fibb = 0;
        int fibbb=1;
        int nth = 1;
        for (int i=2; i<=n; i++){
            nth = fibb+fibbb;
            fibb=fibbb;
            fibbb=nth;
        }
        return nth; 
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int n = 2;
        int f = 8;
        int[][] board = {{4 ,2 ,4}, {3,2,1}, {1,2,3}};
        System.out.println(countOccurrences(arr, n)); // Problem #1
        System.out.println(reverseArray(arr)); // Problem #2
        System.out.println(sumGrid(board)); // Problem #3
        System.out.println(fib(f)); // Problem #4
    }
}