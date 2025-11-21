package ObjectCatalogue;

public class Reactions {

	private  Integer likes;

	private Integer dislikes;
	
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public Integer getDislikes() {
		return dislikes;
	}
	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}
	
	@Override
	public String toString() {
		return "Reactions [likes=" + likes + ", dislikes=" + dislikes + "]";
	}

}
