package com.wangyi.abstrctFactory;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/2/3 20:32
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        courseFactory.createNote().edit();
        courseFactory.createVideo().record();
        courseFactory.createDayi().dayi();

    }
}
