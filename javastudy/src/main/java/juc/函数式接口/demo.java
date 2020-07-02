package juc.函数式接口;


import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;

/**
 * Function:函数式接口，有一个输入，有一个输出
 * predicate:断定型接口，返回值只能是 布尔值
 *
 * 只要是函数式接口，可以用 lambda表达式简化
 *
 */
public class demo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long reduce = LongStream.range(1, 1000_000_000_000L).parallel().reduce(0, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(reduce);
        System.out.println(end - start);
    }
}
