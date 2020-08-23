package com.arjun.sort.algorithm

import scala.annotation.tailrec

class BubbleSort {

	// best case is O(n) worst case is O(n^2) means as input double complexity increases 4 times .

	def sortList(input: Array[Int]): Array[Int] = {

		// loop one iterate till n-1 position
		// loop two iterate till n - ( loop + 1)

		for (idx <- 0 to input.size - 2) {
			for (itr <- 0 to input.size - (idx + 2)) {
				if ( input(itr) > input(itr + 1) ) {
					val swtichValue = input(itr)
					input(itr) = input(itr + 1)
					input(itr + 1) = swtichValue
				}
			}
		}
		input
	}

	def recursiveBubbleSort(input: List[Int]): List[Int] = {

		// iteration is a counter to make sure we loop n times
		// input at end will have the highest number in the list
		// result will hold all elements in the list apart from the highest number. The highest number then
		// gets appended making the list complete

		@tailrec
		def sort(input: List[Int], iteration: List[Int], result: List[Int]): List[Int] =

			input match {
				case firstElemet :: secondElement :: rest => {
					if ( firstElemet > secondElement ) sort(firstElemet +: rest, iteration, result :+ secondElement) else sort(secondElement +: rest, iteration, result :+ firstElemet)
				}
				case lastElement :: Nil => sort(Nil, iteration, result :+ lastElement)
				case Nil => if ( iteration.isEmpty ) return result else sort(result, iteration.dropRight(1), Nil)
			}

		sort(input, input, Nil)
	}

}
