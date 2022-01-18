package input_ouput_stream.sub_stream.buffer;

import java.io.*;

public class BufferedStreamTest {
    public static void main(String[] args) throws Exception {
        //기본 스트림 생성
        String originalFilePath1 = BufferedStreamTest.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis1 = new FileInputStream(originalFilePath1);
        FileOutputStream fos1 = new FileOutputStream(targetFilePath1);

        //버퍼 보조 스트림 연결
        String originalFilePath2 = BufferedStreamTest.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis1, fos1);
        System.out.println("버퍼 사용 안 했을 때: " + nonBufferTime + " ns");

        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용 했을 때: " + bufferTime + " ns");


        fis1.close();
        fos1.close();
        bis.close();
        bos.close();
    }

    static int data = -1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while(true) {
            data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();

        long end = System.nanoTime();
        return (end - start);
    }
}
