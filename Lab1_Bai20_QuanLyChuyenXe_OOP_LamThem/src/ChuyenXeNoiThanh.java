public class ChuyenXeNoiThanh extends ChuyenXe {
  public double soTuyen;
  public double soKm;

  public ChuyenXeNoiThanh(double soTuyen, double soKm, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
    super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
    this.soTuyen = soTuyen;
    this.soKm = soKm;
  }
  @Override
  public void inThongTin(){
    System.out.println("XE NỘI THÀNH " );
    System.out.print("Mã số chuyến: "+maSoChuyen+"\n"
            +"Họ tên tài xế: "+hoTenTaiXe+"\n"
            +"Số xe: "+ soXe + "\n"
            +"Doanh thu: " + doanhThu +"\n"
            +"Số tuyến: "+ soTuyen + "\n"
            +"Số km: "+ soKm + "\n"
    );
  }
}
