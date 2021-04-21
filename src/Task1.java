/** В этом классе мы создаем трехмерный массив и пробегаясь по нему с помощью циклов
 * увеличиваем его на число, которое задаем через консоль. *
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int [][][] myArray = {{{3, 5, 8, 99, 6}}, {{4, 52, 33, 62, 7}}};
        System.out.println( " Please enter number ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for ( int [][] item1: myArray){
            for ( int [] item2: item1){
                for ( int item3: item2){
                    int item = item3 + number;
                    System.out.print( item + "\t");
                }
            }
            System.out.println();
        }

    }
}
