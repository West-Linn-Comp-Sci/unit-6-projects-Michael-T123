
import java.util.ArrayList;
import java.util.Scanner;
    public class BattleShip1D
    {
        public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            ArrayList<Integer> ship = new ArrayList<Integer>();
            int max = 4;
            int min = 0;
            int randNum = (int)(Math.random()*((4-0) +1) + 0);
            for(int i= 0; i<7;i++){
                ship.add(0);

            }
            ship.set(randNum,1);
            ship.set(randNum+1,2);
            ship.set(randNum+2,3);


            int countMiss = 0;
            int countHit = 0;
            int guess = 1;
            String accuracy = "";

            while(countHit<3){
                System.out.println("Guess a number between 0-6");
                guess = input.nextInt();
                System.out.println("You Guessed: " + guess);
                if((guess==ship.indexOf(1))||(guess==ship.indexOf(2))||(guess==ship.indexOf(3))){
                    System.out.println("hit");
                    countHit++;
                }else{
                    System.out.println("miss");
                    countMiss++;
                }

            }
            if(countHit>countMiss){
                accuracy = "Good shot";
            } else
                accuracy = "Better luck next time";
            System.out.println("*****************************\nYou sank my battleship\nHits: "
                    +countHit +" Misses: "+countMiss + "\n"+accuracy);
        }
    }