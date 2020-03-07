import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class ReaderClass {
    private String str = null;
    private BufferedReader reader;
    static List<String> list = new ArrayList<>();

    public void metodRead() {

        try {
            reader = new BufferedReader(new FileReader("input_1.txt"));

            String str = "";

            System.out.println("From file");
            while ((str = reader.readLine()) != null) {

                list.add(str);

            }

            reader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
