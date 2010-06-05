
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
 * ISystemProperties.java
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
public class ISystemProperties extends IUnknown {

    public static ISystemProperties cast(IUnknown other) {
        return new ISystemProperties(other.getRef(), other.getRemoteWSPort());
    }

    public ISystemProperties(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute ISystemProperties::minGuestRAM of type unsigned long
    public Long getMinGuestRAM() {
        try {
            Long retVal = port.iSystemPropertiesGetMinGuestRAM(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxGuestRAM of type unsigned long
    public Long getMaxGuestRAM() {
        try {
            Long retVal = port.iSystemPropertiesGetMaxGuestRAM(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::minGuestVRAM of type unsigned long
    public Long getMinGuestVRAM() {
        try {
            Long retVal = port.iSystemPropertiesGetMinGuestVRAM(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxGuestVRAM of type unsigned long
    public Long getMaxGuestVRAM() {
        try {
            Long retVal = port.iSystemPropertiesGetMaxGuestVRAM(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::minGuestCPUCount of type unsigned long
    public Long getMinGuestCPUCount() {
        try {
            Long retVal = port.iSystemPropertiesGetMinGuestCPUCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxGuestCPUCount of type unsigned long
    public Long getMaxGuestCPUCount() {
        try {
            Long retVal = port.iSystemPropertiesGetMaxGuestCPUCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxGuestMonitors of type unsigned long
    public Long getMaxGuestMonitors() {
        try {
            Long retVal = port.iSystemPropertiesGetMaxGuestMonitors(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxVDISize of type unsigned long long
    public BigInteger getMaxVDISize() {
        try {
            BigInteger retVal = port.iSystemPropertiesGetMaxVDISize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::networkAdapterCount of type unsigned long
    public Long getNetworkAdapterCount() {
        try {
            Long retVal = port.iSystemPropertiesGetNetworkAdapterCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::serialPortCount of type unsigned long
    public Long getSerialPortCount() {
        try {
            Long retVal = port.iSystemPropertiesGetSerialPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::parallelPortCount of type unsigned long
    public Long getParallelPortCount() {
        try {
            Long retVal = port.iSystemPropertiesGetParallelPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::maxBootPosition of type unsigned long
    public Long getMaxBootPosition() {
        try {
            Long retVal = port.iSystemPropertiesGetMaxBootPosition(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::defaultMachineFolder of type wstring
    public String getDefaultMachineFolder() {
        try {
            String retVal = port.iSystemPropertiesGetDefaultMachineFolder(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDefaultMachineFolder(String value) {
        try {
            port.iSystemPropertiesSetDefaultMachineFolder(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::defaultHardDiskFolder of type wstring
    public String getDefaultHardDiskFolder() {
        try {
            String retVal = port.iSystemPropertiesGetDefaultHardDiskFolder(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDefaultHardDiskFolder(String value) {
        try {
            port.iSystemPropertiesSetDefaultHardDiskFolder(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::mediumFormats of type IMediumFormat
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMediumFormat> getMediumFormats() {
        try {
            List<String> retVal = port.iSystemPropertiesGetMediumFormats(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMediumFormat.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::defaultHardDiskFormat of type wstring
    public String getDefaultHardDiskFormat() {
        try {
            String retVal = port.iSystemPropertiesGetDefaultHardDiskFormat(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDefaultHardDiskFormat(String value) {
        try {
            port.iSystemPropertiesSetDefaultHardDiskFormat(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::freeDiskSpaceWarning of type unsigned long long
    public BigInteger getFreeDiskSpaceWarning() {
        try {
            BigInteger retVal = port.iSystemPropertiesGetFreeDiskSpaceWarning(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setFreeDiskSpaceWarning(BigInteger value) {
        try {
            port.iSystemPropertiesSetFreeDiskSpaceWarning(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::freeDiskSpacePercentWarning of type unsigned long
    public Long getFreeDiskSpacePercentWarning() {
        try {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentWarning(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setFreeDiskSpacePercentWarning(Long value) {
        try {
            port.iSystemPropertiesSetFreeDiskSpacePercentWarning(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::freeDiskSpaceError of type unsigned long long
    public BigInteger getFreeDiskSpaceError() {
        try {
            BigInteger retVal = port.iSystemPropertiesGetFreeDiskSpaceError(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setFreeDiskSpaceError(BigInteger value) {
        try {
            port.iSystemPropertiesSetFreeDiskSpaceError(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::freeDiskSpacePercentError of type unsigned long
    public Long getFreeDiskSpacePercentError() {
        try {
            Long retVal = port.iSystemPropertiesGetFreeDiskSpacePercentError(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setFreeDiskSpacePercentError(Long value) {
        try {
            port.iSystemPropertiesSetFreeDiskSpacePercentError(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::remoteDisplayAuthLibrary of type wstring
    public String getRemoteDisplayAuthLibrary() {
        try {
            String retVal = port.iSystemPropertiesGetRemoteDisplayAuthLibrary(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setRemoteDisplayAuthLibrary(String value) {
        try {
            port.iSystemPropertiesSetRemoteDisplayAuthLibrary(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::webServiceAuthLibrary of type wstring
    public String getWebServiceAuthLibrary() {
        try {
            String retVal = port.iSystemPropertiesGetWebServiceAuthLibrary(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setWebServiceAuthLibrary(String value) {
        try {
            port.iSystemPropertiesSetWebServiceAuthLibrary(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISystemProperties::LogHistoryCount of type unsigned long
    public Long getLogHistoryCount() {
        try {
            Long retVal = port.iSystemPropertiesGetLogHistoryCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setLogHistoryCount(Long value) {
        try {
            port.iSystemPropertiesSetLogHistoryCount(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISystemProperties::defaultAudioDriver of type AudioDriverType
    public org.virtualbox_3_2.AudioDriverType getDefaultAudioDriver() {
        try {
            org.virtualbox_3_2.AudioDriverType retVal = port.iSystemPropertiesGetDefaultAudioDriver(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method ISystemProperties::getMaxDevicesPerPortForStorageBus(
            [in] StorageBus bus,
            [return] unsigned long maxDevicesPerPort)
     */
    public Long getMaxDevicesPerPortForStorageBus(org.virtualbox_3_2.StorageBus bus) {
        try {
            Long retVal = port.iSystemPropertiesGetMaxDevicesPerPortForStorageBus(_this, bus);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method ISystemProperties::getMinPortCountForStorageBus(
            [in] StorageBus bus,
            [return] unsigned long minPortCount)
     */
    public Long getMinPortCountForStorageBus(org.virtualbox_3_2.StorageBus bus) {
        try {
            Long retVal = port.iSystemPropertiesGetMinPortCountForStorageBus(_this, bus);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method ISystemProperties::getMaxPortCountForStorageBus(
            [in] StorageBus bus,
            [return] unsigned long maxPortCount)
     */
    public Long getMaxPortCountForStorageBus(org.virtualbox_3_2.StorageBus bus) {
        try {
            Long retVal = port.iSystemPropertiesGetMaxPortCountForStorageBus(_this, bus);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method ISystemProperties::getMaxInstancesOfStorageBus(
            [in] StorageBus bus,
            [return] unsigned long maxInstances)
     */
    public Long getMaxInstancesOfStorageBus(org.virtualbox_3_2.StorageBus bus) {
        try {
            Long retVal = port.iSystemPropertiesGetMaxInstancesOfStorageBus(_this, bus);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method ISystemProperties::getDeviceTypesForStorageBus(
            [in] StorageBus bus,
            [return] DeviceType deviceTypes[])
     */
    public List<org.virtualbox_3_2.DeviceType> getDeviceTypesForStorageBus(org.virtualbox_3_2.StorageBus bus) {
        try {
            List<org.virtualbox_3_2.DeviceType> retVal = port.iSystemPropertiesGetDeviceTypesForStorageBus(_this, bus);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
