public class Conclusion {
    static String line = null;


    public void Sonuc(){
        for (int a = 0; a < 8; a++) {


            switch (a) {
                case 0:
                    line = Board.board[0] + Board.board[1] + Board.board[2];
                    break;
                case 1:
                    line = Board.board[3] + Board.board[4] + Board.board[5];
                    break;
                case 2:
                    line = Board.board[6] + Board.board[7] + Board.board[8];
                    break;
                case 3:
                    line = Board.board[0] + Board.board[3] + Board.board[6];
                    break;
                case 4:
                    line = Board.board[1] + Board.board[4] + Board.board[7];
                    break;
                case 5:
                    line = Board.board[2] + Board.board[5] + Board.board[8];
                    break;
                case 6:
                    line = Board.board[0] + Board.board[4] + Board.board[8];
                    break;
                case 7:
                    line = Board.board[2] + Board.board[4] + Board.board[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                System.out.println("X kazandı");
                break;

            }

            // For O winner
            else if (line.equals("OOO")) {
                System.out.println("O kazandı");
               break;

            }
        }


    }
}
