public class SinhVien {
  private String hoTen;
  private String email;
  private String soDienThoai;
  private String cmnd;

  public SinhVien(String hoTen, String email, String soDienThoai, String cmnd) {
    this.hoTen = hoTen;
    this.email = email;
    this.soDienThoai = soDienThoai;
    this.cmnd = cmnd;
  }

  @Override
  public String toString() {
    return "SinhVien{" +
            "hoTen='" + hoTen + '\'' +
            ", email='" + email + '\'' +
            ", soDienThoai='" + soDienThoai + '\'' +
            ", cmnd='" + cmnd + '\'' +
            '}';
  }
}
