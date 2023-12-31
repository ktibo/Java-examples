
import java.io.*;

public class Streams {

    static final String PATH = "C:\\test\\"; // Default file path

    public static void main(String... args) {

        while (true) {

            StringBuilder menu = new StringBuilder();
            menu.append("0: Quit\n");
            menu.append("1: randomAccessFile\n");
            menu.append("2: bufferredReader\n");
            menu.append("3: printWriter\n");
            menu.append("4: file operations\n");
            menu.append("Choose an option: ");

            System.out.print(menu);

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
                case 4:
                    fileOperations();
                    break;
                default:
                    System.out.println("Option " + option + " isn't specified!");
            }

        }

    }

    private static void fileOperations() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filePath;

        do {
            try {
                System.out.print("Enter txt-file name in \"" + PATH + "\" : ");
                String fileName = br.readLine();
                filePath = PATH + fileName + ".txt";

                if (!(new File(filePath)).isFile())
                    System.out.println("Incorrect file \"" + filePath + "\"!");

            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

        } while (!(new File(filePath)).isFile());

        System.out.println("Enter some data in \""+filePath+"\"");

        // The stream will be closed automatically after try-block
        try (FileWriter fw = new FileWriter(filePath, true)) {

            String str;
            while (!(str = br.readLine()).isEmpty()) {
                fw.write(str + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Your file:");

        try (BufferedReader brfr = new BufferedReader(new FileReader(filePath))) {

            String str;
            while ((str = brfr.readLine()) != null){
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void printWriter() {

        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("printWriter()");

    }

    private static void randomAccessFile() {

        String fileName;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter .txt file name in \""+PATH+"\" : ");
            fileName = bf.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        try (RandomAccessFile raf = new RandomAccessFile(PATH+fileName+".txt", "rw")) {
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
