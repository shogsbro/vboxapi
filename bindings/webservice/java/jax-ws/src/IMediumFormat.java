
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
 * IMediumFormat.java
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
public class IMediumFormat extends IUnknown {

    public static IMediumFormat cast(IUnknown other) {
        return new IMediumFormat(other.getRef(), other.getRemoteWSPort());
    }

    public IMediumFormat(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IMediumFormat::id of type wstring
    public String getId() {
        try {
            String retVal = port.iMediumFormatGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMediumFormat::name of type wstring
    public String getName() {
        try {
            String retVal = port.iMediumFormatGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMediumFormat::fileExtensions of type wstring
    public List<String> getFileExtensions() {
        try {
            List<String> retVal = port.iMediumFormatGetFileExtensions(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMediumFormat::capabilities of type unsigned long
    public Long getCapabilities() {
        try {
            Long retVal = port.iMediumFormatGetCapabilities(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMediumFormat::describeProperties(
            [out] wstring names[],
            [out] wstring description[],
            [out] DataType types[],
            [out] unsigned long flags[],
            [out] wstring defaults[])
     */
    public void describeProperties(Holder<List<String>> names, Holder<List<String>> description, Holder<List<org.virtualbox_3_2.DataType>> types, Holder<List<Long>> flags, Holder<List<String>> defaults) {
        try {
            port.iMediumFormatDescribeProperties(_this, names, description, types, flags, defaults);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
