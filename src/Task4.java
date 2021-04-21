/** В этом классе мы создали двумерный массив целых чисел.
 * С помощью циклов мы находим сумму всех элементов массива.
 *  */
public class Task4 {
    public static void main(String[] args) {
        int[][] myArray = {{4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        int sum = 0;
        for (int i = 0; i< myArray.length; i++){
            for ( int j=0; j< myArray[i].length; j++){
                 sum+=myArray[i][j];

            }
        }
        System.out.println( "Sum of all array elements  " +sum);
    }
}
