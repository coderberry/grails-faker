package com.coderberry.faker

class Dates extends Faker {

    /**
	 * Returns a random date between today and today + one year.
	 */
	static Date futureDate(){
		return (new Date() + generator.nextInt(364)+1)
	}

	/**
	 * Returns a random date between today and today - one year.
	 */
	static Date pastDate(){
		return (new Date() - (generator.nextInt(364)+1))
	}

	/**
	 * Returns a random date between today-20 years and today -100 years. Useful for birth dates.
	 */
	static Date veryPastDate(){
		def date = new Date() - 7300 //today - 20 years
		return (date - generator.nextInt(29200)) //0 to 80 years
	}
    

}
