
/**
 * Copyright (C) 2008-2010 Oracle Corporation
 *
 * This file is part of a free software library; you can redistribute
 * it and/or modify it under the terms of the GNU Lesser General
 * Public License version 2.1 as published by the Free Software
 * Foundation and shipped in the "COPYING.LIB" file with this library.
 * The library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY of any kind.
 *
 * Oracle LGPL Disclaimer: For the avoidance of doubt, except that if
 * any license choice other than GPL or LGPL is available it will
 * apply instead, Oracle elects to use only the Lesser General Public
 * License version 2.1 (LGPLv2) at this time for any software where
 * a choice of LGPL license versions is made available with the
 * language indicating that LGPLv2 or any later version may be used,
 * or where a choice of which version of the LGPL is applied is
 * otherwise unspecified.
 *
 * Helper.java
 *
 * DO NOT EDIT! This is a generated file.
 * Generated from: src/VBox/Main/idl/VirtualBox.xidl (VirtualBox's interface definitions in XML)
 * Generator: src/VBox/Main/webservice/glue-jaxws.xsl
 */


package com.sun.xml.ws.commons.virtualbox_3_2;

import org.virtualbox_3_2.VboxPortType;
import org.virtualbox_3_2.VboxService;
import org.virtualbox_3_2.InvalidObjectFaultMsg;
import org.virtualbox_3_2.RuntimeFaultMsg;
import javax.xml.ws.WebServiceException;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Helper {
    public static <T> List<T> wrap(Class<T> wrapperClass, VboxPortType pt, List<String> thisPtrs) {
        try {
            if(thisPtrs==null)  return Collections.emptyList();

            Constructor<T> c = wrapperClass.getConstructor(String.class, VboxPortType.class);
            List<T> ret = new ArrayList<T>(thisPtrs.size());
            for (String thisPtr : thisPtrs) {
                ret.add(c.newInstance(thisPtr,pt));
            }
            return ret;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public static <T1, T2> List<T1> wrap2(Class<T1> wrapperClass1, Class<T2> wrapperClass2, VboxPortType pt, List<T2> thisPtrs) {
        try {
            if(thisPtrs==null)  return Collections.emptyList();

            Constructor<T1> c = wrapperClass1.getConstructor(wrapperClass2, VboxPortType.class);
            List<T1> ret = new ArrayList<T1>(thisPtrs.size());
            for (T2 thisPtr : thisPtrs) {
                ret.add(c.newInstance(thisPtr,pt));
            }
            return ret;
        } catch (NoSuchMethodException e) {
            throw new AssertionError(e);
        } catch (InstantiationException e) {
            throw new AssertionError(e);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public static <T extends IUnknown> List<String> unwrap(List<T> thisPtrs) {
        if (thisPtrs==null)  return Collections.emptyList();

        List<String> ret = new ArrayList<String>();
        for (T obj : thisPtrs) {
          ret.add(obj.getRef());
        }
        return ret;
    }
}
