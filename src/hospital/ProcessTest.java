package hospital;

public class ProcessTest {
    public static void main(String[] args) {
        PaymentProcess paymentProcess = new PaymentProcess("1234","557","cold",1000);

        try {
            paymentProcess.login("1234","557");
        } catch (CheckedException e) {
            System.out.println(e);

        }
        try {
            paymentProcess.doctorConsult();
        } catch (CheckedException e){
            System.out.println(e);

        }

    }
    }


