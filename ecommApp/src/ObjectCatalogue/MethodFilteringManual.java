package ObjectCatalogue;

import java.util.ArrayList;
import java.util.List;

public class MethodFilteringManual {
	
	public static void main(String[] args) {
		
		PostActions actions = new PostActions();
		actions.setId(1);
		actions.setTitle("MotivationTile");
		actions.setUserId(1213);
		actions.setViews(1000);
		
		PostActions actions1 = new PostActions();
		actions1.setId(2);
		actions1.setTitle("sdfdfadc");
		actions1.setUserId(1213);
		actions1.setViews(1000);
		PostActions actions2 = new PostActions();
		actions2.setId(3);
		actions2.setTitle("scfdcS");
		actions2.setUserId(1213);
		actions2.setViews(100000);
		
		List<PostActions> postList = new ArrayList<PostActions>();
		postList.add(actions2);
		postList.add(actions1);
		postList.add(actions);
		
		List<String> titles = new ArrayList<String>();
		
		for(PostActions actions3: postList) {
			if(actions3.getViews() == 1000) {
				titles.add(actions3.getTitle());	
			}
		}
		
		System.out.println(titles);
		
		
	}

}
