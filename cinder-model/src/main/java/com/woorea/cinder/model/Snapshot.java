package com.woorea.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author developer
 */
public class Snapshot implements Iterable<Volume>, Serializable {

    @JsonProperty("Snapshot")
	private List<Volume> name;

	
	public List<Volume> getName() {
		return name;
	}
	
	@Override
	public Iterator<Volume> iterator() {
		return name.iterator();
	}
    
   
    private String description;

    private String volume_id;

    private String force;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVolume_id() {
        return volume_id;
    }

    public void setVolume_id(String volume_id) {
        this.volume_id = volume_id;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }

    @Override
    public String toString() {
        return "Snapshot{" + "name=" + name + ", description=" + description + ", volume_id=" + volume_id + ", force=" + force + '}';
    }

    
    
}
