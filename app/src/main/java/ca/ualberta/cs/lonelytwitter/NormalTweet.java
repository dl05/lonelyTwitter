package ca.ualberta.cs.lonelytwitter;

/**
 * Class NormalTweet extends Tweet
 * Created by lipton on 9/25/18.
 */

public class NormalTweet extends Tweet {
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    /**
     * @return false
     */
    public Boolean isImportant() {
        return false;
    }
}
