package com.coderberry.faker

class Internet extends Faker {

    static String email(String name = null) {
        [userName(name), domainName()].join('@')
    }

    static String freeEmail(String name = null) {
        def freeDomainNames = ['gmail.com', 'yahoo.com', 'hotmail.com']
        return [userName(name), freeDomainNames[generator.nextInt(freeDomainNames.size())]].join('@')
    }

    static String userName(String name = null) {
        if (name != null) {
            return name.split(' ').join(['.','_'][generator.nextInt(2)]).toLowerCase()
        } else {
            def vals = []
            vals << Name.firstName().split(' ').join('').toLowerCase()
            vals << [
                    Name.firstName().split(' ').join(''),
                    Name.lastName().split(' ').join('')
            ].join(['.','_'][generator.nextInt(2)]).toLowerCase()
            return vals[generator.nextInt(vals.size())].replaceAll("(,|')", '')
        }
    }

    static String domainName() {
        return [domainWord(), domainSuffix()].join('.')
    }

    static private String domainWord() {
        return Company.name().split(' ')[0].split(' ').join('').toLowerCase().replaceAll("(,|')", '')
    }

    static private String domainSuffix() {
        def vals = ['co.uk', 'com', 'us', 'uk', 'ca', 'biz', 'info', 'name']
        return vals[generator.nextInt(vals.size())]
    }

}
