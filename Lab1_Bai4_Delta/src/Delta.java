import java.util.Scanner;
// Viết chương trình nhập các hệ số của phương trình bậc 2. Tính delta và xuất căn delta ra màn hình.
public class Delta {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Nhập 3 cạnh a, b, c
    System.out.print("Nhập a: ");
    double a = scanner.nextDouble();
    System.out.print("Nhập b: ");
    double b = scanner.nextDouble();
    System.out.print("Nhập c: ");
    double c = scanner.nextDouble();

    // Tính delta và căn delta
    double delta = Math.pow(b,2) - 4 * a * c;
    double canDelta = Math.sqrt(delta);

    // Xuất ra màn hình
    System.out.printf("Delta = %.2f\n", delta);
    System.out.printf("Căn delta = %.2f\n", canDelta);  }

}
