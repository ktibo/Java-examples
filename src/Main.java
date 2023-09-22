
import java.io.*;

public class Main {

    public static void main(String... args) {

        System.out.println("Insert number:\n" +
                "0: RandomAccessFile");

        System.out.println("-1: Quit");

        while (true) {

            int option;
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String res = "";
            try {
                res = input.readLine();
                option = Integer.parseInt(res);
            } catch (NumberFormatException e) {
                System.out.println("\""+res+"\" is not a number! Try again.");
                continue;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            switch (option) {
                case 0:
                    try (RandomAccessFile raf = new RandomAccessFile("C:\\test\\src.txt", "rw")) {
                        //raf.seek(100);
                        raf.writeBoolean(true);
                        raf.writeBoolean(false);
                        raf.writeChar('f');

                        raf.seek(1);
                        //boolean b = raf.readBoolean();
                        char ch = raf.readChar();

                        System.out.println(ch);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case -1: return;
                default:
                    System.out.println("Option " + option + " isn't specified!");
            }
        }

    }

}