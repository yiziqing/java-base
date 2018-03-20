package com.nidan.design.pattern.factory.func;

import com.nidan.design.pattern.model.Phone;

/**
 * Created by nzqbe on 2018/3/21.
 */
public class PhoneFactory implements Factory{

    public Phone getName(){
        return new Phone();
    }
}
