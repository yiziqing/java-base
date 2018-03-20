package com.nidan.design.pattern.factory.func;

import com.nidan.design.pattern.model.Mac;

/**
 * Created by nzqbe on 2018/3/21.
 */
public class MacFactory implements Factory{

    public Mac getName(){
        return new Mac();
    }

}
