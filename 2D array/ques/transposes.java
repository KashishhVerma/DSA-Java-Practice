package ques;

public class transposes {
    public static void main(String[] args) { 
    int matrix[][]={
        {2,3,7},
        {5,6,7}
    };
    int row=matrix.length-1;
    int col=matrix[0].length-1;
    int[][] transpose=new int[col][row];
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            transpose[j][i]=matrix[i][j];
        }
    }
    printMatrix(transpose);
}
    public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
        }
    }
}
