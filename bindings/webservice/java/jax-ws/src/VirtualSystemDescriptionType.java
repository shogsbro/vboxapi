
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
 * VirtualSystemDescriptionType.java
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
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VirtualSystemDescriptionType")
@XmlEnum
public enum VirtualSystemDescriptionType {

    @XmlEnumValue("Ignore")
    Ignore("Ignore"),
    @XmlEnumValue("OS")
    OS("OS"),
    @XmlEnumValue("Name")
    Name("Name"),
    @XmlEnumValue("Product")
    Product("Product"),
    @XmlEnumValue("Vendor")
    Vendor("Vendor"),
    @XmlEnumValue("Version")
    Version("Version"),
    @XmlEnumValue("ProductUrl")
    ProductUrl("ProductUrl"),
    @XmlEnumValue("VendorUrl")
    VendorUrl("VendorUrl"),
    @XmlEnumValue("Description")
    Description("Description"),
    @XmlEnumValue("License")
    License("License"),
    @XmlEnumValue("Miscellaneous")
    Miscellaneous("Miscellaneous"),
    @XmlEnumValue("CPU")
    CPU("CPU"),
    @XmlEnumValue("Memory")
    Memory("Memory"),
    @XmlEnumValue("HardDiskControllerIDE")
    HardDiskControllerIDE("HardDiskControllerIDE"),
    @XmlEnumValue("HardDiskControllerSATA")
    HardDiskControllerSATA("HardDiskControllerSATA"),
    @XmlEnumValue("HardDiskControllerSCSI")
    HardDiskControllerSCSI("HardDiskControllerSCSI"),
    @XmlEnumValue("HardDiskControllerSAS")
    HardDiskControllerSAS("HardDiskControllerSAS"),
    @XmlEnumValue("HardDiskImage")
    HardDiskImage("HardDiskImage"),
    @XmlEnumValue("Floppy")
    Floppy("Floppy"),
    @XmlEnumValue("CDROM")
    CDROM("CDROM"),
    @XmlEnumValue("NetworkAdapter")
    NetworkAdapter("NetworkAdapter"),
    @XmlEnumValue("USBController")
    USBController("USBController"),
    @XmlEnumValue("SoundCard")
    SoundCard("SoundCard");

    private final String value;

    VirtualSystemDescriptionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VirtualSystemDescriptionType fromValue(String v) {
        for (VirtualSystemDescriptionType c: VirtualSystemDescriptionType. values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

