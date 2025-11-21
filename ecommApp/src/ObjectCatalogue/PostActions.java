package ObjectCatalogue;

import java.util.List;

public class PostActions {
	
	private String title;
	private Integer views;
	List<String> tags;
	Reactions reactions;
	private Integer userId;
	
	private Integer id;
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
	public Integer getViews() {
		return views;
	}
	public void setViews(Integer views) {
		this.views = views;
	}
	public List<String> getTags() {
		return tags;
	}
	public void setTags(List<String> tags) {
		this.tags = tags;
	}
	public Reactions getReactions() {
		return reactions;
	}
	public void setReactions(Reactions reactions) {
		this.reactions = reactions;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "PostActions [title=" + title + ", views=" + views + ", tags=" + tags + ", reactions=" + reactions
				+ ", userId=" + userId + ", id=" + id + "]";
	}

}
