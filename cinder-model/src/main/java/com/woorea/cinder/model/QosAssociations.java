
package com.woorea.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author sony
 */
public class QosAssociations implements Iterable<QosSpecs>, Serializable{
    
    @JsonProperty("QosAssociations")
	private List<QosSpecs> list;

	
	public List<QosSpecs> getId() {
            return list;
	}
	
        public List<QosSpecs> getName() {
            return list;
	}
        
	@Override
	public Iterator<QosSpecs> iterator() {
		return list.iterator();
	}

    
    
}
