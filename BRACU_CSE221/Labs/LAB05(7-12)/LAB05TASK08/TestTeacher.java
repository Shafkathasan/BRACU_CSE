/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LAB05TASK08;

public class TestTeacher {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Saad Abdullah", "CSE");
        Teacher t2 = new Teacher("Mumit Khan", "CSE");
        Teacher t3 = new Teacher("Sadia Kazi", "CSE");
        Course c1 = new Course("CSE 110 Programming Language I");
        Course c2 = new Course("CSE 111 Programming Language-II");
        Course c3 = new Course("CSE 220 Data Structures");
        Course c4 = new Course("CSE 221 Algorithms");
        Course c5 = new Course("CCSE 230 Discrete Mathematics");
        Course c6 = new Course("CSE 310 Object Oriented Programming");
        Course c7 = new Course("CSE 320 Data Communications");
        Course c8 = new Course("CSE 340 Computer Architecture");
        t1.addCourse(c1);
        t1.addCourse(c2);
        t2.addCourse(c3);
        t2.addCourse(c4);
        t2.addCourse(c5);
        t3.addCourse(c6);
        t3.addCourse(c7);
        t3.addCourse(c8);
        t1.printDetail();
        t2.printDetail();
        t3.printDetail();
    }
}

class Teacher {

    private String name, dept, course;
    private Course[] arr = new Course[8];
    int index = 0;

    public Teacher(String n, String d) {
        name = n;
        dept = d;
    }

    public void addCourse(Course c) {
        arr[index] = c;
        ++index;
    }

    public void printDetail() {
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("========================");
        for (int i = 0; i < index; ++i) {
            System.out.println(arr[i].courseName);
        }
    }
}

class Course {

    public String courseName;

    public Course(String c) {
        courseName = c;
    }

    public String returnCourse() {
        return courseName;
    }
}
