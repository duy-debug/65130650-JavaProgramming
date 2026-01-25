public class Main{
  public static void main(String[] args) {
    // Dùng constructor có tham số
    NhanVien nv1 = new NhanVien("Tran Duy", 21, "Khánh Hòa", 35000000, 250);
    System.out.println(nv1);

    // Dùng constructor không tham số + setter
    NhanVien nv2 = new NhanVien();
    nv2.setHoTen("Nguyen Van A");
    nv2.setTuoi(30);
    nv2.setDiaChi("TP HCM");
    nv2.setTienLuong(20000000);
    nv2.setTongSoGioLam(150);

    // Dùng getter để lấy dữ liệu
    System.out.println("Họ tên: " + nv2.getHoTen());
    System.out.println("Tuổi: " + nv2.getTuoi());
    System.out.println("Địa chỉ: " + nv2.getDiaChi());
    System.out.println("Tiền lương: " + nv2.getTienLuong());
    System.out.println("Tổng giờ làm: " + nv2.getTongSoGioLam());
    System.out.println("Thưởng: " + nv2.tinhThuong());

    // In object (gọi toString)
    System.out.println(nv2);
    System.out.println("---------------------------------------------------------------");
    QuanLyNhanVien quanLyNhanVien = new QuanLyNhanVien();
    NhanVien nv3 = new NhanVien("Ngo Luc", 21, "Khánh Hòa", 36000000, 200);
    NhanVien nv4 = new NhanVien("Ngo Hung", 21, "Khánh Hòa", 36000000, 200);
    NhanVien nv5= new NhanVien("Ngo Lam", 21, "Khánh Hòa", 36000000, 200);
    quanLyNhanVien.them(nv1);
    quanLyNhanVien.them(nv2);
    quanLyNhanVien.them(nv3);
    quanLyNhanVien.them(nv4);
    quanLyNhanVien.them(nv5);
    quanLyNhanVien.inDS();
  }
}