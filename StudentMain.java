package Exercise5;

public class StudentMain {
        public static void main(String[] args) {
            Course course = new Course();
            CourseRecord courserecord = new CourseRecord();
            Assignment assignment = new Assignment();

                assignment.setMark(100);
            courserecord.addAssignment(assignment);
            Student student = new Student();
                student.setName("Lexi LaMonica");
            courserecord.setStudent(student);
            course.addCourseRecord(courserecord);
                course.setTitle("Computer Science");
            System.out.println(course.getCourseRecords());
        }
    }


