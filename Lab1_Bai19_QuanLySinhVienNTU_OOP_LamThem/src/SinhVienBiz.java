public class SinhVienBiz extends SinhVienNTU {
  private final float diemMarketing;
  private final float diemSales;
  public SinhVienBiz(String hoTen,String nganh, float diemMarketing, float diemSales) {
    super(hoTen, nganh);
    this.diemMarketing = diemMarketing;
    this.diemSales = diemSales;
  }
  @Override
  public double getDiemTB(){
    double diemTB;
    // Tính điểm trung bình = môn học * hệ số / tổng hệ số
    diemTB = (diemMarketing  * 2 + diemSales * 1)/3;
    return diemTB;
  }
}
