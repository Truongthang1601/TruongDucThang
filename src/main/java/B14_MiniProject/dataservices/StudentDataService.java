package B14_MiniProject.dataservices;

import B14_MiniProject.models.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StudentDataService {
    public List<Student> read(String path) throws IOException{
        
        List<Student> students;
        students = new ArrayList<>();
        
        /*Path pathFileToRead = Paths.get("./resources/Student-input.txt");*/
        Path pathFileToRead = Paths.get(path);
        
        List<String> allLines = Files.readAllLines(pathFileToRead);
           
        for(int i = 0; i < allLines.size(); ++i) {
            
            String line = allLines.get(i);
            String[] data;
            data = line.split(",");
            
            Student student = new Student(Integer.parseInt(data[0]), data[1].trim(), data[2].trim(), data[3].trim(), Integer.parseInt(data[4]));
            /*--trim: loại bỏ các khoảng trắng thừa*/
            students.add(student);
            
        }
        return students;
        
    } 
}
/* -- path: đọc đường dẫn
   -- path sau get thì là nơi để truyền dữ liệu các file khác vào
   -- readAllLine: đọc bắt lỗi
   -- allLines.get(i): giá trị của từng dòng trong file
   -- String line: lưu thành các dòng
   -- String data: phân tách là lưu thành các trường dữ liệu
   -- Integer.parseInt: chuyển dữ liệu int sang dữ liệu string được mã hóa
*/