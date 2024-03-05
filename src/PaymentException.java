public class PaymentException extends Exception {

    String code;

    public PaymentException(String code,String massage) {
        super(massage);
        this.code = code;

    }

    public String getCode() {
        return code;
    }

}
