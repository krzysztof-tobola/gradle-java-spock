package com.example

import spock.lang.*

class ShapesSpec extends Specification {
    def "test"() {
        Square square = new Square.Builder().withPositionX(3).withSize(4).build()

        expect:
        square.positionX == 3
        square.size == 4
    }
}
