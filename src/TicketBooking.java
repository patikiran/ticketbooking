public class TicketBooking extends BookMyShow {

    int noOfSeats;

    public TicketBooking(String userName, String passWord,int noOfSeats) {
        super(userName, passWord);
        this.noOfSeats=noOfSeats;

    }

    public int getNoOfSeats() {
        return noOfSeats;
    }
}
