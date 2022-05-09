import java.util.Scanner;

public class Quy_Doi_Tien_Te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tien USD:");
        double usd = sc.nextDouble();
        double quyDoi = usd*23000;
        System.out.println("So tien "+ usd+" USD="+quyDoi+"VND");
    }
}
