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

    /* -- PHONE NUMBER -- */

    def String phoneNumber(String format = null) {
        return PhoneNumber.phoneNumber(format)
    }

    /* -- VERSION -- */

    def String version() {
        return Version.version()
    }
}
