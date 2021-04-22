/**
 * В этом классе необходимо отсортировать элементы в строках двумерного массива
 * по возрастанию.
 */

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[][] myArray = {{10, 5, 1, 7, 11}, {9, 10, 7, 12, 4}};
//        int tmp;
//        for ( int i = 0; i< myArray.length; i++){
//            for (int j = 0; j< myArray[i].length; j++){
//                for ( int k = j+1; k< myArray.length; k++){
//                    if (myArray[i][j]>myArray[i][k]){
//                        tmp = myArray[i][j];
//                        myArray[i][j] = myArray[i][k];
//                        myArray[i][k] = tmp;
//                    }
//                }
//            }
//        }
//        for ( int i = 0; i< myArray.length; i++){
//            for ( int j = 0; j< myArray[i].length; j++){
//                System.out.print(myArray[i][j] + " ");
//            }
//            System.out.println();
//        }
/**
 * Нашел в интернете вот такой способ сортировки строк в массиве, он работает, но не совсем понятно
 *как работает "map".
 */
        Arrays.stream(myArray).forEach(Arrays::sort);
        Arrays.stream(myArray).map(Arrays:: toString).forEach(System.out::println);

    }
}
