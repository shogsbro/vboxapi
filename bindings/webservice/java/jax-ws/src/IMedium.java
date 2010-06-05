
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
 * IMedium.java
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
public class IMedium extends IUnknown {

    public static IMedium cast(IUnknown other) {
        return new IMedium(other.getRef(), other.getRemoteWSPort());
    }

    public IMedium(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IMedium::id of type uuid
    public String getId() {
        try {
            String retVal = port.iMediumGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMedium::description of type wstring
    public String getDescription() {
        try {
            String retVal = port.iMediumGetDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDescription(String value) {
        try {
            port.iMediumSetDescription(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::state of type MediumState
    public org.virtualbox_3_2.MediumState getState() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumGetState(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMedium::location of type wstring
    public String getLocation() {
        try {
            String retVal = port.iMediumGetLocation(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLocation(String value) {
        try {
            port.iMediumSetLocation(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::name of type wstring
    public String getName() {
        try {
            String retVal = port.iMediumGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::deviceType of type DeviceType
    public org.virtualbox_3_2.DeviceType getDeviceType() {
        try {
            org.virtualbox_3_2.DeviceType retVal = port.iMediumGetDeviceType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::hostDrive of type boolean
    public Boolean getHostDrive() {
        try {
            Boolean retVal = port.iMediumGetHostDrive(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::size of type unsigned long long
    public BigInteger getSize() {
        try {
            BigInteger retVal = port.iMediumGetSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::format of type wstring
    public String getFormat() {
        try {
            String retVal = port.iMediumGetFormat(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::mediumFormat of type IMediumFormat
    public com.sun.xml.ws.commons.virtualbox_3_2.IMediumFormat getMediumFormat() {
        try {
            String retVal = port.iMediumGetMediumFormat(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMediumFormat(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMedium::type of type MediumType
    public org.virtualbox_3_2.MediumType getType() {
        try {
            org.virtualbox_3_2.MediumType retVal = port.iMediumGetType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setType(org.virtualbox_3_2.MediumType value) {
        try {
            port.iMediumSetType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::parent of type IMedium
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getParent() {
        try {
            String retVal = port.iMediumGetParent(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::children of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getChildren() {
        try {
            List<String> retVal = port.iMediumGetChildren(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::base of type IMedium
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getBase() {
        try {
            String retVal = port.iMediumGetBase(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::readOnly of type boolean
    public Boolean getReadOnly() {
        try {
            Boolean retVal = port.iMediumGetReadOnly(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::logicalSize of type unsigned long long
    public BigInteger getLogicalSize() {
        try {
            BigInteger retVal = port.iMediumGetLogicalSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMedium::autoReset of type boolean
    public Boolean getAutoReset() {
        try {
            Boolean retVal = port.iMediumGetAutoReset(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAutoReset(Boolean value) {
        try {
            port.iMediumSetAutoReset(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::lastAccessError of type wstring
    public String getLastAccessError() {
        try {
            String retVal = port.iMediumGetLastAccessError(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMedium::machineIds of type uuid
    public List<String> getMachineIds() {
        try {
            List<String> retVal = port.iMediumGetMachineIds(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::refreshState(
            [return] MediumState state)
     */
    public org.virtualbox_3_2.MediumState refreshState() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumRefreshState(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::getSnapshotIds(
            [in] uuid machineId,
            [return] uuid snapshotIds[])
     */
    public List<String> getSnapshotIds(String machineId) {
        try {
            List<String> retVal = port.iMediumGetSnapshotIds(_this, machineId);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::lockRead(
            [return] MediumState state)
     */
    public org.virtualbox_3_2.MediumState lockRead() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumLockRead(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::unlockRead(
            [return] MediumState state)
     */
    public org.virtualbox_3_2.MediumState unlockRead() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumUnlockRead(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::lockWrite(
            [return] MediumState state)
     */
    public org.virtualbox_3_2.MediumState lockWrite() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumLockWrite(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::unlockWrite(
            [return] MediumState state)
     */
    public org.virtualbox_3_2.MediumState unlockWrite() {
        try {
            org.virtualbox_3_2.MediumState retVal = port.iMediumUnlockWrite(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::close()
     */
    public void close() {
        try {
            port.iMediumClose(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::getProperty(
            [in] wstring name,
            [return] wstring value)
     */
    public String getProperty(String name) {
        try {
            String retVal = port.iMediumGetProperty(_this, name);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::setProperty(
            [in] wstring name,
            [in] wstring value)
     */
    public void setProperty(String name, String value) {
        try {
            port.iMediumSetProperty(_this, name, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::getProperties(
            [in] wstring names,
            [out] wstring returnNames[],
            [return] wstring returnValues[])
     */
    public List<String> getProperties(String names, Holder<List<String>> returnNames) {
        try {
            Holder<List<String>> retVal = new Holder<List<String>>();
            port.iMediumGetProperties(_this, names, returnNames, retVal);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::setProperties(
            [in] wstring names[],
            [in] wstring values[])
     */
    public void setProperties(List<String> names, List<String> values) {
        try {
            port.iMediumSetProperties(_this, names, values);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::createBaseStorage(
            [in] unsigned long long logicalSize,
            [in] MediumVariant variant,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress createBaseStorage(BigInteger logicalSize, org.virtualbox_3_2.MediumVariant variant) {
        try {
            String retVal = port.iMediumCreateBaseStorage(_this, logicalSize, variant);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::deleteStorage(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress deleteStorage() {
        try {
            String retVal = port.iMediumDeleteStorage(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::createDiffStorage(
            [in] IMedium target,
            [in] MediumVariant variant,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress createDiffStorage(com.sun.xml.ws.commons.virtualbox_3_2.IMedium target, org.virtualbox_3_2.MediumVariant variant) {
        try {
            String retVal = port.iMediumCreateDiffStorage(_this, ((target == null)?null:target.getRef()), variant);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::mergeTo(
            [in] IMedium target,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress mergeTo(com.sun.xml.ws.commons.virtualbox_3_2.IMedium target) {
        try {
            String retVal = port.iMediumMergeTo(_this, ((target == null)?null:target.getRef()));
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::cloneTo(
            [in] IMedium target,
            [in] MediumVariant variant,
            [in] IMedium parent,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress cloneTo(com.sun.xml.ws.commons.virtualbox_3_2.IMedium target, org.virtualbox_3_2.MediumVariant variant, com.sun.xml.ws.commons.virtualbox_3_2.IMedium parent) {
        try {
            String retVal = port.iMediumCloneTo(_this, ((target == null)?null:target.getRef()), variant, ((parent == null)?null:parent.getRef()));
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::compact(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress compact() {
        try {
            String retVal = port.iMediumCompact(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::resize(
            [in] unsigned long long logicalSize,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress resize(BigInteger logicalSize) {
        try {
            String retVal = port.iMediumResize(_this, logicalSize);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMedium::reset(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress reset() {
        try {
            String retVal = port.iMediumReset(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
