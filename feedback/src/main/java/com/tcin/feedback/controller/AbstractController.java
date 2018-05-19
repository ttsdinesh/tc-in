package com.tcin.feedback.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
@RestController
public abstract class AbstractController {
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String test() {
		return "This is a test";
	}
}
