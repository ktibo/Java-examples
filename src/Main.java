
import java.io.*;

public class Main {

    public static void main(String... args) {

        while (true) {

            StringBuilder menu = new StringBuilder("Enter a number.\n");
            menu.append("1: randomAccessFile\n");
            menu.append("2: bufferredReader\n");
            menu.append("3: PrintWriter\n");
            menu.append("0: Quit");

            System.out.println(menu);

            int option;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String res = "";
            try {
                res = input.readLine();
                option = Integer.parseInt(res);
            } catch (NumberFormatException e) {
                System.out.println("\""+res+"\" is not a number!");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            switch (option) {
                case 0: return;
                case 1:
                    randomAccessFile();
                    break;
                case 2:
                    bufferredReader();
                    break;
                case 3:
                    printWriter();
                    break;
                default:
                    System.out.println("Option " + option + " isn't specified!");
            }

        }

    }

    private static void printWriter() {

        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("printWriter()");

    }

    private static void randomAccessFile() {

        String fileName;
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter file name: ");
            fileName = input.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try (RandomAccessFile raf = new RandomAccessFile("C:\\test\\"+fileName+".txt", "rw")) {
            //raf.seek(100);
            raf.writeBoolean(true);
            raf.writeBoolean(false);
            raf.writeChar('f');

            raf.seek(2);
            //boolean b = raf.readBoolean();
            char ch = raf.readChar();

            System.out.println(ch);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    private static void bufferredReader() {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Type some symbols here: ");

        try {
            //char s = (char)bf.read();
            //System.out.println(s);
            String str = bf.readLine();
            System.out.println("Your string: "+str);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
