package service;

import java.util.Objects;

import dao.HibernatePostDao;
import dao.PostDao;
import persistence.Post;

public class PostServiceImpl implements PostService {
	
	private PostDao postDao;
	
	public PostServiceImpl() {
		postDao = new HibernatePostDao();
	}
	
	@Override
	public Post get(int postId) {
		return postDao.get(postId);
	}
	
	@Override
	public void save(Post post) {
		Objects.requireNonNull(post, "post should not be null");
		postDao.save(post);
	}
	
}
