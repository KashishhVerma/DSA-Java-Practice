package ques;
public class keyInArrray{
    public static void search(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix[0].length - 1; j >= 0; j++) {
                if (matrix[i][j] == 7) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        search(matrix);
    }
}