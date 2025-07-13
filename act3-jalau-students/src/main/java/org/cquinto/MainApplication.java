package org.cquinto;

import org.cquinto.domain.Student;
import org.cquinto.domain.University;

/**
 * Cristian Ezequiel Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        University university = new University(new Student[]{});

        university.addStudent(new Student("Gery", 1, new String[]{"Introduction"}));
        university.addStudent(new Student("Luis", 3, new String[]{"Science"}));
        university.addStudent(new Student("Raul", 2, new String[]{"Maths"}));
        university.addStudent(new Student("Liz", 1, new String[]{"Science"}));

        university.addStudentCourse("Database I", 1);
        university.addStudentCourse("Science", 3);
        university.addStudentCourse("Database I", 3);

        university.promoteStudentGrade(1);

        university.listFilteredStudentsByCourse("Science");
        university.listAllStudents();
    }

}
