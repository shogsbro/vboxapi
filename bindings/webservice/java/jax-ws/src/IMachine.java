
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
 * IMachine.java
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
public class IMachine extends IUnknown {

    public static IMachine cast(IUnknown other) {
        return new IMachine(other.getRef(), other.getRemoteWSPort());
    }

    public IMachine(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IMachine::parent of type IVirtualBox
    public com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBox getParent() {
        try {
            String retVal = port.iMachineGetParent(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBox(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::accessible of type boolean
    public Boolean getAccessible() {
        try {
            Boolean retVal = port.iMachineGetAccessible(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::accessError of type IVirtualBoxErrorInfo
    public com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo getAccessError() {
        try {
            String retVal = port.iMachineGetAccessError(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVirtualBoxErrorInfo(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::name of type wstring
    public String getName() {
        try {
            String retVal = port.iMachineGetName(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setName(String value) {
        try {
            port.iMachineSetName(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::description of type wstring
    public String getDescription() {
        try {
            String retVal = port.iMachineGetDescription(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setDescription(String value) {
        try {
            port.iMachineSetDescription(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::id of type uuid
    public String getId() {
        try {
            String retVal = port.iMachineGetId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::OSTypeId of type wstring
    public String getOSTypeId() {
        try {
            String retVal = port.iMachineGetOSTypeId(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setOSTypeId(String value) {
        try {
            port.iMachineSetOSTypeId(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::HardwareVersion of type wstring
    public String getHardwareVersion() {
        try {
            String retVal = port.iMachineGetHardwareVersion(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setHardwareVersion(String value) {
        try {
            port.iMachineSetHardwareVersion(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::hardwareUUID of type uuid
    public String getHardwareUUID() {
        try {
            String retVal = port.iMachineGetHardwareUUID(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setHardwareUUID(String value) {
        try {
            port.iMachineSetHardwareUUID(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::CPUCount of type unsigned long
    public Long getCPUCount() {
        try {
            Long retVal = port.iMachineGetCPUCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setCPUCount(Long value) {
        try {
            port.iMachineSetCPUCount(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::CPUHotPlugEnabled of type boolean
    public Boolean getCPUHotPlugEnabled() {
        try {
            Boolean retVal = port.iMachineGetCPUHotPlugEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setCPUHotPlugEnabled(Boolean value) {
        try {
            port.iMachineSetCPUHotPlugEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::memorySize of type unsigned long
    public Long getMemorySize() {
        try {
            Long retVal = port.iMachineGetMemorySize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMemorySize(Long value) {
        try {
            port.iMachineSetMemorySize(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::memoryBalloonSize of type unsigned long
    public Long getMemoryBalloonSize() {
        try {
            Long retVal = port.iMachineGetMemoryBalloonSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMemoryBalloonSize(Long value) {
        try {
            port.iMachineSetMemoryBalloonSize(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::PageFusionEnabled of type boolean
    public Boolean getPageFusionEnabled() {
        try {
            Boolean retVal = port.iMachineGetPageFusionEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPageFusionEnabled(Boolean value) {
        try {
            port.iMachineSetPageFusionEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::VRAMSize of type unsigned long
    public Long getVRAMSize() {
        try {
            Long retVal = port.iMachineGetVRAMSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setVRAMSize(Long value) {
        try {
            port.iMachineSetVRAMSize(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::accelerate3DEnabled of type boolean
    public Boolean getAccelerate3DEnabled() {
        try {
            Boolean retVal = port.iMachineGetAccelerate3DEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAccelerate3DEnabled(Boolean value) {
        try {
            port.iMachineSetAccelerate3DEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::accelerate2DVideoEnabled of type boolean
    public Boolean getAccelerate2DVideoEnabled() {
        try {
            Boolean retVal = port.iMachineGetAccelerate2DVideoEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setAccelerate2DVideoEnabled(Boolean value) {
        try {
            port.iMachineSetAccelerate2DVideoEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::monitorCount of type unsigned long
    public Long getMonitorCount() {
        try {
            Long retVal = port.iMachineGetMonitorCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setMonitorCount(Long value) {
        try {
            port.iMachineSetMonitorCount(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::BIOSSettings of type IBIOSSettings
    public com.sun.xml.ws.commons.virtualbox_3_2.IBIOSSettings getBIOSSettings() {
        try {
            String retVal = port.iMachineGetBIOSSettings(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IBIOSSettings(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::firmwareType of type FirmwareType
    public org.virtualbox_3_2.FirmwareType getFirmwareType() {
        try {
            org.virtualbox_3_2.FirmwareType retVal = port.iMachineGetFirmwareType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setFirmwareType(org.virtualbox_3_2.FirmwareType value) {
        try {
            port.iMachineSetFirmwareType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::pointingHidType of type PointingHidType
    public org.virtualbox_3_2.PointingHidType getPointingHidType() {
        try {
            org.virtualbox_3_2.PointingHidType retVal = port.iMachineGetPointingHidType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setPointingHidType(org.virtualbox_3_2.PointingHidType value) {
        try {
            port.iMachineSetPointingHidType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::keyboardHidType of type KeyboardHidType
    public org.virtualbox_3_2.KeyboardHidType getKeyboardHidType() {
        try {
            org.virtualbox_3_2.KeyboardHidType retVal = port.iMachineGetKeyboardHidType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setKeyboardHidType(org.virtualbox_3_2.KeyboardHidType value) {
        try {
            port.iMachineSetKeyboardHidType(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::hpetEnabled of type boolean
    public Boolean getHpetEnabled() {
        try {
            Boolean retVal = port.iMachineGetHpetEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setHpetEnabled(Boolean value) {
        try {
            port.iMachineSetHpetEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::snapshotFolder of type wstring
    public String getSnapshotFolder() {
        try {
            String retVal = port.iMachineGetSnapshotFolder(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setSnapshotFolder(String value) {
        try {
            port.iMachineSetSnapshotFolder(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::VRDPServer of type IVRDPServer
    public com.sun.xml.ws.commons.virtualbox_3_2.IVRDPServer getVRDPServer() {
        try {
            String retVal = port.iMachineGetVRDPServer(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVRDPServer(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::mediumAttachments of type IMediumAttachment
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment> getMediumAttachments() {
        try {
            List<org.virtualbox_3_2.IMediumAttachment> retVal = port.iMachineGetMediumAttachments(_this);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment.class, org.virtualbox_3_2.IMediumAttachment.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::USBController of type IUSBController
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBController getUSBController() {
        try {
            String retVal = port.iMachineGetUSBController(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBController(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::audioAdapter of type IAudioAdapter
    public com.sun.xml.ws.commons.virtualbox_3_2.IAudioAdapter getAudioAdapter() {
        try {
            String retVal = port.iMachineGetAudioAdapter(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IAudioAdapter(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::storageControllers of type IStorageController
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IStorageController> getStorageControllers() {
        try {
            List<String> retVal = port.iMachineGetStorageControllers(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IStorageController.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::settingsFilePath of type wstring
    public String getSettingsFilePath() {
        try {
            String retVal = port.iMachineGetSettingsFilePath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::settingsModified of type boolean
    public Boolean getSettingsModified() {
        try {
            Boolean retVal = port.iMachineGetSettingsModified(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::sessionState of type SessionState
    public org.virtualbox_3_2.SessionState getSessionState() {
        try {
            org.virtualbox_3_2.SessionState retVal = port.iMachineGetSessionState(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::sessionType of type wstring
    public String getSessionType() {
        try {
            String retVal = port.iMachineGetSessionType(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::sessionPid of type unsigned long
    public Long getSessionPid() {
        try {
            Long retVal = port.iMachineGetSessionPid(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::state of type MachineState
    public org.virtualbox_3_2.MachineState getState() {
        try {
            org.virtualbox_3_2.MachineState retVal = port.iMachineGetState(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::lastStateChange of type long long
    public Long getLastStateChange() {
        try {
            Long retVal = port.iMachineGetLastStateChange(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::stateFilePath of type wstring
    public String getStateFilePath() {
        try {
            String retVal = port.iMachineGetStateFilePath(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::logFolder of type wstring
    public String getLogFolder() {
        try {
            String retVal = port.iMachineGetLogFolder(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::currentSnapshot of type ISnapshot
    public com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot getCurrentSnapshot() {
        try {
            String retVal = port.iMachineGetCurrentSnapshot(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::snapshotCount of type unsigned long
    public Long getSnapshotCount() {
        try {
            Long retVal = port.iMachineGetSnapshotCount(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::currentStateModified of type boolean
    public Boolean getCurrentStateModified() {
        try {
            Boolean retVal = port.iMachineGetCurrentStateModified(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IMachine::sharedFolders of type ISharedFolder
    public List<com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder> getSharedFolders() {
        try {
            List<org.virtualbox_3_2.ISharedFolder> retVal = port.iMachineGetSharedFolders(_this);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder.class, org.virtualbox_3_2.ISharedFolder.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::clipboardMode of type ClipboardMode
    public org.virtualbox_3_2.ClipboardMode getClipboardMode() {
        try {
            org.virtualbox_3_2.ClipboardMode retVal = port.iMachineGetClipboardMode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setClipboardMode(org.virtualbox_3_2.ClipboardMode value) {
        try {
            port.iMachineSetClipboardMode(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::guestPropertyNotificationPatterns of type wstring
    public String getGuestPropertyNotificationPatterns() {
        try {
            String retVal = port.iMachineGetGuestPropertyNotificationPatterns(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setGuestPropertyNotificationPatterns(String value) {
        try {
            port.iMachineSetGuestPropertyNotificationPatterns(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::teleporterEnabled of type boolean
    public Boolean getTeleporterEnabled() {
        try {
            Boolean retVal = port.iMachineGetTeleporterEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTeleporterEnabled(Boolean value) {
        try {
            port.iMachineSetTeleporterEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::teleporterPort of type unsigned long
    public Long getTeleporterPort() {
        try {
            Long retVal = port.iMachineGetTeleporterPort(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTeleporterPort(Long value) {
        try {
            port.iMachineSetTeleporterPort(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::teleporterAddress of type wstring
    public String getTeleporterAddress() {
        try {
            String retVal = port.iMachineGetTeleporterAddress(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTeleporterAddress(String value) {
        try {
            port.iMachineSetTeleporterAddress(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::teleporterPassword of type wstring
    public String getTeleporterPassword() {
        try {
            String retVal = port.iMachineGetTeleporterPassword(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setTeleporterPassword(String value) {
        try {
            port.iMachineSetTeleporterPassword(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::RTCUseUTC of type boolean
    public Boolean getRTCUseUTC() {
        try {
            Boolean retVal = port.iMachineGetRTCUseUTC(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setRTCUseUTC(Boolean value) {
        try {
            port.iMachineSetRTCUseUTC(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::ioCacheEnabled of type boolean
    public Boolean getIoCacheEnabled() {
        try {
            Boolean retVal = port.iMachineGetIoCacheEnabled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setIoCacheEnabled(Boolean value) {
        try {
            port.iMachineSetIoCacheEnabled(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::ioCacheSize of type unsigned long
    public Long getIoCacheSize() {
        try {
            Long retVal = port.iMachineGetIoCacheSize(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setIoCacheSize(Long value) {
        try {
            port.iMachineSetIoCacheSize(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read/write attribute IMachine::ioBandwidthMax of type unsigned long
    public Long getIoBandwidthMax() {
        try {
            Long retVal = port.iMachineGetIoBandwidthMax(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
    public void setIoBandwidthMax(Long value) {
        try {
            port.iMachineSetIoBandwidthMax(_this, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setBootOrder(
            [in] unsigned long position,
            [in] DeviceType device)
     */
    public void setBootOrder(Long position, org.virtualbox_3_2.DeviceType device) {
        try {
            port.iMachineSetBootOrder(_this, position, device);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getBootOrder(
            [in] unsigned long position,
            [return] DeviceType device)
     */
    public org.virtualbox_3_2.DeviceType getBootOrder(Long position) {
        try {
            org.virtualbox_3_2.DeviceType retVal = port.iMachineGetBootOrder(_this, position);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::attachDevice(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device,
            [in] DeviceType type,
            [in] uuid id)
     */
    public void attachDevice(String name, Integer controllerPort, Integer device, org.virtualbox_3_2.DeviceType type, String id) {
        try {
            port.iMachineAttachDevice(_this, name, controllerPort, device, type, id);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::detachDevice(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device)
     */
    public void detachDevice(String name, Integer controllerPort, Integer device) {
        try {
            port.iMachineDetachDevice(_this, name, controllerPort, device);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::passthroughDevice(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device,
            [in] boolean passthrough)
     */
    public void passthroughDevice(String name, Integer controllerPort, Integer device, Boolean passthrough) {
        try {
            port.iMachinePassthroughDevice(_this, name, controllerPort, device, passthrough);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::mountMedium(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device,
            [in] uuid medium,
            [in] boolean force)
     */
    public void mountMedium(String name, Integer controllerPort, Integer device, String medium, Boolean force) {
        try {
            port.iMachineMountMedium(_this, name, controllerPort, device, medium, force);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getMedium(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device,
            [return] IMedium medium)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMedium getMedium(String name, Integer controllerPort, Integer device) {
        try {
            String retVal = port.iMachineGetMedium(_this, name, controllerPort, device);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMedium(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getMediumAttachmentsOfController(
            [in] wstring name,
            [return] IMediumAttachment mediumAttachments[])
     */
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment> getMediumAttachmentsOfController(String name) {
        try {
            List<org.virtualbox_3_2.IMediumAttachment> retVal = port.iMachineGetMediumAttachmentsOfController(_this, name);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment.class, org.virtualbox_3_2.IMediumAttachment.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getMediumAttachment(
            [in] wstring name,
            [in] long controllerPort,
            [in] long device,
            [return] IMediumAttachment attachment)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment getMediumAttachment(String name, Integer controllerPort, Integer device) {
        try {
            org.virtualbox_3_2.IMediumAttachment retVal = port.iMachineGetMediumAttachment(_this, name, controllerPort, device);
            return (retVal != null) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMediumAttachment(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getNetworkAdapter(
            [in] unsigned long slot,
            [return] INetworkAdapter adapter)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.INetworkAdapter getNetworkAdapter(Long slot) {
        try {
            String retVal = port.iMachineGetNetworkAdapter(_this, slot);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.INetworkAdapter(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::addStorageController(
            [in] wstring name,
            [in] StorageBus connectionType,
            [return] IStorageController controller)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IStorageController addStorageController(String name, org.virtualbox_3_2.StorageBus connectionType) {
        try {
            String retVal = port.iMachineAddStorageController(_this, name, connectionType);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IStorageController(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getStorageControllerByName(
            [in] wstring name,
            [return] IStorageController storageController)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IStorageController getStorageControllerByName(String name) {
        try {
            String retVal = port.iMachineGetStorageControllerByName(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IStorageController(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getStorageControllerByInstance(
            [in] unsigned long instance,
            [return] IStorageController storageController)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IStorageController getStorageControllerByInstance(Long instance) {
        try {
            String retVal = port.iMachineGetStorageControllerByInstance(_this, instance);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IStorageController(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::removeStorageController(
            [in] wstring name)
     */
    public void removeStorageController(String name) {
        try {
            port.iMachineRemoveStorageController(_this, name);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getSerialPort(
            [in] unsigned long slot,
            [return] ISerialPort port)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.ISerialPort getSerialPort(Long slot) {
        try {
            String retVal = port.iMachineGetSerialPort(_this, slot);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISerialPort(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getParallelPort(
            [in] unsigned long slot,
            [return] IParallelPort port)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IParallelPort getParallelPort(Long slot) {
        try {
            String retVal = port.iMachineGetParallelPort(_this, slot);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IParallelPort(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getExtraDataKeys(
            [return] wstring value[])
     */
    public List<String> getExtraDataKeys() {
        try {
            List<String> retVal = port.iMachineGetExtraDataKeys(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getExtraData(
            [in] wstring key,
            [return] wstring value)
     */
    public String getExtraData(String key) {
        try {
            String retVal = port.iMachineGetExtraData(_this, key);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setExtraData(
            [in] wstring key,
            [in] wstring value)
     */
    public void setExtraData(String key, String value) {
        try {
            port.iMachineSetExtraData(_this, key, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getCPUProperty(
            [in] CPUPropertyType property,
            [return] boolean value)
     */
    public Boolean getCPUProperty(org.virtualbox_3_2.CPUPropertyType property) {
        try {
            Boolean retVal = port.iMachineGetCPUProperty(_this, property);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setCPUProperty(
            [in] CPUPropertyType property,
            [in] boolean value)
     */
    public void setCPUProperty(org.virtualbox_3_2.CPUPropertyType property, Boolean value) {
        try {
            port.iMachineSetCPUProperty(_this, property, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getCPUIDLeaf(
            [in] unsigned long id,
            [out] unsigned long valEax,
            [out] unsigned long valEbx,
            [out] unsigned long valEcx,
            [out] unsigned long valEdx)
     */
    public void getCPUIDLeaf(Long id, Holder<Long> valEax, Holder<Long> valEbx, Holder<Long> valEcx, Holder<Long> valEdx) {
        try {
            port.iMachineGetCPUIDLeaf(_this, id, valEax, valEbx, valEcx, valEdx);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setCPUIDLeaf(
            [in] unsigned long id,
            [in] unsigned long valEax,
            [in] unsigned long valEbx,
            [in] unsigned long valEcx,
            [in] unsigned long valEdx)
     */
    public void setCPUIDLeaf(Long id, Long valEax, Long valEbx, Long valEcx, Long valEdx) {
        try {
            port.iMachineSetCPUIDLeaf(_this, id, valEax, valEbx, valEcx, valEdx);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::removeCPUIDLeaf(
            [in] unsigned long id)
     */
    public void removeCPUIDLeaf(Long id) {
        try {
            port.iMachineRemoveCPUIDLeaf(_this, id);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::removeAllCPUIDLeaves()
     */
    public void removeAllCPUIDLeaves() {
        try {
            port.iMachineRemoveAllCPUIDLeaves(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getHWVirtExProperty(
            [in] HWVirtExPropertyType property,
            [return] boolean value)
     */
    public Boolean getHWVirtExProperty(org.virtualbox_3_2.HWVirtExPropertyType property) {
        try {
            Boolean retVal = port.iMachineGetHWVirtExProperty(_this, property);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setHWVirtExProperty(
            [in] HWVirtExPropertyType property,
            [in] boolean value)
     */
    public void setHWVirtExProperty(org.virtualbox_3_2.HWVirtExPropertyType property, Boolean value) {
        try {
            port.iMachineSetHWVirtExProperty(_this, property, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::saveSettings()
     */
    public void saveSettings() {
        try {
            port.iMachineSaveSettings(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::discardSettings()
     */
    public void discardSettings() {
        try {
            port.iMachineDiscardSettings(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::deleteSettings()
     */
    public void deleteSettings() {
        try {
            port.iMachineDeleteSettings(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::export(
            [in] IAppliance aAppliance,
            [return] IVirtualSystemDescription aDescription)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IVirtualSystemDescription export(com.sun.xml.ws.commons.virtualbox_3_2.IAppliance aAppliance) {
        try {
            String retVal = port.iMachineExport(_this, ((aAppliance == null)?null:aAppliance.getRef()));
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IVirtualSystemDescription(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getSnapshot(
            [in] uuid id,
            [return] ISnapshot snapshot)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot getSnapshot(String id) {
        try {
            String retVal = port.iMachineGetSnapshot(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::findSnapshot(
            [in] wstring name,
            [return] ISnapshot snapshot)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot findSnapshot(String name) {
        try {
            String retVal = port.iMachineFindSnapshot(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setCurrentSnapshot(
            [in] uuid id)
     */
    public void setCurrentSnapshot(String id) {
        try {
            port.iMachineSetCurrentSnapshot(_this, id);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::createSharedFolder(
            [in] wstring name,
            [in] wstring hostPath,
            [in] boolean writable)
     */
    public void createSharedFolder(String name, String hostPath, Boolean writable) {
        try {
            port.iMachineCreateSharedFolder(_this, name, hostPath, writable);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::removeSharedFolder(
            [in] wstring name)
     */
    public void removeSharedFolder(String name) {
        try {
            port.iMachineRemoveSharedFolder(_this, name);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::canShowConsoleWindow(
            [return] boolean canShow)
     */
    public Boolean canShowConsoleWindow() {
        try {
            Boolean retVal = port.iMachineCanShowConsoleWindow(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::showConsoleWindow(
            [return] unsigned long long winId)
     */
    public BigInteger showConsoleWindow() {
        try {
            BigInteger retVal = port.iMachineShowConsoleWindow(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getGuestProperty(
            [in] wstring name,
            [out] wstring value,
            [out] unsigned long long timestamp,
            [out] wstring flags)
     */
    public void getGuestProperty(String name, Holder<String> value, Holder<BigInteger> timestamp, Holder<String> flags) {
        try {
            port.iMachineGetGuestProperty(_this, name, value, timestamp, flags);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getGuestPropertyValue(
            [in] wstring property,
            [return] wstring value)
     */
    public String getGuestPropertyValue(String property) {
        try {
            String retVal = port.iMachineGetGuestPropertyValue(_this, property);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getGuestPropertyTimestamp(
            [in] wstring property,
            [return] unsigned long long value)
     */
    public BigInteger getGuestPropertyTimestamp(String property) {
        try {
            BigInteger retVal = port.iMachineGetGuestPropertyTimestamp(_this, property);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setGuestProperty(
            [in] wstring property,
            [in] wstring value,
            [in] wstring flags)
     */
    public void setGuestProperty(String property, String value, String flags) {
        try {
            port.iMachineSetGuestProperty(_this, property, value, flags);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::setGuestPropertyValue(
            [in] wstring property,
            [in] wstring value)
     */
    public void setGuestPropertyValue(String property, String value) {
        try {
            port.iMachineSetGuestPropertyValue(_this, property, value);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::enumerateGuestProperties(
            [in] wstring patterns,
            [out] wstring name[],
            [out] wstring value[],
            [out] unsigned long long timestamp[],
            [out] wstring flags[])
     */
    public void enumerateGuestProperties(String patterns, Holder<List<String>> name, Holder<List<String>> value, Holder<List<BigInteger>> timestamp, Holder<List<String>> flags) {
        try {
            port.iMachineEnumerateGuestProperties(_this, patterns, name, value, timestamp, flags);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::querySavedThumbnailSize(
            [in] unsigned long screenId,
            [out] unsigned long size,
            [out] unsigned long width,
            [out] unsigned long height)
     */
    public void querySavedThumbnailSize(Long screenId, Holder<Long> size, Holder<Long> width, Holder<Long> height) {
        try {
            port.iMachineQuerySavedThumbnailSize(_this, screenId, size, width, height);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::readSavedThumbnailToArray(
            [in] unsigned long screenId,
            [in] boolean BGR,
            [out] unsigned long width,
            [out] unsigned long height,
            [return] octet data[])
     */
    public List<Short> readSavedThumbnailToArray(Long screenId, Boolean BGR, Holder<Long> width, Holder<Long> height) {
        try {
            Holder<List<Short>> retVal = new Holder<List<Short>>();
            port.iMachineReadSavedThumbnailToArray(_this, screenId, BGR, width, height, retVal);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::querySavedScreenshotPNGSize(
            [in] unsigned long screenId,
            [out] unsigned long size,
            [out] unsigned long width,
            [out] unsigned long height)
     */
    public void querySavedScreenshotPNGSize(Long screenId, Holder<Long> size, Holder<Long> width, Holder<Long> height) {
        try {
            port.iMachineQuerySavedScreenshotPNGSize(_this, screenId, size, width, height);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::readSavedScreenshotPNGToArray(
            [in] unsigned long screenId,
            [out] unsigned long width,
            [out] unsigned long height,
            [return] octet data[])
     */
    public List<Short> readSavedScreenshotPNGToArray(Long screenId, Holder<Long> width, Holder<Long> height) {
        try {
            Holder<List<Short>> retVal = new Holder<List<Short>>();
            port.iMachineReadSavedScreenshotPNGToArray(_this, screenId, width, height, retVal);
            return retVal.value;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::hotPlugCPU(
            [in] unsigned long cpu)
     */
    public void hotPlugCPU(Long cpu) {
        try {
            port.iMachineHotPlugCPU(_this, cpu);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::hotUnplugCPU(
            [in] unsigned long cpu)
     */
    public void hotUnplugCPU(Long cpu) {
        try {
            port.iMachineHotUnplugCPU(_this, cpu);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::getCPUStatus(
            [in] unsigned long cpu,
            [return] boolean attached)
     */
    public Boolean getCPUStatus(Long cpu) {
        try {
            Boolean retVal = port.iMachineGetCPUStatus(_this, cpu);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::queryLogFilename(
            [in] unsigned long idx,
            [return] wstring filename)
     */
    public String queryLogFilename(Long idx) {
        try {
            String retVal = port.iMachineQueryLogFilename(_this, idx);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IMachine::readLog(
            [in] unsigned long idx,
            [in] unsigned long long offset,
            [in] unsigned long long size,
            [return] octet data[])
     */
    public List<Short> readLog(Long idx, BigInteger offset, BigInteger size) {
        try {
            List<Short> retVal = port.iMachineReadLog(_this, idx, offset, size);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
