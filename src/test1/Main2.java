package test1;

public class Main2 {
    public static void main(String[] args) {
        //примитивные типы
        byte bt = 127;
        System.out.println(Byte.MAX_VALUE);

        short sh = 32767;
        System.out.println(Short.MAX_VALUE);

        int i = 2147483647; // по умолчанию
        System.out.println(Integer.MAX_VALUE);

        long l = 9223372036854775807L;
        System.out.println(Long.MAX_VALUE);

        char ch = 23000;
//        char ch = D;
        System.out.println(ch);
        System.out.println(Character.MAX_VALUE);

        String s = "hello";
        System.out.println(s);

        boolean b = true;
        System.out.println(b);

        double d = 54.4555; // по умолчанию
        System.out.println(Double.MAX_VALUE);

        float f = 43.5F;
        float f2 = 20000L;
        System.out.println(Float.MAX_VALUE);

//        void v = null;

//        BigDecimal bigDecimal; бесконечное дробное
//        BigInteger bigInteger; бесконечное целое
    }
}
