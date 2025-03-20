
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        square.placeValue(size/2, 0, 1);
        int rowCounter = 0;
        int columnCounter = size / 2;
        for (int num = 2; num <= size * size; num++) {
            int nextRow = rowCounter - 1;
            int nextColumn = columnCounter + 1;

            if (nextRow < 0) {
                nextRow = size - 1;
            }
            if (nextColumn >= size) {
                nextColumn = 0;
            }
            if (square.readValue(nextColumn, nextRow) != 0) {
               nextRow = rowCounter +1;
               nextColumn = columnCounter;
               if (nextRow > size -1) {
                   nextRow = 0;
               }
            }
            square.placeValue(nextColumn, nextRow, num);
            
            rowCounter = nextRow;
            columnCounter = nextColumn;

        }
        return square;
    }

}
