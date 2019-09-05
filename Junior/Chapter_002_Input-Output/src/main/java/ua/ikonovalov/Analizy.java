package ua.ikonovalov;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ikonovalov
 * @Since 05.09.19.
 */
public class Analizy {
    public void unavailable(String source, String target) {
        try(BufferedReader br = new BufferedReader(new FileReader(source))) {
            List<String> list = new ArrayList<>();
            boolean checkStatus = true;
                while(br.ready()) {
                    String cheak = br.readLine();
                    if (checkStatus) {
                        if (cheak.contains("400") || cheak.contains("500")) {
                            list.add(cheak);
                            checkStatus = false;

                        }
                    }
            }
            try (PrintWriter pr = new PrintWriter(new FileOutputStream(target)) {
            }) {
                 for (String str : list) {
                     pr.write(str);
                     pr.write(System.lineSeparator());
                 }
             }

            } catch (FileNotFoundException fe) {
                 fe.printStackTrace();
             } catch (IOException io) {
            io.printStackTrace();
            }
    }

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("target.csv"))) {
            out.println("15:01:30;15:02:32");
            out.println("15:10:30;23:12:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
