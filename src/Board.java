public class Board {

    private final Cell[][] grid ;
    private  final  int movesCount ;
    private final int size;


    public Board(int size) {
        this.size = size;
        grid = new Cell[size][size] ;
        movesCount = 0;
        initializeBoard();
    }

    private void initializeBoard() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = new Cell();
            }
        }
    }

    // To decide this is vlaid move or not
    public  boolean isValidMove( int row , int col ) {
        return  row >= 0 && row < size && col >= 0 && col < size &&  grid[row][col].isEmpty() ;
    }

    //place the move
    public  void placeMove(int row , int col,Symbol symbol) {
        grid[row][col].setSymbol(symbol); ;
    }

    // checking the win
    public boolean checkWin ( Symbol symbol) {

        // check row

        for ( int row  = 0 ; row < size ; row++) {
            boolean rowWin = true ;
            for ( int col = 0 ; col < size ; col++)  {
                if ( grid[row][col].getSymbol() != symbol) {
                    rowWin  = false ;
                    break ;
                }
            }
            if (rowWin) return true ;
        }

        // check col
        for ( int col  = 0 ; col < size ; col++) {
            boolean colWin  = true ;
            for ( int row = 0 ; row < size ; row++)  {
                if ( grid[row][col].getSymbol() != symbol) {
                    colWin  = false ;
                    break ;
                }
            }
            if (colWin) return true ;
        }


        // diagonal
        boolean diag1 = true, diag2 = true;
        for (int i = 0; i < size; i++) {
            if (grid[i][i].getSymbol() != symbol) diag1 = false;
            if (grid[i][size - i - 1].getSymbol() != symbol) diag2 = false;
        }
        return  diag1 || diag2 ;
    }

    public boolean isFull() {
        return movesCount == size * size;
    }

    public void reset() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                grid[i][j].setSymbol(Symbol.EMPTY);
    }


    public void print() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                System.out.print(grid[row][col].getSymbol() + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


