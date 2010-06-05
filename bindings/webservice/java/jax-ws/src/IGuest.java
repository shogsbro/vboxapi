
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
 * IGuest.java
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
public class IGuest extends IUnknown {

    public static IGuest cast(IUnknown other) {
        return new IGuest(other.getRef(), other.getRemoteWSPort());
    }

    public IGuest(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IGuest::OSTypeId of type wstring
    public String getOSTypeId() {
        try {
            String retVal = port.iGuestGetOSTypeId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IGuest::additionsActive of type boolean
    public Boolean getAdditionsActive() {
        try {
            Boolean retVal = port.iGuestGetAdditionsActive(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IGuest::additionsVersion of type wstring
    public String getAdditionsVersion() {
        try {
            String retVal = port.iGuestGetAdditionsVersion(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IGuest::supportsSeamless of type boolean
    public Boolean getSupportsSeamless() {
        try {
            Boolean retVal = port.iGuestGetSupportsSeamless(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IGuest::supportsGraphics of type boolean
    public Boolean getSupportsGraphics() {
        try {
            Boolean retVal = port.iGuestGetSupportsGraphics(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IGuest::memoryBalloonSize of type unsigned long
    public Long getMemoryBalloonSize() {
        try {
            Long retVal = port.iGuestGetMemoryBalloonSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMemoryBalloonSize(Long value) {
        try {
            port.iGuestSetMemoryBalloonSize(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IGuest::pageFusionEnabled of type boolean
    public Boolean getPageFusionEnabled() {
        try {
            Boolean retVal = port.iGuestGetPageFusionEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPageFusionEnabled(Boolean value) {
        try {
            port.iGuestSetPageFusionEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IGuest::statisticsUpdateInterval of type unsigned long
    public Long getStatisticsUpdateInterval() {
        try {
            Long retVal = port.iGuestGetStatisticsUpdateInterval(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setStatisticsUpdateInterval(Long value) {
        try {
            port.iGuestSetStatisticsUpdateInterval(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IGuest::internalGetStatistics(
            [out] unsigned long cpuUser,
            [out] unsigned long cpuKernel,
            [out] unsigned long cpuIdle,
            [out] unsigned long memTotal,
            [out] unsigned long memFree,
            [out] unsigned long memBalloon,
            [out] unsigned long memShared,
            [out] unsigned long memCache,
            [out] unsigned long pagedTotal,
            [out] unsigned long memAllocTotal,
            [out] unsigned long memFreeTotal,
            [out] unsigned long memBalloonTotal,
            [out] unsigned long memSharedTotal)
     */
    public void internalGetStatistics(Holder<Long> cpuUser, Holder<Long> cpuKernel, Holder<Long> cpuIdle, Holder<Long> memTotal, Holder<Long> memFree, Holder<Long> memBalloon, Holder<Long> memShared, Holder<Long> memCache, Holder<Long> pagedTotal, Holder<Long> memAllocTotal, Holder<Long> memFreeTotal, Holder<Long> memBalloonTotal, Holder<Long> memSharedTotal) {
        try {
            port.iGuestInternalGetStatistics(_this, cpuUser, cpuKernel, cpuIdle, memTotal, memFree, memBalloon, memShared, memCache, pagedTotal, memAllocTotal, memFreeTotal, memBalloonTotal, memSharedTotal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IGuest::setCredentials(
            [in] wstring userName,
            [in] wstring password,
            [in] wstring domain,
            [in] boolean allowInteractiveLogon)
     */
    public void setCredentials(String userName, String password, String domain, Boolean allowInteractiveLogon) {
        try {
            port.iGuestSetCredentials(_this, userName, password, domain, allowInteractiveLogon);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IGuest::executeProcess(
            [in] wstring execName,
            [in] unsigned long flags,
            [in] wstring arguments[],
            [in] wstring environment[],
            [in] wstring userName,
            [in] wstring password,
            [in] unsigned long timeoutMS,
            [out] unsigned long pid,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress executeProcess(String execName, Long flags, List<String> arguments, List<String> environment, String userName, String password, Long timeoutMS, Holder<Long> pid) {
        try {
            Holder<String> retVal = new Holder<String>();
            port.iGuestExecuteProcess(_this, execName, flags, arguments, environment, userName, password, timeoutMS, pid, retVal);
            return (retVal.value.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal.value, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IGuest::getProcessOutput(
            [in] unsigned long pid,
            [in] unsigned long flags,
            [in] unsigned long timeoutMS,
            [in] unsigned long long size,
            [return] octet data[])
     */
    public List<Short> getProcessOutput(Long pid, Long flags, Long timeoutMS, BigInteger size) {
        try {
            List<Short> retVal = port.iGuestGetProcessOutput(_this, pid, flags, timeoutMS, size);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IGuest::getProcessStatus(
            [in] unsigned long pid,
            [out] unsigned long exitcode,
            [out] unsigned long flags,
            [return] unsigned long reason)
     */
    public Long getProcessStatus(Long pid, Holder<Long> exitcode, Holder<Long> flags) {
        try {
            Holder<Long> retVal = new Holder<Long>();
            port.iGuestGetProcessStatus(_this, pid, exitcode, flags, retVal);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
