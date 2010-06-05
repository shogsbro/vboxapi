/** @file
 *
 * VBox Remote Desktop Protocol:
 * External Authentication Library:
 * Simple Authentication.
 */

/*
 * Copyright (C) 2006-2007 Oracle Corporation
 *
 * Oracle Corporation confidential
 * All rights reserved
 */

#include <stdlib.h>
#include <string.h>

#include <VBox/VRDPAuth.h>

extern "C"
#if defined(_MSC_VER)
__declspec(dllexport)
#endif
VRDPAuthResult VRDPAUTHCALL VRDPAuth (PVRDPAUTHUUID pUuid,
                                      VRDPAuthGuestJudgement guestJudgement,
                                      const char *szUser,
                                      const char *szPassword,
                                      const char *szDomain)
{
    /* default is failed */
    VRDPAuthResult result = VRDPAuthAccessDenied;

    if (getenv("VBOX_VRDP_AUTH_USER") && getenv("VBOX_VRDP_AUTH_PASSWORD"))
    {

        if (   !strcmp(getenv("VBOX_VRDP_AUTH_USER"), szUser)
            && !strcmp(getenv("VBOX_VRDP_AUTH_PASSWORD"), szPassword))
        {
            result = VRDPAuthAccessGranted;
        }
    }

    return result;
}

/* Verify the function prototype. */
static PVRDPAUTHENTRY gpfnAuthEntry = VRDPAuth;
