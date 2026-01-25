import java.util.Scanner;
//Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện theo
//phương pháp lũy tiến
//✓ Nếu số điện sử dụng từ 0 đến 50 thì giá mỗi số điện là 1000
//✓ Nếu số điện sử dụng trên 50 thì giá mỗi số điện vượt hạn mức là 1200
public class TienDien {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập số điện sử dụng: ");
    double soDienSuDung = scanner.nextDouble();
    double soTien = 0;
    if(soDienSuDung >= 0 && soDienSuDung <= 50) {
      soTien = soDienSuDung * 1000;
    }
    if(soDienSuDung > 50) {
      soTien = (soDienSuDung - 50) * 1200 + 50 * 1000;
    }
    System.out.printf("Số tiền sử dụng: %.2f", soTien);
  }
}
