
/**
 * Write a description of class fdsf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class FreqChart
{
        public static void main (String [] args){
            Scanner in = new Scanner(System.in);
            System.out.println("Numbers would you like to enter? "); 
            int q = in.nextInt();

            int[] numbers = new int[q];
            double sum = 0;
            for (int counter = 0; counter < q; counter++){ 
                System.out.println("Enter your numbers: ");
                int number = in.nextInt();
                numbers[counter] = number; 
            }

            int minInterval = 0;
            int maxInterval = 9;
            
            while (maxInterval < 100) {
                System.out.print(minInterval + "-" + maxInterval + ":"); 
                for (int i = 0; i < q; i++){ 
                    if (minInterval <= numbers[i] && numbers[i] <= maxInterval ) { 
                        System.out.print("*");
                    }
                }
                System.out.println();
                minInterval += 10;
                maxInterval += 10;
            }

        }
    }