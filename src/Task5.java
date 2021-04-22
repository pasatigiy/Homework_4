/**В этом классе мы создали двумерный массив и вывели на консоль диагонали этого массива.
 * У элементов массива, которые лежат на диагоналях номера строк и столбцов либо равны, либо
 * их сумма будет равна максимальному значению индекса строки(столбца), в нашем случае ("длина массива - 1").
 *
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] myArray = {{ 1, 2, 3, 4 }, { 4, 5, 6, 7 }, {8, 9, 10, 11}, {12, 13, 14,15}};
        for (int i =0; i< myArray.length; i++){
            for (int j = 0; j< myArray[i].length; j++){
                if ( i==j){
                    System.out.print(myArray[i][j] +" ");
                }
            }
        }
        System.out.println();
        for (int i =0; i< myArray.length; i++){
            for (int j = 0; j< myArray[i].length; j++){
                if ( (i+j)== myArray.length -1 ){
                    System.out.print(myArray[i][j] + " ");
                }
            }
        }
    }
}
