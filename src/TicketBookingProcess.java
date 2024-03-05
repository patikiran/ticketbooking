public class TicketBookingProcess extends TicketBooking{
    int remainingSeats;

    public TicketBookingProcess(String userName, String passWord, int noOfSeats) {
        super(userName, passWord, noOfSeats);

    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public int TicketBooking(String userName, String passWord) throws PaymentException{
        this.userName="Kiran";
        this.passWord="1435";
        int totalAvaibeSeats=20;
        int totalNoOfSeats=0;
        if (userName.equals(userName) &&  this.passWord.equals(passWord)){
            System.out.println("Login succesfull");
            if (noOfSeats<totalAvaibeSeats){
                remainingSeats=totalAvaibeSeats-noOfSeats;
                System.out.println("Booking seats="+noOfSeats);
                System.out.println("Remaining seats="+remainingSeats);
            }

        }else {
            remainingSeats=totalAvaibeSeats-noOfSeats;
            System.out.println("After Booking Seats="+remainingSeats);
            System.out.println("Hold Seats="+noOfSeats);
            System.out.println("Payment Cancel");
            totalNoOfSeats=remainingSeats+noOfSeats;
            System.out.println("After payment cancel no of seats="+totalNoOfSeats);
            throw new PaymentException(ErrorCode.PAYMENT_FAILED.getCode(), ErrorCode.PAYMENT_FAILED.getMessage());
        }
        return totalNoOfSeats;
    }
}
