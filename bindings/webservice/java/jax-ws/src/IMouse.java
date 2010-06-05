
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
 * IMouse.java
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
public class IMouse extends IUnknown {

    public static IMouse cast(IUnknown other) {
        return new IMouse(other.getRef(), other.getRemoteWSPort());
    }

    public IMouse(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IMouse::absoluteSupported of type boolean
    public Boolean getAbsoluteSupported() {
        try {
            Boolean retVal = port.iMouseGetAbsoluteSupported(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMouse::relativeSupported of type boolean
    public Boolean getRelativeSupported() {
        try {
            Boolean retVal = port.iMouseGetRelativeSupported(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMouse::needsHostCursor of type boolean
    public Boolean getNeedsHostCursor() {
        try {
            Boolean retVal = port.iMouseGetNeedsHostCursor(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMouse::putMouseEvent(
            [in] long dx,
            [in] long dy,
            [in] long dz,
            [in] long dw,
            [in] long buttonState)
     */
    public void putMouseEvent(Integer dx, Integer dy, Integer dz, Integer dw, Integer buttonState) {
        try {
            port.iMousePutMouseEvent(_this, dx, dy, dz, dw, buttonState);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMouse::putMouseEventAbsolute(
            [in] long x,
            [in] long y,
            [in] long dz,
            [in] long dw,
            [in] long buttonState)
     */
    public void putMouseEventAbsolute(Integer x, Integer y, Integer dz, Integer dw, Integer buttonState) {
        try {
            port.iMousePutMouseEventAbsolute(_this, x, y, dz, dw, buttonState);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
