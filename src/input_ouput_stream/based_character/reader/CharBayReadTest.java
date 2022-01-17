package input_ouput_stream.based_character.reader;

import java.io.FileReader;
import java.io.Reader;

public class CharBayReadTest {
    public static void main(String[] args)  throws Exception {
        Reader reader = new FileReader("C:/Temp/test10.txt");

        char[] buffer = new char[100];

        while(true) {
            int readCharNum = reader.read(buffer);
            if(readCharNum == -1) break;

            for(int i=0; i<readCharNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
