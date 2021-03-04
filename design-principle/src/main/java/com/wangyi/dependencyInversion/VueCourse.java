package com.wangyi.dependencyInversion;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/1/31 13:35
 */
public class VueCourse implements ICourse {
    public void study() {
        System.out.println("wy正在学习Vue课程");
    }
}
