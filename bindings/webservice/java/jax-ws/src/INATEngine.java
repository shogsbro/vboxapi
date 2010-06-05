
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
 * INATEngine.java
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
public class INATEngine extends IUnknown {

    public static INATEngine cast(IUnknown other) {
        return new INATEngine(other.getRef(), other.getRemoteWSPort());
    }

    public INATEngine(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute INATEngine::network of type wstring
    public String getNetwork() {
        try {
            String retVal = port.inatEngineGetNetwork(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setNetwork(String value) {
        try {
            port.inatEngineSetNetwork(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::hostIP of type wstring
    public String getHostIP() {
        try {
            String retVal = port.inatEngineGetHostIP(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setHostIP(String value) {
        try {
            port.inatEngineSetHostIP(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::tftpPrefix of type wstring
    public String getTftpPrefix() {
        try {
            String retVal = port.inatEngineGetTftpPrefix(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTftpPrefix(String value) {
        try {
            port.inatEngineSetTftpPrefix(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::tftpBootFile of type wstring
    public String getTftpBootFile() {
        try {
            String retVal = port.inatEngineGetTftpBootFile(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTftpBootFile(String value) {
        try {
            port.inatEngineSetTftpBootFile(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::tftpNextServer of type wstring
    public String getTftpNextServer() {
        try {
            String retVal = port.inatEngineGetTftpNextServer(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTftpNextServer(String value) {
        try {
            port.inatEngineSetTftpNextServer(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::aliasMode of type unsigned long
    public Long getAliasMode() {
        try {
            Long retVal = port.inatEngineGetAliasMode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAliasMode(Long value) {
        try {
            port.inatEngineSetAliasMode(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::dnsPassDomain of type boolean
    public Boolean getDnsPassDomain() {
        try {
            Boolean retVal = port.inatEngineGetDnsPassDomain(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDnsPassDomain(Boolean value) {
        try {
            port.inatEngineSetDnsPassDomain(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::dnsProxy of type boolean
    public Boolean getDnsProxy() {
        try {
            Boolean retVal = port.inatEngineGetDnsProxy(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDnsProxy(Boolean value) {
        try {
            port.inatEngineSetDnsProxy(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute INATEngine::dnsUseHostResolver of type boolean
    public Boolean getDnsUseHostResolver() {
        try {
            Boolean retVal = port.inatEngineGetDnsUseHostResolver(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDnsUseHostResolver(Boolean value) {
        try {
            port.inatEngineSetDnsUseHostResolver(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute INATEngine::redirects of type wstring
    public List<String> getRedirects() {
        try {
            List<String> retVal = port.inatEngineGetRedirects(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INATEngine::setNetworkSettings(
            [in] unsigned long mtu,
            [in] unsigned long sockSnd,
            [in] unsigned long sockRcv,
            [in] unsigned long TcpWndSnd,
            [in] unsigned long TcpWndRcv)
     */
    public void setNetworkSettings(Long mtu, Long sockSnd, Long sockRcv, Long TcpWndSnd, Long TcpWndRcv) {
        try {
            port.inatEngineSetNetworkSettings(_this, mtu, sockSnd, sockRcv, TcpWndSnd, TcpWndRcv);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INATEngine::getNetworkSettings(
            [out] unsigned long mtu,
            [out] unsigned long sockSnd,
            [out] unsigned long sockRcv,
            [out] unsigned long TcpWndSnd,
            [out] unsigned long TcpWndRcv)
     */
    public void getNetworkSettings(Holder<Long> mtu, Holder<Long> sockSnd, Holder<Long> sockRcv, Holder<Long> TcpWndSnd, Holder<Long> TcpWndRcv) {
        try {
            port.inatEngineGetNetworkSettings(_this, mtu, sockSnd, sockRcv, TcpWndSnd, TcpWndRcv);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INATEngine::addRedirect(
            [in] wstring name,
            [in] NATProtocol proto,
            [in] wstring hostIp,
            [in] unsigned short hostPort,
            [in] wstring guestIp,
            [in] unsigned short guestPort)
     */
    public void addRedirect(String name, org.virtualbox_3_2.NATProtocol proto, String hostIp, Integer hostPort, String guestIp, Integer guestPort) {
        try {
            port.inatEngineAddRedirect(_this, name, proto, hostIp, hostPort, guestIp, guestPort);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method INATEngine::removeRedirect(
            [in] wstring name)
     */
    public void removeRedirect(String name) {
        try {
            port.inatEngineRemoveRedirect(_this, name);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
