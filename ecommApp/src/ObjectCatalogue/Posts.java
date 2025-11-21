package ObjectCatalogue;

import java.util.List;

public class Posts {
	List<PostActions> posts;



	public List<PostActions> getPosts() {
		return posts;
	}

	public void setPosts(List<PostActions> posts) {
		this.posts = posts;
	}
	@Override
	public String toString() {
		return "Posts [posts=" + posts + "]";
	}

}
