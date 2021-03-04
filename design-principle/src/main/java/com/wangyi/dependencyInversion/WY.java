package com.wangyi.dependencyInversion;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/1/31 13:19
 */
public class WY {
//    public void study(ICourse course){
//        course.study();//下层依赖抽象
//    }
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }

    public void study(){
        iCourse.study();
    }

}
