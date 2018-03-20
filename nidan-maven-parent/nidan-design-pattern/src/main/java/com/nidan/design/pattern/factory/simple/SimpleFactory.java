package com.nidan.design.pattern.factory.simple;

import com.nidan.design.pattern.model.*;

/**
 * Created by nzqbe on 2018/3/20.
 */
public class SimpleFactory {

    public ED createED(String ed){
        if(ed.equals("mac")){
            return new Mac();
        }else if(ed.equals("phone")){
            return new Phone();
        }else if(ed.equals("tv")){
            return new TV();
        }else if(ed.equals("watch")){
            return new Watch();
        }
        return null;
    }



}
