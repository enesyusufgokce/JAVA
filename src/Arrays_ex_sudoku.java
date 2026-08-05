// 1. control each value in a row
// 2. control each value in a column
// 3. shouldn't be redundant number inside 2x2 box

public class Arrays_ex_sudoku {
    public static void main(String[] args) {
        byte[][] sudoku =
            {
                {1, 4, 3, 2},
                {-1, -1, 1, 4},
                {4, 1, 2, 3},
                {2, 3, -1, -1},
            };
        byte sudokuX = 2;
        byte sudokuY = 2;

        boolean isTrue = true;

        topFor:
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku[i].length; j++){
                if (sudoku[i][j] != -1){
                    byte value = sudoku[i][j];
                    sudoku[i][j] = -1;

                    for (int k = 0; k < sudoku.length; k++){
                        if (sudoku[k][j] == value){
                            isTrue = false;
                            break topFor;
                        } else if (sudoku[i][k] == value) {
                            isTrue = false;
                            break topFor;
                        }
                    }
                    byte row = (byte) (i - (i % sudokuX));
                    byte column = (byte) (j - (j % sudokuY));

                    for (int r = row; r < row + sudokuX; r++){
                        for (int c = column; c < column + sudokuY; c++){
                            if(sudoku[r][c] == value) {
                                isTrue = false;
                            }
                        }
                    }
                    sudoku[i][j] = value;  // after the controls, reset the original value
                }
            }
        }
        if (isTrue) {
            System.out.println("this sudoku is correct");
        }
        else{
            System.out.println("this sudoki is incorrect");
        }
    }
}
