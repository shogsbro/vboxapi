
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
 * IHost.java
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
public class IHost extends IUnknown {

    public static IHost cast(IUnknown other) {
        return new IHost(other.getRef(), other.getRemoteWSPort());
    }

    public IHost(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IHost::DVDDrives of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getDVDDrives() {
        try {
            List<String> retVal = port.iHostGetDVDDrives(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::floppyDrives of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getFloppyDrives() {
        try {
            List<String> retVal = port.iHostGetFloppyDrives(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::USBDevices of type IHostUSBDevice
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice> getUSBDevices() {
        try {
            List<String> retVal = port.iHostGetUSBDevices(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::USBDeviceFilters of type IHostUSBDeviceFilter
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDeviceFilter> getUSBDeviceFilters() {
        try {
            List<String> retVal = port.iHostGetUSBDeviceFilters(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDeviceFilter.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::networkInterfaces of type IHostNetworkInterface
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface> getNetworkInterfaces() {
        try {
            List<String> retVal = port.iHostGetNetworkInterfaces(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::processorCount of type unsigned long
    public Long getProcessorCount() {
        try {
            Long retVal = port.iHostGetProcessorCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::processorOnlineCount of type unsigned long
    public Long getProcessorOnlineCount() {
        try {
            Long retVal = port.iHostGetProcessorOnlineCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::processorCoreCount of type unsigned long
    public Long getProcessorCoreCount() {
        try {
            Long retVal = port.iHostGetProcessorCoreCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::memorySize of type unsigned long
    public Long getMemorySize() {
        try {
            Long retVal = port.iHostGetMemorySize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::memoryAvailable of type unsigned long
    public Long getMemoryAvailable() {
        try {
            Long retVal = port.iHostGetMemoryAvailable(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::operatingSystem of type wstring
    public String getOperatingSystem() {
        try {
            String retVal = port.iHostGetOperatingSystem(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::OSVersion of type wstring
    public String getOSVersion() {
        try {
            String retVal = port.iHostGetOSVersion(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::UTCTime of type long long
    public Long getUTCTime() {
        try {
            Long retVal = port.iHostGetUTCTime(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IHost::Acceleration3DAvailable of type boolean
    public Boolean getAcceleration3DAvailable() {
        try {
            Boolean retVal = port.iHostGetAcceleration3DAvailable(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::getProcessorSpeed(
            [in] unsigned long cpuId,
            [return] unsigned long speed)
     */
    public Long getProcessorSpeed(Long cpuId) {
        try {
            Long retVal = port.iHostGetProcessorSpeed(_this, cpuId);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::getProcessorFeature(
            [in] ProcessorFeature feature,
            [return] boolean supported)
     */
    public Boolean getProcessorFeature(org.virtualbox_3_2.ProcessorFeature feature) {
        try {
            Boolean retVal = port.iHostGetProcessorFeature(_this, feature);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::getProcessorDescription(
            [in] unsigned long cpuId,
            [return] wstring description)
     */
    public String getProcessorDescription(Long cpuId) {
        try {
            String retVal = port.iHostGetProcessorDescription(_this, cpuId);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::getProcessorCPUIDLeaf(
            [in] unsigned long cpuId,
            [in] unsigned long leaf,
            [in] unsigned long subLeaf,
            [out] unsigned long valEax,
            [out] unsigned long valEbx,
            [out] unsigned long valEcx,
            [out] unsigned long valEdx)
     */
    public void getProcessorCPUIDLeaf(Long cpuId, Long leaf, Long subLeaf, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx, Holder<Long> valEdx) {
        try {
            port.iHostGetProcessorCPUIDLeaf(_this, cpuId, leaf, subLeaf, valEax, valEbx, valEcx, valEdx);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::createHostOnlyNetworkInterface(
            [out] IHostNetworkInterface hostInterface,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress createHostOnlyNetworkInterface(Holder<com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface> hostInterface) {
        try {
            Holder<String> tmphostInterface = new Holder<String>(); 
            Holder<String> retVal = new Holder<String>();
            port.iHostCreateHostOnlyNetworkInterface(_this, tmphostInterface, retVal);
            hostInterface.value = (tmphostInterface.value.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface(tmphostInterface.value, port) : null;
            return (retVal.value.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal.value, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::removeHostOnlyNetworkInterface(
            [in] uuid id,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress removeHostOnlyNetworkInterface(String id) {
        try {
            String retVal = port.iHostRemoveHostOnlyNetworkInterface(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::createUSBDeviceFilter(
            [in] wstring name,
            [return] IHostUSBDeviceFilter filter)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDeviceFilter createUSBDeviceFilter(String name) {
        try {
            String retVal = port.iHostCreateUSBDeviceFilter(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDeviceFilter(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::insertUSBDeviceFilter(
            [in] unsigned long position,
            [in] IHostUSBDeviceFilter filter)
     */
    public void insertUSBDeviceFilter(Long position, com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDeviceFilter filter) {
        try {
            port.iHostInsertUSBDeviceFilter(_this, position, ((filter == null)?null:filter.getRef()));
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::removeUSBDeviceFilter(
            [in] unsigned long position)
     */
    public void removeUSBDeviceFilter(Long position) {
        try {
            port.iHostRemoveUSBDeviceFilter(_this, position);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findHostDVDDrive(
            [in] wstring name,
            [return] IMedium drive)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium findHostDVDDrive(String name) {
        try {
            String retVal = port.iHostFindHostDVDDrive(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findHostFloppyDrive(
            [in] wstring name,
            [return] IMedium drive)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium findHostFloppyDrive(String name) {
        try {
            String retVal = port.iHostFindHostFloppyDrive(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findHostNetworkInterfaceByName(
            [in] wstring name,
            [return] IHostNetworkInterface networkInterface)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface findHostNetworkInterfaceByName(String name) {
        try {
            String retVal = port.iHostFindHostNetworkInterfaceByName(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findHostNetworkInterfaceById(
            [in] uuid id,
            [return] IHostNetworkInterface networkInterface)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface findHostNetworkInterfaceById(String id) {
        try {
            String retVal = port.iHostFindHostNetworkInterfaceById(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findHostNetworkInterfacesOfType(
            [in] HostNetworkInterfaceType type,
            [return] IHostNetworkInterface networkInterfaces[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface> findHostNetworkInterfacesOfType(org.virtualbox_3_2.HostNetworkInterfaceType type) {
        try {
            List<String> retVal = port.iHostFindHostNetworkInterfacesOfType(_this, type);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IHostNetworkInterface.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findUSBDeviceById(
            [in] uuid id,
            [return] IHostUSBDevice device)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice findUSBDeviceById(String id) {
        try {
            String retVal = port.iHostFindUSBDeviceById(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IHost::findUSBDeviceByAddress(
            [in] wstring name,
            [return] IHostUSBDevice device)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice findUSBDeviceByAddress(String name) {
        try {
            String retVal = port.iHostFindUSBDeviceByAddress(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
