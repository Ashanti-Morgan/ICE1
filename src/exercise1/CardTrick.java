package exercise1;

import java.util.Scanner;
/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        hand[0]= new Card();
        hand[0].setValue(1);
        hand[0].setSuit("Hearts");        
        hand[1]= new Card();
        hand[1].setValue(2);
        hand[1].setSuit("Clubs");        
        hand[2]= new Card();
        hand[2].setValue(3);
        hand[2].setSuit("Diamonds");
        hand[3]= new Card();
        hand[3].setValue(4);
        hand[3].setSuit("Spades");
        hand[4]= new Card();
        hand[4].setValue(5);
        hand[4].setSuit("Clubs");
        hand[5]= new Card();
        hand[5].setValue(12);
        hand[5].setSuit("Hearts");
        hand[6]= new Card();
        hand[6].setValue(11);
        hand[6].setSuit("Hearts");
       
        Scanner input = new Scanner(System.in);
        int userValue =input.nextInt();
        String userSuit= input.nextLine();
        for(int i =0;i<hand.length;i++){
            if(hand[i].getValue()==userValue &&
               hand[i].getSuit().equals(userSuit)){
                printInfo();
            }//end of if
        }//end of for
        
    }
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Ashanti");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("Land some high quality internships over the next few years");
        System.out.println("Have a job offer lined up before I graduate");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("Reading");
        System.out.println("Learning about the tech industry");
        System.out.println("Video games");
        System.out.println("Weightlifting");

        System.out.println();
        
    
    }

}
