
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
 * IVirtualBox.java
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
public class IVirtualBox extends IUnknown {

    public static IVirtualBox cast(IUnknown other) {
        return new IVirtualBox(other.getRef(), other.getRemoteWSPort());
    }

    public IVirtualBox(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IVirtualBox::version of type wstring
    public String getVersion() {
        try {
            String retVal = port.iVirtualBoxGetVersion(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::revision of type unsigned long
    public Long getRevision() {
        try {
            Long retVal = port.iVirtualBoxGetRevision(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::packageType of type wstring
    public String getPackageType() {
        try {
            String retVal = port.iVirtualBoxGetPackageType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::homeFolder of type wstring
    public String getHomeFolder() {
        try {
            String retVal = port.iVirtualBoxGetHomeFolder(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::settingsFilePath of type wstring
    public String getSettingsFilePath() {
        try {
            String retVal = port.iVirtualBoxGetSettingsFilePath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::host of type IHost
    public com.sun.xml.ws.commons.virtualbox_3_2.IHost getHost() {
        try {
            String retVal = port.iVirtualBoxGetHost(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IHost(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::systemProperties of type ISystemProperties
    public com.sun.xml.ws.commons.virtualbox_3_2.ISystemProperties getSystemProperties() {
        try {
            String retVal = port.iVirtualBoxGetSystemProperties(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISystemProperties(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::machines of type IMachine
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMachine> getMachines() {
        try {
            List<String> retVal = port.iVirtualBoxGetMachines(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMachine.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::hardDisks of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getHardDisks() {
        try {
            List<String> retVal = port.iVirtualBoxGetHardDisks(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::DVDImages of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getDVDImages() {
        try {
            List<String> retVal = port.iVirtualBoxGetDVDImages(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::floppyImages of type IMedium
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMedium> getFloppyImages() {
        try {
            List<String> retVal = port.iVirtualBoxGetFloppyImages(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IMedium.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::progressOperations of type IProgress
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IProgress> getProgressOperations() {
        try {
            List<String> retVal = port.iVirtualBoxGetProgressOperations(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IProgress.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::guestOSTypes of type IGuestOSType
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IGuestOSType> getGuestOSTypes() {
        try {
            List<org.virtualbox_3_2.IGuestOSType> retVal = port.iVirtualBoxGetGuestOSTypes(_this);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.IGuestOSType.class, org.virtualbox_3_2.IGuestOSType.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::sharedFolders of type ISharedFolder
    public List<com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder> getSharedFolders() {
        try {
            List<org.virtualbox_3_2.ISharedFolder> retVal = port.iVirtualBoxGetSharedFolders(_this);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder.class, org.virtualbox_3_2.ISharedFolder.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::performanceCollector of type IPerformanceCollector
    public com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceCollector getPerformanceCollector() {
        try {
            String retVal = port.iVirtualBoxGetPerformanceCollector(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IPerformanceCollector(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IVirtualBox::DHCPServers of type IDHCPServer
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer> getDHCPServers() {
        try {
            List<String> retVal = port.iVirtualBoxGetDHCPServers(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createMachine(
            [in] wstring name,
            [in] wstring osTypeId,
            [in] wstring baseFolder,
            [in] uuid id,
            [in] boolean override,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine createMachine(String name, String osTypeId, String baseFolder, String id, Boolean override) {
        try {
            String retVal = port.iVirtualBoxCreateMachine(_this, name, osTypeId, baseFolder, id, override);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createLegacyMachine(
            [in] wstring name,
            [in] wstring osTypeId,
            [in] wstring settingsFile,
            [in] uuid id,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine createLegacyMachine(String name, String osTypeId, String settingsFile, String id) {
        try {
            String retVal = port.iVirtualBoxCreateLegacyMachine(_this, name, osTypeId, settingsFile, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openMachine(
            [in] wstring settingsFile,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine openMachine(String settingsFile) {
        try {
            String retVal = port.iVirtualBoxOpenMachine(_this, settingsFile);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::registerMachine(
            [in] IMachine machine)
     */
    public void registerMachine(com.sun.xml.ws.commons.virtualbox_3_2.IMachine machine) {
        try {
            port.iVirtualBoxRegisterMachine(_this, ((machine == null)?null:machine.getRef()));
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getMachine(
            [in] uuid id,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine getMachine(String id) {
        try {
            String retVal = port.iVirtualBoxGetMachine(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::findMachine(
            [in] wstring name,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine findMachine(String name) {
        try {
            String retVal = port.iVirtualBoxFindMachine(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::unregisterMachine(
            [in] uuid id,
            [return] IMachine machine)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine unregisterMachine(String id) {
        try {
            String retVal = port.iVirtualBoxUnregisterMachine(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createAppliance(
            [return] IAppliance appliance)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IAppliance createAppliance() {
        try {
            String retVal = port.iVirtualBoxCreateAppliance(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IAppliance(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createHardDisk(
            [in] wstring format,
            [in] wstring location,
            [return] IMedium medium)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium createHardDisk(String format, String location) {
        try {
            String retVal = port.iVirtualBoxCreateHardDisk(_this, format, location);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openHardDisk(
            [in] wstring location,
            [in] AccessMode accessMode,
            [in] boolean setImageId,
            [in] uuid imageId,
            [in] boolean setParentId,
            [in] uuid parentId,
            [return] IMedium medium)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium openHardDisk(String location, org.virtualbox_3_2.AccessMode accessMode, Boolean setImageId, String imageId, Boolean setParentId, String parentId) {
        try {
            String retVal = port.iVirtualBoxOpenHardDisk(_this, location, accessMode, setImageId, imageId, setParentId, parentId);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getHardDisk(
            [in] uuid id,
            [return] IMedium medium)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getHardDisk(String id) {
        try {
            String retVal = port.iVirtualBoxGetHardDisk(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::findHardDisk(
            [in] wstring location,
            [return] IMedium medium)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium findHardDisk(String location) {
        try {
            String retVal = port.iVirtualBoxFindHardDisk(_this, location);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openDVDImage(
            [in] wstring location,
            [in] uuid id,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium openDVDImage(String location, String id) {
        try {
            String retVal = port.iVirtualBoxOpenDVDImage(_this, location, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getDVDImage(
            [in] uuid id,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getDVDImage(String id) {
        try {
            String retVal = port.iVirtualBoxGetDVDImage(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::findDVDImage(
            [in] wstring location,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium findDVDImage(String location) {
        try {
            String retVal = port.iVirtualBoxFindDVDImage(_this, location);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openFloppyImage(
            [in] wstring location,
            [in] uuid id,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium openFloppyImage(String location, String id) {
        try {
            String retVal = port.iVirtualBoxOpenFloppyImage(_this, location, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getFloppyImage(
            [in] uuid id,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getFloppyImage(String id) {
        try {
            String retVal = port.iVirtualBoxGetFloppyImage(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::findFloppyImage(
            [in] wstring location,
            [return] IMedium image)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium findFloppyImage(String location) {
        try {
            String retVal = port.iVirtualBoxFindFloppyImage(_this, location);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getGuestOSType(
            [in] uuid id,
            [return] IGuestOSType type)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IGuestOSType getGuestOSType(String id) {
        try {
            org.virtualbox_3_2.IGuestOSType retVal = port.iVirtualBoxGetGuestOSType(_this, id);
            return (retVal != null) ? new com.sun.xml.ws.commons.virtualbox_3_2.IGuestOSType(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createSharedFolder(
            [in] wstring name,
            [in] wstring hostPath,
            [in] boolean writable)
     */
    public void createSharedFolder(String name, String hostPath, Boolean writable) {
        try {
            port.iVirtualBoxCreateSharedFolder(_this, name, hostPath, writable);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::removeSharedFolder(
            [in] wstring name)
     */
    public void removeSharedFolder(String name) {
        try {
            port.iVirtualBoxRemoveSharedFolder(_this, name);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getExtraDataKeys(
            [return] wstring value[])
     */
    public List<String> getExtraDataKeys() {
        try {
            List<String> retVal = port.iVirtualBoxGetExtraDataKeys(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::getExtraData(
            [in] wstring key,
            [return] wstring value)
     */
    public String getExtraData(String key) {
        try {
            String retVal = port.iVirtualBoxGetExtraData(_this, key);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::setExtraData(
            [in] wstring key,
            [in] wstring value)
     */
    public void setExtraData(String key, String value) {
        try {
            port.iVirtualBoxSetExtraData(_this, key, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openSession(
            [in] ISession session,
            [in] uuid machineId)
     */
    public void openSession(com.sun.xml.ws.commons.virtualbox_3_2.ISession session, String machineId) {
        try {
            port.iVirtualBoxOpenSession(_this, ((session == null)?null:session.getRef()), machineId);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openRemoteSession(
            [in] ISession session,
            [in] uuid machineId,
            [in] wstring type,
            [in] wstring environment,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress openRemoteSession(com.sun.xml.ws.commons.virtualbox_3_2.ISession session, String machineId, String type, String environment) {
        try {
            String retVal = port.iVirtualBoxOpenRemoteSession(_this, ((session == null)?null:session.getRef()), machineId, type, environment);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::openExistingSession(
            [in] ISession session,
            [in] uuid machineId)
     */
    public void openExistingSession(com.sun.xml.ws.commons.virtualbox_3_2.ISession session, String machineId) {
        try {
            port.iVirtualBoxOpenExistingSession(_this, ((session == null)?null:session.getRef()), machineId);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::waitForPropertyChange(
            [in] wstring what,
            [in] unsigned long timeout,
            [out] wstring changed,
            [out] wstring values)
     */
    public void waitForPropertyChange(String what, Long timeout, Holder<String> changed, Holder<String> values) {
        try {
            port.iVirtualBoxWaitForPropertyChange(_this, what, timeout, changed, values);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::createDHCPServer(
            [in] wstring name,
            [return] IDHCPServer server)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer createDHCPServer(String name) {
        try {
            String retVal = port.iVirtualBoxCreateDHCPServer(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::findDHCPServerByNetworkName(
            [in] wstring name,
            [return] IDHCPServer server)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer findDHCPServerByNetworkName(String name) {
        try {
            String retVal = port.iVirtualBoxFindDHCPServerByNetworkName(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::removeDHCPServer(
            [in] IDHCPServer server)
     */
    public void removeDHCPServer(com.sun.xml.ws.commons.virtualbox_3_2.IDHCPServer server) {
        try {
            port.iVirtualBoxRemoveDHCPServer(_this, ((server == null)?null:server.getRef()));
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IVirtualBox::checkFirmwarePresent(
            [in] FirmwareType firmwareType,
            [in] wstring version,
            [out] wstring url,
            [out] wstring file,
            [return] boolean result)
     */
    public Boolean checkFirmwarePresent(org.virtualbox_3_2.FirmwareType firmwareType, String version, Holder<String> url, Holder<String> file) {
        try {
            Holder<Boolean> retVal = new Holder<Boolean>();
            port.iVirtualBoxCheckFirmwarePresent(_this, firmwareType, version, url, file, retVal);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
