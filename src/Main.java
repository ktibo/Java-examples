import java.awt.*;
import java.awt.color.ColorSpace;
import java.io.*;
import java.net.*;
import java.nio.file.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.*;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) throws Exception {

        try (RandomAccessFile raf = new RandomAccessFile("C:\\test\\src.txt", "rw")) {
            raf.writeBoolean(true);
            raf.writeBoolean(false);

            raf.seek(1);
            boolean b = raf.readBoolean();

            System.out.println(b);

        }catch (Exception e){
            System.out.println("fuck");
        }


//        try (FileInputStream fin = new FileInputStream("C:\\test\\src.txt");
//             FileOutputStream fout = new FileOutputStream("C:\\test\\des.txt");
//        ) {
//            int s = 1/0;
//            while(s!=-1){
//                s = fin.read();
//                if (s!=-1) fout.write(s);
//            }
//
//            System.out.println("OK");
//        }catch (Exception e){
//            System.out.println("fuck");
//        }



//        FileInputStream fis = null;
//
//        try {
//            fis = new FileInputStream("C:\\test1\\src.txt");
//            int i;
//            do{
//                i = fis.read();
//                if (i!=-1) S
//            +-ystem.out.print((char)i);
//            } while (i!=-1);
//
//        }catch (Exception e){
//            System.out.println("fuck");
//        } finally {
//            if (fis!=null) fis.close();
//        }



        //byte[] data = new byte[10];

        //System.out.format("123");
        //System.out.write(10);
        //System.out.println("Enterrr!!!");
        //System.in.read(data);
        //System.out.println("ok");

        //TestClass t1 = new TestClass2(1);


        //Language lan = new Language("");
        //lan.fun(t1);

       // Object ob = new TestClass(2);

//        BufferedReader reader;
//
//        try {
//            reader = new BufferedReader(new FileReader("C:\\test1\\src.txt"));
//            String line = reader.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                // read next line
//                line = reader.readLine();
//            }
//
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        //int a = Integer.parseInt(input.readLine());
        //int b = Integer.parseInt(input.readLine());
        //input.close();

    }

}