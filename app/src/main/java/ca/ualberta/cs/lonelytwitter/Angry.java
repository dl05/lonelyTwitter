/**
 * Angry extends Mood
 * Created by lipton on 9/18/18.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Angry creates an angry mood with a message
 */
public class Angry extends Mood {
    private String message;

    Angry() {
        // Need to initialize everything, set everything that exists for that object
        this.message = "I am angry";    // this is like self in python
    }

    @Override
    public String getMood() {return this.message;}



}
