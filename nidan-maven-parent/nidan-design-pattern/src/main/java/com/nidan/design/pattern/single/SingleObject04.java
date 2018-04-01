package com.nidan.design.pattern.single;

/**
 * 4，双检锁/双重校验锁（DCL，即 double-checked locking）
 *
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 *
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 *
 * Created by Nidan on 2018年03月22 下午 12:05
 */
public class SingleObject04 {

    private SingleObject04(){}

    public volatile static SingleObject04 singleObject04;

    public static SingleObject04 getInstance(){
        if(singleObject04==null){
            synchronized (SingleObject04.class){
                if (singleObject04==null){
                    singleObject04=new SingleObject04();
                }
            }
        }
        return singleObject04;
    }

}
