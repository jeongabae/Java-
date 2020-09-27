import java.io.*;

public class Lottery {
    public static void main(String[] args) {
        try {

            File file = new File("/Users/jeongabae/IdeaProjects/homework/src/main/java/text1.txt");

            FileReader filereader = new FileReader(file);

            BufferedReader bufReader = new BufferedReader(filereader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                System.out.println(line);
            }

            bufReader.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
