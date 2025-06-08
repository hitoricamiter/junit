package ru.zaikin.junittest;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {
    @Test
    public void getStudentTest() {
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Andrew");
        studentService.addStudent(student);


        List<Student> listOfStudents = studentService.getStudent();

        boolean actualResult = listOfStudents.isEmpty();

        //assertTrue(actualResult);

        // assertTrue(() -> actualResult);

        // assertTrue(actualResult, "List is empty");

        // assertTrue(() -> actualResult, "List is Empty");

        // assertTrue(actualResult, () -> "List is empty" );

        assertTrue(() -> actualResult, () -> "[lazy] getStudentTest() failed coz' empty");
    }

    @Test
    public void getStudentsTestUsingAssertFalse() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Andrew");
        studentService.addStudent(student);
        List<Student> studentList = studentService.getStudent();

        boolean actualResult = studentList.isEmpty();

        assertFalse(actualResult);

    }

    @Test
    public void getStudentByIdTestAssignedNull() {
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Andrew");

        studentService.addStudent(student);

        Student actual = studentService.getStudentById(2);

        assertNull(actual, "this user exist");


    }



}