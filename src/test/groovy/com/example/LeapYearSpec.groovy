package com.example

import spock.lang.*

import static com.example.LeapYear.*

class LeapYearSpec extends Specification {
    @Unroll
    def "year #year is leap"() {
        expect:
        isLeap(year)

        where:
        year << [0, 4, 8, 400, 800, 1600, 1996, 2000]
    }

    @Unroll
    def "year #year is not leap"() {
        expect:
        !isLeap(year)

        where:
        year << [1, 2, 3, 5, 100, 200, 300, 500, 1800, 1997]
    }
}
