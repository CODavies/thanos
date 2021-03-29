package ChapterThree;

public class AirlineReservationSystem {
    boolean[] seats = new boolean[10];


    public void assignSeatTypeFirstClass() {
        for (int i = 0; i <= 4; i++) {
            if (!seats[i]) {
                seats[i] = true;
                break;
            }
        }
    }

    public void assignSeatTypeEconomy() {
        for (int j = 5; j < seats.length; j++) {
            if (!seats[j]) {
                seats[j] = true;
            }
        }
    }

    public boolean[] getSeats() {
        return seats;
    }

    public void seatsNotAvailable() {
        for (int j = 0; j < seats.length; j++) {
            if (!seats[j]) {
                seats[j] = true;
            }
        }

    }

    public boolean[] getFreeSeats() {
        return seats;
    }
}











