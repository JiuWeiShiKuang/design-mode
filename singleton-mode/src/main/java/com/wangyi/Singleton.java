package com.wangyi;

/*
 * @Author wangyi
 * @Description 单例模式 懒汉模式
 * @Date 2021/1/24 20:49
 */
public class Singleton {

    //1.将构造方法私有化,不允许外部直接创建对象
    private Singleton(){
    }

    //2.创建类的唯一实例, 使用private static修饰
    private static Singleton instance = new Singleton();

    //3.提供一个获取实例的方法,用public static修饰
    public static Singleton getSingleton(){
        return instance;
    }

}
