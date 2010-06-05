
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
 * IUnknown.java
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

public class IUnknown
{
   protected String _this; /* almost final, could only be set in finalizer */
   protected final  VboxPortType port;

   public IUnknown(String _this, VboxPortType port)
   {
      this._this = _this;
      this.port = port;
   }

   public final String getRef()
   {
      return _this;
   }

   public final VboxPortType getRemoteWSPort()
   {
      return port;
   }

   public synchronized void releaseRemote() throws WebServiceException
   {
      if (_this == null) {
        return;
      }
      try {
          port.iManagedObjectRefRelease(_this);
          _this = null;
      } catch (InvalidObjectFaultMsg e) {
          throw new WebServiceException(e);
      } catch (RuntimeFaultMsg e) {
          throw new WebServiceException(e);
      }
   }

   /*
   protected void finalize()
   {
      try {
         releaseRemote();
      } catch (WebServiceException e) {
      }
   } */

   // may need to support some sort of QueryInterface, to make this class useable
   // not only as common baseclass
}
