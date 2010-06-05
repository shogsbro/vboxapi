
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
 * IStorageController.java
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
public class IStorageController extends IUnknown {

    public static IStorageController cast(IUnknown other) {
        return new IStorageController(other.getRef(), other.getRemoteWSPort());
    }

    public IStorageController(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IStorageController::name of type wstring
    public String getName() {
        try {
            String retVal = port.iStorageControllerGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IStorageController::maxDevicesPerPortCount of type unsigned long
    public Long getMaxDevicesPerPortCount() {
        try {
            Long retVal = port.iStorageControllerGetMaxDevicesPerPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IStorageController::minPortCount of type unsigned long
    public Long getMinPortCount() {
        try {
            Long retVal = port.iStorageControllerGetMinPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IStorageController::maxPortCount of type unsigned long
    public Long getMaxPortCount() {
        try {
            Long retVal = port.iStorageControllerGetMaxPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IStorageController::instance of type unsigned long
    public Long getInstance() {
        try {
            Long retVal = port.iStorageControllerGetInstance(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setInstance(Long value) {
        try {
            port.iStorageControllerSetInstance(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IStorageController::portCount of type unsigned long
    public Long getPortCount() {
        try {
            Long retVal = port.iStorageControllerGetPortCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPortCount(Long value) {
        try {
            port.iStorageControllerSetPortCount(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IStorageController::bus of type StorageBus
    public org.virtualbox_3_2.StorageBus getBus() {
        try {
            org.virtualbox_3_2.StorageBus retVal = port.iStorageControllerGetBus(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IStorageController::controllerType of type StorageControllerType
    public org.virtualbox_3_2.StorageControllerType getControllerType() {
        try {
            org.virtualbox_3_2.StorageControllerType retVal = port.iStorageControllerGetControllerType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setControllerType(org.virtualbox_3_2.StorageControllerType value) {
        try {
            port.iStorageControllerSetControllerType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IStorageController::useHostIOCache of type boolean
    public Boolean getUseHostIOCache() {
        try {
            Boolean retVal = port.iStorageControllerGetUseHostIOCache(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setUseHostIOCache(Boolean value) {
        try {
            port.iStorageControllerSetUseHostIOCache(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IStorageController::getIDEEmulationPort(
            [in] long devicePosition,
            [return] long portNumber)
     */
    public Integer getIDEEmulationPort(Integer devicePosition) {
        try {
            Integer retVal = port.iStorageControllerGetIDEEmulationPort(_this, devicePosition);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IStorageController::setIDEEmulationPort(
            [in] long devicePosition,
            [in] long portNumber)
     */
    public void setIDEEmulationPort(Integer devicePosition, Integer portNumber) {
        try {
            port.iStorageControllerSetIDEEmulationPort(_this, devicePosition, portNumber);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
