package com.coderberry.faker



import grails.test.mixin.*
import org.junit.*
import grails.test.*

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
class FakerServiceTests extends GrailsUnitTestCase {

   
	def FakerService fakerService
    
    protected void setUp() {
        super.setUp()
		fakerService = new FakerService()
    }

    protected void tearDown() {
        super.tearDown()
    }
    
    
    //Names
    void testEsFirstNameMale() {
        def name = fakerService.esFirstNameMale()
		assert name.length() > 0
    }
    
    void testEsFirstNameFemale() {
        def name = fakerService.esFirstNameFemale()
		assert name.length() > 0
    }
    
    void testEsFirstName() {
        def name = fakerService.esFirstName()
		assert name.length() > 0
    }
    
    void testEsLastName() {
        def name = fakerService.esLastName()
		assert name.length() > 0
    }
    
    void testEsName() {
        def name = fakerService.esName()
		assert name.length() > 0
        assert name.split(' ').size() == 3
    }

    //Address
    void testEsPostcode() {
        def postCode = fakerService.esPostcode()
        def provinceCode = Integer.parseInt(postCode[0..1])
		assert postCode.length() == 5
        assert provinceCode <= 52
        assert provinceCode > 1
    }
    
    void testEsProvince() {
        def province = fakerService.esProvince()
		assert province.length() > 0
    }
    
    
    //Loren
    void testWord() {
        def word = fakerService.word()
		assert word.length() > 0
    }
    
    void testWordCapital() {
        def word = fakerService.wordCapital()
		assert word.length() > 0
    }
    
    
    //Phone
    void testEsPhoneNumber() {
        def phone = fakerService.esPhoneNumber()
        def phoneRegex = /[69][0-9]{8}/
		assert phone ==~ phoneRegex
    }
    
    
    //Dates
    void testFutureDate(){
		def date = fakerService.futureDate()
		assert (new Date() + 365) > date
		assert (new Date()) < date
	}
	
	void testPastDate(){
		def date = fakerService.pastDate()
		assert (new Date() - 365) < date
		assert (new Date()) > date
	}
	
	void testVeryPastDate(){
		def date = fakerService.veryPastDate()
		assert (new Date() - 36500) < date
		assert (new Date() - 7300) > date
	}
    
    void testEsNIF(){
		def nif = fakerService.esNIF()
		def nifRegex = /[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKET]/
		assert nif ==~ nifRegex
		
	}
    
}

