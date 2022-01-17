package input_ouput_stream.based_byte.input_stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class SomeBayReadTest {
    public static void main(String[] args) throws Exception{
        InputStream is = new FileInputStream("C:/Temp/test3.db");

        byte[] buffer = new byte[5];

        int readByteNum = is.read(buffer, 2, 3);

        if(readByteNum != -1) { //읽은 byte가 있다면
            for(int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        is.close();
    }
}
