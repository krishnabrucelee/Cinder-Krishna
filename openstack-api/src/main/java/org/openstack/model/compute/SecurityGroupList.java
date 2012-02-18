package org.openstack.model.compute;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.google.common.collect.Lists;

@XmlRootElement(name = "security_groups")
@XmlAccessorType(XmlAccessType.NONE)
public class SecurityGroupList implements Serializable, Iterable<SecurityGroup> {

	@XmlElement(name = "security_group")
	private List<SecurityGroup> list = new ArrayList<SecurityGroup>();

	public List<SecurityGroup> getList() {
		if (list == null) {
			list = Lists.newArrayList();
		}
		return list;
	}

	@Override
	public Iterator<SecurityGroup> iterator() {
		return list.iterator();
	}

}
