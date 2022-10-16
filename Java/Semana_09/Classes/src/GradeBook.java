public class GradeBook {
  private String courseName;

  public GradeBook(String name) {
    this.courseName = name;
  }

  public void setCourseName(String name) {
    courseName = name;
  }

  public String getCourseName() {
    return courseName;
  }

  public void DisplayMessage() {
    System.out.printf("Welcome to the grade book " + getCourseName());
  }
}
