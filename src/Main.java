import java.util.Scanner;

public class Main {

    static int sum(int a, int b) {
        return a + b;
    }

    static int minus(int a, int b) {
        return a - b;
    }

    static int times(int a, int b) {
        return a * b;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= i;
        }

        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static int factoriyel(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result *= i;
        }

        return result;
    }

    static void rectangleCalc(int a, int b) {
        int circle = 2 * (a + b);
        int area = a * b;
        System.out.println("Dikdörgenin Çevresi : " + circle);
        System.out.println("Dikdörgenin Alanı : " + area);
    }

    static void ekranaYazdir(int result) {
        System.out.println("İşlem Sonucu : " + result);
    }

    static void ekranaStringYazdir() {
        System.out.println("Math Error");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select, a, b=0;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);
        while (true) {
            System.out.print("Bir işlem seçiniz : ");
            select = scan.nextInt();

            if (select == 0) {
                break;
            }

            if (select == 6) {
                System.out.print("Sayı giriniz : ");
                a = scan.nextInt();
            } else {
                System.out.print("1. sayıyı giriniz : ");
                a = scan.nextInt();
                System.out.print("2. giriniz : ");
                b = scan.nextInt();
            }

            switch (select) {
                case 1:
                    ekranaYazdir(sum(a, b));
                    break;
                case 2:
                    ekranaYazdir(minus(a, b));
                    break;
                case 3:
                    ekranaYazdir(times(a, b));
                    break;
                case 4:
                    if (divided(a, b) == 0) {
                        ekranaStringYazdir();
                    } else {
                        ekranaYazdir(divided(a, b));
                    }

                    break;
                case 5:
                    ekranaYazdir(power(a, b));
                    break;
                case 6:
                    ekranaYazdir(factoriyel(a));
                    break;
                case 7:
                    ekranaYazdir(mod(a, b));
                    break;
                case 8:
                    rectangleCalc(a, b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz.");
            }

        }
        System.out.println("Program sonlandırıldı!");

    }
}