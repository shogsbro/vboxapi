
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
 * ISnapshot.java
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
public class ISnapshot extends IUnknown {

    public static ISnapshot cast(IUnknown other) {
        return new ISnapshot(other.getRef(), other.getRemoteWSPort());
    }

    public ISnapshot(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute ISnapshot::id of type uuid
    public String getId() {
        try {
            String retVal = port.iSnapshotGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISnapshot::name of type wstring
    public String getName() {
        try {
            String retVal = port.iSnapshotGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setName(String value) {
        try {
            port.iSnapshotSetName(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute ISnapshot::description of type wstring
    public String getDescription() {
        try {
            String retVal = port.iSnapshotGetDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDescription(String value) {
        try {
            port.iSnapshotSetDescription(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISnapshot::timeStamp of type long long
    public Long getTimeStamp() {
        try {
            Long retVal = port.iSnapshotGetTimeStamp(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISnapshot::online of type boolean
    public Boolean getOnline() {
        try {
            Boolean retVal = port.iSnapshotGetOnline(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISnapshot::machine of type IMachine
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine getMachine() {
        try {
            String retVal = port.iSnapshotGetMachine(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISnapshot::parent of type ISnapshot
    public com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot getParent() {
        try {
            String retVal = port.iSnapshotGetParent(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute ISnapshot::children of type ISnapshot
    public List<com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot> getChildren() {
        try {
            List<String> retVal = port.iSnapshotGetChildren(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
