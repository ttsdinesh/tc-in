package com.tcin.feedback.domain;

import java.util.Set;
import java.util.HashSet;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
public class ObjectionalContentCache {

	private static Set<String> objectionalContentList;

	static {
		objectionalContentList = new HashSet<String>();
		objectionalContentList.add("XXX");
		objectionalContentList.add("ABC");
	}

	public static Set<String> getObjectionContentList() {
		return objectionalContentList;
	}

}
