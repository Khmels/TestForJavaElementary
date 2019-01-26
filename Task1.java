package homeTask;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("filepath")));
        Pattern pattern = Pattern.compile("[^.,/\\-;:]+");
        Matcher matcher;

        while (bufferedReader.ready()){
            String s = bufferedReader.readLine();
            matcher = pattern.matcher(s);
            while (matcher.find()){
                System.out.print(matcher.group() + " ");
            }
        }
    }
}
