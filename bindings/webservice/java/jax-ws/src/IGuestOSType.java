
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
 * IGuestOSType.java
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
public class IGuestOSType {

    private org.virtualbox_3_2.IGuestOSType real;
    private VboxPortType port;

    public IGuestOSType(org.virtualbox_3_2.IGuestOSType real, VboxPortType port) {
      this.real = real; 
      this.port = port;  
    }

    // read-only attribute IGuestOSType::familyId of type wstring
    public String getFamilyId() {
            String retVal = real.getFamilyId();
            return retVal;
    }

    // read-only attribute IGuestOSType::familyDescription of type wstring
    public String getFamilyDescription() {
            String retVal = real.getFamilyDescription();
            return retVal;
    }

    // read-only attribute IGuestOSType::id of type wstring
    public String getId() {
            String retVal = real.getId();
            return retVal;
    }

    // read-only attribute IGuestOSType::description of type wstring
    public String getDescription() {
            String retVal = real.getDescription();
            return retVal;
    }

    // read-only attribute IGuestOSType::is64Bit of type boolean
    public Boolean isIs64Bit() {
            Boolean retVal = real.isIs64Bit();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedIOAPIC of type boolean
    public Boolean isRecommendedIOAPIC() {
            Boolean retVal = real.isRecommendedIOAPIC();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedVirtEx of type boolean
    public Boolean isRecommendedVirtEx() {
            Boolean retVal = real.isRecommendedVirtEx();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedRAM of type unsigned long
    public Long getRecommendedRAM() {
            Long retVal = real.getRecommendedRAM();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedVRAM of type unsigned long
    public Long getRecommendedVRAM() {
            Long retVal = real.getRecommendedVRAM();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedHDD of type unsigned long
    public Long getRecommendedHDD() {
            Long retVal = real.getRecommendedHDD();
            return retVal;
    }

    // read-only attribute IGuestOSType::adapterType of type NetworkAdapterType
    public org.virtualbox_3_2.NetworkAdapterType getAdapterType() {
            org.virtualbox_3_2.NetworkAdapterType retVal = real.getAdapterType();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedPae of type boolean
    public Boolean isRecommendedPae() {
            Boolean retVal = real.isRecommendedPae();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedDvdStorageController of type StorageControllerType
    public org.virtualbox_3_2.StorageControllerType getRecommendedDvdStorageController() {
            org.virtualbox_3_2.StorageControllerType retVal = real.getRecommendedDvdStorageController();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedDvdStorageBus of type StorageBus
    public org.virtualbox_3_2.StorageBus getRecommendedDvdStorageBus() {
            org.virtualbox_3_2.StorageBus retVal = real.getRecommendedDvdStorageBus();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedHdStorageController of type StorageControllerType
    public org.virtualbox_3_2.StorageControllerType getRecommendedHdStorageController() {
            org.virtualbox_3_2.StorageControllerType retVal = real.getRecommendedHdStorageController();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedHdStorageBus of type StorageBus
    public org.virtualbox_3_2.StorageBus getRecommendedHdStorageBus() {
            org.virtualbox_3_2.StorageBus retVal = real.getRecommendedHdStorageBus();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedFirmware of type FirmwareType
    public org.virtualbox_3_2.FirmwareType getRecommendedFirmware() {
            org.virtualbox_3_2.FirmwareType retVal = real.getRecommendedFirmware();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedUsbHid of type boolean
    public Boolean isRecommendedUsbHid() {
            Boolean retVal = real.isRecommendedUsbHid();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedHpet of type boolean
    public Boolean isRecommendedHpet() {
            Boolean retVal = real.isRecommendedHpet();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedUsbTablet of type boolean
    public Boolean isRecommendedUsbTablet() {
            Boolean retVal = real.isRecommendedUsbTablet();
            return retVal;
    }

    // read-only attribute IGuestOSType::recommendedRtcUseUtc of type boolean
    public Boolean isRecommendedRtcUseUtc() {
            Boolean retVal = real.isRecommendedRtcUseUtc();
            return retVal;
    }
}
