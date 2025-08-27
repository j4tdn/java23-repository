package persistance;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_Student")
public class Student {
	
	@Id
	@Column(name = "T01_Student_Id")
	private Integer id;
	
	@Column(name = "T01_Name")
	private String name;
	
	@Column(name = "T01_Gender")
	private String gender;
	
	
	@Column(name = "T01_class_Id")
	private Integer class_Id;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "T01_Student_Id", referencedColumnName = "T03_Class_Id")
//	
	
	// @ManyToOne: mặc định EAGER FETCH
	
	
	/**
	 * Empty constructor
	 */
	public Student() {
	}
	
	/**
	 * Required constructor with full parameters
	 */
	
	public Student(Integer id, String name, String gender, Integer class_Id) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.class_Id = class_Id;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getClass_Id() {
		return class_Id;
	}

	public void setClass_Id(Integer class_Id) {
		this.class_Id = class_Id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Student that)) {
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
		return "Item [id=" + id + ", name=" + name + "]";
	}
}