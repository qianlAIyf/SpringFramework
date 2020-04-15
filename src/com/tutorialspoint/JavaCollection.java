package com.tutorialspoint;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	//a setter method to set List
	public void setAddressList(List adList) {
		this.addressList = adList;
	}
	
	//print and returns all the elements of the list
	public List getAddressList() {
		System.out.println("List Elements: " + addressList);
		return addressList;
	}
	
	
}
