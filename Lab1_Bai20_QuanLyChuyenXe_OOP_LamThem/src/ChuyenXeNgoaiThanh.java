public class ChuyenXeNgoaiThanh extends ChuyenXe{
  public String noiDen;
  public int soNgayDi;
  public ChuyenXeNgoaiThanh(String noiDen, int soNgayDi, String maSoChuyen, String hoTenTaiXe,String soXe,double doanhThu) {
    super(maSoChuyen,hoTenTaiXe,soXe,doanhThu);
    this.noiDen = noiDen;
    this.soNgayDi = soNgayDi;
  }
  @Override
  public void inThongTin(){
    System.out.println("XE NGOẠI THÀNH " );
    System.out.print("Mã số chuyến: "+maSoChuyen+"\n"
            +"Họ tên tài xế: "+hoTenTaiXe+"\n"
            +"Số xe: "+ soXe + "\n"
            +"Doanh thu: " + doanhThu +"\n"
            +"Nơi đến: "+ noiDen + "\n"
            +"Số ngày đi: "+ soNgayDi + "\n"
    );
  }
}
