package org.wso2.store.client;

import java.util.HashMap;

public class Asset {
	
	

	private String name;
	private String type;
	private HashMap<String, String> attributes;
	private String id;

	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public HashMap<String, String> getAttributes() {
		return attributes;
	}
	public void setAttributes(HashMap<String, String> attributes) {
		this.attributes = attributes;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Asset [name=" + name + ", type=" + type + ", attributes="
				+ attributes + "]";
	}
}
