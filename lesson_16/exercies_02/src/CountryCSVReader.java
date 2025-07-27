import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryCSVReader {
    public static void main(String[] args) {
        String filePath = "country.csv";
        List<Country> countryList = readCSV(filePath);

        for (Country country : countryList) {
            System.out.println(country);
        }
    }

    public static List<Country> readCSV(String filePath) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String code = parts[1].replace("\"", "").trim();
                    String name = parts[2].replace("\"", "").trim();

                    countries.add(new Country(id, code, name));
                }
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
        return countries;
    }
}
