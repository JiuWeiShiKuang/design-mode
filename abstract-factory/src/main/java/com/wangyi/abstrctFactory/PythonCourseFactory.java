package com.wangyi.abstrctFactory;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/2/3 20:29
 */
public class PythonCourseFactory extends CourseFactory {
    public INote createNote() {
        super.init();
        return new PythonNote();
    }

    public IVideo createVideo() {
        super.init();
        return new PythonVideo();
    }

    public IDayi createDayi() {
        super.init();
        return null;
    }
}
