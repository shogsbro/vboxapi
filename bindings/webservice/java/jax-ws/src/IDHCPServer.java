
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
 * IDHCPServer.java
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
public class IDHCPServer extends IUnknown {

    public static IDHCPServer cast(IUnknown other) {
        return new IDHCPServer(other.getRef(), other.getRemoteWSPort());
    }

    public IDHCPServer(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute IDHCPServer::enabled of type boolean
    public Boolean getEnabled() {
        try {
            Boolean retVal = port.idhcpServerGetEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setEnabled(Boolean value) {
        try {
            port.idhcpServerSetEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IDHCPServer::IPAddress of type wstring
    public String getIPAddress() {
        try {
            String retVal = port.idhcpServerGetIPAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IDHCPServer::networkMask of type wstring
    public String getNetworkMask() {
        try {
            String retVal = port.idhcpServerGetNetworkMask(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IDHCPServer::networkName of type wstring
    public String getNetworkName() {
        try {
            String retVal = port.idhcpServerGetNetworkName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IDHCPServer::lowerIP of type wstring
    public String getLowerIP() {
        try {
            String retVal = port.idhcpServerGetLowerIP(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IDHCPServer::upperIP of type wstring
    public String getUpperIP() {
        try {
            String retVal = port.idhcpServerGetUpperIP(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDHCPServer::setConfiguration(
            [in] wstring IPAddress,
            [in] wstring networkMask,
            [in] wstring FromIPAddress,
            [in] wstring ToIPAddress)
     */
    public void setConfiguration(String IPAddress, String networkMask, String FromIPAddress, String ToIPAddress) {
        try {
            port.idhcpServerSetConfiguration(_this, IPAddress, networkMask, FromIPAddress, ToIPAddress);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDHCPServer::start(
            [in] wstring networkName,
            [in] wstring trunkName,
            [in] wstring trunkType)
     */
    public void start(String networkName, String trunkName, String trunkType) {
        try {
            port.idhcpServerStart(_this, networkName, trunkName, trunkType);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDHCPServer::stop()
     */
    public void stop() {
        try {
            port.idhcpServerStop(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
