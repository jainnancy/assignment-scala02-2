package edu.knoldus

import org.apache.log4j.Logger

class Blogger {
  val log = Logger.getLogger(this.getClass)
  val random = new scala.util.Random

  def favouriteTechnology(blogList: Map[String, Int], numberOfBlogs: Int): String = {

    numberOfBlogs match {
      case x if x > 0 => {
        val technology = random.shuffle(blogList.keys).head
        log.info(s"\nBlogged on $technology ")
        val updatedList = blogList + (technology -> (blogList.get(technology).get + 1))
        favouriteTechnology(updatedList, numberOfBlogs - 1)
      }
      case x if x == 0 => {
        val maximum = blogList.valuesIterator.max
        val favourite = blogList.find({ case (k, v) => v == maximum })
        s"\nFavourite technology is ${favourite.get._1}"
      }
    }
  }

}
