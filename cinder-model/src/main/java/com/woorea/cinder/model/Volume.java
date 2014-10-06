package com.woorea.cinder.model;

/**
 *
 * @author
 */
public class Volume {

    private String availability_zone;

    private String source_volid;

    private String display_description;

    private String snapshot_id;

    private String size;

    private String display_name;

    private String imageRef;

    private String volume_type;

    private String metadata;

    public String getAvailability_zone() {
        return availability_zone;
    }

    public void setAvailability_zone(String availability_zone) {
        this.availability_zone = availability_zone;
    }

    public String getSource_volid() {
        return source_volid;
    }

    public void setSource_volid(String source_volid) {
        this.source_volid = source_volid;
    }

    public String getDisplay_description() {
        return display_description;
    }

    public void setDisplay_description(String display_description) {
        this.display_description = display_description;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public String getVolume_type() {
        return volume_type;
    }

    public void setVolume_type(String volume_type) {
        this.volume_type = volume_type;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Volume{" + "availability_zone=" + availability_zone + ", source_volid=" + source_volid + ", display_description=" + display_description + ", snapshot_id=" + snapshot_id + ", size=" + size + ", display_name=" + display_name + ", imageRef=" + imageRef + ", volume_type=" + volume_type + ", metadata=" + metadata + '}';
    }

}
