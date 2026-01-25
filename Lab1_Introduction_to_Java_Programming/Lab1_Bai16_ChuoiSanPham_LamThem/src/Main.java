import java.util.*;
public class Main{
  public static void main(String[] args) {
    List<SanPham> list = new ArrayList<>();
    // Nhập 5 sản phẩm
    for(int i=0; i<1; i++){
      SanPham sanPham = new SanPham();
      sanPham.nhap();
      list.add(sanPham);
    }
    // Xuất sản phẩm có hãng là Nokia
    System.out.println("Các sản phẩm có hãng Nokia:");
    for (SanPham sanPham : list) {
      if (sanPham.hang.trim().equals("Nokia")) {
        sanPham.xuat();
      }
    }
  }
}