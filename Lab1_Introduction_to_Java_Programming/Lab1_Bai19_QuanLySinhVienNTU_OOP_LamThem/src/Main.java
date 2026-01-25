public class Main{
  public static void main(String[] args) {
    SinhVienNTU svIT = new SinhVienIT("Duy", "Công Nghệ Thông Tin", 9,10,10);
    SinhVienNTU svBIZ = new SinhVienBiz("Duy", "Marketing", 9,10);
    svIT.inThongTin();
    svBIZ.inThongTin();
  }
}