package main.lloyd.twitte

/**
  * Created by jdiaz on 7/25/16.
  */
case class Tweet(author: String, body: String)

trait Bot {
  // Post a new tweet
  def tweet(tweet: Tweet): Boolean
  // Reply to a tweet with another tweet
  def reply(tweet: Tweet, user: String): Tweet
  // On follow account event
  def onFollow(user: String): Tweet
  // On favorite
  def onFavorite(tweet: Tweet, user: String): Tweet
}

class Lloyd extends Bot{
  // Post a new tweet
  override def tweet(tweet: Tweet): Boolean = ???

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
  }
}


