package basic_api_class.string.constructor;

import java.io.IOException;

public class KeyboardToStringTest {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력: ");
        int readByteNo = System.in.read(bytes); //bytes에 읽은 byte 저장하고 byte 수 return

        String str = new String(bytes, 0, readByteNo-2);
        System.out.println(str);
    }
}
