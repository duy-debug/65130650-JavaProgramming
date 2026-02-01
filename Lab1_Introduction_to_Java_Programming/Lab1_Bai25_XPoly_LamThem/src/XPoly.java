// xây dựng class tiện ích
/*
double... x gọi là tham số biến đổi (varargs)
Khi vào trong hàm, x được hiểu như một mảng double[]
Có thể dùng for hoặc for-each để duyệt
 */
public class XPoly {
  public static double sum(double... x) { // phương thức này ko được ghi đè trong class con
    double total = 0;
    for (double value : x) {
      total += value;
    }
    return total;
  }

  public static double min(double... x) {
    double min = x[0];
    for (double value : x) {
      if (value < min) {
        min = value;
      }
    }
    return min;
  }

  public static double max(double... x) {
    double max = x[0];
    for (double value : x) {
      if (value > max) {
        max = value;
      }
    }
    return max;
  }
}
