package com.nidan.design.pattern.test;

import com.nidan.design.pattern.factory.abstr.EDFactory;
import com.nidan.design.pattern.factory.func.Factory;
import com.nidan.design.pattern.factory.func.MacFactory;
import com.nidan.design.pattern.factory.simple.SimpleFactory;
import com.nidan.design.pattern.model.ED;
import org.junit.Test;

/**
 * Created by nzqbe on 2018/3/20.
 */
public class FactoryTest {

    /**
     * 简单工厂测试
     */
    @Test
    public void testSimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        ED mac = simpleFactory.createED("tv");
        System.out.println(mac.toString());
    }

    /**
     * 多工厂测试
     */
    @Test
    public void testMultiFactory(){
        Factory factory=new MacFactory();
        System.out.println(factory.getName());
    }

    /**
     * 抽象工厂测试
     */
    @Test
    public void testAbstractFactory(){
        EDFactory edFactory=new EDFactory();
        System.out.println(edFactory.getMac());
    }

    public static void s1(){
        System.out.println("父类的静态方法");
    }

    public void method(){
        System.out.println("父类的一般方法");
    }

}

class Test2 extends FactoryTest{

    public static void s1(){
        System.out.println("子类的静态方法");
    }

    public void method(){
        System.out.println("子类的一般方法");
    }

    public static void main(String[] args) {
        FactoryTest factoryTest=new Test2();

        factoryTest.method();
        //父类的静态方法不可被子类重写
        factoryTest.s1();
    }

}
