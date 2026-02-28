package day6.staticInnerclass;

public class University {
    static class Admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        boolean result = University.Admission.isEligible(45);
        System.out.println(result);
        boolean result2= University.Admission.isEligible(69);
        System.out.println(result2);
    }
}
/*
! PTR:
*No University object needed - no heap memory needed
*logical grouping of data - improves readability
* similar to creating utility helper classes
 */