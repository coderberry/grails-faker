package com.coderberry.faker

class Version {

    static int MAJOR = 3
    static int MINOR = 2
    static int TINY = 1

    static String version() {
        return [MAJOR, MINOR, TINY].join('.')
    }

}
