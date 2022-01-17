package input_ouput_stream.based_byte.input_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadTest {
    public static void main(String[] args) throws Exception {
        InputStream is = new FileInputStream("C:/Temp/test1.db");
        while(true) {
            int data = is.read();
            if(data == -1) break;
            System.out.println(data);
        }
        is.close();
    }
}
