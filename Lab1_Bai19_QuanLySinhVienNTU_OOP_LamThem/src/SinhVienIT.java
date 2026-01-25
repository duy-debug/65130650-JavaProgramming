public class SinhVienIT extends SinhVienNTU {
  private final float diemJava;
  private final float diemCSS;
  private final float diemHTML;
  public SinhVienIT(String hoTen,String nganh,float diemJava, float diemCSS, float diemHTML) {
    super(hoTen, nganh);
    this.diemJava = diemJava;
    this.diemCSS = diemCSS;
    this.diemHTML = diemHTML;
  }
  @Override
  public double getDiemTB(){
    double diemTB;
    // Tính điểm trung bình = môn học * hệ số / tổng hệ số
    diemTB = (diemJava  * 2 + diemCSS * 1 + diemHTML * 1)/4;
    return diemTB;
  }
}
