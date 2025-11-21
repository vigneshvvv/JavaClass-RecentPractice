package ObjectCatalogue;

import java.util.ArrayList;
import java.util.List;

public class MainMethod {
	
	public static PostActions generatepostActions(Integer id, String title,  Integer views, Integer userId, List<String> tags, Reactions reactions) {
		PostActions actions = new PostActions();
		actions.setId(id);
		actions.setTitle(title);
		actions.setViews(views);
		actions.setUserId(userId);
		actions.setTags(tags);
		actions.setReactions(reactions);
		return actions;
	}
	
	public static Posts createPosts() {
		Posts posts = new Posts();
		List<PostActions> actions = new ArrayList<PostActions>();
		
		List<String> tags = new ArrayList<String>();
		tags.add("history");
		tags.add("American");
		
		Reactions reactions = new Reactions();
		reactions.setLikes(100);
		reactions.setDislikes(100);
		
		actions.add(generatepostActions(1, "new", 100, 12344, tags, reactions));
		 posts.setPosts(actions);
		 return posts;
	
	}
	
	public static void main(String[] args) {
		 Posts posts =  createPosts();
		 System.out.println(posts);
		
	}

}
