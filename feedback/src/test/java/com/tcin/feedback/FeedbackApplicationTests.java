package com.tcin.feedback;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tcin.feedback.domain.Comment;
import com.tcin.feedback.domain.ResponseInfo;
import com.tcin.feedback.service.CommentService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackApplicationTests {

	@Autowired
	CommentService commentService;

	@Test
	public void contextLoads() {
	}

}
