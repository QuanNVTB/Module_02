import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileText {
    public void readFileText(String filePath) {
        try{
            File file = new File(filePath);

            System.out.println("Kiem ta File tai: " + file.getAbsoluteFile());
            System.out.println("File co ton tai hay khong: " + file.exists());

            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new  BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while((line = br.readLine()) != null){
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tong = " + sum);
        }catch (Exception e){
            System.out.println("File khong ton tai hoac noi dung co loi!");
        }
    }
}
