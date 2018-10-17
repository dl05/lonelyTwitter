package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

public class TweetListTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));
    }

    public void testAddDuplicateTweet(){
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("added");
        tweetList.add(tweet);

        assertTrue(tweetList.hasTweet(tweet));

        tweetList.add(tweet);
        tweetList.delete(tweet);
        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testHasTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("Hello");
        assertFalse(tweetList.hasTweet(tweet));
        tweetList.add(tweet);
        Tweet retrievedTweet = tweetList.getTweet(0);

        assertEquals(retrievedTweet.getMessage(), tweet.getMessage());
        assertEquals(retrievedTweet.getDate(), tweet.getDate());
    }

    public void testDeleteTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("delete");

        tweetList.add(tweet);
        tweetList.delete(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetTweet() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("first");

        tweetList.add(tweet);

        assertFalse(tweetList.hasTweet(tweet));
    }

    public void testGetTweets() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("first");

        tweetList.add(tweet);

        Tweet tweet2 = new NormalTweet("second");
        tweetList.add(tweet2);


        assertEquals(tweet, tweetList.getTweets().get(0));
        assertEquals(tweet2, tweetList.getTweets().get(1));
    }

    public void testGetCount() {
        TweetList tweetList = new TweetList();
        Tweet tweet = new NormalTweet("first");
        Tweet tweet2 = new NormalTweet("Second");

        tweetList.add(tweet);
        tweetList.add(tweet2);

        assertEquals(tweetList.getCount(), 2);
    }
}
