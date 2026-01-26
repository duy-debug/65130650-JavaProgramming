import java.util.ArrayList;
import java.util.List;

public class LopHoc {
  private List<HocSinh> hocSinhList = new ArrayList<>();
  private  GiaoVien giaoVienChuNhiem;
  private  GiaoVien giaoVienGiangDay;

  public LopHoc(List<HocSinh> hocSinhList, GiaoVien giaoVienChuNhiem, GiaoVien giaoVienGiangDay) {
    this.hocSinhList = hocSinhList;
    this.giaoVienChuNhiem = giaoVienChuNhiem;
    this.giaoVienGiangDay = giaoVienGiangDay;
  }

  public LopHoc() {

  }

  public List<HocSinh> getHocSinhList() {
    return hocSinhList;
  }

  public void setHocSinhList(List<HocSinh> hocSinhList) {
    this.hocSinhList = hocSinhList;
  }

  public GiaoVien getGiaoVienChuNhiem() {
    return giaoVienChuNhiem;
  }

  public void setGiaoVienChuNhiem(GiaoVien giaoVienChuNhiem) {
    this.giaoVienChuNhiem = giaoVienChuNhiem;
  }

  public GiaoVien getGiaoVienGiangDay() {
    return giaoVienGiangDay;
  }

  public void setGiaoVienGiangDay(GiaoVien giaoVienGiangDay) {
    this.giaoVienGiangDay = giaoVienGiangDay;
  }
  public int themHocSinh(HocSinh hs) {
    hocSinhList.add(hs);
    return 1;
  }
  public int themGiaoVienGiangDay(GiaoVien gvi) {
    giaoVienGiangDay = gvi;
    return 1;
  }
  public void inDSHS(){
    for(HocSinh hs : hocSinhList){
      System.out.println(hs.HienThiTT());
    }
  }
  public void inDSGVDG(){
    if(giaoVienGiangDay != null){
      System.out.println(giaoVienGiangDay.HienThiTT());
    }
  }
}
