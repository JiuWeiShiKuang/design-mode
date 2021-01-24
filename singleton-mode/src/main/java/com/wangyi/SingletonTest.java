package com.wangyi;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/1/24 20:51
 */
/**
 *懒汉饿汉
 *      区别: 饿汉模式加载类时比较慢,但运行时获取对象的速度比较快    线程安全
 *            懒汉模式加载类时比较快,但运行时获取对象的速度比较慢    线程不安全
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();
        if (s1 == s2){
            System.out.println("s1和s2是同一个实例");
        }else {
            System.out.println("s1和s2不是同一个实例");
        }

        Singleton2 s3 = Singleton2.getInstance();
        Singleton2 s4 = Singleton2.getInstance();
        if (s3 == s4){
            System.out.println("s3和s4是同一个实例");
        }else {
            System.out.println("s3和s4不是同一个实例");
        }
    }
}
