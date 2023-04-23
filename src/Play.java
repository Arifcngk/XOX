import java.util.Scanner;

public class Play {
    public int player=0;
    public void Play()
    {  Conclusion conclusion=new Conclusion();
        Board board1=new Board();
        board1.BoardAlan();
        for (int i=0;i<=10;i++)
        {

           player++;
           if (player%2==1){
               System.out.print("X'in Sırası:");
               Scanner secim=new Scanner(System.in);
               int _secim=secim.nextInt();
               Board.board[ _secim-1]="X";
               board1.BoardAlan();
               conclusion.Sonuc();





           }
            else if (player%2==0){
                System.out.print("O'in Sırası:");
                Scanner secim=new Scanner(System.in);
                int _secim=secim.nextInt();
                Board.board[ _secim-1]="O";
                board1.BoardAlan();
                conclusion.Sonuc();


            }
        }

    }
}
