
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
 * IVFSExplorer.java
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
public class IVFSExplorer extends IUnknown {

    public static IVFSExplorer cast(IUnknown other) {
        return new IVFSExplorer(other.getRef(), other.getRemoteWSPort());
    }

    public IVFSExplorer(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IVFSExplorer::path of type wstring
    public String getPath() {
        try {
            String retVal = port.ivfsExplorerGetPath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVFSExplorer::type of type VFSType
    public org.virtualbox_3_2.VFSType getType() {
        try {
            org.virtualbox_3_2.VFSType retVal = port.ivfsExplorerGetType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::update(
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress update() {
        try {
            String retVal = port.ivfsExplorerUpdate(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::cd(
            [in] wstring aDir,
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress cd(String aDir) {
        try {
            String retVal = port.ivfsExplorerCd(_this, aDir);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::cdUp(
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress cdUp() {
        try {
            String retVal = port.ivfsExplorerCdUp(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::entryList(
            [out] wstring aNames[],
            [out] unsigned long aTypes[])
     */
    public void entryList(Holder<List<String>> aNames, Holder<List<Long>> aTypes) {
        try {
            port.ivfsExplorerEntryList(_this, aNames, aTypes);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::exists(
            [in] wstring aNames[],
            [return] wstring aExists[])
     */
    public List<String> exists(List<String> aNames) {
        try {
            List<String> retVal = port.ivfsExplorerExists(_this, aNames);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVFSExplorer::remove(
            [in] wstring aNames[],
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress remove(List<String> aNames) {
        try {
            String retVal = port.ivfsExplorerRemove(_this, aNames);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
