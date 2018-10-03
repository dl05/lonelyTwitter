/**
 * Class Mood creates a mood
 * Created by lipton on 9/18/18.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Class Mood assigns a date
 */
public abstract class Mood {
    private Date date;

    Mood() {
        this.date = new Date();
    }


    Mood(Date date) {
        this.date = date;
    }

    public abstract String getMood();

    /**
     * Return the date
     * @return this.date
     */
    public Date getDate() {return this.date;}


}
