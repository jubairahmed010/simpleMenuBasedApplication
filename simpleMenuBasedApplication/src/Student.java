package Assignment.src;

public class Student {
    private int studentID;
    private String studentName;
    private double studentCgpa;

    public Student() {
    }

    public Student(int studentID, String studentName, double studentCgpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCgpa = studentCgpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentCgpa(double studentCgpa) {
        this.studentCgpa = studentCgpa;
    }

    @Override
    public String toString() {
        return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCgpa=" + studentCgpa
                + "]";
    }

}
