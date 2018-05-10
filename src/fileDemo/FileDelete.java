package fileDemo;

import java.io.File;

/**
 * Author: Bridge
 * Date: 2018/05/04 19:00ls
 * Function:删除文件
 */
public class FileDelete {

    public static void main(String[] args) {
        try {
            //查看文件路径，双击文件，显示详情
            File file = new File("" +
                    "/Users/bridge/IdeaProjects/my-demo/writer.txt");
            if (file.delete()){
                System.out.println(file.getName() +  "文件已经被删除！");
            }else {
                System.out.println("文件删除失败！");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
