/**
 * @author ruofeng gao
 * @version studyNote 1.0
 */
public class helloworld {
    static int x = 'a';// if byte y = x + 1; then error
    static char a = 'a';
    static String b = x + "";
    static float c = 5.12E-2F;
    static double d = .5F;
    static double e = 2.7;
    static double f = 8.1 / 3;
    static float g = 1.0f + x;
    // static String h = a+"";

    public static boolean compareTwoDouble(double a, double b) {
        // if (a < b)
        if (a == b)
        // if(Math.abs(a-b)<1e-6)
        {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(compareTwoDouble(f, e));// false 2.7 is not equal to 2.6999999999999997
        System.out.println(c + d);
        System.out.println(g);
        int y = Integer.parseInt(b);
        char z = b.charAt(0);
        System.out.println(a + "" + (int) z + "|" + a +
                " " + y + "" + x + "|" + z);// ((int)a+'b')ture
    }

    public static int add(int a, int b) {
        a = 1;
        b = 2;
        return a + b;
    }
}
