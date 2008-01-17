/**
 *  BlueCove - Java library for Bluetooth
 *  Copyright (C) 2006-2008 Vlad Skarzhevskyy
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  @version $Id$
 */
package com.intel.bluetooth;

import javax.bluetooth.BluetoothStateException;
import javax.bluetooth.DiscoveryListener;
import javax.bluetooth.RemoteDevice;
import javax.bluetooth.UUID;

/**
 * @author vlads
 * 
 */
public interface SearchServicesRunnable {

	/**
	 * Common synchronous method called by SearchServicesThread. Should throw
	 * BluetoothStateException only if it can't start Search
	 */
	public int runSearchServices(SearchServicesThread sst, int[] attrSet, UUID[] uuidSet, RemoteDevice device,
			DiscoveryListener listener) throws BluetoothStateException;

}
