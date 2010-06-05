
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
 * IPerformanceMetric.java
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
import java.math.BigInteger;
import java.util.List;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;
public class IPerformanceMetric extends IUnknown {

    public static IPerformanceMetric cast(IUnknown other) {
        return new IPerformanceMetric(other.getRef(), other.getRemoteWSPort());
    }

    public IPerformanceMetric(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IPerformanceMetric::metricName of type wstring
    public String getMetricName() {
        try {
            String retVal = port.iPerformanceMetricGetMetricName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::object of type $unknown
    public IUnknown getObject() {
        try {
            String retVal = port.iPerformanceMetricGetObject(_this);
            return (retVal.length() > 0) ? new IUnknown(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::description of type wstring
    public String getDescription() {
        try {
            String retVal = port.iPerformanceMetricGetDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::period of type unsigned long
    public Long getPeriod() {
        try {
            Long retVal = port.iPerformanceMetricGetPeriod(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::count of type unsigned long
    public Long getCount() {
        try {
            Long retVal = port.iPerformanceMetricGetCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::unit of type wstring
    public String getUnit() {
        try {
            String retVal = port.iPerformanceMetricGetUnit(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::minimumValue of type long
    public Integer getMinimumValue() {
        try {
            Integer retVal = port.iPerformanceMetricGetMinimumValue(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IPerformanceMetric::maximumValue of type long
    public Integer getMaximumValue() {
        try {
            Integer retVal = port.iPerformanceMetricGetMaximumValue(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
