package input_ouput_stream.based_byte.output_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class SomeBayWriteTest {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/Temp/test3.db");

        byte[] array = {10, 20, 30, 40, 50, 60};

        os.write(array, 1, 3);

        os.flush();
        os.close();
    }
}
