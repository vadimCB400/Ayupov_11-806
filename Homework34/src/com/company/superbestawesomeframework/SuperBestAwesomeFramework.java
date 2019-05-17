package com.company.superbestawesomeframework;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperBestAwesomeFramework {
    static <T> List<T> getMany(Class<T> c, int count) {
        List<T> l = new ArrayList<>();
        try {
            for (int i = 0; i < count; i++) {
                T o = c.newInstance();
                l.add(o);
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
        return l;
    }
    public static <T> List<T> getManyWithCons(Class<T> c, int count, Object... params) {
        List<T> list = new ArrayList<>();

        Constructor usefulConstructor = null;
        Constructor[] constructors = c.getConstructors();
        for (Constructor constructor: constructors) {
            Class[] constructorParameterTypes = constructor.getParameterTypes();
            boolean usable = true;
            int i = 0;

            if (params.length != constructorParameterTypes.length) continue;;

            for (Object p: params) {
                if(constructorParameterTypes.length == i) break;
                if (p.getClass() != constructorParameterTypes[i]) usable = false;
                i++;
            }

            if(usable){
                usefulConstructor = constructor;
                break;
            }
        }
        if (usefulConstructor == null){
            return null;
        }
        for (int i = 0; i < count; i++) {
            try {
                list.add((T) usefulConstructor.newInstance(params));
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

}
