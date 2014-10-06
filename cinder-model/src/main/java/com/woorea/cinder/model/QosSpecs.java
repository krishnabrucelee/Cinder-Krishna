package com.woorea.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author developer
 */
public class QosSpecs implements Iterable<Volume>, Serializable{

     @JsonProperty("QosSpecs")
	private List<Volume> name;

	
	public List<Volume> getName() {
		return name;
	}
	
	@Override
	public Iterator<Volume> iterator() {
		return name.iterator();
	}
    
    private String specs;

    private String availability;

    private String numberOfFailures;

    private String consumer;

    private String links;
    
    private String id; 
    
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getNumberOfFailures() {
        return numberOfFailures;
    }

    public void setNumberOfFailures(String numberOfFailures) {
        this.numberOfFailures = numberOfFailures;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QosSpecs{" + "name=" + name + ", specs=" + specs + ", availability=" + availability + ", numberOfFailures=" + numberOfFailures + ", consumer=" + consumer + ", links=" + links + ", id=" + id + '}';
    }

    
    
}
