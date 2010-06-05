
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
 * IVRDPServer.java
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
public class IVRDPServer extends IUnknown {

    public static IVRDPServer cast(IUnknown other) {
        return new IVRDPServer(other.getRef(), other.getRemoteWSPort());
    }

    public IVRDPServer(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute IVRDPServer::enabled of type boolean
    public Boolean getEnabled() {
        try {
            Boolean retVal = port.ivrdpServerGetEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setEnabled(Boolean value) {
        try {
            port.ivrdpServerSetEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::ports of type wstring
    public String getPorts() {
        try {
            String retVal = port.ivrdpServerGetPorts(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPorts(String value) {
        try {
            port.ivrdpServerSetPorts(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::netAddress of type wstring
    public String getNetAddress() {
        try {
            String retVal = port.ivrdpServerGetNetAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setNetAddress(String value) {
        try {
            port.ivrdpServerSetNetAddress(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::authType of type VRDPAuthType
    public org.virtualbox_3_2.VRDPAuthType getAuthType() {
        try {
            org.virtualbox_3_2.VRDPAuthType retVal = port.ivrdpServerGetAuthType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAuthType(org.virtualbox_3_2.VRDPAuthType value) {
        try {
            port.ivrdpServerSetAuthType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::authTimeout of type unsigned long
    public Long getAuthTimeout() {
        try {
            Long retVal = port.ivrdpServerGetAuthTimeout(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAuthTimeout(Long value) {
        try {
            port.ivrdpServerSetAuthTimeout(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::allowMultiConnection of type boolean
    public Boolean getAllowMultiConnection() {
        try {
            Boolean retVal = port.ivrdpServerGetAllowMultiConnection(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAllowMultiConnection(Boolean value) {
        try {
            port.ivrdpServerSetAllowMultiConnection(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::reuseSingleConnection of type boolean
    public Boolean getReuseSingleConnection() {
        try {
            Boolean retVal = port.ivrdpServerGetReuseSingleConnection(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setReuseSingleConnection(Boolean value) {
        try {
            port.ivrdpServerSetReuseSingleConnection(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::videoChannel of type boolean
    public Boolean getVideoChannel() {
        try {
            Boolean retVal = port.ivrdpServerGetVideoChannel(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setVideoChannel(Boolean value) {
        try {
            port.ivrdpServerSetVideoChannel(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IVRDPServer::videoChannelQuality of type unsigned long
    public Long getVideoChannelQuality() {
        try {
            Long retVal = port.ivrdpServerGetVideoChannelQuality(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setVideoChannelQuality(Long value) {
        try {
            port.ivrdpServerSetVideoChannelQuality(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
