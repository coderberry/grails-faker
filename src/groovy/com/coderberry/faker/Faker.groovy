package com.coderberry.faker

class Faker {

    static String numerify(String val) {
        def ret = []
        val.each { letter ->
            ret << letter.replace('#', generator.nextInt(10).toString())
        }
        return ret.join('')
    }

    static String letterify(String val) {
        def ret = []
        val.each { letter ->
            ret << letter.replace('?', ('a'..'z')[generator.nextInt(26)])
        }
        return ret.join('')
    }

    static String bothify(String val) {
        return letterify(numerify(val))
    }

    protected static Object[] shuffle(Object[] a, int cnt = 5) {
        def ret = []
        for (int i=0; i<cnt; i++) {
            ret << a[generator.nextInt(a.length)]
        }
        return ret
    }

    protected static final Random generator = new Random();

}
