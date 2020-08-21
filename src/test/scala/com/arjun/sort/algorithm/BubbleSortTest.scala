package com.arjun.sort.algorithm
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._


class BubbleSortTest extends TestCase {

	var bubbleSort: BubbleSort = _

	override def setUp {
		bubbleSort = new BubbleSort
	}


	def testSortArray: Unit ={
		val input = Array(100,30,70,90,15)
		val expectedResult = Array(15,30,70,90,100)
		val actaulResult = bubbleSort.sortArray(input)
		assertEquals(expectedResult,actaulResult)
	}




}
