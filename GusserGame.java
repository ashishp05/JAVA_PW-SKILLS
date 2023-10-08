import java.util.Scanner;

class Gusser
{
    int numfromgusser;
    public int gussNumber()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Gusser Guess the number :");
        numfromgusser=sc.nextInt();
        return numfromgusser;
    }
 }
 class Player
 {
     int numfromplayer;

     public int gussNumber()
     {
         Scanner sca=new Scanner(System.in);
         System.out.println("player Guess the number :");
         numfromplayer=sca.nextInt();
         return numfromplayer;
     }
 }
class Umpire
{
    int gussernum;
    int player1num;
    int player2num;
    int player3num;
    public void collectFromGusser()
    {
        Gusser g= new Gusser();
        gussernum=g.gussNumber();
    }
    public void collectFromPlayer()
    {
        Player p1 =new Player();
        player1num=p1.gussNumber();

        Player p2 =new Player();
        player2num=p2.gussNumber();


        Player p3 =new Player();
        player3num=p3.gussNumber();

    }
    public void compare()
    {
        if(gussernum==player1num && gussernum==player2num && gussernum==player3num)
        {
            System.out.println("All players are win game.");
        }
        else if(gussernum==player1num && gussernum==player2num)
        {
            System.out.println("player 1 and player 2 are win");
        }
        else if (gussernum==player1num && gussernum==player3num)
        {
            System.out.println("player 1 and player 3 are win");

        }
        else if (gussernum==player2num && gussernum==player3num)
        {
            System.out.println("player 2 and player 3 are win");

        }
        else if (gussernum==player1num)
        {
            System.out.println("Player 1 win");
        }
        else if (gussernum==player2num)
        {
            System.out.println("Player 2 win");
        }
        else if (gussernum==player3num)
        {
            System.out.println("Player 3 win");
        }
        else
        {
            System.out.println(" All player are lost game.");
        }
    }
}

public class GusserGame {
    public static void main(String[] args) {
        Umpire u =new Umpire();
        u.collectFromGusser();
        u.collectFromPlayer();
        u.compare();
        
        System.out.println("********************************************************************************************");
        System.out.println("***********************************Finish The Game******************************************");
        System.out.println("********************************************************************************************");
    }
}
