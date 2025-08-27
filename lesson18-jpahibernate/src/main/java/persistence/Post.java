package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "t23_post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C23_ID")
	private Integer id;

	@Column(name = "C23_TITLE")
	private String title;
	
	@ManyToMany(cascade = CascadeType.PERSIST)
	@JoinTable(
			name = "t24_post_tag",
			joinColumns = @JoinColumn(name = "C24_POST_ID", referencedColumnName = "C23_ID"),
			inverseJoinColumns = @JoinColumn(name = "C24_TAG_ID", referencedColumnName = "C25_ID")
	)
	private List<Tag> tags = new ArrayList<>();
	
	/**
	 * Empty constructor
	 */
	public Post() {
	}
	
	/**
	 * Constructor
	 * 
	 * @param id    the id
	 * @param title the title
	 */
	public Post(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<Tag> getTags() {
		return tags;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	/* Helper methods */
	public void addTag(Tag tag) {
        tags.add(tag);
        tag.getPosts().add(this);
    }
 
    public void removeTag(Tag tag) {
        tags.remove(tag);
        tag.getPosts().remove(this);
    }
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Post that)) {
			return false;
		}
		
		return Objects.equals(getId(), that.getId());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + "]";
	}
}