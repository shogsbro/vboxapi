
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
 * IAppliance.java
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
public class IAppliance extends IUnknown {

    public static IAppliance cast(IUnknown other) {
        return new IAppliance(other.getRef(), other.getRemoteWSPort());
    }

    public IAppliance(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IAppliance::path of type wstring
    public String getPath() {
        try {
            String retVal = port.iApplianceGetPath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IAppliance::disks of type wstring
    public List<String> getDisks() {
        try {
            List<String> retVal = port.iApplianceGetDisks(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IAppliance::virtualSystemDescriptions of type IVirtualSystemDescription
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IVirtualSystemDescription> getVirtualSystemDescriptions() {
        try {
            List<String> retVal = port.iApplianceGetVirtualSystemDescriptions(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IVirtualSystemDescription.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::read(
            [in] wstring file,
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress read(String file) {
        try {
            String retVal = port.iApplianceRead(_this, file);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::interpret()
     */
    public void interpret() {
        try {
            port.iApplianceInterpret(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::importMachines(
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress importMachines() {
        try {
            String retVal = port.iApplianceImportMachines(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::createVFSExplorer(
            [in] wstring aUri,
            [return] IVFSExplorer aExplorer)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IVFSExplorer createVFSExplorer(String aUri) {
        try {
            String retVal = port.iApplianceCreateVFSExplorer(_this, aUri);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVFSExplorer(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::write(
            [in] wstring format,
            [in] wstring path,
            [return] IProgress aProgress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress write(String format, String path) {
        try {
            String retVal = port.iApplianceWrite(_this, format, path);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IAppliance::getWarnings(
            [return] wstring aWarnings[])
     */
    public List<String> getWarnings() {
        try {
            List<String> retVal = port.iApplianceGetWarnings(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
