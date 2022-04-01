package arrays;


public class Arr {

    public static void main(String[] args) {
        int[][] arr = {{2,4,6,}, {4,6}, { 3,66,54,3,2,23,4}, {4,67,8,7}};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
