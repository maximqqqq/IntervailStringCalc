import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WraiterClass {

    public void metodWrirer(double a, double b, char op, double rez) {
        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("output.txt", true)))) {
            out.println(a + "" + op + "" + b + "=" + rez);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}