package hospital;

public class PatientDetails extends OtpVerification {
    public String name;
    public String gender;

    public String diseaseName;

    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", diseaseName='" + diseaseName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", otp='" + otp + '\'' +
                '}';
    }

    public PatientDetails(String mobileNo, String otp, String diseaseName) {
        super(mobileNo, otp);
        this.diseaseName = diseaseName;
        this.name="vijay";
        this.gender="male";


    }
}




