package com.coderberry.faker

import com.coderberry.faker.*

class FakerService {

    boolean transactional = false

    /* -- HELPERS -- */

    def String numerify(String val) {
        return Faker.numerify(val)
    }

    def String letterify(String val) {
        return Faker.letterify(val)
    }

    def String bothify(String val) {
        return Faker.bothify(val)
    }

    /* -- NAME -- */

    def String name() {
        return Name.name()
    }

    def String firstName() {
        return Name.firstName()
    }

    def String lastName() {
        return Name.lastName()
    }
    
    def String esFirstNameMale() {
        return Name.esFirstNameMale()
    }
    
    def String esFirstNameFemale() {
        return Name.esFirstNameFemale()
    }
    
    def String esFirstName() {
        return Name.esFirstName()
    }
    
    def String esLastName() {
        return Name.esLastName()
    }
    
    def String esName() {
        return Name.esName()
    }
    
    

    /* -- ADDRESS -- */

    def String streetAddress() {
        return Address.streetAddress()
    }

    def String streetName() {
        return Address.streetName()
    }

    def String secondaryAddress() {
        return Address.secondaryAddress()
    }

    def String city() {
        return Address.city()
    }

    def String usState() {
        return Address.usState()
    }

    def String usStateAbbr() {
        return Address.usStateAbbr()
    }

    def String zipCode() {
        return Address.zipCode()
    }

    def String ukCounty() {
        return Address.ukCounty()
    }

    def String ukCountry() {
        return Address.ukCountry()
    }

    def String ukPostcode() {
        return Address.ukPostcode()
    }
    
    def String esPostcode() {
        return Address.esPostcode()
    }
    
    def String esProvince() {
        return Address.esProvince()
    }
    
    

    /* -- COMPANY -- */

    def String companyName() {
        return Company.name()
    }

    def String companyCatchPhrase() {
        return Company.catchPhrase()
    }

    def String companyBS() {
        return Company.bs()
    }

    def String occupation() {
        return Company.occupation()
    }

    /* -- INTERNET -- */

    def String email(String name = null) {
        return Internet.email(name)
    }

    def String freeEmail(String name = null) {
        return Internet.freeEmail(name)
    }

    def String userName(String name = null) {
        return Internet.userName(name)
    }

    def String domainName() {
        return Internet.domainName()
    }

    /* -- LOREM -- */

    def String sentence(int wordCount) {
        return Lorem.sentence(wordCount)
    }

    def String paragraph(int sentenceCount) {
        return Lorem.paragraph(sentenceCount)
    }
    
    def String word() {
        return Lorem.word()
    }
    
    def String wordCapital() {
        return Lorem.wordCapital()
    }

    /* -- PHONE NUMBER -- */

    def String phoneNumber(String format = null) {
        return PhoneNumber.phoneNumber(format)
    }
    
    def String esPhoneNumber() {
        return PhoneNumber.esPhoneNumber()
    }
    
    /* -- DATES -- */
    /**
     * Returns a random date between today and today + one year.
     */
    def Date futureDate() {
        return Dates.futureDate()
    }

    /**
     * Returns a random date between today and today - one year.
     */
    def Date pastDate() {
        return Dates.pastDate()
    }

    /**
     * Returns a random date between today-20 years and today -100 years. Useful for birth dates.
     */
    def Date veryPastDate() {
        return Dates.veryPastDate()
    }
    
    /* -- FISCAL -- */
    
    /**
     * Returns a random spanish Fiscal Identification Number (NIF)
     * @return
     */
    def String esNIF(){
        return Fiscal.esNIF()
    }
    

    /* -- VERSION -- */

    def String version() {
        return Version.version()
    }
}
