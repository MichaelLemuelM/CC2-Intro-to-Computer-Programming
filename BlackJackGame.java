﻿
import java.util.Scanner;

class BlackJackGame{

    public static void main(String[] args) 
    {
        int player_random1 = 100;
        int player_random2 = 100;

        while(player_random1 >= 12 || player_random2 >= 12  || player_random1 < 3 || player_random2 <3)
        {
            player_random1 = (int)(Math.random()*100);
            player_random2 = (int)(Math.random()*100);
        }
        
        int player_total = player_random1 + player_random2;
        
        System.out.println("Players are each dealt two cards, face up or down depending on the casino and the table at which you sit. In the U.S., the dealer is also dealt two cards, normally one up (exposed) and one down (hidden). In most other countries, the dealer receives one card face up. The value of cards two through ten is their pip value (2 through 10). Face cards (Jack, Queen, and King) are all worth ten. Aces can be worth one or eleven. A hand's value is the sum of the card values. Players are allowed to draw additional cards to improve their hands. A hand with an ace valued as 11 is called \"soft\", meaning that the hand will not bust by taking an additional card; the value of the ace will become one to prevent the hand from exceeding 21. Otherwise, the hand is \"hard\".\n" +
"\n" +
"Once all the players have completed their hands, it is the dealer’s turn. The dealer hand will not be completed if all players have either busted or received blackjacks. The dealer then reveals the hidden card and must hit until the cards total 17 or more points. (At most tables the dealer also hits on a \"soft\" 17, i.e. a hand containing an ace and one or more other cards totaling six.) Players win by not busting and having a total higher than the dealer, or not busting and having the dealer bust, or getting a blackjack without the dealer getting a blackjack. If the player and dealer have the same total (not counting blackjacks), this is called a \"push\", and the player typically does not win or lose money on that hand. Otherwise, the dealer wins.\n" +
"\n" +
"Blackjack has many rule variations. Since the 1960s, blackjack has been a high-profile target of advantage players, particularly card counters, who track the profile of cards that have been dealt and adapt their wagers and ");
        System.out.println("You get a "+player_random1+" and a "+player_random2);
        System.out.println("Your total is "+player_total);
 if(player_total==21)
        {
            System.out.println("Blackjack! Player Wins!");
     return;
        }
 System.out.println();
        
        int dealer_random1 = 100;
        int dealer_random2 = 100;
        
        while(dealer_random1 >= 12 || dealer_random2 >= 12 || dealer_random1 < 3 || dealer_random2 < 3)
        {
            dealer_random1 = (int)(Math.random()*100);
            dealer_random2 = (int)(Math.random()*100);
        }
        
        int dealer_total = dealer_random1 + dealer_random2;
        
        boolean hidden = Math.random() < 0.5; // to decide whether to hide one card or not
        
        if(hidden==true)
        {
            System.out.println("The dealer has a "+dealer_random1+" showing and a hidden card");
     System.out.println("His total is hidden too");
     System.out.println();
        }
        else
        {
            System.out.println("The dealer has a "+dealer_random1+" showing  and a "+dealer_random2);
            System.out.println("Dealer total is "+dealer_total);
     System.out.println();
     if(dealer_total==21)
            {
                 System.out.println("Blackjack! Dealer Wins!");
   return;
            }
        }

        String player_preference;
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to hit or stay?");
        player_preference = in.nextLine();

        while(player_preference.equals("hit"))
        {
            int player_random3 = 100;
            while(player_random3 >= 12  || player_random3 < 3)
            {
                player_random3 = (int)(Math.random()*100);
            }
            player_total = player_total + player_random3;
            System.out.println("You drew a "+player_random3);
            System.out.println("Your total is "+player_total);
     System.out.println();

            if(player_total>21)
            {
                System.out.println("Busted! Dealer wins!");
                return;
            }
            else if(player_total==21)
                {
                    System.out.println("You Win!");
                    return;
                }
            System.out.println("Would you like to hit or stay?");
            player_preference = in.nextLine();
        }
        
        if (player_preference.equals("stay"))
        {
            System.out.println();
            System.out.println("Okay, dealer's turn.");
            int dealer_random3 = 100;
            while(dealer_random3 >= 12 || dealer_random3 <3)
            {
                dealer_random3 = (int)(Math.random()*100);
            }

            System.out.println("His hidden card was "+dealer_random2);
            System.out.println("His total was "+dealer_total);
            System.out.println();

            if(dealer_total>16)
            {
                System.out.println("Dealer stays");
            }
            else
            {
                while(dealer_total<=16)
                {
                    dealer_total = dealer_total + dealer_random3;
                    System.out.println("Dealer choses to hit.");
                    System.out.println("He draws a "+dealer_random3);
                    System.out.println("His total is "+dealer_total);
                }
            }

            System.out.println();
            System.out.println("Dealer total is "+dealer_total);
            System.out.println("Your total is "+player_total);

            if((player_total>dealer_total && player_total<21)||dealer_total>21)
            {
                System.out.println("YOU WIN!");
            }
            else if((dealer_total<21 && player_total<dealer_total)||player_total>21)
                 {
                    System.out.println("Dealer wins!");
                 }
        }
    }
}