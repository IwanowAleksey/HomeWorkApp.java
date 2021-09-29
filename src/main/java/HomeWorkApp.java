
public class HomeWorkApp {
    public static void main(String[] args) {
        digitealSignatureSet(5, 7);
        integers(12);
        returningNumbers(7);
        printlines();
        learyear(1987);
    }

    public static boolean digitealSignatureSet(int a, int b) {
        int summa = a + b;
        if (summa > 10 && summa <= 20) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }

    public static void integers(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else if (a >= 0) {
            System.out.println("Число положительное");
        }
    }

    public static boolean returningNumbers(int c) {
        if (c > 0){
            System.out.println("false");
            return false;
        }else {
            System.out.println("true");
            return true;
        }
    }
    public static void printlines() {
        String x = "Java";
        int a = 10;
        for (int i = 0; i < a; i++) {
            System.out.println(x);
        }
    }
    public static boolean learyear(int a) {
        if ( a % 400 == 0 && a % 4 == 0 || a % 100 != 0){
            System.out.println("Год  високосный");
            return false;
        }else {
            System.out.println("Год не висококосный");
            return true;
        }
    }
}