package input_ouput_stream.based_character.reader;

import java.io.FileReader;
import java.io.Reader;

public class ReadTest {
    public static void main(String[] args) throws Exception{
        Reader reader = new FileReader("C:/Temp/test7.txt");
        while(true) {
            int data = reader.read();
            if(data == -1) break;
            System.out.println((char) data);
        }
        reader.close();
    }
}
