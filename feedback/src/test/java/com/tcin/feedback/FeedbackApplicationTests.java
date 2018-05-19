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

	@Test
	public void testContentPositive() {
		long millis = System.currentTimeMillis();
		ResponseInfo actual = commentService.persistComment(new Comment("This is a good product", "123", millis));
		ResponseInfo expected = new ResponseInfo("COMMENT_POSTED", millis, "Comment posted successfully");
		Assert.assertEquals(expected.toString(), actual.toString());
	}

	@Test
	public void testContentNegative() {
		long millis = System.currentTimeMillis();
		ResponseInfo actual = commentService.persistComment(new Comment("This is a good product. XXX", "123", millis));
		ResponseInfo expected = new ResponseInfo("OBJECTIONAL_CONTENT", millis,
				"Objectional content found in the post. The objectional word is :" + "XXX");
		Assert.assertEquals(expected.toString(), actual.toString());
	}

}
