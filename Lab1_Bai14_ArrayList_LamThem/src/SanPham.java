import java.util.Scanner;
public class SanPham {
  String ten;
  Double donGia;

  public void nhap() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập tên sản phẩm: ");
    ten = scanner.nextLine();
    System.out.print("Nhập đơn giá: ");
    donGia = scanner.nextDouble();
  }

  public void xuat() {
    System.out.println("Tên: " + ten + " | Giá: " + donGia);
  }
}
