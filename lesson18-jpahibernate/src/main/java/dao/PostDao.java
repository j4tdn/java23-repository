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

<<<<<<< HEAD
}
=======
}
>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
