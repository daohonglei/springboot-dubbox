package com.utils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;


import com.alibaba.dubbo.common.serialize.support.SerializationOptimizer;
import com.entity.Simple;
import com.entity.User;

public class SerializationOptimizerImpl implements SerializationOptimizer {

    @SuppressWarnings("rawtypes")
	public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        //这里可以把所有需要进行序列化的类进行添加
        classes.add(User.class);
        classes.add(Simple.class);
        return classes;
    }
}
