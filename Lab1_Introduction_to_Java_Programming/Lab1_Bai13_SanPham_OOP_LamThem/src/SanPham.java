import java.util.Scanner;
public class SanPham {
  public String tenSp;
  public double donGia;
  public double giamGia;
  public double getThueNhapKhau() {
    return donGia * 0.1;
  }

  public void nhap(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập tên sản phẩm: ");
    this.tenSp = scanner.nextLine();
    System.out.print("Nhập đơn giá: ");
    this.donGia = scanner.nextDouble();
    System.out.print("Nhập giảm giá: ");
    this.giamGia = scanner.nextDouble();
  }
  public void xuat(){
    System.out.println("Tên sản phẩm: "+tenSp);
    System.out.println("Đơn giá: "+donGia);
    System.out.println("Giảm giá: "+giamGia);
    System.out.println("Thuế nhập khẩu 10%: "+getThueNhapKhau());
  }

}
