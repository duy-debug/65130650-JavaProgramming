import java.util.*;
//Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và họ xuất IN HOA.
public class Chuoi {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập họ tên từ bàn phím: ");
    String name = scanner.nextLine();
    int viTriDau = name.indexOf(" ");
    int viTriCuoi = name.lastIndexOf(" ");
    String ho = name.substring(0, viTriDau).toUpperCase();
    String ten = name.substring(viTriCuoi + 1).toUpperCase(); // vì nó lấy bắt đầu từ dấu cách nên phải + 1
    String tenDem = name.substring(viTriDau+1,viTriCuoi).toUpperCase();

    System.out.println("Họ: " + ho);
    System.out.println("Tên đệm: " + tenDem);
    System.out.println("Tên: " + ten);
  }
}
