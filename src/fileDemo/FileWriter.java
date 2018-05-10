package fileDemo;

import java.io.*;

/**
 * Author: Bridge
 * Date: 2018/05/04 18:51
 * Function:java写文件
 */
public class FileWriter {

    public static void main(String[] args) {

        try {
            BufferedWriter writer = new BufferedWriter(
                    new java.io.FileWriter("writer.txt"));
            writer.write("Hello,Java!");
            writer.close();
            System.out.println("创建文件成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("writer.txt"));
            String str = reader.readLine();
//            while (str != null){//loop read
//                System.out.println(str);
//                reader.close();
//            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
