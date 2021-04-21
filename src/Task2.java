/** Этот класс создан для создания программы раскраски шахматной доски 8 на 8
 * он основан на том, что каждая ячейка имеет свой порядковый номер по вертикали и горизонтали.
 * Цвет "Black" имеют ячейки, у которых позиции либо полностью нечетные, либо полностью четные по двум
 * направлениям, у которых это условие не выполняется будут иметь цвет "White'.
 */
public class Task2 {
    public static void main(String[] args) {

        String[][] myArray = new String[8][8];
        for ( int i = 0; i< myArray.length; i++){
            for ( int j = 0; j<myArray[i].length; j++){
                if ( i%2 == 0 && j%2 == 0){
                    myArray[i][j] = "B";
                }
                if ( i%2 != 0 && j%2 != 0){
                    myArray[i][j] = "B";
                }
                if ( i%2 == 0 && j%2 != 0){
                    myArray[i][j] = "W";
                }
                if ( i%2 != 0 && j%2 == 0){
                    myArray[i][j] = "W";
                }


                System.out.print( myArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}