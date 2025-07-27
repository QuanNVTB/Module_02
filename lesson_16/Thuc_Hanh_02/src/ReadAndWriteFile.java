import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String fielPath) {
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(fielPath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while((line = br.readLine()) != null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.out.println("File khong ton tai hoac noi dung co loi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Gia tri lon nhat la: " + max);
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
