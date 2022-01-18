package input_ouput_stream.sub_stream;

import java.io.*;

public class DataInputOutputStreamTest {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("C:/Temp/primitive.db");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("김한울");
        dos.writeDouble(100);
        dos.writeInt(1);

        dos.writeUTF("김안울");
        dos.writeDouble(90);
        dos.writeInt(2);

        dos.flush();
        dos.close();

        FileInputStream fis = new FileInputStream("C:/Temp/primitive.db");
        DataInputStream dis = new DataInputStream(fis);

        for(int i=0; i<2; i++) {
            String name = dis.readUTF();
            double score = dis.readDouble();
            int order = dis.readInt();
            System.out.println(name + " | " + score + " | " + order);
        }

        dis.close();


    }
}
