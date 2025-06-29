package dao;

import persistence.Post;

public interface PostDao {

	/**
	 * Get post by id
	 * 
	 * @param postId the postId
	 */
	Post get(int postId);

	/**
	 * Save new post
	 * 
	 * @param post the post
	 */
	void save(Post post);

}
