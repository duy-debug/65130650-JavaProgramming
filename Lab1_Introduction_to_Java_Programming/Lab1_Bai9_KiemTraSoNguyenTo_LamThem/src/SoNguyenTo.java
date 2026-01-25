import java.util.Scanner;
// Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số
//nguyên tố hay không (số nguyên tố là số chỉ chia hết cho 1 và chính nó).
public class SoNguyenTo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập một số nguyên: ");
    int n = scanner.nextInt();
    // Số nguyên tố bắt đầu từ 2
    if (n <= 1) {
      System.out.print(n + " không phải là số nguyên tố");
      return;
    }
    int laSoNguyenTo = 1; // đặt cờ mặc định 1 là số nguyên tố
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        laSoNguyenTo = 0; // Không phải số nguyên tố gán cờ = 0
        break; // thoát khỏi vòng lặp
      }
    }
    if (laSoNguyenTo == 1) {
      System.out.print(n + " là số nguyên tố");
    } else {
      System.out.print(n + " không phải là số nguyên tố");
    }
  }
}
