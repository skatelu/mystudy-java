package com.example.changedata.common.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class OutToFile {
    private static String filePath = "D:\\电子证照\\证照数据-推送国办历史数据\\全量数据\\cjrzNull.txt";

    public static void saveAsFileWriter(String content) {
        FileWriter fwriter = null;
        try {
            // true表示不覆盖原来的内容，而是加到文件的后面。若要覆盖原来的内容，直接省略这个参数就好
            fwriter = new FileWriter(filePath, true);
            fwriter.write("\r\n"+content);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                fwriter.flush();
                fwriter.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Date());
    }
}
