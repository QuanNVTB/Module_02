import java.util.HashMap;
import java.util.Map;

public class WordCountWithMap {
    public static void main(String[] args) {
        String text = "Java is easy and Java is powerful";

        Map<String, Integer> result = countWords(text);

        System.out.println("So lan xuat hien cua moi tu: ");
        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        //Chuyển thành chữ thường tách từ
        String[] words = text.toLowerCase().split("\\s+");
        for (String word : words) {
            if(wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            }else{
                wordCount.put(word, 1);
            }
        }
        return wordCount;
    };

}
