public class TicTowToe {


    public  void run () {

        Player player1 = new Player("Player 1" , Symbol.O) ;
        Player player2 = new Player("Player 2" , Symbol.X  ) ;

        Game game = new Game(player1 , player2 , 3 );
        game.playMove(0, 0);
        game.printBoard();

        game.playMove(0, 1);
        game.printBoard();

        game.playMove(2, 2);
        game.printBoard();

        game.playMove(0, 2);
        game.printBoard();

        game.playMove(1, 1);
        game.printBoard();
    }


}
