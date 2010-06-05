
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
 * INetworkAdapter.java
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
public class INetworkAdapter extends IUnknown {

    public static INetworkAdapter cast(IUnknown other) {
        return new INetworkAdapter(other.getRef(), other.getRemoteWSPort());
    }

    public INetworkAdapter(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute INetworkAdapter::adapterType of type NetworkAdapterType
    public org.virtualbox_3_2.NetworkAdapterType getAdapterType() {
        try {
            org.virtualbox_3_2.NetworkAdapterType retVal = port.iNetworkAdapterGetAdapterType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAdapterType(org.virtualbox_3_2.NetworkAdapterType value) {
        try {
            port.iNetworkAdapterSetAdapterType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute INetworkAdapter::slot of type unsigned long
    public Long getSlot() {
        try {
            Long retVal = port.iNetworkAdapterGetSlot(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::enabled of type boolean
    public Boolean getEnabled() {
        try {
            Boolean retVal = port.iNetworkAdapterGetEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setEnabled(Boolean value) {
        try {
            port.iNetworkAdapterSetEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::MACAddress of type wstring
    public String getMACAddress() {
        try {
            String retVal = port.iNetworkAdapterGetMACAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMACAddress(String value) {
        try {
            port.iNetworkAdapterSetMACAddress(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute INetworkAdapter::attachmentType of type NetworkAttachmentType
    public org.virtualbox_3_2.NetworkAttachmentType getAttachmentType() {
        try {
            org.virtualbox_3_2.NetworkAttachmentType retVal = port.iNetworkAdapterGetAttachmentType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::hostInterface of type wstring
    public String getHostInterface() {
        try {
            String retVal = port.iNetworkAdapterGetHostInterface(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setHostInterface(String value) {
        try {
            port.iNetworkAdapterSetHostInterface(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::internalNetwork of type wstring
    public String getInternalNetwork() {
        try {
            String retVal = port.iNetworkAdapterGetInternalNetwork(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setInternalNetwork(String value) {
        try {
            port.iNetworkAdapterSetInternalNetwork(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::NATNetwork of type wstring
    public String getNATNetwork() {
        try {
            String retVal = port.iNetworkAdapterGetNATNetwork(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setNATNetwork(String value) {
        try {
            port.iNetworkAdapterSetNATNetwork(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::VDENetwork of type wstring
    public String getVDENetwork() {
        try {
            String retVal = port.iNetworkAdapterGetVDENetwork(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setVDENetwork(String value) {
        try {
            port.iNetworkAdapterSetVDENetwork(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::cableConnected of type boolean
    public Boolean getCableConnected() {
        try {
            Boolean retVal = port.iNetworkAdapterGetCableConnected(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setCableConnected(Boolean value) {
        try {
            port.iNetworkAdapterSetCableConnected(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::lineSpeed of type unsigned long
    public Long getLineSpeed() {
        try {
            Long retVal = port.iNetworkAdapterGetLineSpeed(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLineSpeed(Long value) {
        try {
            port.iNetworkAdapterSetLineSpeed(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::traceEnabled of type boolean
    public Boolean getTraceEnabled() {
        try {
            Boolean retVal = port.iNetworkAdapterGetTraceEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTraceEnabled(Boolean value) {
        try {
            port.iNetworkAdapterSetTraceEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::traceFile of type wstring
    public String getTraceFile() {
        try {
            String retVal = port.iNetworkAdapterGetTraceFile(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTraceFile(String value) {
        try {
            port.iNetworkAdapterSetTraceFile(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute INetworkAdapter::natDriver of type INATEngine
    public com.sun.xml.ws.commons.virtualbox_3_2.INATEngine getNatDriver() {
        try {
            String retVal = port.iNetworkAdapterGetNatDriver(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.INATEngine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INetworkAdapter::bootPriority of type unsigned long
    public Long getBootPriority() {
        try {
            Long retVal = port.iNetworkAdapterGetBootPriority(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setBootPriority(Long value) {
        try {
            port.iNetworkAdapterSetBootPriority(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::attachToNAT()
     */
    public void attachToNAT() {
        try {
            port.iNetworkAdapterAttachToNAT(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::attachToBridgedInterface()
     */
    public void attachToBridgedInterface() {
        try {
            port.iNetworkAdapterAttachToBridgedInterface(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::attachToInternalNetwork()
     */
    public void attachToInternalNetwork() {
        try {
            port.iNetworkAdapterAttachToInternalNetwork(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::attachToHostOnlyInterface()
     */
    public void attachToHostOnlyInterface() {
        try {
            port.iNetworkAdapterAttachToHostOnlyInterface(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::attachToVDE()
     */
    public void attachToVDE() {
        try {
            port.iNetworkAdapterAttachToVDE(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INetworkAdapter::detach()
     */
    public void detach() {
        try {
            port.iNetworkAdapterDetach(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
