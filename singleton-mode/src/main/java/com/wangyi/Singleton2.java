package com.wangyi;

/*
 * @Author wangyi
 * @Description 饿汉模式
 * @Date 2021/1/24 21:05
 */
public class Singleton2 {

    //1.将构造方法私有化,不允许外部直接获取实例
    private Singleton2(){
    }

    //2.声明类的唯一实例,使用private static 修饰
    private static Singleton2 instance;

    //3.提供一个用于获取实例的方法,用public static修饰
    public static Singleton2 getInstance(){
        if (instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}
