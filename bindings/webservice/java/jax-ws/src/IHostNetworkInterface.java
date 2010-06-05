
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
 * IHostNetworkInterface.java
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
public class IHostNetworkInterface extends IUnknown {

    public static IHostNetworkInterface cast(IUnknown other) {
        return new IHostNetworkInterface(other.getRef(), other.getRemoteWSPort());
    }

    public IHostNetworkInterface(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IHostNetworkInterface::name of type wstring
    public String getName() {
        try {
            String retVal = port.iHostNetworkInterfaceGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::id of type uuid
    public String getId() {
        try {
            String retVal = port.iHostNetworkInterfaceGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::networkName of type wstring
    public String getNetworkName() {
        try {
            String retVal = port.iHostNetworkInterfaceGetNetworkName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::dhcpEnabled of type boolean
    public Boolean getDhcpEnabled() {
        try {
            Boolean retVal = port.iHostNetworkInterfaceGetDhcpEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::IPAddress of type wstring
    public String getIPAddress() {
        try {
            String retVal = port.iHostNetworkInterfaceGetIPAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::networkMask of type wstring
    public String getNetworkMask() {
        try {
            String retVal = port.iHostNetworkInterfaceGetNetworkMask(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::IPV6Supported of type boolean
    public Boolean getIPV6Supported() {
        try {
            Boolean retVal = port.iHostNetworkInterfaceGetIPV6Supported(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::IPV6Address of type wstring
    public String getIPV6Address() {
        try {
            String retVal = port.iHostNetworkInterfaceGetIPV6Address(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::IPV6NetworkMaskPrefixLength of type unsigned long
    public Long getIPV6NetworkMaskPrefixLength() {
        try {
            Long retVal = port.iHostNetworkInterfaceGetIPV6NetworkMaskPrefixLength(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::hardwareAddress of type wstring
    public String getHardwareAddress() {
        try {
            String retVal = port.iHostNetworkInterfaceGetHardwareAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::mediumType of type HostNetworkInterfaceMediumType
    public org.virtualbox_3_2.HostNetworkInterfaceMediumType getMediumType() {
        try {
            org.virtualbox_3_2.HostNetworkInterfaceMediumType retVal = port.iHostNetworkInterfaceGetMediumType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::status of type HostNetworkInterfaceStatus
    public org.virtualbox_3_2.HostNetworkInterfaceStatus getStatus() {
        try {
            org.virtualbox_3_2.HostNetworkInterfaceStatus retVal = port.iHostNetworkInterfaceGetStatus(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHostNetworkInterface::interfaceType of type HostNetworkInterfaceType
    public org.virtualbox_3_2.HostNetworkInterfaceType getInterfaceType() {
        try {
            org.virtualbox_3_2.HostNetworkInterfaceType retVal = port.iHostNetworkInterfaceGetInterfaceType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHostNetworkInterface::enableStaticIpConfig(
            [in] wstring IPAddress,
            [in] wstring networkMask)
     */
    public void enableStaticIpConfig(String IPAddress, String networkMask) {
        try {
            port.iHostNetworkInterfaceEnableStaticIpConfig(_this, IPAddress, networkMask);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHostNetworkInterface::enableStaticIpConfigV6(
            [in] wstring IPV6Address,
            [in] unsigned long IPV6NetworkMaskPrefixLength)
     */
    public void enableStaticIpConfigV6(String IPV6Address, Long IPV6NetworkMaskPrefixLength) {
        try {
            port.iHostNetworkInterfaceEnableStaticIpConfigV6(_this, IPV6Address, IPV6NetworkMaskPrefixLength);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHostNetworkInterface::enableDynamicIpConfig()
     */
    public void enableDynamicIpConfig() {
        try {
            port.iHostNetworkInterfaceEnableDynamicIpConfig(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHostNetworkInterface::dhcpRediscover()
     */
    public void dhcpRediscover() {
        try {
            port.iHostNetworkInterfaceDhcpRediscover(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
