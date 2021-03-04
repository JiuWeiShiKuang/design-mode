package com.wangyi.abstrctFactory;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/2/3 20:29
 */
public class JavaCourseFactory extends CourseFactory {
    public INote createNote() {
        super.init();
        return new JavaNote();
    }

    public IVideo createVideo() {
        super.init();
        return new JavaVideo();
    }

    public IDayi createDayi() {
        super.init();
        return new JavaDayi();
    }
}
