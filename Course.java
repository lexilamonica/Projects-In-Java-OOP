package Exercise5;
/* Lexi LaMonica
 * Spring 2021
 * Assignment 2*/
import java.util.ArrayList;
class Course {
    String title;
    public ArrayList<CourseRecord> courseRecords = new ArrayList<CourseRecord>();
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void addCourseRecord(CourseRecord c) {
        courseRecords.add(c);
    }
    public ArrayList<CourseRecord> getCourseRecords() {
        return courseRecords;
    }
    public void printCourseStudents() {
        for(CourseRecord courserecord : courseRecords) {
            System.out.println(courserecord.getStudent());
        }
    }
    public void printFinalExamStudents() {
        for(CourseRecord courserecord : courseRecords) {
            if(courserecord.takeFinalExam())
                System.out.println(courserecord.toString());
        }
    }

}