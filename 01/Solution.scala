/*
 * Solution to https://projecteuler.net/problem=1
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */

object Solution extends App {
  val max = 1000
  def multiplesOf(x: Int, max: Int): Set[Int] = Seq.range(x, max, x).toSet
  val multiplesOfThreeOrFive = multiplesOf(3, max) | multiplesOf(5, max)
  val answer = multiplesOfThreeOrFive.sum
  println(answer)
}
