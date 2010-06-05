
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
 * IUSBController.java
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
public class IUSBController extends IUnknown {

    public static IUSBController cast(IUnknown other) {
        return new IUSBController(other.getRef(), other.getRemoteWSPort());
    }

    public IUSBController(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute IUSBController::enabled of type boolean
    public Boolean getEnabled() {
        try {
            Boolean retVal = port.iusbControllerGetEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setEnabled(Boolean value) {
        try {
            port.iusbControllerSetEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBController::enabledEhci of type boolean
    public Boolean getEnabledEhci() {
        try {
            Boolean retVal = port.iusbControllerGetEnabledEhci(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setEnabledEhci(Boolean value) {
        try {
            port.iusbControllerSetEnabledEhci(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IUSBController::proxyAvailable of type boolean
    public Boolean getProxyAvailable() {
        try {
            Boolean retVal = port.iusbControllerGetProxyAvailable(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IUSBController::USBStandard of type unsigned short
    public Integer getUSBStandard() {
        try {
            Integer retVal = port.iusbControllerGetUSBStandard(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IUSBController::deviceFilters of type IUSBDeviceFilter
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter> getDeviceFilters() {
        try {
            List<String> retVal = port.iusbControllerGetDeviceFilters(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IUSBController::createDeviceFilter(
            [in] wstring name,
            [return] IUSBDeviceFilter filter)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter createDeviceFilter(String name) {
        try {
            String retVal = port.iusbControllerCreateDeviceFilter(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IUSBController::insertDeviceFilter(
            [in] unsigned long position,
            [in] IUSBDeviceFilter filter)
     */
    public void insertDeviceFilter(Long position, com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter filter) {
        try {
            port.iusbControllerInsertDeviceFilter(_this, position, ((filter == null)?null:filter.getRef()));
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IUSBController::removeDeviceFilter(
            [in] unsigned long position,
            [return] IUSBDeviceFilter filter)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter removeDeviceFilter(Long position) {
        try {
            String retVal = port.iusbControllerRemoveDeviceFilter(_this, position);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBDeviceFilter(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
