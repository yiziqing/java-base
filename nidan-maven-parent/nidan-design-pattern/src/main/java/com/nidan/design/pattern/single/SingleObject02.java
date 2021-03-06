package com.nidan.design.pattern.single;

/**
 * 2，懒汉式，线程安全
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 *
 * 实现难度：易
 *
 * 这种方式具备很好的 lazy loading，能够在多线程中很好的工作，但是，效率很低，99% 情况下不需要同步。
 *
 * 优点：第一次调用才初始化，避免内存浪费。
 * 缺点：必须加锁 synchronized 才能保证单例，但加锁会影响效率。
 * getInstance() 的性能对应用程序不是很关键（该方法使用不太频繁）。
 *
 * Created by Nidan on 2018年03月22 下午 12:05
 */
public class SingleObject02 {

    private SingleObject02(){}

    public static SingleObject02 singleObject;

    public static synchronized SingleObject02 getInstance(){
        if(singleObject==null){
            singleObject=new SingleObject02();
        }
        return  singleObject;
    }

}
