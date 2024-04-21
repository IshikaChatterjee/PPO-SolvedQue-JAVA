// A Party has been organized on cruise. The party is organized for a limited time t. The no of guests entering is E[i] AND the 
// number of guests leaving is L[i] every hour.
// The task is to find the maximum no. of guests present on the cruise.
// ( NOTE : array E and L size will always be the same ) WHERE E[i] = [7,0,5,1,3]  and L[i] = [1,2,1,3,4]
// Constrains: 1 <= T <= 25 , 0 <= E[i] <= 500 , 0 <= L[i] <=500


public class MaxGuestsOnCruise {

    public static int maxGuests(int[] entrance, int[] exits) {

        int maxGuests = 0;
        int currentGuests = 0;

        for (int i = 0; i < entrance.length; i++) {
    
            int netChange = entrance[i] - exits[i];

            currentGuests += netChange;

            maxGuests = Math.max(maxGuests, currentGuests);
        }

        return maxGuests;
    }

    public static void main(String[] args) {

        int[] entrance = {7, 0, 5, 1, 3};
        int[] exits = {1, 2, 1, 3, 4};

        int maxGuests = maxGuests(entrance, exits);
        System.out.println("Maximum number of guests present on the cruise: " + maxGuests);
    }
}


