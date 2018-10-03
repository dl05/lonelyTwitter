/**
 * Class NormalTweet extends Tweet
 * Created by lipton on 9/25/18.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Normal Tweet Class
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
