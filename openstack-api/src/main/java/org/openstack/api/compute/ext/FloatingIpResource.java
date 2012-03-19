package org.openstack.api.compute.ext;

import org.openstack.api.common.Resource;
import org.openstack.model.compute.NovaFloatingIp;

/**
 * Keypair Support
 * 
 * @author sp
 *
 */
public class FloatingIpResource extends Resource {

	public NovaFloatingIp show() {
		return resource().get(NovaFloatingIp.class);	
	}
	
	public void delete() {
		 resource().delete();	
	}

}