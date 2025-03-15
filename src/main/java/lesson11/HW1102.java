package lesson11;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;

public class HW1102 {
    public static void main(String[] args) {
//        wrapperClass();
//        stringClass();
//        stringBuilderClass();
//        bigIntegerClass();
//        bigDecimalClass();
    }

    private static void wrapperClass() {
        Integer num = 100;
        Double num2 = 5.5;
        Integer num3 = 100;

        System.out.println(num.equals(num3));
        System.out.println(num.toString());
        System.out.println(Double.valueOf(num2.toString()));


    }
    private static void stringClass(){
        String str1 = "Hello 1";
        String str2 = "Hello 1";
        String str3 = new String("Hello 2");
        System.out.println(str1.equals(str2));
        System.out.println(str3.toLowerCase());
        System.out.println(str3.toUpperCase());
        System.out.println("str3 = " + str3);
        System.out.println(str1.substring(1, 4));
        System.out.println(str2.replace('e', 'i'));
        System.out.println("str1 = " + str1);
    }
    private static void stringBuilderClass(){
        StringBuilder str1 = new StringBuilder("Java ");
        str1.append("is complicated but awesome");
        System.out.println("str1 = " + str1);

        str1.insert(0,"This is Java ");
        System.out.println("str1 = " + str1);

        str1.reverse();
        System.out.println("str1 = " + str1);
    }
    private static void bigIntegerClass(){
        BigInteger num = new BigInteger("100000000000000000");
        BigInteger num2 = new BigInteger("2000000000000000000");

        BigInteger sum = num.add(num2);
        BigInteger diff = num.subtract(num2);
        BigInteger product = num.multiply(num2);
        BigInteger result = sum.divide(diff);

        System.out.println(sum);
        System.out.println(diff);
        System.out.println(product);
        System.out.println(result);

    }
    private static void bigDecimalClass(){
        BigDecimal num = new BigDecimal("124567890.0987654321");
        BigDecimal num2 = new BigDecimal("987654321.123456789");
        BigDecimal sum = num.add(num2);
        BigDecimal diff = num.subtract(num2);
        BigDecimal product = num.multiply(num2);

        // divide phải có số thập phân hữu hạn
        BigDecimal result = num.divide(num2, 10, RoundingMode.CEILING);
        System.out.println(sum);

    }
}
