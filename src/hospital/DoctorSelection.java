package hospital;

public class DoctorSelection extends PatientDetails{
    public String disease1="fever";
    public String disease2="cold";


    public DoctorSelection(String mobileNo, String otp, String diseaseName) {
        super(mobileNo, otp, diseaseName);

    }
    public void doctorConsult() throws CheckedException {
        if (diseaseName.equals(this.disease1)){
            System.out.println("consult the doctor.ganesh");

        }  else if (diseaseName.equals(this.disease2)){
            System.out.println("consult doctor .ravi");
        } else {
            System.out.println("doctors are not avaliable");
            throw  new CheckedException(ErrorCodes.INVALID_DISEASE_1001.getCode(),ErrorCodes.INVALID_DETAILS_1000.getMessage());

        }

    }

}
