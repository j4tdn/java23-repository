package view;

import persistence.Post;
import persistence.Tag;
import service.PostService;
import service.PostServiceImpl;
import utils.PrintUtils;

public class Ex04PostView {
	
	private static PostService postService;
	
	static {
		postService = new PostServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("==== Bắt đầu chương trình ====\n");
		
		/*
		 Hibernate: insert into t23_post (C23_TITLE) values (?)
   		 Hibernate: insert into t25_tag (C25_NAME) values (?)
		 Hibernate: insert into t25_tag (C25_NAME) values (?)
		 Hibernate: insert into t24_post_tag (C24_POST_ID,C24_TAG_ID) values (?,?)
		 Hibernate: insert into t24_post_tag (C24_POST_ID,C24_TAG_ID) values (?,?)
		*/
		
		// postService.save(mockPost());
		
		Post post = postService.get(2);
		
		PrintUtils.generate("1. Liệt kê Post có id = 2", post);
		
		PrintUtils.generate("2. Liệt kê Post's Tags có id = 2", post.getTags());
		
		System.out.println("\n==== Kết thúc chương trình ====");
	}
	
	private static Post mockPost() {
		Post post = new Post("Post1: OOP In Advanced");
		Tag tag1 = new Tag("Java");
		Tag tag2 = new Tag("OOP");
		post.addTag(tag1);
		post.addTag(tag2);
		return post;
	}
} 
