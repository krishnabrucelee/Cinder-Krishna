package com.woorea.openstack.cinder;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackClientConnector;
import com.woorea.openstack.nova.api.ExtensionsResource;
import com.woorea.openstack.nova.api.QuotaSetsResource;
import com.woorea.openstack.nova.api.extensions.SnapshotsExtension;
import com.woorea.openstack.nova.api.extensions.VolumesExtension;

/**
 * @author govindon.
 *
 * The class Cinder extends the OpenStackClient class.
 */
public class Cinder extends OpenStackClient {

    /**
     * The instance is created for the ExtensionResouce class.
     *
     * Lists Block Storage API extensions.
     */
    private final ExtensionsResource EXTENSIONS;
    private final SnapshotsExtension SNAPSHOTS;
    /**
     * The instance is created for the VolumesExtension class.
     *
     * A volume is a detachable block storage device. You can think of it as a
     * USB hard drive. You can attach a volume to one instance at a time
     */
    private final VolumesExtension VOLUMES;
 
    /**
     * The instance is created for QuotaSetsResource class.
     *
     * Administrators only, depending on policy settings. View, update, and
     * delete quotas for a tenant
     */
    private final QuotaSetsResource QUOTA_SETS;
 
    /**
     * The instance of OpenStackClientConnector is used to access the Cinder
     * class.
     *
     * @param endpoint the endpoint to set
     * @param connector the connector to set
     */
    public Cinder(String endpoint, OpenStackClientConnector connector) {
        super(endpoint, connector);
        EXTENSIONS = new ExtensionsResource(this);
        SNAPSHOTS = new SnapshotsExtension(this);
        VOLUMES = new VolumesExtension(this);
        QUOTA_SETS = new QuotaSetsResource(this);
    }

    /**
     * @param endpoint the endpoint to set
     */
    public Cinder(String endpoint) {
        this(endpoint, null);
    }

    /**
     * @return the EXTENSIONS
     */
    public ExtensionsResource extensions() {
        return EXTENSIONS;
    }


    /**
     * @return the SNAPSHOTS
     */
    public SnapshotsExtension snapshots() {
        return SNAPSHOTS;
    }

    /**
     * @return the VOLUMES
     */
    public VolumesExtension volumes() {
        return VOLUMES;
    }

    /**
     * @return the QUOTA_SETS
     */
    public QuotaSetsResource quotaSets() {
        return QUOTA_SETS;
    }

}