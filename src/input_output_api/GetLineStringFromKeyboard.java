package input_output_api;

import java.io.*;

public class GetLineStringFromKeyboard {
    public static void main(String[] args) throws Exception{
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.println("입력하세용: ");
            String lineStr = br.readLine();
            if(lineStr.equals("q") || lineStr.equals("quit")) break;
            System.out.println("입력된 내용: " + lineStr);
            System.out.println();
        }
        br.close();
    }
}
