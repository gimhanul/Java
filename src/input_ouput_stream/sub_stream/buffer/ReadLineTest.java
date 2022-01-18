package input_ouput_stream.sub_stream.buffer;

import java.io.*;

public class ReadLineTest {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader(
                ReadLineTest.class.getResource("language.txt").getPath()
        );
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            String data = br.readLine();
            if(data == null) break;
            System.out.println(data);
        }

        br.close();
    }
}
