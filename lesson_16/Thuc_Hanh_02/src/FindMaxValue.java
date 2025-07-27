import java.util.List;

public class FindMaxValue {
    public static  int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for(int i = 1; i < numbers.size(); i++){
            if(max<numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\codegym\\module_02\\lesson_16\\Thuc_Hanh_02\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\codegym\\module_02\\lesson_16\\Thuc_Hanh_02\\result.txt", maxValue);
    }
}
