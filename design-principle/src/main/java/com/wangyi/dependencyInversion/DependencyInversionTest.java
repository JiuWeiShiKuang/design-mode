package com.wangyi.dependencyInversion;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/1/31 13:36
 */
public class DependencyInversionTest {
    public static void main(String[] args) {
//        ======V1=======
//        WY wy = new WY();
//        wy.study(new JavaCourse());
//        wy.study(new VueCourse());

//        ======V2======
        WY wy = new WY();
        wy.setiCourse(new JavaCourse());
        wy.setiCourse(new VueCourse());
        wy.study();
    }
}
