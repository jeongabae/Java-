import java.io.*;

public class FileReader {
    try

    {
        String fileName = "LotteryNumber.txt";
        FileInputStream fis = new FileInputStream(fileName);
        FileReader fr = new FileReader(fileName);

        fis.close();
        fr.close();

    }catch(IOException)

    {
    }
}
