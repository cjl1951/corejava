import java.util.Scanner;

/**
 * A sample Java program
 * Java is case-sensitive: Main!=main.
 * Keywords: public, static, etc.
 * Braces {} are used for blocks.
 * Statements end in semicolons.
 * Everything is inside a class.
 * By convention, class names are CameLCase.
 * Source file must be called FirstSample.java.
 *
 * method calls
 * Object.method(parameters)
 *
 * comments
 * single-line comments:
 * multi-line comments
 * Documentation comments
 *   caution: multi-line comments do not nest.
 *
 * Integers
 *  four integer types: int, short, long, byte
 *      int   4bytes -2147483648 to 2147483647
 *      short 2bytes -32768 to 32767
 *      long  8bytes -9223372036854775808 to 9223372036854775807
 *      byte  1byte  -128 to 127
 *
 * Literals
 *  Long: 4000000000L
 *  Hex: 0xCAFE
 *  Binary: 0b1111_0100_0010_0100_0000
 *
 * Floating-Point Numbers
 *  Two floating-point types:
 *      float  4bytes Approximately ±3.4028235E38 (6-7 significant decimal digits)
 *      double 8bytes Approximately ±1.7976931348623157E308 (15 significant decimal digits)
 *
 *  float literals: 0.5F
 *  Only use float if a library requires it.
 *  Special values Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NaN.
 *
 * The char Type
 *  Originally used to describe Unicode characters.
 *  Nowadays: "Code Units" in the UTF-16 encoding.
 *  Every Unicode character requires one or two `char` values:
 *      A has "code point" U+0041 and is encoded as a single `char` value (hex 0041 or decimal 65).
 *      ◎ has "code point" U+1D546 and is encoded by two code units with hex values D835 DD46.
 *  Avoid `char` unless you know that you can't won't run into Unicode characters ≥ U+10000.
 *  Character literals enclosed in single quotes: 'A', '\n', '\u2122'.
 *
 * The boolean Type
 *  Two value: false, true.
 *  No conversion between `int` and boolean.
 *  All together, java has eight primitive types:
 *      int, long, short, byte
 *      double, float
 *      char
 *      boolean
 *
 * Variables
 *  Every variable must be declared with a type, which comes before the name
 *  Initialization is optional
 *  Declaration can appear anywhere in block
 *  Can assign new value with `=` operator
 *  Constant declared with `final`
 *
 * Mathematical Operations and Functions
 *  Arithmetic: +, -, *, `/`
 *  Integer division and modulus: `/` and % (with integer operands):
 *      15 / 2 is 7.
 *      15.0 / 2 is 7.5.
 *      15 % 2 is 1.
 *  Math.sqrt(x) is √ x.
 *  Math.pow(a, b) is a^b
 *  Math.floorMod(a, b) is like a % b with better behavior for negative values:
 *      Math.floorMod(-15, 2) is 1.
 *  Trig and log functions: Math.sin, Math.log, ...
 *
 * Type Conversions
 *
 *
 * @author tonychen
 * @date 2023/4/15 12:06
 */
public class FirstSample {
    public static void main(String[] args) {
        System.out.println("Integer min value is=" + Integer.MIN_VALUE + ",Integer max value is=" + Integer.MAX_VALUE);
        System.out.println("Short min value is=" + Short.MIN_VALUE + ",Short max value is=" + Short.MAX_VALUE);
        System.out.println("Long min value is=" + Long.MIN_VALUE + ",Long max value is=" + Long.MAX_VALUE);
        System.out.println("Byte min value is=" + Byte.MIN_VALUE + ",Byte max value is=" + Byte.MAX_VALUE);
        System.out.println("Float min value is=" + Float.MIN_VALUE + ",Float max value is=" + Float.MAX_VALUE);
        System.out.println("Double min value is=" + Double.MIN_VALUE + ",Double max value is=" + Double.MAX_VALUE);
        System.out.println("Special Value Double.POSITIVE_INFINITY=" + Double.POSITIVE_INFINITY + ",and Double.NEGATIVE_INFINITY=" + Double.NEGATIVE_INFINITY + " and Double.NaN=" + Double.NaN);
        int a = 'A';
        System.out.println(a);
        a = '\n';
        System.out.println(a);
        a = '\u2122';
        System.out.println(a);
        char single = '\u2122';
        System.out.println(single);
        boolean flag = true;
        // java: incompatible types: boolean cannot be converted to int
//        int d = flag;
        System.out.println(Math.floorMod(-15, 2));
        System.out.println("We will not use 'Hello Java\u2122!'");
        String helloTM = "Java\u2122";
        System.out.println(helloTM);
        String substring = helloTM.substring(0, 3);
        System.out.println(substring);
        System.out.println(helloTM.length());
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13;
        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);
        int index = helloTM.offsetByCodePoints(0, 3);
        int cp = helloTM.codePointAt(index);
        System.out.println(index);
        System.out.println(cp);
        for (int i = 0; i < helloTM.codePoints().toArray().length; i++) {
            System.out.println(helloTM.codePoints().toArray()[i]);
        }

        String repl = "\ufffd";
        System.out.println(repl);

        System.out.printf("%(,.2f", -10000.00 / 3.0);

        Scanner in = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = in.nextLine();

        System.out.print("How old are you? ");
        age = in.nextInt();

        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
    }
}
