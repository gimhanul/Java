package input_ouput_stream.based_character.writer;

import java.io.FileWriter;
import java.io.Writer;

public class CharBayWriteTest {
    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("C:/Temp/test8.txt");

        char[] arr = {'A', 'B', 'C'};

        writer.write(arr);

        writer.flush();
        writer.close();
    }
}
