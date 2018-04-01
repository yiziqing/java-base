package com.nidan.design.pattern.single;

/**
 * 3，饿汉式，线程安全
 *
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 *
 * 描述：这种方式比较常用，但容易产生垃圾对象。
 * 优点：没有加锁，执行效率会提高。
 * 缺点：类加载时就初始化，浪费内存。
 * 它基于 classloder 机制避免了多线程的同步问题，不过，instance 在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用 getInstance 方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，
 * 这时候初始化 instance 显然没有达到 lazy loading 的效果。
 *
 * Created by Nidan on 2018年03月22 下午 12:05
 */
public class SingleObject03 {

    private SingleObject03(){}

    public final static SingleObject03 singleObject03=new SingleObject03();

    public static SingleObject03 getInstance(){
        return singleObject03;
    }

}
