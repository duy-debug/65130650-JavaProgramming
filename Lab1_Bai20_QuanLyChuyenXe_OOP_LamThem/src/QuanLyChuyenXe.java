import java.util.*;
public class QuanLyChuyenXe {
  List<ChuyenXe> list = new ArrayList<>();
  public void themChuyenXe(ChuyenXe chuyenXe) {
    list.add(chuyenXe);
  }
  public void xuatDanhSach(){
    for(ChuyenXe chuyenXe : list){
      chuyenXe.inThongTin();
    }
  }
  public double tinhDoanhThuNoiThanh(){
    double tinhDoanhThu = 0;
    for(ChuyenXe chuyenXe : list){
      if(chuyenXe instanceof ChuyenXeNoiThanh){
        tinhDoanhThu+= chuyenXe.getDoanhThu();
      }
    }
    return tinhDoanhThu;
  }
  public double tinhDoanhThuNgoaiThanh(){
    double tinhDoanhThu = 0;
    for(ChuyenXe chuyenXe : list){
      if(chuyenXe instanceof ChuyenXeNgoaiThanh){
        tinhDoanhThu+= chuyenXe.getDoanhThu();
      }
    }
    return tinhDoanhThu;
  }
  public double tinhTongDoanhThu(){
    double tongDoanhThu = 0;
    for(ChuyenXe chuyenXe : list){
      tongDoanhThu+=chuyenXe.getDoanhThu();
    }
    return tongDoanhThu;
  }
}
