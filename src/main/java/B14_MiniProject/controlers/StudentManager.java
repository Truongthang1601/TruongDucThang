package B14_MiniProject.controlers;

import B14_MiniProject.dataservices.StudentDataService;
import B14_MiniProject.models.Student;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentManager {

    private List<Student> list;
    private final String pathFileToInput;
    private StudentDataService service;

    public StudentManager(String pathFileToInput) {

        this.pathFileToInput = pathFileToInput;

        this.service = new StudentDataService();

        try {

            this.list = service.read(pathFileToInput);

        } catch (IOException ex) {

            ex.printStackTrace();
        }
    }

/*Sắp xếp theo tên*/
   public void sortbyName () {
     Collections.sort(
             list,
             (s1, s2) -> s1.getName().compareTo(s2.getName())
     );
   }

/*Sắp xếp theo địa phuong*/
    public void sortbyAddress () {
     Collections.sort(
             list,
             (s1, s2) -> s1.getAddress().compareTo(s2.getAddress())
     );
   }

    public void sortbyPhone () {
     Collections.sort(
             list,
             (s1, s2) -> s1.getPhone().compareTo(s2.getPhone())
     );
   }

    public void sortbyKlass () {
     Collections.sort(
             list,
             (s1, s2) -> s1.getKlass().compareTo(s2.getKlass())
     );
   }
/*Sắp xếp theo ID*/
    public void sortbyId () {
     Collections.sort(
             list,
             (s1, s2) -> Integer.compare(s1.getId(), s2.getId()));
  }

    public  Student findByName (String name) {

        for (Student s: list){
            if (s.getName().equals(name)){
                return s;
            }

        }
        return null;
    }

    public  Student findById (int id) {

        for (Student s: list){
            if (s.getId()== id){
                return s;
            }

        }
        return null;
    }

    public void addStudent(Scanner sc) {
        list.add(new Student().input(sc));

    }

    public void editStudent(Scanner sc) {
        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Student student = findById(id);
        student.edit(sc);

    }

    public void deleteStudent(Scanner sc) {
        System.out.println("Enter id: ");

        int id = sc.nextInt();
        sc.nextLine();

        Student student = findById(id);
        list.remove(student);

    }

    public void addStudent(Scanner scanner) {
    }

    public void editStudent(Scanner scanner) {
    }
}
/*Để so sánh các số thập phân hay số lớn thì ta thay Integer bằng double hoặc float*/

/*
-- add():
-- eadit():
-- delete():
-- sortStudentsByName()
-- sortStudentsByGPA()
-- sortStudentsByAddress()
-- ........
-- GPA là điểm trung bình
*/