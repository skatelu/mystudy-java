package common;

public class Base64Test {

    public static void main(String[] args) {
        fileToBase64();
    }


    public static void fileToBase64() {
        // 文件转成Base64字符串
        String a = "";
        try {
            a = Base64Utils.encodeBase64File("D:\\test\\ejjzszyzgzs_AAAE5E6B595242ECB5DA720A20452D73.ofd");
        } catch (Exception e) {

        }

        System.out.println(a);
    }
}
