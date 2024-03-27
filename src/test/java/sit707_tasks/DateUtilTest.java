package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "S220473748";
		Assert.assertNotNull("Student ID is S220473748", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Rohit Rajendra Kadam";
		Assert.assertNotNull("Student name is Rohit Rajendra Kadam", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("january1ShouldIncrementToJanuary2 > " + date);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        System.out.println(date);
	}
	
	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// Code here
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("january1ShouldDecrementToDecember31 > " + date);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(12, date.getMonth());
        System.out.println(date);
	}
	
	/*
	 * Write tests for rest months of year 2024.
	 */
	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
		// February max boundary area: max+1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
		// February max boundary area: max-1
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldDecrementToFebruary28 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(28, date.getDay());
        Assert.assertEquals(2, date.getMonth());
	}
	
	@Test
	public void testNominalFebruary() {
		int rand_day_1_to_29 = 1 + new Random().nextInt(29);
        DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
        System.out.println("testFebruaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		// Code here
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February1ShouldIncrementToFebruary2 > " + date);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
	}
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		// Code here
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February1ShouldDecrementToJanuary31 > " + date);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        System.out.println(date);
	}
	
	@Test
    public void testMaxMarch31ShouldIncrementToApril1() {
		// March max boundary area: max+1
		DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("March31ShouldIncrementToApril1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
		// March max boundary area: max-1
		DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("March31ShouldDecrementToMarch30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(3, date.getMonth());
	}
	
	@Test
	public void testNominalMarch() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
        System.out.println("testMarchNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	
	/*
	 * Complete below test cases.
	 */
	
	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
		// Code here
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March1ShouldIncrementToMarch2 > " + date);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        System.out.println(date);
	}
	
	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
		// Code here
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March1ShouldDecrementToFebruary29 > " + date);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
	}
	   @Test
	    public void testMaxApril30ShouldIncrementToMay1() {
			// April max boundary area: max+1
			DateUtil date = new DateUtil(30, 4, 2024);
	        System.out.println("April30ShouldIncrementToMay1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(5, date.getMonth());
	        Assert.assertEquals(1, date.getDay());
		}
		
		@Test
		public void testMaxApril30ShouldDecrementToApril29() {
			// April max boundary area: max-1
			DateUtil date = new DateUtil(30, 4, 2024);
	        System.out.println("April30ShouldDecrementToApril29 > " + date);
	        date.decrement();
	        System.out.println(date);
	        Assert.assertEquals(29, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
		}
		
		@Test
		public void testNominalApril() {
			int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	        DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	        System.out.println("testAprilNominal > " + date);
	        date.increment();
	        System.out.println(date);
		}
		
		/*
		 * Complete below test cases.
		 */
		
		@Test
		public void testMinApril1ShouldIncrementToApril2() {
			// Code here
			DateUtil date = new DateUtil(1, 4, 2024);
			System.out.println("April1ShouldIncrementToApril2 > " + date);
	        date.increment();
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
	        System.out.println(date);
		}
		
		@Test
		public void testMinApril1ShouldDecrementToMarch31() {
			// Code here
			DateUtil date = new DateUtil(1, 4, 2024);
			System.out.println("April1ShouldDecrementToMarch31 > " + date);
	        date.decrement();
	        Assert.assertEquals(31, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	        System.out.println(date);
		}
	    @Test
	    public void testMaxMay31ShouldIncrementToJune1() {
			// May max boundary area: max+1
			DateUtil date = new DateUtil(31, 5, 2024);
	        System.out.println("May31ShouldIncrementToJune1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1, date.getDay());
		}
		
		@Test
		public void testMaxMay31ShouldDecrementToMay30() {
			// May max boundary area: max-1
			DateUtil date = new DateUtil(31, 5, 2024);
	        System.out.println("May31ShouldDecrementToMay30 > " + date);
	        date.decrement();
	        System.out.println(date);
	        Assert.assertEquals(30, date.getDay());
	        Assert.assertEquals(5, date.getMonth());
		}
		
		@Test
		public void testNominalMay() {
			int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	        DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	        System.out.println("testMayNominal > " + date);
	        date.increment();
	        System.out.println(date);
		}
		
		/*
		 * Complete below test cases.
		 */
		
		@Test
		public void testMinMay1ShouldIncrementToMay2() {
			// Code here
			DateUtil date = new DateUtil(1, 5, 2024);
			System.out.println("May1ShouldIncrementToMay2 > " + date);
	        date.increment();
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(5, date.getMonth());
	        System.out.println(date);
		}
		
		@Test
		public void testMinMay1ShouldDecrementToApril30() {
			// Code here
			DateUtil date = new DateUtil(1, 5, 2024);
			System.out.println("May1ShouldDecrementToApril30 > " + date);
	        date.decrement();
	        Assert.assertEquals(30, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
	        System.out.println(date);
		}
		
		 @Test
		    public void testMaxJune30ShouldIncrementToJuly1() {
				// May June boundary area: max+1
				DateUtil date = new DateUtil(30, 6, 2024);
		        System.out.println("June30ShouldIncrementToJuly1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(7, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxJune30ShouldDecrementToJune29() {
				// May June boundary area: max-1
				DateUtil date = new DateUtil(30, 6, 2024);
		        System.out.println("June30ShouldDecrementToJune29 > " + date);
		        date.decrement();
		        System.out.println(date);
		        Assert.assertEquals(29, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
			}
			
			@Test
			public void testNominalJune() {
				int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		        DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
		        System.out.println("testJuneNominal > " + date);
		        date.increment();
		        System.out.println(date);
			}
			
			/*
			 * Complete below test cases.
			 */
			
			@Test
			public void testMinJune1ShouldIncrementToJune2() {
				// Code here
				DateUtil date = new DateUtil(1, 6, 2024);
				System.out.println("June1ShouldIncrementToJune2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinJune1ShouldDecrementToMay30() {
				// Code here
				DateUtil date = new DateUtil(1, 6, 2024);
				System.out.println("June1ShouldDecrementToMay31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(5, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxJuly31ShouldIncrementToAugust1() {
				// May July boundary area: max+1
				DateUtil date = new DateUtil(31, 7, 2024);
		        System.out.println("July31ShouldIncrementToAugust1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(8, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxJuly31ShouldDecrementToJuly30() {
				// May July boundary area: max-1
				DateUtil date = new DateUtil(31, 7, 2024);
		        System.out.println("July31ShouldDecrementToJuly30 > " + date);
		        date.decrement();
		        System.out.println(date);
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
			}
			
			@Test
			public void testNominalJuly() {
				int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		        DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
		        System.out.println("testJulyNominal > " + date);
		        date.increment();
		        System.out.println(date);
			}
			
			/*
			 * Complete below test cases.
			 */
			
			@Test
			public void testMinJuly1ShouldIncrementToJuly2() {
				// Code here
				DateUtil date = new DateUtil(1, 7, 2024);
				System.out.println("July1ShouldIncrementToJuly2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinJuly1ShouldDecrementToJune30() {
				// Code here
				DateUtil date = new DateUtil(1, 7, 2024);
				System.out.println("July1ShouldDecrementToJune30 > " + date);
		        date.decrement();
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxAugust31ShouldIncrementToSeptember1() {
				// May August boundary area: max+1
				DateUtil date = new DateUtil(31, 8, 2024);
		        System.out.println("August31ShouldIncrementToSeptember1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(9, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxAugust31ShouldDecrementToAugust30() {
				// May August boundary area: max-1
				DateUtil date = new DateUtil(31, 8, 2024);
		        System.out.println("July31ShouldDecrementToJuly30 > " + date);
		        date.decrement();
		        System.out.println(date);
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(8, date.getMonth());
			}
			
			@Test
			public void testNominalAugust() {
				int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		        DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
		        System.out.println("testAugustNominal > " + date);
		        date.increment();
		        System.out.println(date);
			}
			
			/*
			 * Complete below test cases.
			 */
			
			@Test
			public void testMinAugust1ShouldIncrementToAugust2() {
				// Code here
				DateUtil date = new DateUtil(1, 8, 2024);
				System.out.println("August1ShouldIncrementToAugust2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(8, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinAugust1ShouldDecrementToJuly31() {
				// Code here
				DateUtil date = new DateUtil(1, 8, 2024);
				System.out.println("August1ShouldDecrementToJuly31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxSeptember30ShouldIncrementToOctober1() {
				// May September boundary area: max+1
				DateUtil date = new DateUtil(30, 9, 2024);
		        System.out.println("September30ShouldIncrementToOctober1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(10, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxSeptember30ShouldDecrementToSeptember29() {
				// May August boundary area: max-1
				DateUtil date = new DateUtil(30, 9, 2024);
		        System.out.println("September30ShouldDecrementToSeptember29 > " + date);
		        date.decrement();
		        System.out.println(date);
		        Assert.assertEquals(29, date.getDay());
		        Assert.assertEquals(9, date.getMonth());
			}
			
			@Test
			public void testNominalSeptember() {
				int rand_day_1_to_30 = 1 + new Random().nextInt(30);
		        DateUtil date = new DateUtil(rand_day_1_to_30, 9, 2024);
		        System.out.println("testSeptemberNominal > " + date);
		        date.increment();
		        System.out.println(date);
			}
			
			/*
			 * Complete below test cases.
			 */
			
			@Test
			public void testMinSeptember1ShouldIncrementToSeptember2() {
				// Code here
				DateUtil date = new DateUtil(1, 9, 2024);
				System.out.println("September1ShouldIncrementToSeptember2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(9, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinSeptember1ShouldDecrementToAugust31() {
				// Code here
				DateUtil date = new DateUtil(1, 9, 2024);
				System.out.println("September1ShouldDecrementToAugust31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(8, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxOctober31ShouldIncrementToNovember1() {
				// May October boundary area: max+1
				DateUtil date = new DateUtil(31, 10, 2024);
		        System.out.println("October31ShouldIncrementToNovember1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(11, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxOctober31ShouldDecrementToOctober30() {
				// May October boundary area: max-1
				DateUtil date = new DateUtil(31, 10, 2024);
		        System.out.println("October31ShouldDecrementToOctober30 > " + date);
		        date.decrement();
		        System.out.println(date);
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(10, date.getMonth());
			}
			
			@Test
			public void testNominalOctober() {
				int rand_day_1_to_31 = 1 + new Random().nextInt(31);
		        DateUtil date = new DateUtil(rand_day_1_to_31, 10, 2024);
		        System.out.println("testOctoberNominal > " + date);
		        date.increment();
		        System.out.println(date);
			}
			
			/*
			 * Complete below test cases.
			 */
			
			@Test
			public void testMinOctober1ShouldIncrementToOctober2() {
				// Code here
				DateUtil date = new DateUtil(1, 10, 2024);
				System.out.println("October1ShouldIncrementToOctober2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(10, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinOctober1ShouldDecrementToSeptember30() {
				// Code here
				DateUtil date = new DateUtil(1, 10, 2024);
				System.out.println("October1ShouldDecrementToSeptember30 > " + date);
		        date.decrement();
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(9, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMaxNovember30ShouldIncrementToDecember1() {
			    // Near November-December boundary: max+1
			    DateUtil date = new DateUtil(30, 11, 2024);
			    System.out.println("November30ShouldIncrementToDecember1 > " + date);
			    date.increment();
			    System.out.println(date);
			    Assert.assertEquals(12, date.getMonth());
			    Assert.assertEquals(1, date.getDay());
			}

			@Test
			public void testMaxNovember30ShouldDecrementToNovember29() {
			    // Near November-December boundary: max-1
			    DateUtil date = new DateUtil(30, 11, 2024);
			    System.out.println("November30ShouldDecrementToNovember29 > " + date);
			    date.decrement();
			    System.out.println(date);
			    Assert.assertEquals(29, date.getDay());
			    Assert.assertEquals(11, date.getMonth());
			}

			@Test
			public void testNominalNovember() {
			    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
			    DateUtil date = new DateUtil(rand_day_1_to_30, 11, 2024);
			    System.out.println("testNovemberNominal > " + date);
			    date.increment();
			    System.out.println(date);
			}

			@Test
			public void testMinNovember1ShouldIncrementToNovember2() {
			    DateUtil date = new DateUtil(1, 11, 2024);
			    System.out.println("November1ShouldIncrementToNovember2 > " + date);
			    date.increment();
			    Assert.assertEquals(2, date.getDay());
			    Assert.assertEquals(11, date.getMonth());
			    System.out.println(date);
			}

			@Test
			public void testMinNovember1ShouldDecrementToOctober31() {
			    DateUtil date = new DateUtil(1, 11, 2024);
			    System.out.println("November1ShouldDecrementToOctober31 > " + date);
			    date.decrement();
			    Assert.assertEquals(31, date.getDay());
			    Assert.assertEquals(10, date.getMonth());
			    System.out.println(date);
			}

			@Test
			public void testMaxDecember31ShouldIncrementToJanuary1() {
			    DateUtil date = new DateUtil(31, 12, 2024);
			    System.out.println("December31ShouldIncrementToJanuary1 > " + date);
			    date.increment();
			    Assert.assertEquals(1, date.getDay());
			    Assert.assertEquals(1, date.getMonth());
			    System.out.println(date);
			}

			@Test
			public void testMaxDecember31ShouldDecrementToDecember30() {
			    DateUtil date = new DateUtil(31, 12, 2024);
			    System.out.println("December31ShouldDecrementToDecember30 > " + date);
			    date.decrement();
			    Assert.assertEquals(30, date.getDay());
			    Assert.assertEquals(12, date.getMonth());
			    System.out.println(date);
			}

			@Test
			public void testNominalDecember() {
			    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
			    DateUtil date = new DateUtil(rand_day_1_to_31, 12, 2024);
			    System.out.println("testDecemberNominal > " + date);
			    date.increment();
			    System.out.println(date);
			}

			@Test
			public void testMinDecember1ShouldIncrementToDecember2() {
			    DateUtil date = new DateUtil(1, 12, 2024);
			    System.out.println("December1ShouldIncrementToDecember2 > " + date);
			    date.increment();
			    Assert.assertEquals(2, date.getDay());
			    Assert.assertEquals(12, date.getMonth());
			    System.out.println(date);
			}

			@Test
			public void testMinDecember1ShouldDecrementToNovember30() {
			    DateUtil date = new DateUtil(1, 12, 2024);
			    System.out.println("December1ShouldDecrementToNovember30 > " + date);
			    date.decrement();
			    Assert.assertEquals(30, date.getDay());
			    Assert.assertEquals(11, date.getMonth());
			    System.out.println(date);
			}
            
			
			//leap year condition
			
			
			@Test
			public void testleapyearFebruary28ShouldIncrementToFebruaray29() {
			    DateUtil date = new DateUtil(28, 2, 2024);
			    System.out.println("February28LeapYearShouldIncrementToFebruary29 > " + date);
			    date.increment();
			    Assert.assertEquals(29, date.getDay());
			    Assert.assertEquals(2, date.getMonth());
			    System.out.println(date);
			}
			
			@Test
			public void testFebruary28LeapYearShouldDecrementToFebruary27() {
			    DateUtil date = new DateUtil(28, 2, 2024);
			    System.out.println("February28LeapYearShouldDecrementToFebruary27 > " + date);
			    date.decrement();
			    Assert.assertEquals(27, date.getDay());
			    Assert.assertEquals(2, date.getMonth());
			    System.out.println(date);
			}
			
			@Test
			public void testFebruary29LeapYearShouldIncrementToMarch1() {
			    DateUtil date = new DateUtil(29, 2, 2024);
			    System.out.println("February29LeapYearShouldIncrementToMarch1 > " + date);
			    date.increment();
			    Assert.assertEquals(1, date.getDay());
			    Assert.assertEquals(3, date.getMonth());
			    System.out.println(date);
			}


			@Test
			public void testLeapYearMarch1ShouldDecrementToFebruary29() {
			    DateUtil date = new DateUtil(1, 3, 2024);
			    System.out.println("March1ShouldDecrementToleapyearFebruary29 > " + date);
			    date.decrement();
			    Assert.assertEquals(29, date.getDay());
			    Assert.assertEquals(2, date.getMonth());
			    System.out.println(date);
			}
			
			
}
