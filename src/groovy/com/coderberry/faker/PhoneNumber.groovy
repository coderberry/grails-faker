package com.coderberry.faker

class PhoneNumber extends Faker {

    static String phoneNumber(String format = null) {
        if (format != null) {
            return Faker.numerify(format)
        } else {
            return Faker.numerify(formats()[generator.nextInt(formats().size())])
        }
    }

    static private String[] formats() {
        def vals = [
                '###-###-####',
                '(###)###-####',
                '1-###-###-####',
                '###.###.####',
                '###-###-####',
                '(###)###-####',
                '1-###-###-####',
                '###.###.####',
                '###-###-#### x###',
                '(###)###-#### x###',
                '1-###-###-#### x###',
                '###.###.#### x###',
                '###-###-#### x####',
                '(###)###-#### x####',
                '1-###-###-#### x####',
                '###.###.#### x####',
                '###-###-#### x#####',
                '(###)###-#### x#####',
                '1-###-###-#### x#####',
                '###.###.#### x#####'
        ]
        return vals
    }
    
    //Spanish
    
    static String esPhoneNumber(){
        def vals = ['6########', "9########"]
        return Faker.numerify(vals[generator.nextInt(vals.size())])
    }

}
