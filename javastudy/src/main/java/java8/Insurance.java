/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package java8;

import javafx.util.Pair;
import lombok.Data;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

/**
 * 泛型类中，变量使用大写形式，且比较短
 * 使用具体的类型替换类型变量就可以实例化泛型类型
 *
 * @author yjl
 * @version $Id: Insurance.java, v 0.1 2021-03-02 15:27 yjl Exp $$
 */
@Data
public class Insurance<T> {
    public String name;
    public T Text;


    public static void main(String[] args) {
        Pair<String, Object> pair = new Pair<>("", "");
        pair.getKey();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("this is a test");
        arrayList.add("haha");
        arrayList.add("ll");
        arrayList.get(2);
        arrayList.iterator().forEachRemaining(m -> System.out.println(m));
        boolean a = arrayList.contains("a");

        LinkedList<String> strings = new LinkedList<>();
        strings.add("Amy");
        strings.add("Bob");
        strings.add("Carl");
        strings.add("Amy");
        ListIterator<String> listIterator = strings.listIterator();
        listIterator.next();
        listIterator.add("Jon");
        System.out.println(strings.toString());

        Vector<String> vector = new Vector(2);

        vector.add("test");
        vector.add("test2");
        vector.add("test3");

        String hashCode = "yangjunlu";
        int i = hashCode.hashCode();

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("test");
        hashSet.contains("test");
    }

}