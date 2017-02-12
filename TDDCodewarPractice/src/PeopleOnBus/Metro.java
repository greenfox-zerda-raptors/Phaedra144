package PeopleOnBus;

import java.util.ArrayList;

class Metro {

    public static int countPassengers(ArrayList<int[]> stops) {

        int getIn = 0;
        int getOff = 0;
        for (int[] stop : stops) {
            getIn += stop[0];
            getOff += stop[1];
        }
        return getIn - getOff;
    }
}

