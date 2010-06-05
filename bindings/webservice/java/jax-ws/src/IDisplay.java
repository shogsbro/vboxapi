
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
 * IDisplay.java
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
public class IDisplay extends IUnknown {

    public static IDisplay cast(IUnknown other) {
        return new IDisplay(other.getRef(), other.getRemoteWSPort());
    }

    public IDisplay(String _this, VboxPortType port) {
        super(_this,port);
    }

    /* method IDisplay::getScreenResolution(
            [in] unsigned long screenId,
            [out] unsigned long width,
            [out] unsigned long height,
            [out] unsigned long bitsPerPixel)
     */
    public void getScreenResolution(Long screenId, Holder<Long> width, Holder<Long> height, Holder<Long> bitsPerPixel) {
        try {
            port.iDisplayGetScreenResolution(_this, screenId, width, height, bitsPerPixel);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDisplay::setVideoModeHint(
            [in] unsigned long width,
            [in] unsigned long height,
            [in] unsigned long bitsPerPixel,
            [in] unsigned long display)
     */
    public void setVideoModeHint(Long width, Long height, Long bitsPerPixel, Long display) {
        try {
            port.iDisplaySetVideoModeHint(_this, width, height, bitsPerPixel, display);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDisplay::setSeamlessMode(
            [in] boolean enabled)
     */
    public void setSeamlessMode(Boolean enabled) {
        try {
            port.iDisplaySetSeamlessMode(_this, enabled);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDisplay::takeScreenShotToArray(
            [in] unsigned long screenId,
            [in] unsigned long width,
            [in] unsigned long height,
            [return] octet screenData[])
     */
    public List<Short> takeScreenShotToArray(Long screenId, Long width, Long height) {
        try {
            List<Short> retVal = port.iDisplayTakeScreenShotToArray(_this, screenId, width, height);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDisplay::invalidateAndUpdate()
     */
    public void invalidateAndUpdate() {
        try {
            port.iDisplayInvalidateAndUpdate(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IDisplay::resizeCompleted(
            [in] unsigned long screenId)
     */
    public void resizeCompleted(Long screenId) {
        try {
            port.iDisplayResizeCompleted(_this, screenId);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
