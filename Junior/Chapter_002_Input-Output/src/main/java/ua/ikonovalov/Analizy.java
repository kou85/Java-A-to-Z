package ua.ikonovalov;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ikonovalov
 * @Since 05.09.19.
 */
public class Analizy {
    public void unavailable(InputStream source, String target) {
   // public void unavailable(InputStream source, File target) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(source))) {
            List<String> list = new ArrayList<>();
            boolean checkStatus = true;
            String temp = null;
                while(br.ready()) {
                    String cheak = br.readLine();

                    if (checkStatus) {
                        if (cheak.contains("400") || cheak.contains("500")) {
                            cheak = cheak.substring(cheak.indexOf(" "), cheak.length());
                           // list.add(cheak);
                            temp = cheak;
                            checkStatus = false;
                        }
                    }
                    if (!checkStatus) {
                        if (cheak.contains("200") || cheak.contains("300")) {
                            cheak = cheak.substring(cheak.indexOf(" "));
                            list.add(temp + ";" + cheak);
                            checkStatus = true;
                        }
                    }
            }
          writeFile(target, list);
        }  catch (IOException io) {
            io.printStackTrace();
        }
    }


   // private void writeFile(String target, List<String> list) {
    private void writeFile(String target, List<String> list) {
      //  try (PrintWriter pr = new PrintWriter(new FileOutputStream(target)) {
        try (PrintWriter pr = new PrintWriter(target) {
        }) {
            for (String str : list) {
                pr.write(str);
                pr.write(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try (PrintWriter out = new PrintWriter(new FileOutputStream("target66.csv"))) {
            out.println("15:01:30;15:02:32");
            out.println("15:10:30;23:12:32");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
