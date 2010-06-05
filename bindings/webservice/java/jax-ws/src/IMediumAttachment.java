
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
 * IMediumAttachment.java
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
public class IMediumAttachment {

    private org.virtualbox_3_2.IMediumAttachment real;
    private VboxPortType port;

    public IMediumAttachment(org.virtualbox_3_2.IMediumAttachment real, VboxPortType port) {
      this.real = real; 
      this.port = port;  
    }

    // read-only attribute IMediumAttachment::medium of type IMedium
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getMedium() {
            String retVal = real.getMedium();
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
    }

    // read-only attribute IMediumAttachment::controller of type wstring
    public String getController() {
            String retVal = real.getController();
            return retVal;
    }

    // read-only attribute IMediumAttachment::port of type long
    public Integer getPort() {
            Integer retVal = real.getPort();
            return retVal;
    }

    // read-only attribute IMediumAttachment::device of type long
    public Integer getDevice() {
            Integer retVal = real.getDevice();
            return retVal;
    }

    // read-only attribute IMediumAttachment::type of type DeviceType
    public org.virtualbox_3_2.DeviceType getType() {
            org.virtualbox_3_2.DeviceType retVal = real.getType();
            return retVal;
    }

    // read-only attribute IMediumAttachment::passthrough of type boolean
    public Boolean isPassthrough() {
            Boolean retVal = real.isPassthrough();
            return retVal;
    }
}
