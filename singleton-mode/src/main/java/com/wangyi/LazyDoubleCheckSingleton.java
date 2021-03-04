package com.wangyi;

/*
 * @Author wangyi
 * @Description 双检查锁单例
 * @Date 2021/2/3 23:14
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){};
    private static volatile LazyDoubleCheckSingleton instance;

    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if (instance == null){
                    instance =  new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
