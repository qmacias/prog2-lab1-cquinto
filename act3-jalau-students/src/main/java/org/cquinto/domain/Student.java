package org.cquinto.domain;

import java.util.Arrays;

public class Student {
    private String name;
    private int grade;
    private String[] courses;

    public Student(String name, int grade, String[] courses) {
        this.name = name;
        this.grade = grade;
        this.courses = courses;
    }

    public void addCourse(String course) {
        int coursesLength = this.courses.length;

        this.courses = Arrays.copyOf(this.courses, coursesLength + 1);

        this.courses[coursesLength] = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return String.format("Student(name=%s, grade=%d, courses=%s)", name, grade, Arrays.toString(courses));
    }

}
