package com.arjun.sort.algorithm
import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._


class BubbleSortTest extends TestCase {

	var bubbleSort: BubbleSort = _

	override def setUp {
		bubbleSort = new BubbleSort
	}


	def testSortList: Unit ={
		val input = Array(100,90,80,70,60)
		val expectedResult = Array(60,70,80,90,100)
		val actaulResult = bubbleSort.sortList(input)
		assertArrayEquals(expectedResult,actaulResult)
	}

	def testSortListRecursive: Unit ={
		val input = List(100,90,80,70,60)
		val expectedResult = List(60,70,80,90,100)
		val actaulResult = bubbleSort.recursiveBubbleSort(input)
		assertEquals(expectedResult,actaulResult)
	}





}
