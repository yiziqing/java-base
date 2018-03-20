package com.nidan.design.pattern.factory.abstr;

import com.nidan.design.pattern.model.ED;
import com.nidan.design.pattern.model.Mac;

/**
 * Created by nzqbe on 2018/3/21.
 */
public abstract class AbstractFactory {

    public abstract ED getMac();

    public abstract ED getPhone();

    public abstract ED getTV();

    public abstract ED getWatch();

}
