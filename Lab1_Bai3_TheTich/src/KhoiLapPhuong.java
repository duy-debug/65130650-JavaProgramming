import java.util.Scanner;
public class KhoiLapPhuong {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    // Nhập cạnh khối lập phương
    System.out.print("Nhập cạnh khối lập phương: ");
    double canhKhoiLapPhuong = scanner.nextDouble();
    double theTich = Math.pow(canhKhoiLapPhuong,3);

    // In ra màn hình thể tích khối lập phương
    System.out.printf("Thể tích khối lập phương: %.2f", theTich);
  }
}
