package hospital;

public class OtpVerification {
    public String mobileNo;
    public String otp;

    public OtpVerification(String mobileNo, String otp) {
        this.mobileNo = mobileNo;
        this.otp = otp;
    }
    public void login(String mobileNo,String otp) throws CheckedException {
        if(this.mobileNo.equals(mobileNo)&&this.otp.equals(otp)){
            System.out.println("login is sucessfull");
        } else {
            System.out.println("login is fail");
            throw new CheckedException(ErrorCodes.INVALID_DETAILS_1000.getCode(), ErrorCodes.INVALID_DETAILS_1000.getMessage());

        }

    }




    }


