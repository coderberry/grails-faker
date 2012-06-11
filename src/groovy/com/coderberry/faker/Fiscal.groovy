package com.coderberry.faker

class Fiscal extends Faker {
   /**
	 * Returns a random spanish Fiscal Identification Number (NIF)
	 * @return
	 */
	static String esNIF(){
		def nif = Faker.numerify("########")
		return nif + "TRWAGMYFPDXBNJZSQVHLCKET".charAt(nif.toInteger() % 23)
	}
    
}
