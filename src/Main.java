import Model.Course;
import Model.Student;
import Model.Enrolls;

import java.util.Calendar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //3 objects created
        Student[] stud_arr;
        stud_arr  = new Student[2];
        stud_arr[0].setName("Richard");
        stud_arr[1].setName("Joseph");

        Student s1 = new Student();
        s1.setName("Richard Joseph");
        Course c1 = new Course();
        c1.setCourseName("OOPM");
        Enrolls e1 = new Enrolls();


        Calendar cal1 = Calendar.getInstance();
        cal1.set(Calendar.MONTH, 11);
        cal1.set(Calendar.DATE, 5);
        cal1.set(Calendar.YEAR, 1996);
        e1.enroll_stud_course(stud_arr[0],c1,cal1);
        e1.display_an_enrollment();

    }
}