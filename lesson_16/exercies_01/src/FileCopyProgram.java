import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap duong dan tep nguon: ");
        String sourcePath = sc.nextLine();

        System.out.print("Nhap duong dan tep dich: ");
        String targetPath = sc.nextLine();

        File sourceFile = new File( sourcePath );
        File targetFile = new File( targetPath );


        //Kiem tra file nguon co ton tai khong
        if(!sourceFile.exists()){
            System.out.println("Tep nguon khong ton tai.");
            return;
        }

        //Kiem tra file dich den co ton tai ko
        if(targetFile.exists()){
            System.out.println("Tep dich da ton tai. khong the ghi de");
            return;
        }
        int chaCount = 0;
        try( FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile);){
           int byteRead ;
           while((byteRead = fis.read()) != 1){
               fos.write(byteRead);
               chaCount++;
           }
            System.out.println("Sao chep thanh cong.");
            System.out.println("So ky tu da sao chep: " + chaCount);
        } catch (IOException e) {
            System.out.println("Co loi xay ra khi sao chep: " + e.getMessage());
        }
    }
}
