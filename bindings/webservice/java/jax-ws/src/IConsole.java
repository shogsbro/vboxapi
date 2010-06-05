
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
 * IConsole.java
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
public class IConsole extends IUnknown {

    public static IConsole cast(IUnknown other) {
        return new IConsole(other.getRef(), other.getRemoteWSPort());
    }

    public IConsole(String _this, VboxPortType port) {
        super(_this,port);
    }

    // read-only attribute IConsole::machine of type IMachine
    public com.sun.xml.ws.commons.virtualbox_3_2.IMachine getMachine() {
        try {
            String retVal = port.iConsoleGetMachine(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMachine(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::state of type MachineState
    public org.virtualbox_3_2.MachineState getState() {
        try {
            org.virtualbox_3_2.MachineState retVal = port.iConsoleGetState(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::guest of type IGuest
    public com.sun.xml.ws.commons.virtualbox_3_2.IGuest getGuest() {
        try {
            String retVal = port.iConsoleGetGuest(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IGuest(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::keyboard of type IKeyboard
    public com.sun.xml.ws.commons.virtualbox_3_2.IKeyboard getKeyboard() {
        try {
            String retVal = port.iConsoleGetKeyboard(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IKeyboard(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::mouse of type IMouse
    public com.sun.xml.ws.commons.virtualbox_3_2.IMouse getMouse() {
        try {
            String retVal = port.iConsoleGetMouse(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IMouse(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::display of type IDisplay
    public com.sun.xml.ws.commons.virtualbox_3_2.IDisplay getDisplay() {
        try {
            String retVal = port.iConsoleGetDisplay(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IDisplay(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // Skipping attribute IMachineDebugger for it is of suppressed type IMachineDebugger

    // read-only attribute IConsole::USBDevices of type IUSBDevice
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice> getUSBDevices() {
        try {
            List<String> retVal = port.iConsoleGetUSBDevices(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::remoteUSBDevices of type IHostUSBDevice
    public List<com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice> getRemoteUSBDevices() {
        try {
            List<String> retVal = port.iConsoleGetRemoteUSBDevices(_this);
            return Helper.wrap(com.sun.xml.ws.commons.virtualbox_3_2.IHostUSBDevice.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::sharedFolders of type ISharedFolder
    public List<com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder> getSharedFolders() {
        try {
            List<org.virtualbox_3_2.ISharedFolder> retVal = port.iConsoleGetSharedFolders(_this);
            return Helper.wrap2(com.sun.xml.ws.commons.virtualbox_3_2.ISharedFolder.class, org.virtualbox_3_2.ISharedFolder.class, port, retVal);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    // read-only attribute IConsole::remoteDisplayInfo of type IRemoteDisplayInfo
    public com.sun.xml.ws.commons.virtualbox_3_2.IRemoteDisplayInfo getRemoteDisplayInfo() {
        try {
            org.virtualbox_3_2.IRemoteDisplayInfo retVal = port.iConsoleGetRemoteDisplayInfo(_this);
            return (retVal != null) ? new com.sun.xml.ws.commons.virtualbox_3_2.IRemoteDisplayInfo(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::powerUp(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress powerUp() {
        try {
            String retVal = port.iConsolePowerUp(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::powerUpPaused(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress powerUpPaused() {
        try {
            String retVal = port.iConsolePowerUpPaused(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::powerDown(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress powerDown() {
        try {
            String retVal = port.iConsolePowerDown(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::reset()
     */
    public void reset() {
        try {
            port.iConsoleReset(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::pause()
     */
    public void pause() {
        try {
            port.iConsolePause(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::resume()
     */
    public void resume() {
        try {
            port.iConsoleResume(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::powerButton()
     */
    public void powerButton() {
        try {
            port.iConsolePowerButton(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::sleepButton()
     */
    public void sleepButton() {
        try {
            port.iConsoleSleepButton(_this);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::getPowerButtonHandled(
            [return] boolean handled)
     */
    public Boolean getPowerButtonHandled() {
        try {
            Boolean retVal = port.iConsoleGetPowerButtonHandled(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::getGuestEnteredACPIMode(
            [return] boolean entered)
     */
    public Boolean getGuestEnteredACPIMode() {
        try {
            Boolean retVal = port.iConsoleGetGuestEnteredACPIMode(_this);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::saveState(
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress saveState() {
        try {
            String retVal = port.iConsoleSaveState(_this);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::adoptSavedState(
            [in] wstring savedStateFile)
     */
    public void adoptSavedState(String savedStateFile) {
        try {
            port.iConsoleAdoptSavedState(_this, savedStateFile);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::forgetSavedState(
            [in] boolean remove)
     */
    public void forgetSavedState(Boolean remove) {
        try {
            port.iConsoleForgetSavedState(_this, remove);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::getDeviceActivity(
            [in] DeviceType type,
            [return] DeviceActivity activity)
     */
    public org.virtualbox_3_2.DeviceActivity getDeviceActivity(org.virtualbox_3_2.DeviceType type) {
        try {
            org.virtualbox_3_2.DeviceActivity retVal = port.iConsoleGetDeviceActivity(_this, type);
            return retVal;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::attachUSBDevice(
            [in] uuid id)
     */
    public void attachUSBDevice(String id) {
        try {
            port.iConsoleAttachUSBDevice(_this, id);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::detachUSBDevice(
            [in] uuid id,
            [return] IUSBDevice device)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice detachUSBDevice(String id) {
        try {
            String retVal = port.iConsoleDetachUSBDevice(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::findUSBDeviceByAddress(
            [in] wstring name,
            [return] IUSBDevice device)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice findUSBDeviceByAddress(String name) {
        try {
            String retVal = port.iConsoleFindUSBDeviceByAddress(_this, name);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::findUSBDeviceById(
            [in] uuid id,
            [return] IUSBDevice device)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice findUSBDeviceById(String id) {
        try {
            String retVal = port.iConsoleFindUSBDeviceById(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IUSBDevice(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::createSharedFolder(
            [in] wstring name,
            [in] wstring hostPath,
            [in] boolean writable)
     */
    public void createSharedFolder(String name, String hostPath, Boolean writable) {
        try {
            port.iConsoleCreateSharedFolder(_this, name, hostPath, writable);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::removeSharedFolder(
            [in] wstring name)
     */
    public void removeSharedFolder(String name) {
        try {
            port.iConsoleRemoveSharedFolder(_this, name);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::takeSnapshot(
            [in] wstring name,
            [in] wstring description,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress takeSnapshot(String name, String description) {
        try {
            String retVal = port.iConsoleTakeSnapshot(_this, name, description);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::deleteSnapshot(
            [in] uuid id,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress deleteSnapshot(String id) {
        try {
            String retVal = port.iConsoleDeleteSnapshot(_this, id);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::restoreSnapshot(
            [in] ISnapshot snapshot,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress restoreSnapshot(com.sun.xml.ws.commons.virtualbox_3_2.ISnapshot snapshot) {
        try {
            String retVal = port.iConsoleRestoreSnapshot(_this, ((snapshot == null)?null:snapshot.getRef()));
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IConsole::teleport(
            [in] wstring hostname,
            [in] unsigned long tcpport,
            [in] wstring password,
            [in] unsigned long maxDowntime,
            [return] IProgress progress)
     */
    public com.sun.xml.ws.commons.virtualbox_3_2.IProgress teleport(String hostname, Long tcpport, String password, Long maxDowntime) {
        try {
            String retVal = port.iConsoleTeleport(_this, hostname, tcpport, password, maxDowntime);
            return (retVal.length() > 0) ? new com.sun.xml.ws.commons.virtualbox_3_2.IProgress(retVal, port) : null;
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
