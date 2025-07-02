<<<<<<< HEAD
=======

>>>>>>> 5c1e4eb (lesson18-jpahibernate-testing 02.07.2025)
package dao;

import persistence.Post;

public class HibernatePostDao extends GenericDao<Post> implements PostDao {

	@Override
	public Post get(int postId) {
		return openSession().get(getEntityClass(), postId);
	}
	
	@Override
	public void save(Post post) {
		System.out.println("LOGGING >> saving new post(id = " + post.getTitle() + ")");

		execute(session -> session.persist(post));

		System.out.println("LOGGING >> finished");
	}

	@Override
	Class<Post> getEntityClass() {
		return Post.class;
	}

}
