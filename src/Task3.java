/**
 * В этой задаче мы премножаем матрицы двух массивов. В нашем случае матрицы согласованы, т.к.
 * число столбцов в первом множителе равно числу строк во втором, значит опреация выполнима.
 */
public class Task3 {
    public static void main(String[] args) {

        int[][] myArray1 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] myArray2 = {{1, 2, 3}, {1, 1, 1}, { 0, 0, 0}, {2, 1, 0}};

        int[][] myArray3 = new int[myArray1.length][myArray2[0].length];
        for ( int i =0; i<myArray3[0].length; i++){
            for ( int j = 0; j<myArray3.length; j++){
                for ( int k = 0; k<myArray1[0].length; k++){
                    myArray3[i][j] = myArray3[i][j] + myArray1[i][k] * myArray2[k][j];

                }
            }
        }
        for ( int i = 0; i<myArray3.length; i++ ){
            for ( int j = 0; j<myArray3[0].length; j++ ){
                System.out.print( myArray3[i][j] + " ");
            }
            System.out.println();
        }



    }
}
