package input_ouput_stream.based_character.writer;

import java.io.FileWriter;
import java.io.Writer;

public class SomeBayWriteTest {
    public static void main(String[] args) throws Exception{
        Writer writer = new FileWriter("C:/Temp/test9.txt");

        char[] arr = {'A', 'B', 'C', 'D', 'E'};

        writer.write(arr, 1, 3);

        writer.flush();
        writer.close();
    }
}
