package com.nidan.design.pattern.test;

import com.nidan.design.pattern.single.SingleObject03;
import org.junit.Test;

/**
 * Created by Nidan on 2018年03月22 下午 16:24
 */
public class SingleTest {

    @Test
    public void test03(){

        System.out.println(SingleObject03.getInstance().hashCode());

        //SingleObject03.singleObject03=new SingleObject03();

        System.out.println(SingleObject03.getInstance().hashCode());

    }

}
