import java.util.Scanner;

class Guesser{
    int guessNum;

    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess the number ^_^");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player{
    int pGuessNum;

    public int guessNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player kindly guess the number ^_^");
        pGuessNum = sc.nextInt();
        return pGuessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1, numFromPlayer2, numFromPlayer3;
    boolean isTrue1 = false;
    boolean isTrue2 = false;
    boolean isTrue3 = false;

    public void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }

    public void collectNumFromPlayer(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessNumber();
        numFromPlayer2 = p2.guessNumber();
        numFromPlayer3 = p3.guessNumber();
    }

    public void compare(){
        if(numFromPlayer1 == numFromGuesser){
            isTrue1 = true;
        }
        if(numFromPlayer2 == numFromGuesser){
            isTrue2 = true;
        }
        if(numFromPlayer3 == numFromGuesser){
            isTrue3 = true;
        }
    }

    public void declareResults(){
        if(isTrue1 != true && isTrue2 != true && isTrue3 != true){
            System.out.println("Game lost, Try Again");
            return;
        }
        if(isTrue1 == true && isTrue2 == true && isTrue3 == true){
            System.out.println("All are winners !!");
            return;
        }
        System.out.println("the winners");

        if(isTrue1 == true){
            System.out.println("Player1 ");
        }

        if(isTrue2 == true){
            System.out.println("Player2 ");
        }

        if(isTrue3 == true){
            System.out.println("Player3 ");
        }

        System.out.println("Congratulations ^_^");
    }
}

public class LaunchGame {
    public static void main(String[] args){
        //TODO
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
        u.declareResults();
    }
}