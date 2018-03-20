package com.nidan.design.pattern.factory.abstr;

import com.nidan.design.pattern.factory.func.MacFactory;
import com.nidan.design.pattern.factory.func.PhoneFactory;
import com.nidan.design.pattern.factory.func.TVFactory;
import com.nidan.design.pattern.factory.func.WatchFactory;
import com.nidan.design.pattern.model.*;

/**
 * Created by nzqbe on 2018/3/21.
 */
public class EDFactory extends AbstractFactory {

    public ED getMac() {
//        return new MacFactory().getName();
        return new Mac();
    }

    public ED getPhone() {
//        return new PhoneFactory().getName();
        return new Phone();
    }

    public ED getTV() {
//        return new TVFactory().getName();
        return new TV();
    }

    public ED getWatch() {
//        return new WatchFactory().getName();
        return new Watch();
    }
}
