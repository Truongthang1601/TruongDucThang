package B14_MiniProject;

import B14_MiniProject.dataservices.StudentDataService;
import B14_MiniProject.models.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        StudentDataService service = new StudentDataService();
        
        List<Student> students = service.read("./resources/Student-input.txt");
        
        for (int i = 0; i < students.size(); ++i ) {
            System.out.println(students.get(i));    
        }   
    }
}
