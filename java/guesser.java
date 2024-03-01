import java.util.Scanner;

class guesser {
    int gnum;
    
    int guesNum(){
        System.out.println("Guesser guess the number betweeen 1 to 25");
        Scanner sc = new Scanner(System.in);
        gnum = sc.nextInt();
        return gnum;
    }
class Player
{
    int pnum;
    int plaNum(){
        System.out.println("Player guesses the numer from 1 to 25");
        Scanner sc = new Scanner(System.in);
        pnum = sc.nextInt();
        return pnum;
    }
class Umpire
{
    int g1num;
    int p1num;
    int p2num;
    int p3num;
    void collectGusNum(){
        guesser g = new guesser();
        g1num = g.guesNum();
    }
  void collectPlayerNum()
{
    System.out.println("Player1");
    Player P1 = new Player();
    p1num =P1.plaNum();
    System.out.println("Player2");
    Player P2 = new Player();
    p2num = P2.plaNum();
    System.out.println("HPlayer3");
    Player P3 = new Player();
    p3num = P3.plaNum();
}
void compare(){
    if(gnum==p1num){
        System.out.println("player 1 wins");
    }
    else if(gnum==p2num){
        System.out.println("player 2 wins");
    }
    else if(gnum==p3num){
        System.out.println("player 3 wins");
    }
    else{
        System.out.println("Game over");
    }
}
}
}
}
