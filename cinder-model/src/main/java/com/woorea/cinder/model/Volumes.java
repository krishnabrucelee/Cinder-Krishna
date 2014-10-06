package com.woorea.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
/**
 *
 * @author developer
 */
public class Volumes implements Iterable<Volume>, Serializable {
        /**
	 * @return id
	 */
	@JsonProperty("Volumes")
	private List<Volume> id;

	
	public List<Volume> getId() {
		return id;
	}
	
	@Override
	public Iterator<Volume> iterator() {
		return id.iterator();
	}
	
      
        private String name;
        
        private String extra_specs;
         
        private String capabilities;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtra_specs() {
        return extra_specs;
    }

    public void setExtra_specs(String extra_specs) {
        this.extra_specs = extra_specs;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }
        
        
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Volumes{" + "id=" + id + ", name=" + name + ", extra_specs=" + extra_specs + ", capabilities=" + capabilities + '}';
    }
	
}

