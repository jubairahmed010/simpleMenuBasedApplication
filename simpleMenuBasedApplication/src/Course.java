package Assignment.src;
import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseTitle;
    private double courseCredit;
    private ArrayList<Student> studentlist = new ArrayList<Student>();
    private int numberOfStudents = 0;
    private Faculty faculty;

    public Course() {
    }

    public Course(String courseId, String courseTitle, double courseCredit) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseCredit = courseCredit;

    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public double getCourseCredit() {
        return courseCredit;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseCredit(double courseCredit) {
        this.courseCredit = courseCredit;
    }

    public void addStudent(Student s) {
        boolean flag = true;
        for (Student e : studentlist) {
            if (e.getStudentID() == s.getStudentID()) {
                flag = false;
                break;
            }
        }
        if (flag == true) {
            this.studentlist.add(s);
            this.numberOfStudents++;
        } else {
            System.out.println("Student already exists in the course!");
        }
    }

    public void dropStudent(int sid) {
        int deleteIndex = -1;
        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getStudentID() == sid) {
                deleteIndex = i;
                break;
            }
        }
        if (deleteIndex == -1) {
            System.out.println("Student doesn't exist");
        } else {
            studentlist.remove(deleteIndex);
            System.out.println("Student removed from the course successfully!");
            numberOfStudents--;
        }
    }

    public void addFaculty(Faculty f) {
        this.faculty = f;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public ArrayList<Student> getStudentList() {
        return studentlist;
    }

    public void printStudentList() {
        for (Student s : studentlist) {
            System.out.println(s.toString());
        }
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", courseTitle=" + courseTitle + ", courseCredit=" + courseCredit + "]";
    }

}
