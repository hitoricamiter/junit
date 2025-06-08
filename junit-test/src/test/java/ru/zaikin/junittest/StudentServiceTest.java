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

    @Test
    public void getStudentByIdTestUsingAssertNotNull() {
        StudentService studentService = new StudentService();


        Student student = new Student(1, "Andrew");

        studentService.addStudent(student);

        Student actual = studentService.getStudentById(1);

        assertNotNull(actual, "this user doesn't exist");

    }


    @Test
    public void getStudentByIdTestUsingAssertEquals() {
        StudentService studentService = new StudentService();

        Student student = new Student(1, "Andrew");

        studentService.addStudent(student);

        Student actual = studentService.getStudentById(1);

        assertEquals(1, actual.getId());
        assertEquals("Andrew", actual.getName());
        assertEquals(student, actual);

    }

    @Test
    public void getStudentByNameTestUsingAssertThrows() {
        StudentService studentService = new StudentService();
        Student student = new Student(1, "Andrew");
        studentService.addStudent(student);

        //assertThrows(StudentNotFoundException.class, () -> studentService.getStudentByName("John"));

        /*assertThrows(StudentNotFoundException.class,
                () -> studentService.getStudentByName("Andrew"),
                "StudentNotFoundException should be true but it wasn't");
*/

        assertThrows(StudentNotFoundException.class,
                () -> studentService.getStudentByName("Joshua"),
                () -> "StudentNotFoundException should be true but it wasn't");


    }








}