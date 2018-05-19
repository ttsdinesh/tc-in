package com.tcin.feedback.service;

import org.springframework.stereotype.Service;

import com.tcin.feedback.domain.Comment;
import com.tcin.feedback.domain.ObjectionalContentCache;
import com.tcin.feedback.domain.ResponseInfo;
import com.tcin.feedback.exception.ObjectionalContentException;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
@Service
public class CommentService {

	/**
	 * Persist the comment after validation
	 * 
	 * @param comment
	 *            Comment object from the API
	 * @return ResponseInfo Information about the response
	 * @throws ObjectionalContentException
	 *             If the comment contains any objectional content
	 */

	public ResponseInfo persistComment(Comment comment) {
		try {
			validateComment(comment);
			// TODO persist comment
			return new ResponseInfo("COMMENT_POSTED", System.currentTimeMillis(), "Comment posted successfully");
		} catch (ObjectionalContentException ex) {
			return new ResponseInfo("OBJECTIONAL_CONTENT", System.currentTimeMillis(),
					"Objectional content found in the post. The objectional word is :" + ex.getObjectionalWord());
		}

	}

	private void validateComment(Comment comment) throws ObjectionalContentException {
		String commentString = comment.getComment();
		if (ObjectionalContentCache.getObjectionContentList().contains(commentString))
			throw new ObjectionalContentException(commentString);

		for (String commentWord : commentString.split("\\s+"))
			if (ObjectionalContentCache.getObjectionContentList().contains(commentWord))
				throw new ObjectionalContentException(commentWord);
	}

}
