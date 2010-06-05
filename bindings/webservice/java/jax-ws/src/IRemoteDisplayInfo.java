
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
 * IRemoteDisplayInfo.java
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
public class IRemoteDisplayInfo {

    private org.virtualbox_3_2.IRemoteDisplayInfo real;
    private VboxPortType port;

    public IRemoteDisplayInfo(org.virtualbox_3_2.IRemoteDisplayInfo real, VboxPortType port) {
      this.real = real; 
      this.port = port;  
    }

    // read-only attribute IRemoteDisplayInfo::active of type boolean
    public Boolean isActive() {
            Boolean retVal = real.isActive();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::port of type long
    public Integer getPort() {
            Integer retVal = real.getPort();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::numberOfClients of type unsigned long
    public Long getNumberOfClients() {
            Long retVal = real.getNumberOfClients();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::beginTime of type long long
    public Long getBeginTime() {
            Long retVal = real.getBeginTime();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::endTime of type long long
    public Long getEndTime() {
            Long retVal = real.getEndTime();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::bytesSent of type unsigned long long
    public BigInteger getBytesSent() {
            BigInteger retVal = real.getBytesSent();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::bytesSentTotal of type unsigned long long
    public BigInteger getBytesSentTotal() {
            BigInteger retVal = real.getBytesSentTotal();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::bytesReceived of type unsigned long long
    public BigInteger getBytesReceived() {
            BigInteger retVal = real.getBytesReceived();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::bytesReceivedTotal of type unsigned long long
    public BigInteger getBytesReceivedTotal() {
            BigInteger retVal = real.getBytesReceivedTotal();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::user of type wstring
    public String getUser() {
            String retVal = real.getUser();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::domain of type wstring
    public String getDomain() {
            String retVal = real.getDomain();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::clientName of type wstring
    public String getClientName() {
            String retVal = real.getClientName();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::clientIP of type wstring
    public String getClientIP() {
            String retVal = real.getClientIP();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::clientVersion of type unsigned long
    public Long getClientVersion() {
            Long retVal = real.getClientVersion();
            return retVal;
    }

    // read-only attribute IRemoteDisplayInfo::encryptionStyle of type unsigned long
    public Long getEncryptionStyle() {
            Long retVal = real.getEncryptionStyle();
            return retVal;
    }
}
