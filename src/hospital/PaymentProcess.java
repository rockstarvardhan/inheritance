package hospital;

public class PaymentProcess extends DoctorSelection implements Payment{
    public int totalAmt;
    public int consultFee = 300;

    public PaymentProcess(String mobileNo, String otp, String diseaseName,int totalAmt) {
        super(mobileNo, otp, diseaseName);
        this.totalAmt=totalAmt;

    }

    @Override
    public boolean payment() throws CheckedException {
        if(totalAmt>=consultFee){
            System.out.println("payment is sucess");
            totalAmt=totalAmt-consultFee;
            System.out.println(totalAmt);
        } else {
            System.out.println("payment is failed");
            try {
                throw new CheckedException(ErrorCodes.INVALID_PAYMENT_1003.getCode(), ErrorCodes.INVALID_DETAILS_1000.getMessage());
            } catch (CheckedException e) {
                throw new RuntimeException(e);
            }

        }
        return false;
    }


}
