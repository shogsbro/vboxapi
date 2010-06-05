
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
 * IUSBDeviceFilter.java
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
public class IUSBDeviceFilter extends IUnknown {

    public static IUSBDeviceFilter cast(IUnknown other) {
        return new IUSBDeviceFilter(other.getRef(), other.getRemoteWSPort());
    }

    public IUSBDeviceFilter(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read/write attribute IUSBDeviceFilter::name of type wstring
    public String getName() {
        try {
            String retVal = port.iusbDeviceFilterGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setName(String value) {
        try {
            port.iusbDeviceFilterSetName(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::active of type boolean
    public Boolean getActive() {
        try {
            Boolean retVal = port.iusbDeviceFilterGetActive(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setActive(Boolean value) {
        try {
            port.iusbDeviceFilterSetActive(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::vendorId of type wstring
    public String getVendorId() {
        try {
            String retVal = port.iusbDeviceFilterGetVendorId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setVendorId(String value) {
        try {
            port.iusbDeviceFilterSetVendorId(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::productId of type wstring
    public String getProductId() {
        try {
            String retVal = port.iusbDeviceFilterGetProductId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setProductId(String value) {
        try {
            port.iusbDeviceFilterSetProductId(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::revision of type wstring
    public String getRevision() {
        try {
            String retVal = port.iusbDeviceFilterGetRevision(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setRevision(String value) {
        try {
            port.iusbDeviceFilterSetRevision(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::manufacturer of type wstring
    public String getManufacturer() {
        try {
            String retVal = port.iusbDeviceFilterGetManufacturer(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setManufacturer(String value) {
        try {
            port.iusbDeviceFilterSetManufacturer(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::product of type wstring
    public String getProduct() {
        try {
            String retVal = port.iusbDeviceFilterGetProduct(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setProduct(String value) {
        try {
            port.iusbDeviceFilterSetProduct(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::serialNumber of type wstring
    public String getSerialNumber() {
        try {
            String retVal = port.iusbDeviceFilterGetSerialNumber(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setSerialNumber(String value) {
        try {
            port.iusbDeviceFilterSetSerialNumber(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::port of type wstring
    public String getPort() {
        try {
            String retVal = port.iusbDeviceFilterGetPort(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPort(String value) {
        try {
            port.iusbDeviceFilterSetPort(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::remote of type wstring
    public String getRemote() {
        try {
            String retVal = port.iusbDeviceFilterGetRemote(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setRemote(String value) {
        try {
            port.iusbDeviceFilterSetRemote(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IUSBDeviceFilter::maskedInterfaces of type unsigned long
    public Long getMaskedInterfaces() {
        try {
            Long retVal = port.iusbDeviceFilterGetMaskedInterfaces(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMaskedInterfaces(Long value) {
        try {
            port.iusbDeviceFilterSetMaskedInterfaces(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
