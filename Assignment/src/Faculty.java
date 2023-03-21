package Assignment.src;

public class Faculty {
    private int facultyId;
    private String facultyName;
    private String position;

    public Faculty() {
    }

    public Faculty(int facultyId, String facultyName, String position) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.position = position;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public String getPosition() {
        return position;
    }

    public void setFacultyId(int facultyId) {
        this.facultyId = facultyId;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", position=" + position + "]";
    }
}
