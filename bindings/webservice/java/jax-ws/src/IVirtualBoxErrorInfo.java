
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
 * IVirtualBoxErrorInfo.java
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
public class IVirtualBoxErrorInfo extends IUnknown {

    public static IVirtualBoxErrorInfo cast(IUnknown other) {
        return new IVirtualBoxErrorInfo(other.getRef(), other.getRemoteWSPort());
    }

    public IVirtualBoxErrorInfo(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IVirtualBoxErrorInfo::resultCode of type long
    public Integer getResultCode() {
        try {
            Integer retVal = port.iVirtualBoxErrorInfoGetResultCode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBoxErrorInfo::interfaceID of type uuid
    public String getInterfaceID() {
        try {
            String retVal = port.iVirtualBoxErrorInfoGetInterfaceID(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBoxErrorInfo::component of type wstring
    public String getComponent() {
        try {
            String retVal = port.iVirtualBoxErrorInfoGetComponent(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBoxErrorInfo::text of type wstring
    public String getText() {
        try {
            String retVal = port.iVirtualBoxErrorInfoGetText(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBoxErrorInfo::next of type IVirtualBoxErrorInfo
    public com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo getNext() {
        try {
            String retVal = port.iVirtualBoxErrorInfoGetNext(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
