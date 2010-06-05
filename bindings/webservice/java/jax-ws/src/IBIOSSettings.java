
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
 * IBIOSSettings.java
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
public class IBIOSSettings extends IUnknown {

    public static IBIOSSettings cast(IUnknown other) {
        return new IBIOSSettings(other.getRef(), other.getRemoteWSPort());
    }

    public IBIOSSettings(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute IBIOSSettings::logoFadeIn of type boolean
    public Boolean getLogoFadeIn() {
        try {
            Boolean retVal = port.ibiosSettingsGetLogoFadeIn(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLogoFadeIn(Boolean value) {
        try {
            port.ibiosSettingsSetLogoFadeIn(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::logoFadeOut of type boolean
    public Boolean getLogoFadeOut() {
        try {
            Boolean retVal = port.ibiosSettingsGetLogoFadeOut(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLogoFadeOut(Boolean value) {
        try {
            port.ibiosSettingsSetLogoFadeOut(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::logoDisplayTime of type unsigned long
    public Long getLogoDisplayTime() {
        try {
            Long retVal = port.ibiosSettingsGetLogoDisplayTime(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLogoDisplayTime(Long value) {
        try {
            port.ibiosSettingsSetLogoDisplayTime(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::logoImagePath of type wstring
    public String getLogoImagePath() {
        try {
            String retVal = port.ibiosSettingsGetLogoImagePath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLogoImagePath(String value) {
        try {
            port.ibiosSettingsSetLogoImagePath(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::bootMenuMode of type BIOSBootMenuMode
    public org.virtualbox_3_2.BIOSBootMenuMode getBootMenuMode() {
        try {
            org.virtualbox_3_2.BIOSBootMenuMode retVal = port.ibiosSettingsGetBootMenuMode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setBootMenuMode(org.virtualbox_3_2.BIOSBootMenuMode value) {
        try {
            port.ibiosSettingsSetBootMenuMode(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::ACPIEnabled of type boolean
    public Boolean getACPIEnabled() {
        try {
            Boolean retVal = port.ibiosSettingsGetACPIEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setACPIEnabled(Boolean value) {
        try {
            port.ibiosSettingsSetACPIEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::IOAPICEnabled of type boolean
    public Boolean getIOAPICEnabled() {
        try {
            Boolean retVal = port.ibiosSettingsGetIOAPICEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setIOAPICEnabled(Boolean value) {
        try {
            port.ibiosSettingsSetIOAPICEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::timeOffset of type long long
    public Long getTimeOffset() {
        try {
            Long retVal = port.ibiosSettingsGetTimeOffset(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTimeOffset(Long value) {
        try {
            port.ibiosSettingsSetTimeOffset(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IBIOSSettings::PXEDebugEnabled of type boolean
    public Boolean getPXEDebugEnabled() {
        try {
            Boolean retVal = port.ibiosSettingsGetPXEDebugEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPXEDebugEnabled(Boolean value) {
        try {
            port.ibiosSettingsSetPXEDebugEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
