import java.util.Scanner;

public class Tinh_So_Ngay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so thang:");
        int a = sc.nextInt();
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay !");
                break;
            case 2:
                System.out.println("Thang co 28 hoac 29 ngay!");
                break;
        }
    }
}
