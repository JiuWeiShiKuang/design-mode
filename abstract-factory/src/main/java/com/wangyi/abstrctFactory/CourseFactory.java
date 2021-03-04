package com.wangyi.abstrctFactory;

/*
 * @Author wangyi
 * @Description
 * @Date 2021/2/3 20:22
 */
public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }
    protected abstract INote createNote();

    protected abstract IVideo createVideo();

    protected abstract IDayi createDayi();
}
