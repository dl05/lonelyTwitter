/**
 * Throws exception if tweet is too long
 * Created by lipton on 9/18/18.
 */

package ca.ualberta.cs.lonelytwitter;

/**
 * Throw the exception if Tweet is too long
 */
public class TweetTooLongException extends Exception {

    //create constructor for the class
    TweetTooLongException() {
        super("The message is too long, make it less than 140");
        //super calls the methods in the base class
    }
}
