package com.nidan.design.pattern.single;

/**
 * 1，懒汉式，线程不安全
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：否
 *
 * 实现难度：易
 *
 * 描述：这种方式是最基本的实现方式，这种实现最大的问题就是不支持多线程。
 * 因为没有加锁 synchronized，所以严格意义上它并不算单例模式。
 *
 * 这种方式 lazy loading 很明显，不要求线程安全，在多线程不能正常工作
 *
 * Created by Nidan on 2018年03月22 下午 12:05
 */
public class SingleObject01 {

    public static SingleObject01 singleObject;

    public static SingleObject01 getInstance(){
        if(singleObject==null){
            singleObject=new SingleObject01();
        }
        return  singleObject;
    }

}
