public class HocSinh extends CaNhan{
  protected String lop;
  protected String nangKhieu;
  public HocSinh(String hoTen, int tuoi, String diaChi, String sdt ,String lop, String nangKhieu) {
    super(hoTen, tuoi, diaChi, sdt);
    this.lop = lop;
    this.nangKhieu = nangKhieu;
  }
  @Override
  public String HienThiTT(){
    return "Họ tên: "+ hoTen +
            ", Tuổi: "+tuoi+
            ", Địa chỉ: " + diaChi +
            ", Số điện thoại: "+sdt+
            ", Lớp: "+lop+
            ", Năng khiếu: "+nangKhieu;
  }
}
