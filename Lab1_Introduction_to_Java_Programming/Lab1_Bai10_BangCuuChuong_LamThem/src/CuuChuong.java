
// Viết chương trình xuất ra màn hình bảng cửu chương từ 1 đến 10
public class CuuChuong {
  public static void main(String[] args) {
    for(int i=1; i<=10; i++){
      System.out.println("Bảng cửu chương: " + i);
      for(int j = 1; j<=10; j++){
        System.out.printf("%d x %d = %d\n",i,j,i*j);
      }
    }
  }
}
