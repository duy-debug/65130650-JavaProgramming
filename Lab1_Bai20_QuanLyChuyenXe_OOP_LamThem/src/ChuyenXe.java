public abstract class ChuyenXe {
  protected String maSoChuyen;
  protected String hoTenTaiXe;
  protected String soXe;
  public double doanhThu;

  public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
    this.maSoChuyen = maSoChuyen;
    this.hoTenTaiXe = hoTenTaiXe;
    this.soXe = soXe;
    this.doanhThu = doanhThu;
  }

  public double getDoanhThu(){
    return doanhThu;
  }
  public abstract void inThongTin();
}
