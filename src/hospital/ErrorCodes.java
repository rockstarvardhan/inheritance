package hospital;

public enum ErrorCodes {
    INVALID_DETAILS_1000("INVALID_DETAILS_1000","Invalid username/password"),
        INVALID_DISEASE_1001("INVALID_DETAILS_1001","Doctor is not avaliable"),
    INVALID_PAYMENT_1003("INVALID_DETAILS_1003","payment is not done");

    String code;

    String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCodes(String code, String message) {
        this.code = code;
        this.message = message;

    }
}
