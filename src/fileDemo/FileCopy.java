package fileDemo;

import java.io.*;
import java.io.FileWriter;

/**
 * Author: Bridge
 * Date: 2018/05/04 22:36
 * Function:复制文件
 */
public class FileCopy {


    public static void main(String[] args) {
        try {
            BufferedWriter out1 = new BufferedWriter(

                    new FileWriter("srcfile" ));
                    //new FileWriter("/Users/bridge/IdeaProjects/my-demo/test.txt" ));
                    out1.write("String is to be copied\n");
                    out1.close();

            InputStream in = new FileInputStream(new File("srcfile"));
            OutputStream out = new FileOutputStream(new File("destnfile"));


            byte[] bytes = new byte[1024];
            int len = in.read(bytes);
            while (len > 0){
                out.write(bytes,0,len);
            }

            in.close();
            out.close();

            BufferedReader reader = new BufferedReader(new FileReader("destnfile"));
            String str = reader.readLine();
            while (str != null){
                System.out.println(str);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
