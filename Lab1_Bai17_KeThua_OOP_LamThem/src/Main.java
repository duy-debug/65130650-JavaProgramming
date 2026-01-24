/*
Xây dựng lớp ChuNhat gồm 2 thuộc tính là rong và dai và các phương thức
getChuVi() và getDienTich() để tính chu vi và diện tích. Phương thức xuat() sẽ xuất
ra màn hình chiều rộng, chiều dài, diện tích và chu vi.
Xây dựng lớp Vuong kế thừa từ lớp ChuNhat và ghi đè phương thức xuat() để xuất
thông tin cạnh, diện tích và chu vi.
Viết chương trình nhập 2 hình chữ nhật và một hình vuông sau đó xuất ra màn
hình.
 */
public class Main{
  public static void main(String[] args) {
    ChuNhat chuNhat1 = new ChuNhat(4,6);
    ChuNhat chuNhat2 = new ChuNhat(4,2);
    ChuNhat hinhVuong = new Vuong(5);
    chuNhat1.xuat();
    chuNhat2.xuat();
    hinhVuong.xuat();
  }
}