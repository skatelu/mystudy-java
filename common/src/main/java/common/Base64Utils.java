package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;

public class Base64Utils {
    /**
     * <p>将文件转成base64 字符串</p>
     * @param filePath 文件路径
     * @return
     * @throws Exception
     */
    public static String encodeBase64File(String filePath) throws Exception {

        if (filePath == null) {
            return null;
        }
        try {
            byte[] b = Files.readAllBytes(Paths.get(filePath));
            return Base64.getEncoder().encodeToString(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;

    }
    /**
     * <p>将base64字符解码保存文件</p>
     * @param base64
     * @param filePath
     * @throws Exception
     */
    public static String decoderBase64File(String base64,String filePath) throws Exception {

        if (base64 == null && filePath == null) {
            return "生成文件失败，请给出相应的数据。";
        }
        try {
            Files.write(Paths.get(filePath), Base64.getDecoder().decode(base64), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e);
        }
        return "指定路径下生成文件成功！";

    }
    /**
     * <p>将base64字符保存文本文件</p>
     * @param base64Code
     * @param targetPath
     * @throws Exception
     */
    public static void toFile(String base64Code,String targetPath) throws Exception {
        byte[] buffer = base64Code.getBytes();
        FileOutputStream out = new FileOutputStream(targetPath);
        out.write(buffer);
        out.close();
    }
//    public static void main(String[] args) {
//        try {
//            String base64Code =encodeBase64File("/Users/Crazy/Pictures/zyb2.jpg");
//            System.out.println(base64Code);
//            decoderBase64File(base64Code, "/Users/Crazy/Desktop/zyb.png");
//            toFile(base64Code, "/Users/Crazy/Desktop/zyb.txt");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
