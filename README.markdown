# faker

Faker, a port of Data::Faker from Perl, is used to easily generate fake data: names, addresses, phone numbers, etc.  
This plugin is a port developed in ruby, found at [http://faker.rubyforge.org](http://faker.rubyforge.org).

### Installation

Execute the following from your application directory:

    grails install-plugin faker

### Usage

    def fakerService // instanciate the service

    fakerService.name() => "Bob Hope"

### Available service methods

    /* -- HELPERS -- */
    println fakerService.numerify('#####')         => 22415
    println fakerService.letterify('??? ???')      => cfo mpu
    println fakerService.bothify('##? ?##')        => 40h l06
    
    /* -- NAME -- */
    println fakerService.name()                    => Matilde Deckow
    println fakerService.firstName()               => Ernest
    println fakerService.lastName()                => Gutkowski
    
    /* -- ADDRESS -- */
    println fakerService.streetAddress()           => 237 Ludwig Station
    println fakerService.streetName()              => Candido Dale
    println fakerService.secondaryAddress()        => Apt. 589
    println fakerService.city()                    => Lake Buster
    println fakerService.usState()                 => West Virginia
    println fakerService.usStateAbbr()             => MI
    println fakerService.zipCode()                 => 31685
    println fakerService.ukCounty()                => West Sussex
    println fakerService.ukCountry()               => Northern Ireland
    println fakerService.ukPostcode()              => JJ40 9EW
    
    /* -- COMPANY -- */
    println fakerService.companyName()             => Eichmann-Marks
    println fakerService.companyCatchPhrase()      => Expanded contextually-based paradigm
    println fakerService.companyBS()               => visualize cross-media schemas
    println fakerService.occupation()              => Gynecologist
    
    /* -- INTERNET -- */
    println fakerService.email()                   => malinda_bartoletti@veum-toy.uk
    println fakerService.email('Joe Blow')         => joe_blow@kuhn-fahey.info
    println fakerService.freeEmail()               => nova_kovacek@gmail.com
    println fakerService.freeEmail('Joe Blow')     => joe.blow@gmail.com
    println fakerService.userName()                => odessa
    println fakerService.userName('Joe Blow')      => joe_blow
    println fakerService.domainName()              => orn.info
    
    /* -- LOREM -- */
    println fakerService.sentence(3)               => Quas dolor culpa rerum tempora autem.
    println fakerService.paragraph(3)              => Et sint aliquid cum quas tempore tempora labore fuga. Voluptatem et saepe eaque illum. Voluptas eius explicabo eos at qui in saepe quis.
    
    /* -- PHONE -- */
    println fakerService.phoneNumber()             => (535)286-9804 x571
    println fakerService.phoneNumber('##########') => 1698340636
    
    /* -- VERSION -- */
    println fakerService.version()                 => 3.2.1

### License

This code is free to use under the terms of the MIT license.

### Contact

Comments are welcome. Send an email to cavneb at gmail.com.

### Version History

* 0.7 - Converting static methods to instance methods and tabs to spaces by [Pablo Alba](http://albaontech.wordpress.com/)
* 0.6 - Spanish added by [Pablo Alba](http://albaontech.wordpress.com/)
* 0.2 - Fixed bug with domain names including commas and apostrophes. Thanks to Mike Hugo for the fix code.
* 0.1 - Initial Release
