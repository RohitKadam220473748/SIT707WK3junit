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
		DateUtil date = new DateUtil(29, 2, 2024);
        System.out.println("February29ShouldIncrementToMarch1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(3, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxFebruary29ShouldDecrementToFebruary28() {
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
	
	@Test
	public void testMinFebruary1ShouldIncrementToFebruary2() {
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February1ShouldIncrementToFebruary2 > " + date);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
	}
	
	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
		DateUtil date = new DateUtil(1, 2, 2024);
		System.out.println("February1ShouldDecrementToJanuary31 > " + date);
        date.decrement();
        Assert.assertEquals(31, date.getDay());
        Assert.assertEquals(1, date.getMonth());
        System.out.println(date);
	}
	
	@Test
    public void testMaxMarch31ShouldIncrementToApril1() {
		DateUtil date = new DateUtil(31, 3, 2024);
        System.out.println("March31ShouldIncrementToApril1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(4, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
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
	
	@Test
	public void testMinMarch1ShouldIncrementToMarch2() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March1ShouldIncrementToMarch2 > " + date);
        date.increment();
        Assert.assertEquals(2, date.getDay());
        Assert.assertEquals(3, date.getMonth());
        System.out.println(date);
	}
	
	@Test
	public void testMinMarch1ShouldDecrementToFebruary29() {
		DateUtil date = new DateUtil(1, 3, 2024);
		System.out.println("March1ShouldDecrementToFebruary29 > " + date);
        date.decrement();
        Assert.assertEquals(29, date.getDay());
        Assert.assertEquals(2, date.getMonth());
        System.out.println(date);
	}
	   @Test
	    public void testMaxApril30ShouldIncrementToMay1() {
			DateUtil date = new DateUtil(30, 4, 2024);
	        System.out.println("April30ShouldIncrementToMay1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(5, date.getMonth());
	        Assert.assertEquals(1, date.getDay());
		}
		
		@Test
		public void testMaxApril30ShouldDecrementToApril29() {
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
		
		@Test
		public void testMinApril1ShouldIncrementToApril2() {
			DateUtil date = new DateUtil(1, 4, 2024);
			System.out.println("April1ShouldIncrementToApril2 > " + date);
	        date.increment();
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
	        System.out.println(date);
		}
		
		@Test
		public void testMinApril1ShouldDecrementToMarch31() {
			DateUtil date = new DateUtil(1, 4, 2024);
			System.out.println("April1ShouldDecrementToMarch31 > " + date);
	        date.decrement();
	        Assert.assertEquals(31, date.getDay());
	        Assert.assertEquals(3, date.getMonth());
	        System.out.println(date);
		}
	    @Test
	    public void testMaxMay31ShouldIncrementToJune1() {
			DateUtil date = new DateUtil(31, 5, 2024);
	        System.out.println("May31ShouldIncrementToJune1 > " + date);
	        date.increment();
	        System.out.println(date);
	        Assert.assertEquals(6, date.getMonth());
	        Assert.assertEquals(1, date.getDay());
		}
		
		@Test
		public void testMaxMay31ShouldDecrementToMay30() {
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
		
		
		@Test
		public void testMinMay1ShouldIncrementToMay2() {
			DateUtil date = new DateUtil(1, 5, 2024);
			System.out.println("May1ShouldIncrementToMay2 > " + date);
	        date.increment();
	        Assert.assertEquals(2, date.getDay());
	        Assert.assertEquals(5, date.getMonth());
	        System.out.println(date);
		}
		
		@Test
		public void testMinMay1ShouldDecrementToApril30() {
			DateUtil date = new DateUtil(1, 5, 2024);
			System.out.println("May1ShouldDecrementToApril30 > " + date);
	        date.decrement();
	        Assert.assertEquals(30, date.getDay());
	        Assert.assertEquals(4, date.getMonth());
	        System.out.println(date);
		}
		
		 @Test
		    public void testMaxJune30ShouldIncrementToJuly1() {
				DateUtil date = new DateUtil(30, 6, 2024);
		        System.out.println("June30ShouldIncrementToJuly1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(7, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxJune30ShouldDecrementToJune29() {
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
			
			@Test
			public void testMinJune1ShouldIncrementToJune2() {
				DateUtil date = new DateUtil(1, 6, 2024);
				System.out.println("June1ShouldIncrementToJune2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinJune1ShouldDecrementToMay30() {
				DateUtil date = new DateUtil(1, 6, 2024);
				System.out.println("June1ShouldDecrementToMay31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(5, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxJuly31ShouldIncrementToAugust1() {
				DateUtil date = new DateUtil(31, 7, 2024);
		        System.out.println("July31ShouldIncrementToAugust1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(8, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxJuly31ShouldDecrementToJuly30() {
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
			
			@Test
			public void testMinJuly1ShouldIncrementToJuly2() {
				DateUtil date = new DateUtil(1, 7, 2024);
				System.out.println("July1ShouldIncrementToJuly2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinJuly1ShouldDecrementToJune30() {
				DateUtil date = new DateUtil(1, 7, 2024);
				System.out.println("July1ShouldDecrementToJune30 > " + date);
		        date.decrement();
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxAugust31ShouldIncrementToSeptember1() {
				DateUtil date = new DateUtil(31, 8, 2024);
		        System.out.println("August31ShouldIncrementToSeptember1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(9, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxAugust31ShouldDecrementToAugust30() {
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
			
			@Test
			public void testMinAugust1ShouldIncrementToAugust2() {
				DateUtil date = new DateUtil(1, 8, 2024);
				System.out.println("August1ShouldIncrementToAugust2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(8, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinAugust1ShouldDecrementToJuly31() {
				DateUtil date = new DateUtil(1, 8, 2024);
				System.out.println("August1ShouldDecrementToJuly31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxSeptember30ShouldIncrementToOctober1() {
				DateUtil date = new DateUtil(30, 9, 2024);
		        System.out.println("September30ShouldIncrementToOctober1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(10, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxSeptember30ShouldDecrementToSeptember29() {
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
			
			@Test
			public void testMinSeptember1ShouldIncrementToSeptember2() {
				DateUtil date = new DateUtil(1, 9, 2024);
				System.out.println("September1ShouldIncrementToSeptember2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(9, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinSeptember1ShouldDecrementToAugust31() {
				DateUtil date = new DateUtil(1, 9, 2024);
				System.out.println("September1ShouldDecrementToAugust31 > " + date);
		        date.decrement();
		        Assert.assertEquals(31, date.getDay());
		        Assert.assertEquals(8, date.getMonth());
		        System.out.println(date);
			}
			
		    @Test
		    public void testMaxOctober31ShouldIncrementToNovember1() {
				DateUtil date = new DateUtil(31, 10, 2024);
		        System.out.println("October31ShouldIncrementToNovember1 > " + date);
		        date.increment();
		        System.out.println(date);
		        Assert.assertEquals(11, date.getMonth());
		        Assert.assertEquals(1, date.getDay());
			}
			
			@Test
			public void testMaxOctober31ShouldDecrementToOctober30() {
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
			
			@Test
			public void testMinOctober1ShouldIncrementToOctober2() {
				DateUtil date = new DateUtil(1, 10, 2024);
				System.out.println("October1ShouldIncrementToOctober2 > " + date);
		        date.increment();
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(10, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMinOctober1ShouldDecrementToSeptember30() {
				DateUtil date = new DateUtil(1, 10, 2024);
				System.out.println("October1ShouldDecrementToSeptember30 > " + date);
		        date.decrement();
		        Assert.assertEquals(30, date.getDay());
		        Assert.assertEquals(9, date.getMonth());
		        System.out.println(date);
			}
			
			@Test
			public void testMaxNovember30ShouldIncrementToDecember1() {
			    DateUtil date = new DateUtil(30, 11, 2024);
			    System.out.println("November30ShouldIncrementToDecember1 > " + date);
			    date.increment();
			    System.out.println(date);
			    Assert.assertEquals(12, date.getMonth());
			    Assert.assertEquals(1, date.getDay());
			}

			@Test
			public void testMaxNovember30ShouldDecrementToNovember29() {
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
            
			
			//TO TEST THE LEAP YEAR CONDITION 
			
			
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
			public void testFebruary29LeapYearShouldIncrementToMarch1() {
			    DateUtil date = new DateUtil(29, 2, 2024);
			    System.out.println("February29LeapYearShouldIncrementToMarch1 > " + date);
			    date.increment();
			    Assert.assertEquals(1, date.getDay());
			    Assert.assertEquals(3, date.getMonth());
			    System.out.println(date);
			}

			
			
			@Test
			public void testleapyear28FebrurayshouldIncrementto1March() {
	            DateUtil date = new DateUtil(28, 2, 2019);
			    System.out.println("February28ToMarch1LeapYear > " + date);
			    date.increment();
			    System.out.println(date);
			    if ((date.getMonth() == 2) && (date.getDay() == 29)) {
			        System.out.println("It is a leap year and the next date is: " + date);
			    }
			    else {
			        System.out.println("It is not in a leap year and next date is: " + date);
			    }
			}
			
			
			//TEST CASES ACCORDING TO ORANGE TABLE WHICH PREDICTS NEXT DATE
			
			
			
			@Test
		    public void testNextExpectedDateto1June1994is2June1994() {
		        DateUtil date = new DateUtil(1, 6, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 1 June 1994 : " + date);
		        Assert.assertEquals(2, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto2June1994is3June1994() {
		        DateUtil date = new DateUtil(2, 6, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 2 June 1994 : " + date);
		        Assert.assertEquals(3, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15June1994is16June1994() {
		        DateUtil date = new DateUtil(15, 6, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 15 June 1994 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto30June1994is1July19944() {
		        DateUtil date = new DateUtil(30, 6, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 30 June 1994 : " + date);
		        Assert.assertEquals(1, date.getDay());
		        Assert.assertEquals(7, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }
		    
		    @Test
		    public void testNextExpectedDateto31June1994InvalidDate() {
		        try {
		            DateUtil date = new DateUtil(31, 6, 1994);
		            date.increment();
		            System.out.println("Next Expected date for 31 June 1994 : " + date);
		            Assert.assertEquals(1, date.getDay());
			        Assert.assertEquals(7, date.getMonth());
			        Assert.assertEquals(1994, date.getYear());
		        } catch (RuntimeException e) {
		            System.out.println("31 June 1994 is Invalid date");
		        }
		    }	


		    @Test
		    public void testNextExpectedDateto15January1994is16January1994() {
		        DateUtil date = new DateUtil(15, 1, 1994);
		        date.increment();
		        System.out.println("Next Expected date for 15 January 1994 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(1, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15February1994is16February1994() {
		        DateUtil date = new DateUtil(15, 2, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 15 February 1994 : " + date);
                Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(2, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15November1994is16November1994() {
		        DateUtil date = new DateUtil(15, 11, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 15 November 1994 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(11, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15December1994is16December1994() {
		        DateUtil date = new DateUtil(15, 12, 1994);
		        date.increment();
		        System.out.println("Next Expected date to 15 December 1994 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(12, date.getMonth());
		        Assert.assertEquals(1994, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15June1700is16June1700() {
		        DateUtil date = new DateUtil(15, 6, 1700);
		        date.increment();
		        System.out.println("Next Expected date to 15 June 1700 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(1700, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15June1701is16June1701() {
		        DateUtil date = new DateUtil(15, 6, 1701);
		        date.increment();
		        System.out.println("Next Expected date to 15 June 1701 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(1701, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15June2023is16June2023() {
		        DateUtil date = new DateUtil(15, 6, 2023);
		        date.increment();
		        System.out.println("Next Expected date to 15 June 2023 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(2023, date.getYear());
		    }

		    @Test
		    public void testNextExpectedDateto15June2024is16June2024() {
		        DateUtil date = new DateUtil(15, 6, 2024);
		        date.increment();
		        System.out.println("Next Expected date to 15 June 2024 : " + date);
		        Assert.assertEquals(16, date.getDay());
		        Assert.assertEquals(6, date.getMonth());
		        Assert.assertEquals(2024, date.getYear());
		    }
			
		     
			
}
