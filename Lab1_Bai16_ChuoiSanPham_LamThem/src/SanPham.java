import java.util.*;
public class SanPham {
  public String tenSanPham;
  public double donGia;
  public String hang;
  Scanner scanner = new Scanner(System.in);
  public void nhap(){
    System.out.print("Nhập tên sản phẩm: ");
    this.tenSanPham = scanner.nextLine();
    System.out.print("Nhập đơn giá: ");
    donGia = Double.parseDouble(scanner.nextLine());
    System.out.print("Nhập tên hãng: ");
    this.hang = scanner.nextLine();
  }
  public void xuat(){
    System.out.println("Tên sản phẩm: "+ this.tenSanPham);
    System.out.printf("Tên sản phẩm: %.2f\n", this.donGia);
    System.out.print("Tên sản phẩm: "+ this.hang);
  }
}
