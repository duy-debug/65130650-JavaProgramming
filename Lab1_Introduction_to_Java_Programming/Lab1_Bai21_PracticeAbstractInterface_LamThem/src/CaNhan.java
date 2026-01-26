public abstract class CaNhan {
  protected String hoTen;
  protected int tuoi;
  protected String diaChi;
  protected String sdt;

  public CaNhan(String hoTen, int tuoi, String diaChi, String sdt) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.sdt = sdt;
  }

  public String getHoTen() {
    return hoTen;
  }

  public void setHoTen(String hoTen) {
    this.hoTen = hoTen;
  }

  public int getTuoi() {
    return tuoi;
  }

  public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
  }

  public String getDiaChi() {
    return diaChi;
  }

  public void setDiaChi(String diaChi) {
    this.diaChi = diaChi;
  }

  public String getSdt() {
    return sdt;
  }

  public void setSdt(String sdt) {
    this.sdt = sdt;
  }

  public abstract String HienThiTT();
}
