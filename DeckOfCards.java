
package Arrays;
/* cardnumber/13 gives suit
   cardnumber|%13 gives rank
*/

public class DeckOfCards {
    
    public static void main(String[] args) {
        
        int[] deck=new int[52]; 
        String[] suits = {"Hearts","Spades","Clubs","Diamonds"};
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        
        for(int i=0;i<deck.length;i++)//initialize the cards
            deck[i]=i;
        
        for(int i=0;i<deck.length;i++){//shuffle the cards
            int index=(int)(Math.random()*deck.length);
            int temp=deck[i];
            deck[i]=deck[index];
            deck[index]=temp;
                    
        }
            
        for(int i=0;i<4;i++){
            String suit=suits[deck[i]/13];//cardnumber/13 gives suit
            String rank=ranks[deck[i]%13];//cardnumber|%13 gives rank
            System.out.println("Card number " + deck[i] + ": " + rank + " of " + suit);
        }
    }
    
}
