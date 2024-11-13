package labwork3;
    public class Deal {
        public static void main(String[] args) {
            int CARDS_PER_PLAYER = 8;
    
            // number of players
            int PLAYERS = Integer.parseInt(args[0]);
    
            String[] SUITS = {
                "Clubs", "Diamonds", "Hearts", "Spades"
            };
    
            String[] RANKS = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace"
            };
    
          int n = SUITS.length * RANKS.length;
    
            if (CARDS_PER_PLAYER * PLAYERS > n)
                throw new RuntimeException("Too many players");
    
        ///initialize deck
            String[] deck = new String[n];
            for(int i = 0; i < RANKS.length;i++){
                for(int j = 0; j < SUITS.length;j++){
                    deck[i * SUITS.length+j]=RANKS[i]+" of "+SUITS[j];            }
            }
        

        ////shuffle deck 

            for(int i = 0; i < n;i++){
                int shuffle = (int)(Math.random()*n-1);
                String temp = deck[shuffle];
                deck[shuffle] = deck[i];
                deck[i]=temp;
            }

        ////deal for the player
        
            for(int i = 0;i < PLAYERS*CARDS_PER_PLAYER;i++){
                System.out.println(deck[i]);
                if(i % CARDS_PER_PLAYER == CARDS_PER_PLAYER-1){
                    System.out.println();
            }
        }
    }
}
     

