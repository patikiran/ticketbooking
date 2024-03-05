public class ExceptionTest {
    public static void main(String[] args) {
        TicketBookingProcess ticketBookingProcess = new TicketBookingProcess("Kiran","225",13);
        try{
            ticketBookingProcess.TicketBooking("Kiran","225");
        }catch (PaymentException e){
            System.out.println(e.getMessage());
        }
    }
}
