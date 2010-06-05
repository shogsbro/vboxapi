
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
 * ISharedFolder.java
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
public class ISharedFolder {

    private org.virtualbox_3_2.ISharedFolder real;
    private VboxPortType port;

    public ISharedFolder(org.virtualbox_3_2.ISharedFolder real, VboxPortType port) {
      this.real = real; 
      this.port = port;  
    }

    // read-only attribute ISharedFolder::name of type wstring
    public String getName() {
            String retVal = real.getName();
            return retVal;
    }

    // read-only attribute ISharedFolder::hostPath of type wstring
    public String getHostPath() {
            String retVal = real.getHostPath();
            return retVal;
    }

    // read-only attribute ISharedFolder::accessible of type boolean
    public Boolean isAccessible() {
            Boolean retVal = real.isAccessible();
            return retVal;
    }

    // read-only attribute ISharedFolder::writable of type boolean
    public Boolean isWritable() {
            Boolean retVal = real.isWritable();
            return retVal;
    }

    // read-only attribute ISharedFolder::lastAccessError of type wstring
    public String getLastAccessError() {
            String retVal = real.getLastAccessError();
            return retVal;
    }
}
