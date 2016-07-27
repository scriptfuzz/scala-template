package main.lloyd.twitte

import twitter4j.TwitterFactory

/**
  * Created by jdiaz on 7/25/16.
  */
trait Bot {
  // Post a new tweet
  def tweet(tweet: Tweet): Tweet
  // Reply to a tweet with another tweet
  def reply(tweet: Tweet, user: String): Tweet
  // On follow account event
  def onFollow(user: String): Tweet
  // On favorite
  def onFavorite(tweet: Tweet, user: String): Tweet
}

case class Tweet(author: String, body: String)

trait TwitterInstance {
  val twitter = TwitterFactory.getSingleton
}

class Lloyd extends Bot with TwitterInstance {
  // Post a new tweet
  override def tweet(tweet: Tweet): Tweet = {
    val status =  twitter.updateStatus(tweet.body)
    println("Just tweeted: "+status.getText)
    new Tweet(status.getUser.toString, status.getText)
  }

  // On follow account event
  override def onFollow(user: String): Tweet = ???

  // Reply to a tweet
  override def reply(tweet: Tweet, user: String): Tweet = ???

  // On favorite
  override def onFavorite(tweet: Tweet, user: String): Tweet = ???
}

object Main {
  def main(args: Array[String]) {
    val lloyd = new Lloyd()
    println("Starting Lloyd...")
    val t = lloyd.tweet(new Tweet("Lloyd","Hello, World"))
    println("Recieved t: "+t)
  }
}


