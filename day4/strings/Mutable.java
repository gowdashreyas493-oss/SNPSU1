package day4.strings;

public class Mutable {
    public static void main(String[] args) {
        String s="BOBZY";
        s+=" THE KING";
        System.out.println(s);
        StringBuffer buf= new StringBuffer("BOBZY");
        buf.append(" THE KING");
        System.out.println(buf);
        StringBuilder build= new StringBuilder("BOBZY");
        build.append(" THE KING");
        System.out.println(build);
    }
}
