public class Booking {

    private Bedroom bedroom;
    private int numNights;

    public Booking(Bedroom bedroom, int numNights) {
        this.bedroom = bedroom;
        this.numNights = numNights;
    }

    public int getNumberNights() {
        return this.numNights;
    }

    public Bedroom getBedroom() {
        return this.bedroom;
    }

    public void setNumberNights(int numNights) {
        this.numNights = numNights;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }


}
