package javaOopStudies.studentExercise.entiteis;

import java.util.Arrays;

public class Student {
    private String name;
    private float[] grade = new float[3];

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, float[] grade) {
        this.name = name;
        this.grade = grade;
    }

    public String name() {
        return name;
    }

    public float[] grade() {
        return grade;
    }

    public void setGrade(float[] grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return ("Name: " + name +
                "Grade 1: " + grade[0] +
                "Grade 2: " + grade[1] +
                "Grade 3: " + grade[2]);
    }
}



