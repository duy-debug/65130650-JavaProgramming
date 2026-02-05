public class Student {
  private String id;
  private String name;
  private double mark;

  public Student(String id, String name, double mark) {
    this.id = id;
    this.name = name;
    this.mark = mark;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getMark() {
    return mark;
  }

  public void setMark(double mark) {
    this.mark = mark;
  }
  public String getRank() {
    if (mark >= 8) return "Gioi";
    if (mark >= 6.5) return "Kha";
    if (mark >= 5) return "Trung binh";
    return "Rot";
  }

  @Override
  public String toString() {
    return "Student{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", mark=" + mark +
            ", rank=" + getRank() +
            '}';
  }
}
