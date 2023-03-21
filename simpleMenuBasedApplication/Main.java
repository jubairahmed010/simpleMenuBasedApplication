package Assignment;

import java.util.*;
import Assignment.src.*;

public class Main {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Faculty> faculties = new ArrayList<Faculty>();
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            displayMainMenu();
            int option = input.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Add Menu:");
                    System.out.println("Enter an option:");
                    System.out.println("1. Add a student");
                    System.out.println("2. Add a course");
                    System.out.println("3. Add a faculty");
                    System.out.println("4. Add a student to a course");
                    System.out.println("5. Add a faculty to a course");
                    System.out.println("6. Back to Main Menu");
                    int addOption = input.nextInt();
                    switch (addOption) {
                        case 1:

                            addAStudent();
                            break;
                        case 2:

                            addACourse();

                            break;
                        case 3:

                            addAFaculty();
                            break;
                        case 4:
                            AddStudentToCourse();
                            break;

                        case 5:
                            AddFacultyToCourse();
                            break;

                        case 6:

                            continue;

                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }
                    break;

                case 2: {
                    System.out.println("Delete Menu:");
                    System.out.println("Enter an option:");
                    System.out.println("1. Delete a student");
                    System.out.println("2. Delete a course");
                    System.out.println("3. Delete a faculty");
                    System.out.println("4. Delete a student from a course");
                    System.out.println("5. Delete a faculty from a course");
                    System.out.println("6. Back to Main Menu");
                    int deleteOption = input.nextInt();
                    switch (deleteOption) {
                        case 1:
                            deleteStudent();
                            break;
                        case 2:
                            deleteCourse();
                            break;
                        case 3:
                            deleteFaculty();
                            break;
                        case 4:
                            deleteStudentFromCourse();
                            break;
                        case 5:
                            deleteFacultyFromCourse();
                            break;

                        case 6:
                            continue;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }
                    break;

                case 3: {
                    System.out.println("Update Menu:");
                    System.out.println("Enter an option:");
                    System.out.println("1. Update a student");
                    System.out.println("2. Update a course");
                    System.out.println("3. Update a faculty");
                    System.out.println("4. Back to Main Menu");
                    int updateOption = input.nextInt();
                    switch (updateOption) {
                        case 1:
                            updateStudent();
                            break;
                        case 2:
                            updateCourse();
                            break;
                        case 3:
                            updateFaculty();
                            break;
                        case 4:
                            continue;
                        default:
                            System.out.println("Invalid option");
                            break;
                    }
                }
                    break;

                case 4: {
                    System.out.println("Print Menu:");
                    System.out.println("Enter an option:");
                    System.out.println("1. Print all students");
                    System.out.println("2. Print all faculties");
                    System.out.println("3. Print all courses");
                    System.out.println("4. Print information of a student");
                    System.out.println("5. Print information of a course");
                    System.out.println("6. Print information of a faculty");
                    System.out.println("7. Print student list and faculty information of a course");
                    System.out.println("8. Print courses taken by a student");
                    System.out.println("9. Back to Main Menu");
                    int printOption = input.nextInt();
                    switch (printOption) {
                        case 1:
                            for (Student s : students) {
                                System.out.println(s.toString());
                            }
                            break;
                        case 2:
                            for (Faculty f : faculties) {
                                System.out.println(f.toString());
                            }
                            break;
                        case 3:
                            for (Course c : courses) {
                                System.out.println(c.toString());
                            }
                            break;
                        case 4:
                            printStudentInfo();
                            break;
                        case 5:
                            printCourseInfo();
                            break;
                        case 6:
                            printFacultyInfo();
                            break;
                        case 7: {
                            System.out.println("Enter the course ID: ");
                            String cid = input.next();
                            for (Course c : courses) {
                                if (c.getCourseId().equals(cid)) {
                                    c.printStudentList();
                                    System.out.println("Faculty information of the course:" + c.getFaculty());
                                }
                            }

                        }
                            break;
                        case 8:
                            printStudentCourseList();
                            break;
                        case 9:
                            continue;
                        default:
                            System.out.println("Invalid option");
                            break;

                    }
                }
                    break;

                case 5: {
                    System.out.println("Search Menu:");
                    System.out.println("1. Search a Student");
                    System.out.println("2. Search a Course");
                    System.out.println("3. Search a Faculty");
                    System.out.println("4. Search whether a student takes a course");
                    System.out.println("5. Search whether a faculty teaches a course");
                    System.out.println("6. Search courses taken by a student");
                    System.out.println("7. Search courses taught by a faculty");
                    System.out.println("8. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    int searchOption = input.nextInt();

                    switch (searchOption) {
                        case 1:
                            searchStudent();
                            break;
                        case 2:
                            searchCourse();
                            break;
                        case 3:
                            searchFaculty();
                            break;
                        case 4:
                            searchStudentCourse();
                            break;
                        case 5:
                            searchFacultyCourse();
                            break;
                        case 6:
                            searchStudentCourseList();
                            break;
                        case 7:
                            searchFacultyCourseList();
                            break;
                        case 8:
                            continue;
                        default:
                            System.out.println("Invalid option selected, please try again.");
                            break;
                    }
                }
                    break;

                case 6:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid option selected, please try again.");
                    break;
            }

            if (option == 6) {
                // exits the loop when the user enters 6
                break;
            }

        }

    }

    // Main menu
    public static void displayMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. Update");
        System.out.println("4. Print");
        System.out.println("5. Search");
        System.out.println("6. Exit");

    }

    public static void addAStudent() {
        System.out.println("ID: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.println("Name: ");
        String n = input.nextLine();
        System.out.println("CGPA: ");
        double cg = input.nextDouble();
        Student s = new Student(id, n, cg);
        boolean flag = false;
        for (Student e : students) {
            if (e.getStudentID() == s.getStudentID()) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            students.add(s);
            System.out.println("Student added successfully");
        } else {
            System.out.println("Student already exists!");
        }
    }

    public static void addAFaculty() {

        System.out.println("ID: ");

        int id = input.nextInt();
        input.nextLine();
        System.out.println("Name: ");

        String name = input.nextLine();
        System.out.println("Position: ");
        input.nextLine();
        String pos = input.nextLine();
        Faculty f = new Faculty(id, name, pos);
        boolean flag = false;
        for (Faculty e : faculties) {
            if (e.getFacultyId() == f.getFacultyId()) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            faculties.add(f);
            System.out.println("Faculty added successfully");
        } else {
            System.out.println("Faculty already exists!");
        }
    }

    public static void addACourse() {
        System.out.println("Course ID: ");
        String id = input.next();
        input.nextLine();
        System.out.println("Course title: ");
        String title = input.nextLine();
        System.out.println("Credit: ");
        double cred = input.nextDouble();
        Course c = new Course(id, title, cred);
        boolean flag = false;
        for (Course e : courses) {
            if (e.getCourseId().equals(c.getCourseId())) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            courses.add(c);
            System.out.println("Course added successfully");
        } else {
            System.out.println("Course already exists!");
        }
    }

    public static void AddStudentToCourse() {

        System.out.print("Course Id:");
        input.nextLine();
        String courseId = input.nextLine();
        boolean courseExists = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                courseExists = true;
                System.out.print("Student Id:");
                int studentId = input.nextInt();
                boolean studentExists = false;
                for (Student student : students) {
                    if (student.getStudentID() == studentId) {
                        studentExists = true;
                        course.addStudent(student);
                        break;
                    }
                }
                if (!studentExists) {
                    System.out.println("Please enter a valid Student Id.");
                }
                break;
            }
        }
        if (!courseExists) {
            System.out.println("Course doesn't exist. Please try again with a proper course id.");
        }

    }

    public static void AddFacultyToCourse() {

        System.out.print("Course Id:");
        input.nextLine();
        String courseId = input.nextLine();
        boolean courseExists = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                courseExists = true;
                System.out.print("Faculty Id:");
                int facultyId = input.nextInt();
                boolean facultyExists = false;
                for (Faculty faculty : faculties) {
                    if (faculty.getFacultyId() == facultyId) {
                        facultyExists = true;
                        course.addFaculty(faculty);
                        break;
                    }
                }
                if (!facultyExists) {
                    System.out.println("Please enter a valid Faculty Id.");
                }
                break;
            }
        }
        if (!courseExists) {
            System.out.println("Course doesn't exist. Please try again with a proper course id.");
        }

    }

    // Remove a student from the list of students
    public static void deleteStudent() {

        System.out.println("Enter student ID:");
        int studentID = input.nextInt();
        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    // Remove a course from the list of courses
    public static void deleteCourse() {

        System.out.println("Enter course ID:");
        String courseId = input.nextLine();
        boolean found = false;
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(courseId)) {
                courses.remove(i);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Course removed successfully!");
        } else {
            System.out.println("Course not found!");
        }
    }

    // Remove a faculty member from the list of faculties
    public static void deleteFaculty() {

        System.out.println("Enter faculty ID:");
        int facultyId = input.nextInt();
        boolean found = false;
        for (int i = 0; i < faculties.size(); i++) {
            Faculty faculty = faculties.get(i);
            if (faculty.getFacultyId() == facultyId) {
                faculties.remove(i);
                System.out.println("Faculty member with ID " + facultyId + " has been removed.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Faculty member with ID " + facultyId + " not found.");
        }
    }

    public static void deleteStudentFromCourse() {
        System.out.print("To delete a student from a course, you need enter the ID of that student: ");
        int studentId = input.nextInt();
        System.out.print("Enter course Id from which you want to drop a student.");
        input.nextLine();
        String courseId = input.nextLine();
        for (Course c : courses) {
            if (courseId.equals(c.getCourseId())) {
                c.dropStudent(studentId);
                break;
            }
        }
    }

    public static void deleteFacultyFromCourse() {

        System.out.print("Enter course Id from which you want to drop a faculty.");
        input.nextLine();
        String courseId = input.nextLine();
        for (Course c : courses) {
            if (courseId.equals(c.getCourseId())) {
                c.dropFaculty();
                break;
            }
        }
    }

    // prints the information of a specific student

    public static void printStudentInfo() {

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        boolean found = false;
        for (Student student : students) {
            if (student.getStudentID() == studentId) {
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    // prints the information of a specific course
    public static void printCourseInfo() {

        System.out.println("Enter course ID:");
        String courseId = input.nextLine();
        boolean found = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                System.out.println(course);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Course not found.");
        }
    }

    // prints the information of a specific faculty member
    public static void printFacultyInfo() {

        System.out.println("Enter faculty ID:");
        int facultyId = input.nextInt();
        boolean found = false;
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyId() == facultyId) {
                System.out.println(faculty);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Faculty member not found.");
        }
    }

    public static void printStudentCourseList() {

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        for (Student student : students) {
            if (student.getStudentID() == studentId) {
                System.out.println("Courses taken by " + student.getStudentName() + ":");
                for (Course c : courses) {
                    if (c.getStudentList().contains(student)) {
                        System.out.println(c.getCourseId() + " " + c.getCourseTitle());
                    }
                }
                return;
            }
        }
        System.out.println("Student with ID " + studentId + " not found.");
    }

    // updates the information of a student
    public static void updateStudent() {

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        for (Student student : students) {
            if (student.getStudentID() == studentId) {
                System.out.println("Enter new student name:");
                String studentName = input.next();
                student.setStudentName(studentName);
                System.out.println("Enter new student CGPA:");
                double studentCgpa = input.nextDouble();
                student.setStudentCgpa(studentCgpa);
                System.out.println("Student information updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // updates the information of a course
    public static void updateCourse() {

        System.out.println("Enter course ID:");
        String courseId = input.next();
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                System.out.println("Enter new course title:");
                String courseTitle = input.next();
                course.setCourseTitle(courseTitle);
                System.out.println("Enter new course credit:");
                double credit = input.nextDouble();
                course.setCourseCredit(credit);
                System.out.println("Course information updated successfully.");
                return;
            }
        }
        System.out.println("Course not found.");
    }

    // updates the information of a faculty member
    public static void updateFaculty() {

        System.out.println("Enter faculty ID:");
        int facultyId = input.nextInt();
        for (Faculty faculty : faculties) {
            if (faculty.getFacultyId() == facultyId) {
                System.out.println("Enter new faculty name:");
                String facultyName = input.next();
                faculty.setFacultyName(facultyName);
                System.out.println("Enter new faculty position:");
                String facultyPosition = input.next();
                faculty.setPosition(facultyPosition);
                System.out.println("Faculty information updated successfully.");
                return;
            }
        }
        System.out.println("Faculty not found.");
    }

    public static void searchStudent() {

        System.out.println("Enter student ID or name ");
        input.nextLine();
        String search = input.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (String.valueOf(student.getStudentID()).equals(search) || student.getStudentName().equals(search)) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found with ID or name: " + search);
        }
    }

    public static void searchCourse() {

        System.out.println("Enter course ID or title:");
        input.nextLine();
        String search = input.nextLine();
        boolean found = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(search) || course.getCourseTitle().equals(search)) {
                System.out.println(course);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No course found with ID or title: " + search);
        }
    }

    public static void searchFaculty() {

        System.out.println("Enter faculty ID or name:");
        input.nextLine();
        String search = input.nextLine();
        boolean found = false;
        for (Faculty faculty : faculties) {
            if (String.valueOf(faculty.getFacultyId()).equals(search) || faculty.getFacultyName().equals(search)) {
                System.out.println(faculty);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No faculty member found with ID or name: " + search);
        }
    }

    public static void searchStudentCourse() {

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        input.nextLine();
        System.out.println("Enter course ID:");
        String courseId = input.nextLine();
        boolean found = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                for (Student student : course.getStudentList()) {
                    if (student.getStudentID() == studentId) {
                        System.out.println("Student " + studentId + " is enrolled in course " + courseId);
                        found = true;
                        break;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("No such enrollment found for student " + studentId + " in course " + courseId);
        }
    }

    public static void searchFacultyCourse() {

        System.out.println("Enter faculty ID:");
        int facultyId = input.nextInt();
        input.nextLine();
        System.out.println("Enter course ID:");
        String courseId = input.nextLine();
        boolean found = false;
        for (Course course : courses) {
            if (course.getCourseId().equals(courseId)) {
                if (course.getFaculty().getFacultyId() == facultyId) {
                    System.out.println("Faculty " + facultyId + " teaches course " + courseId);
                    found = true;
                    break;
                }
            }

        }
        if (!found) {
            System.out.println("Can not be found");
        }
    }

    // search for the courses taken by a specific student
    public static void searchStudentCourseList() {

        System.out.println("Enter student ID:");
        int studentId = input.nextInt();
        boolean found = false;
        for (Course course : courses) {
            for (Student student : course.getStudentList()) {
                if (student.getStudentID() == studentId) {
                    System.out.println(
                            "Course ID: " + course.getCourseId() + " Course Title: " + course.getCourseTitle());
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Can not be found");
        }
    }

    // search for the courses taught by a specific faculty member
    public static void searchFacultyCourseList() {

        System.out.println("Enter faculty ID:");
        int facultyId = input.nextInt();
        boolean found = false;
        for (Course course : courses) {
            if (course.getFaculty().getFacultyId() == facultyId) {
                System.out.println("Course ID: " + course.getCourseId() + " Course Title: " + course.getCourseTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Can not be found");
        }
    }

}
