package com.nidan.design.pattern.factory.func;

import com.nidan.design.pattern.model.Phone;
import com.nidan.design.pattern.model.TV;

/**
 * Created by nzqbe on 2018/3/21.
 */
public class TVFactory implements Factory{

    public TV getName(){
        return new TV();
    }
}
