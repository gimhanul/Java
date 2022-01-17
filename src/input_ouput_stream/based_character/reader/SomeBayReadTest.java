package input_ouput_stream.based_character.reader;

import java.io.FileReader;
import java.io.Reader;

public class SomeBayReadTest {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader("C:/Temp/test9.txt");

        char[] buffer = new char[5];

        int readCharNum = reader.read(buffer, 2, 3);
        if(readCharNum != -1) { //읽은 문자가 있다면
            for(int i=0; i<buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }

        reader.close();
    }
}
