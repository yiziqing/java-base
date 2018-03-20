package com.nidan.design.pattern.factory.func;

import com.nidan.design.pattern.model.Watch;

/**
 * Created by nzqbe on 2018/3/21.
 */
public class WatchFactory implements Factory{

    public Watch getName(){
        return new Watch();
    }
}
