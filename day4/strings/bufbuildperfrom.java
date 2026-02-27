package day4.strings;

public class bufbuildperfrom {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("java");
        for(int i=1;i<257360;i++){
            buffer.append("DSA");
        }
        System.out.println("Builder time: "+ (System.currentTimeMillis() - start )+"ms");
        StringBuilder build= new StringBuilder("java");
        for(int i=1;i<257360;i++){
            build.append("DSA");
        }
        System.out.println("Buffer time: "+ (System.currentTimeMillis() - start )+"ms");

    }
}
