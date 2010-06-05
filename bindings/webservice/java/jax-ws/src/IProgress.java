
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
 * IProgress.java
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
public class IProgress extends IUnknown {

    public static IProgress cast(IUnknown other) {
        return new IProgress(other.getRef(), other.getRemoteWSPort());
    }

    public IProgress(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IProgress::id of type uuid
    public String getId() {
        try {
            String retVal = port.iProgressGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::description of type wstring
    public String getDescription() {
        try {
            String retVal = port.iProgressGetDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::initiator of type $unknown
    public IUnknown getInitiator() {
        try {
            String retVal = port.iProgressGetInitiator(_this);
            return (retVal.length() > 0) ? new IUnknown(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::cancelable of type boolean
    public Boolean getCancelable() {
        try {
            Boolean retVal = port.iProgressGetCancelable(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::percent of type unsigned long
    public Long getPercent() {
        try {
            Long retVal = port.iProgressGetPercent(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::timeRemaining of type long
    public Integer getTimeRemaining() {
        try {
            Integer retVal = port.iProgressGetTimeRemaining(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::completed of type boolean
    public Boolean getCompleted() {
        try {
            Boolean retVal = port.iProgressGetCompleted(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::canceled of type boolean
    public Boolean getCanceled() {
        try {
            Boolean retVal = port.iProgressGetCanceled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::resultCode of type long
    public Integer getResultCode() {
        try {
            Integer retVal = port.iProgressGetResultCode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::errorInfo of type IVirtualBoxErrorInfo
    public com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo getErrorInfo() {
        try {
            String retVal = port.iProgressGetErrorInfo(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::operationCount of type unsigned long
    public Long getOperationCount() {
        try {
            Long retVal = port.iProgressGetOperationCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::operation of type unsigned long
    public Long getOperation() {
        try {
            Long retVal = port.iProgressGetOperation(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::operationDescription of type wstring
    public String getOperationDescription() {
        try {
            String retVal = port.iProgressGetOperationDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IProgress::operationPercent of type unsigned long
    public Long getOperationPercent() {
        try {
            Long retVal = port.iProgressGetOperationPercent(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IProgress::timeout of type unsigned long
    public Long getTimeout() {
        try {
            Long retVal = port.iProgressGetTimeout(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTimeout(Long value) {
        try {
            port.iProgressSetTimeout(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IProgress::setCurrentOperationProgress(
            [in] unsigned long percent)
     */
    public void setCurrentOperationProgress(Long percent) {
        try {
            port.iProgressSetCurrentOperationProgress(_this, percent);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IProgress::setNextOperation(
            [in] wstring nextOperationDescription,
            [in] unsigned long nextOperationsWeight)
     */
    public void setNextOperation(String nextOperationDescription, Long nextOperationsWeight) {
        try {
            port.iProgressSetNextOperation(_this, nextOperationDescription, nextOperationsWeight);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IProgress::waitForCompletion(
            [in] long timeout)
     */
    public void waitForCompletion(Integer timeout) {
        try {
            port.iProgressWaitForCompletion(_this, timeout);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IProgress::waitForOperationCompletion(
            [in] unsigned long operation,
            [in] long timeout)
     */
    public void waitForOperationCompletion(Long operation, Integer timeout) {
        try {
            port.iProgressWaitForOperationCompletion(_this, operation, timeout);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IProgress::cancel()
     */
    public void cancel() {
        try {
            port.iProgressCancel(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
