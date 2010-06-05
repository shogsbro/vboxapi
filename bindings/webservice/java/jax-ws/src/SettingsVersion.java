
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
 * SettingsVersion.java
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

@XmlType(name = "SettingsVersion")
@XmlEnum
public enum SettingsVersion {

    @XmlEnumValue("Null")
    Null("Null"),
    @XmlEnumValue("v1_0")
    v1_0("v1_0"),
    @XmlEnumValue("v1_1")
    v1_1("v1_1"),
    @XmlEnumValue("v1_2")
    v1_2("v1_2"),
    @XmlEnumValue("v1_3pre")
    v1_3pre("v1_3pre"),
    @XmlEnumValue("v1_3")
    v1_3("v1_3"),
    @XmlEnumValue("v1_4")
    v1_4("v1_4"),
    @XmlEnumValue("v1_5")
    v1_5("v1_5"),
    @XmlEnumValue("v1_6")
    v1_6("v1_6"),
    @XmlEnumValue("v1_7")
    v1_7("v1_7"),
    @XmlEnumValue("v1_8")
    v1_8("v1_8"),
    @XmlEnumValue("v1_9")
    v1_9("v1_9"),
    @XmlEnumValue("v1_10")
    v1_10("v1_10"),
    @XmlEnumValue("Future")
    Future("Future");

    private final String value;

    SettingsVersion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SettingsVersion fromValue(String v) {
        for (SettingsVersion c: SettingsVersion. values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}

