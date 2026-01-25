public abstract class SinhVienNTU {
  protected String hoTen;
  protected String nganh;

  public SinhVienNTU(String hoTen, String nganh) {
    this.hoTen = hoTen;
    this.nganh = nganh;
  }
  // phương thức trừu tượng
  public abstract double getDiemTB();
  public String getHocLuc(){
    double diemTB = getDiemTB();
    if(diemTB < 5){
      return "Yếu";
    }
    else if(diemTB < 6.5){
      return "Trung bình";
    }
    else if(diemTB < 8){
      return "Khá";
    }
    else{
      return "Giỏi";
    }
  }
  public void inThongTin(){
    System.out.println("Họ tên: " +hoTen+", Ngành: "+nganh +", Điểm: "+getDiemTB() + ", Học lực: " +getHocLuc());
  }
}
