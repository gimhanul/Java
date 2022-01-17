package input_ouput_stream.based_byte.output_stream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteBayWriteTest {
    public static void main(String[] args) throws Exception{
        OutputStream os = new FileOutputStream("C:/Temp/test2.db");

        byte[] bay = {10, 20, 30};

        os.write(bay);

        os.flush();
        os.close();
    }
}
