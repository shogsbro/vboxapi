
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
 * IVirtualSystemDescription.java
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
public class IVirtualSystemDescription extends IUnknown {

    public static IVirtualSystemDescription cast(IUnknown other) {
        return new IVirtualSystemDescription(other.getRef(), other.getRemoteWSPort());
    }

    public IVirtualSystemDescription(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IVirtualSystemDescription::count of type unsigned long
    public Long getCount() {
        try {
            Long retVal = port.iVirtualSystemDescriptionGetCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualSystemDescription::getDescription(
            [out] VirtualSystemDescriptionType aTypes[],
            [out] wstring aRefs[],
            [out] wstring aOvfValues[],
            [out] wstring aVBoxValues[],
            [out] wstring aExtraConfigValues[])
     */
    public void getDescription(Holder<List<org.virtualbox_3_2.VirtualSystemDescriptionType>> aTypes, Holder<List<String>> aRefs, Holder<List<String>> aOvfValues, Holder<List<String>> aVBoxValues, Holder<List<String>> aExtraConfigValues) {
        try {
            port.iVirtualSystemDescriptionGetDescription(_this, aTypes, aRefs, aOvfValues, aVBoxValues, aExtraConfigValues);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualSystemDescription::getDescriptionByType(
            [in] VirtualSystemDescriptionType aType,
            [out] VirtualSystemDescriptionType aTypes[],
            [out] wstring aRefs[],
            [out] wstring aOvfValues[],
            [out] wstring aVBoxValues[],
            [out] wstring aExtraConfigValues[])
     */
    public void getDescriptionByType(org.virtualbox_3_2.VirtualSystemDescriptionType aType, Holder<List<org.virtualbox_3_2.VirtualSystemDescriptionType>> aTypes, Holder<List<String>> aRefs, Holder<List<String>> aOvfValues, Holder<List<String>> aVBoxValues, Holder<List<String>> aExtraConfigValues) {
        try {
            port.iVirtualSystemDescriptionGetDescriptionByType(_this, aType, aTypes, aRefs, aOvfValues, aVBoxValues, aExtraConfigValues);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualSystemDescription::getValuesByType(
            [in] VirtualSystemDescriptionType aType,
            [in] VirtualSystemDescriptionValueType aWhich,
            [return] wstring aValues[])
     */
    public List<String> getValuesByType(org.virtualbox_3_2.VirtualSystemDescriptionType aType, org.virtualbox_3_2.VirtualSystemDescriptionValueType aWhich) {
        try {
            List<String> retVal = port.iVirtualSystemDescriptionGetValuesByType(_this, aType, aWhich);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualSystemDescription::setFinalValues(
            [in] boolean aEnabled[],
            [in] wstring aVBoxValues[],
            [in] wstring aExtraConfigValues[])
     */
    public void setFinalValues(List<Boolean> aEnabled, List<String> aVBoxValues, List<String> aExtraConfigValues) {
        try {
            port.iVirtualSystemDescriptionSetFinalValues(_this, aEnabled, aVBoxValues, aExtraConfigValues);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualSystemDescription::addDescription(
            [in] VirtualSystemDescriptionType aType,
            [in] wstring aVBoxValue,
            [in] wstring aExtraConfigValue)
     */
    public void addDescription(org.virtualbox_3_2.VirtualSystemDescriptionType aType, String aVBoxValue, String aExtraConfigValue) {
        try {
            port.iVirtualSystemDescriptionAddDescription(_this, aType, aVBoxValue, aExtraConfigValue);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
