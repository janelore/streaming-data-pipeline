package com.labs1904.hwe.exercises

import scala.math.Ordering.Implicits.seqDerivedOrdering

object ChallengeProblems {
  /*
    1. Define a function that takes in a String and returns that string with no changes
    Write your function below this comment - refer to Challenge Tests to have your test pass
    Params - String
    Returns - String
  */
  def sameString(input: String): String = {
    input: String
  }

  /*
  2. Write a function that returns "Hello World!" and takes in nothing as a parameter
  Params - None
  Returns - String
   */
  val helloWorld: () => String = () => "Hello World!"


  /*
  3. Write a function that takes in a list and returns the total size of the list
  -Note - Use the .size method
  Params - List[Int]
  Returns - Int
   */
  def listSize(input: List[Int]): Int = {
    input.size
  }
  // lists
  //val aList = List(1,2,3,4,5)
  //val firstElement = aList.head
  //val rest = aList.tail
  //val aPrependedList = 0 :: aList // List(0,1,2,3,4,5)
  //val anExtendedList = 0 +: aList :+ 6 // List(0,1,2,3,4,5,6)

  /*
  4. Write a function that takes in an int and adds an int that you create within the function and returns the addition of the two together
  Note - Your variable must be a val and must be equal to 25
  Params - Int
  Returns - Int
   */
  def sumInts(input: Int): Int = {
    val x: Int = 25
    x + input
  }

  /*
   5. Write a function that takes in a list of strings, and return a list of strings where every letter is capitalized
   Hint - you can use .map here
   Params - List[String]
   Returns - List[String]
*/
  def upper(input: List[String]): List[String] = {
    input.map(_.toUpperCase())
  }

  /*
  6. Write a function that returns a new list, where only elements of the list passed in that are 0 or positive numbers are kept.
  Params - List[Int]
  Returns - List[Int]
   */
  def filterNegatives(input: List[Int]): List[Int] = {
    input.filter(_ >= 0)
  }


  /*
  7. Returns a new list, where only the elements passed in containing "car" are kept to the new list.
  Params - List[String]
  Returns - List[String]
 */
  def containsCar(input: List[String]): List[String] = {
    input.filter(_.contains("car"))
  }
  /*
    8. Returns the sum of all numbers passed in.
    Params - List[Int]
    Returns - Int
   */
  def sumList(input: List[Int]): Int = {
    input.sum
  }
  /*
  9. Write a function that takes in an integer with a cats age, and return the human age equivalent.
    A human year is equivalent to 4 cat years
    Params - Int
    Returns - Int
   */
  def catsAge(input: Int): Int = {
    input*4
  }
  /*
  10. Same question as #9, but this time you are given a Option[Int]
    If an int is provided, returns a cats age for the human's age equivalent.
    If None is provided, return None
    A humanYear is equivalent to four catYears
    -Params - Option[Int]
    -Returns - Option[Int]
 */
  def catsAgeOption(humanAge: Option[Int]): Option[Int] = humanAge match {
    case Some(humanAge) => Some(humanAge*4)
    case None => None
  }

  /*
  11. Write a function that takes in a list of ints, and return the minimum of the ints provided
  Params - List
  Returns - Int
   */
  def minimum(input: List[Int]): Int = {
    input.min
  }
  /*
  12. Same as question 11, but this time you are given a list of Option[Ints], returns the minimum of the Ints provided.
  If no ints are provided, return None.
 */

  def minimumOption(input: List[Option[Int]]):Option[Int]= {
    input.minBy(x => x.getOrElse(0))
  }










}
