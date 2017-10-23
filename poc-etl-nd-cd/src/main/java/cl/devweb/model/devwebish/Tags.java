package cl.devweb.model.devwebish;

import java.util.Date;


public class Tags {

	/*
	 * table "tags" is kind of enumeration
	 *
	 */
	private long id;
	private String name;
	private String description;
	private long priority;
	private String type;
	private Date created;
	private Date modified;
	private String image;
	private long dealtags_id; // we are going to have this ID here (anti-pattern).


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getPriority() {
		return priority;
	}
	public void setPriority(long priority) {
		this.priority = priority;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getModified() {
		return modified;
	}
	public void setModified(Date modified) {
		this.modified = modified;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public long getDealtags_id() {
		return dealtags_id;
	}
	public void setDealtags_id(long dealtags_id) {
		this.dealtags_id = dealtags_id;
	}


}


