package day4.association.aggregation;

public class patient {
    String patientName;
    int patientAge;
    String disease,dateOfArrival;
    information info;
    payment pay;
    public patient(String patientName, String dateOfArrival, String disease, int patientAge,information info,payment pay) {
        this.patientName = patientName;
        this.dateOfArrival = dateOfArrival;
        this.disease = disease;
        this.patientAge = patientAge;
        this.pay=pay;
        this.info=info;
    }
    void patientDetails(){
        System.out.println("Name: "+this.patientName);
        System.out.println("AGE: "+this.patientAge);
        System.out.println("Disease: "+this.disease);
        System.out.println("Date Of Arrival: "+this.dateOfArrival);
        System.out.println("Block Number: "+this.info.blockNo);
        System.out.println("Floor number: "+this.info.floorNo);
        System.out.println("Room number: "+this.info.roomNo);
        System.out.println("Bed Number: "+this.info.roomNo);
        System.out.println("Admission fees: "+this.pay.admFees);
        System.out.println("Registration Fees: "+this.pay.regFees);
        System.out.println("Balance amount: "+this.pay.balAmt);
    }

    public static void main(String[] args) {
        information info=new information(3,420,45,'C');
        payment pay=new payment(5000,5000,10000);
        patient p1=new patient("Bobzy","06/02/2026","Covid",23,info,pay);;
        p1.patientDetails();
    }

}
