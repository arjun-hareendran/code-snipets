package com.arjun.sort.algorithm

class BubbleSort {

	// best case is O(n) worst case is O(n^2) means as input double complexity increases 4 times .

	def sortList(input: Array[Int]): Array[Int] = {

		var swtichValue = 0
		for (idx <- 0 to input.size - 2) {

			for (itr <- 0 to input.size - (idx + 2)) {

				if ( input(itr) > input(itr + 1) ) {
					swtichValue = input(itr)
					input(itr) = input(itr + 1)
					input(itr + 1) = swtichValue
				}

				println(input.mkString(" "))

			}

		}
		input
	}

}
