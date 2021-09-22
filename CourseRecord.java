package Exercise5;
import java.util.ArrayList;
/* Lexi LaMonica */
class CourseRecord{
    public Student student;
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    public Student getStudent() {
        return student; }
    public void setStudent(Student student) {
        this.student = student; }
    public void addAssignment(Assignment x) {
        assignments.add(x); }
    public ArrayList<Assignment> getAssignments() {
        return assignments; }
    public boolean takeFinalExam() {
        return false; }
    public double average() {
        return 0; }

  @Override
  public String toString() { return "Here is the course record for student, "+student+", their assignment grade is " + assignments + " :)" ;
     }
    }
