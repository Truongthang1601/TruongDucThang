package B14_MiniProject;

import B14_MiniProject.controlers.StudentManager;
import B14_MiniProject.dataservices.StudentDataService;
import B14_MiniProject.models.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);



/*In ra danh sách Student input

    public static void main(String[] args) throws IOException {
    StudentDataService service = new StudentDataService();

        List<Student> students = service.read("./resources/Student-input.txt");

        for (int i = 0; i < students.size(); ++i ) {

            System.out.println(students.get(i));
        }
        //write to file "./resources/Student-output.txt"
        service.write("./resources/Student-output.txt", students);
    }
}
*/


/* Sắp xếp danh sách theo tên sortbyName
public static void main(String[] args) throws IOException {
     StudentDataService service = new StudentDataService();

    List<Student> students = service.read("./resources/Student-input.txt");

   StudentManager mng = new StudentManager();
    students = mng.sortbyAddress(students);
      for (int i = 0; i < students.size(); ++i ) {

            System.out.println(students.get(i));
        }
        service.write("./resources/Student-output.txt", students);
    }
*/

/*Timg kiếm theo tên*/
public static void main(String[] args) throws IOException {
     StudentDataService service = new StudentDataService();

    List<Student> students = service.read("./resources/Student-input.txt");

    String choose = null;
    boolean exit = false;
    StudentManager studentManager = new StudentManager("./resources/Student-input.txt");

    showMenu();

    while (true) {
        choose = scanner.nextLine();

        switch(choose){
            case "1" -> {
                System.out.println("Add student: ");
                studentManager.addStudent(scanner);
             }

            case "2" -> {
                System.out.println("Edit Student ");
                studentManager.editStudent(scanner);
             }

            case "3" -> {
                System.out.println("Delete Student ");
                studentManager.deleteStudent(scanner);
             }

            case "4" -> {
                System.out.println("Sort Student by Id");
                studentManager.sortbyId();
             }

            case "5" -> {
                System.out.println("Sort Student by name ");
                studentManager.sortbyName();
             }

            case "6" -> {
                System.out.println("Sort Student by address");
                studentManager.sortbyAddress();
             }

            case "7" -> {
                System.out.println("Sort Student by number phone");
                studentManager.sortbyPhone();
             }

            case "8" -> {
                System.out.println("Sort Student by class");
                studentManager.sortbyKlass();
             }

            case "9" -> {
                System.out.println("Exit");
                exit = true;
             }
            default -> {
                    System.out.println("Invalid input!! ");
             }
           }
          if(exit) {
              break;
        }
          showMenu();
    }

 //   StudentManager mng = new StudentManager();
    //Student findByName = mng.findByName (students, "Nguyen van A");
 //   Student findById = mng.findById(students,1010);
 //   System.out.println(findById);

   }
    public static void  showMenu() {
        System.out.println("--------------------------Menu--------------------------");
        System.out.println("1. Add Student ");
        System.out.println("2. Edit Student ");
        System.out.println("3. Delete Student ");
        System.out.println("4. Sort Student by Id ");
        System.out.println("5. Sort Student by name");
        System.out.println("6. Sort Student by address ");
        System.out.println("7. Sort Student by number phone ");
        System.out.println("8. Sort Student by class ");
        System.out.println("9. Exit ");
        System.out.println("--------------------------------------------------------");
        System.out.println("Please choose: ");

    }
}
/*
--B1: Class
--B2: Array (list) of students
--B3: logic
*/