
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        try (RandomAccessFile raf = new RandomAccessFile("C:\\test\\src.txt", "rw")) {
            raf.writeBoolean(true);
            raf.writeBoolean(false);
            raf.writeChar('f');

            raf.seek(1);
            boolean b = raf.readBoolean();
            char ch = raf.readChar();

            System.out.println(ch);

        }catch (Exception e){
            System.out.println("fuck");
        }


    }

}