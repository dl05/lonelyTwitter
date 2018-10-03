/**
 * Sad Class extends Mood
 * Created by lipton on 9/18/18.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Sad creates a sad mood
 * Gives it sad message
 */
public class Sad extends Mood {
    private String message;

    Sad() {
        // Need to initialize everything, set everything that exists for that object
        this.message = "I am sad...";    // this is like self in python
    }

    /**
     * Gets Mood
     * @return this.message
     */
    public String getMood() {return this.message;}
}
