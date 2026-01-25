public class NhanVien {
  private String hoTen;
  private int tuoi;
  private String diaChi;
  private double tienLuong;
  private int tongSoGioLam;

  public NhanVien(String hoTen, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
    this.hoTen = hoTen;
    this.tuoi = tuoi;
    this.diaChi = diaChi;
    this.tienLuong = tienLuong;
    this.tongSoGioLam = tongSoGioLam;
  }

  public NhanVien() {
    this.hoTen = "";
    this.tuoi = 0;
    this.diaChi = "";
    this.tienLuong = 0;
    this.tongSoGioLam = 0;
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

  public double getTienLuong() {
    return tienLuong;
  }

  public void setTienLuong(double tienLuong) {
    this.tienLuong = tienLuong;
  }

  public int getTongSoGioLam() {
    return tongSoGioLam;
  }

  public void setTongSoGioLam(int tongSoGioLam) {
    this.tongSoGioLam = tongSoGioLam;
  }

  @Override
  public String toString() {
    return "NhanVien{" +
            "hoTen='" + hoTen + '\'' +
            ", tuoi=" + tuoi +
            ", diaChi='" + diaChi + '\'' +
            ", tienLuong=" + tienLuong +
            ", tongSoGioLam=" + tongSoGioLam +
            ", thuong=" + tinhThuong() +
            '}';
  }
  public double tinhThuong(){
    double thuong=0;
    if(tongSoGioLam >= 200){
      thuong = tienLuong * 0.2;
    }
    else if(tongSoGioLam >= 100){
      thuong = tienLuong * 0.1;
    }
    if(tongSoGioLam < 100 && tongSoGioLam >= 0){
      thuong = 0;
    }
    return thuong;
  }
}
