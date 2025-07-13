package org.cquinto.domain;

import java.util.Arrays;

public class University {
    private Student[] students;

    public University(Student[] students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        int studentsLength = this.students.length;

        this.students = Arrays.copyOf(this.students, studentsLength + 1);

        this.students[studentsLength] = student;
    }

    public void addStudentCourse(String studentCourse, int studentPosition) {
        this.students[studentPosition - 1].addCourse(studentCourse);
    }

    public void promoteStudentGrade(int studentPosition) {
        int studentIndex = studentPosition - 1;

        this.students[studentIndex].setGrade(this.students[studentIndex].getGrade() + 1);
    }

    private String[] filterStudentsByCourse(String studentCourse) {
        String[] filteredStudents = new String[]{};

        for (Student student : this.students) {
            for (String course : student.getCourses()) {
                if (course.equals(studentCourse)) {
                    int filteredStudentsLength = filteredStudents.length;

                    filteredStudents = Arrays.copyOf(filteredStudents, filteredStudentsLength + 1);

                    filteredStudents[filteredStudentsLength] = student.getName();
                }
            }
        }

        return filteredStudents;
    }

    public void listFilteredStudentsByCourse(String studentCourse) {
        System.out.println(Arrays.toString(this.filterStudentsByCourse(studentCourse)));
    }

    public void listAllStudents() {
        for (Student student : this.students) {
            System.out.printf("Name: %s, Grade: %d, Courses: ", student.getName(), student.getGrade());

            for (String course : student.getCourses()) {
                System.out.printf("%s ", course);
            }

            System.out.println();
        }
    }

    @Override
    public String toString() {
        return String.format("University(students=%s)", Arrays.toString(students));
    }

}
