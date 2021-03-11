/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package designpatterns.creative.singledesignpattern.case1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 懒汉式单例模式
 * 单例模式实战案例一：处理资源访问冲突
 * 在这个例子中，我们自定义实现了一个往文件中打印日志的Logger类
 * 设计成单例模式，防止多线程环境下写入日志相互覆盖的问题
 * @author yjl
 * @version $Id: Logger.java, v 0.1 2021-02-24 15:32 yjl Exp $$
 */
public class Logger {

    private FileWriter writer;
    // 自己new自己，并将其声明为私有变量
    private static final Logger instance = new Logger();

    private Logger(){
        File file = new File("");
        try {
            writer = new FileWriter(file, true);// true 标识追加写入
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Logger getInstance(){
        return instance;
    }

    public void log(String message) throws IOException {
        writer.write(message);
    }

}