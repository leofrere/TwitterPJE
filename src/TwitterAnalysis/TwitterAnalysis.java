package TwitterAnalysis;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.Status;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterAnalysis {
	
	public String request(String aString) throws TwitterException {
		String str = "";
		String newLine = System.getProperty("line.separator");
		
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("Bn52Swi1pNGZhUShyapLYFoHr")
		  .setOAuthConsumerSecret("6cojrmleSZq0GX969VFF87jVl45608aLlBN7809oDGI7HchLb4")
		  .setOAuthAccessToken("1078385700679102464-XJy4MJTR7MmtlRTDh1m63OlOYN8ZiT")
		  .setOAuthAccessTokenSecret("IBnXYOaT4VjtrTQLy2u7wHgp1Wu5ZshvvdhNAPpbPQUE6");
		
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
	    Query query = new Query(aString);
	    QueryResult result = twitter.search(query);
	    for (Status status : result.getTweets()) {
	    	str = str + "@" + status.getUser().getScreenName() + ":" + status.getText() + newLine;
	        System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	    }
	    System.out.println(str);
	    return str;
	}

	
}
