
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
 * IPerformanceCollector.java
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
public class IPerformanceCollector extends IUnknown {

    public static IPerformanceCollector cast(IUnknown other) {
        return new IPerformanceCollector(other.getRef(), other.getRemoteWSPort());
    }

    public IPerformanceCollector(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IPerformanceCollector::metricNames of type wstring
    public List<String> getMetricNames() {
        try {
            List<String> retVal = port.iPerformanceCollectorGetMetricNames(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IPerformanceCollector::getMetrics(
            [in] wstring metricNames[],
            [in] $unknown objects[],
            [return] IPerformanceMetric metrics[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric> getMetrics(List<String> metricNames, List<IUnknown> objects) {
        try {
            List<String> retVal = port.iPerformanceCollectorGetMetrics(_this, metricNames, Helper.unwrap(objects));
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IPerformanceCollector::setupMetrics(
            [in] wstring metricNames[],
            [in] $unknown objects[],
            [in] unsigned long period,
            [in] unsigned long count,
            [return] IPerformanceMetric affectedMetrics[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric> setupMetrics(List<String> metricNames, List<IUnknown> objects, Long period, Long count) {
        try {
            List<String> retVal = port.iPerformanceCollectorSetupMetrics(_this, metricNames, Helper.unwrap(objects), period, count);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IPerformanceCollector::enableMetrics(
            [in] wstring metricNames[],
            [in] $unknown objects[],
            [return] IPerformanceMetric affectedMetrics[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric> enableMetrics(List<String> metricNames, List<IUnknown> objects) {
        try {
            List<String> retVal = port.iPerformanceCollectorEnableMetrics(_this, metricNames, Helper.unwrap(objects));
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IPerformanceCollector::disableMetrics(
            [in] wstring metricNames[],
            [in] $unknown objects[],
            [return] IPerformanceMetric affectedMetrics[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric> disableMetrics(List<String> metricNames, List<IUnknown> objects) {
        try {
            List<String> retVal = port.iPerformanceCollectorDisableMetrics(_this, metricNames, Helper.unwrap(objects));
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceMetric.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IPerformanceCollector::queryMetricsData(
            [in] wstring metricNames[],
            [in] $unknown objects[],
            [out] wstring returnMetricNames[],
            [out] $unknown returnObjects[],
            [out] wstring returnUnits[],
            [out] unsigned long returnScales[],
            [out] unsigned long returnSequenceNumbers[],
            [out] unsigned long returnDataIndices[],
            [out] unsigned long returnDataLengths[],
            [return] long returnData[])
     */
    public List<Integer> queryMetricsData(List<String> metricNames, List<IUnknown> objects, Holder<List<String>> returnMetricNames, Holder<List<IUnknown>> returnObjects, Holder<List<String>> returnUnits, Holder<List<Long>> returnScales, Holder<List<Long>> returnSequenceNumbers, Holder<List<Long>> returnDataIndices, Holder<List<Long>> returnDataLengths) {
        try {
            Holder<List<String>> tmpreturnObjects = new Holder<List<String>>(); 
            Holder<List<Integer>> retVal = new Holder<List<Integer>>();
            port.iPerformanceCollectorQueryMetricsData(_this, metricNames, Helper.unwrap(objects), returnMetricNames, tmpreturnObjects, returnUnits, returnScales, returnSequenceNumbers, returnDataIndices, returnDataLengths, retVal);
            returnObjects.value = Helper.wrap(IUnknown.class, port, tmpreturnObjects.value);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
