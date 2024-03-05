public enum ErrorCode {
    PAYMENT_FAILED("Error Code_","401");
        String Message;
        String code;

    ErrorCode(String message, String code) {
        Message = message;
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public String getCode() {
        return code;
    }
}
