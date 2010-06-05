
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
 * IWebsessionManager.java
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



import java.net.URL;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import javax.xml.ws.WebServiceException;

class PortPool
{
    private final static String wsdlFile = "vboxwebService_3_2.wsdl";

 
    private Map<VboxPortType, Integer> known;
    private boolean initStarted;
    private VboxService svc;

    PortPool(boolean usePreinit)
    {
        known = new HashMap<VboxPortType, Integer>();

        if (usePreinit)
        {
           new Thread(new Runnable()
              {
                 public void run()
                 {
                    // need to sync on something else but 'this'
                    synchronized (known)
                    {
                      initStarted = true;
                      known.notify();
                    }

                    preinit();
                 }
               }).start();

           synchronized (known)
           {
              while (!initStarted)
              {
                 try {
                   known.wait();
                 } catch (InterruptedException e) {
                 break;
                 }
              }
           }
        }
    }

    private synchronized void preinit()
    {
        VboxPortType port = getPort();
        releasePort(port);
    }

    synchronized VboxPortType getPort()
    {
        VboxPortType port = null;
        int ttl = 0;

        for (VboxPortType cur: known.keySet())
        {
            int value = known.get(cur);
            if ((value & 0x10000) == 0)
            {
                port = cur;
                ttl = value & 0xffff;
                break;
            }
        }

        if (port == null)
        {
            if (svc == null) {
                URL wsdl = PortPool.class.getClassLoader().getResource(wsdlFile);
                if (wsdl == null)
                    throw new LinkageError(wsdlFile+" not found, but it should have been in the jar");
                svc = new VboxService(wsdl,
                                      new QName("http://www.virtualbox.org/Service",
                                                "vboxService"));
            }
            port = svc.getVboxServicePort();
            // reuse this object 0x10 times
            ttl = 0x10;
        }
        // mark as used
        known.put(port, new Integer(0x10000 | ttl));
        return port;
    }

    synchronized void releasePort(VboxPortType port)
    {
        Integer val = known.get(port);
        if (val == null || val == 0)
        {
            // know you not
            return;
        }

        int v = val;
        int ttl = v & 0xffff;
        // decrement TTL, and throw away port if used too much times
        if (--ttl <= 0)
        {
            known.remove(port);
        }
        else
        {
            v = ttl; // set new TTL and clear busy bit
            known.put(port, v);
        }
    }
}

public class IWebsessionManager {

    private static PortPool pool = new PortPool(true);
    protected VboxPortType port;

    public IWebsessionManager(URL url)
    {
        connect(url);
    }

    public IWebsessionManager(String url)
    {
        connect(url);
    }

    public IWebsessionManager(URL url, Map<String, Object> requestContext, Map<String, Object> responseContext)
    {
        connect(url.toExternalForm(), requestContext, responseContext);
    }

    public IWebsessionManager(String url, Map<String, Object> requestContext, Map<String, Object> responseContext)
    {
        connect(url, requestContext, responseContext);
    }

    public void connect(URL url)
    {
        connect(url.toExternalForm());
    }

    public void connect(String url)
    {
        this.port = pool.getPort();

         try {
          ((BindingProvider)port).getRequestContext().
                 put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
         }  catch (Throwable t) {
             if (this.port != null)
                pool.releasePort(this.port);
             // we have to throw smth derived from RuntimeException
             throw new WebServiceException(t);
          }
    }

    public void connect(String url, Map<String, Object> requestContext, Map<String, Object> responseContext)
    {
         this.port = pool.getPort();

         try {
           ((BindingProvider)port).getRequestContext();
           if (requestContext != null)
               ((BindingProvider)port).getRequestContext().putAll(requestContext);

           if (responseContext != null)
               ((BindingProvider)port).getResponseContext().putAll(responseContext);

           ((BindingProvider)port).getRequestContext().
                put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, url);
          } catch (Throwable t) {
             if (this.port != null)
                pool.releasePort(port);
             // we have to throw smth derived from RuntimeException
             throw new WebServiceException(t);
          }
    }


    public void disconnect(IVirtualBox refIVirtualBox)
    {
        try {
           logoff(refIVirtualBox);
        } finally {
           if (this.port != null) {
             pool.releasePort(this.port);
             this.port = null;
           }
        }
    }

    public void cleanupUnused()
    {
       System.gc();
       Runtime.getRuntime().runFinalization();
    }

    /* method IWebsessionManager::logon(
            [in] wstring username,
            [in] wstring password,
            [return] IVirtualBox return)
     */
    public IVirtualBox logon(String username, String password) {
        try {
            String retVal = port.iWebsessionManagerLogon(username, password);
            return new IVirtualBox(retVal, port);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IWebsessionManager::getSessionObject(
            [in] IVirtualBox refIVirtualBox,
            [return] ISession return)
     */
    public ISession getSessionObject(IVirtualBox refIVirtualBox) {
        try {
            String retVal = port.iWebsessionManagerGetSessionObject(((refIVirtualBox == null)?null:refIVirtualBox.getRef()));
            return new ISession(retVal, port);
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }

    /* method IWebsessionManager::logoff(
            [in] IVirtualBox refIVirtualBox)
     */
    public void logoff(IVirtualBox refIVirtualBox) {
        try {
            port.iWebsessionManagerLogoff(((refIVirtualBox == null)?null:refIVirtualBox.getRef()));
        } catch (InvalidObjectFaultMsg e) {
            throw new WebServiceException(e);
        } catch (RuntimeFaultMsg e) {
            throw new WebServiceException(e);
        }
    }
}
