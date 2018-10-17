package ca.ualberta.cs.lonelytwitter;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet) {
        if (tweets.contains(tweet))
            throw new IllegalArgumentException("This Tweet Already Exists in the list!");
        else {
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet) {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index) {
        return tweets.get(index);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public ArrayList<Tweet> getTweets(){
        return tweets;
    }

    public int getCount(){
        return tweets.size();
    }

}
