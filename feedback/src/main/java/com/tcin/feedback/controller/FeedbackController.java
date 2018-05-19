package com.tcin.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcin.feedback.domain.Comment;
import com.tcin.feedback.domain.ResponseInfo;
import com.tcin.feedback.service.CommentService;

import io.swagger.annotations.ApiOperation;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
@RestController
// @RequestMapping(value = "feedback/v1")
public class FeedbackController {

	@Autowired
	CommentService commentService;

	@RequestMapping(value = "/comment", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(notes = "API to validate and post the comment", value = "API to validate and post the comment. Return proper message on finding any objectional content", response = ResponseInfo.class)
	@ResponseBody
	public ResponseEntity<ResponseInfo> searchMovies(@RequestBody final Comment comment) {
		return ResponseEntity.ok(commentService.persistComment(comment));
	}
}
