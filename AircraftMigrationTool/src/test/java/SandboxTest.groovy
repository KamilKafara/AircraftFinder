import spock.lang.Specification

import javax.swing.Renderer
import java.awt.*

class SandboxTest extends Specification {
    def "should be a simple path test"() {
        expect:
        1 == 1
    }

    def "ReadFileByDocumentType"() {}

    def "Should expect an Exception to be thrown for invalid inputs"() {
        given:
        def point = new Point(1, 2)
        when:
        def x = 1
        def y = 2

        then:
        x == point.x
        y == point.y

    }

    def "Should test many different points [#inX,#inY]"() {
        when:
        def point = new Point(inX, inY)

        then:
        point.getX() == inX
        point.getY() == inY

        where:
        inX << [-1, 0, 1, 2]
        inY << [-10, 0, 10, 20]

    }

    def "should use data tables for calculating max. Max of #a and #b is #max"() {
        expect:
        Math.max(a, b) == max

        where:
        a | b  || max
        1 | 3  || 3
        7 | 53 || 53
        5 | -3 || 5
        0 | 0  || 0
    }

    def "should be able to mock a concrete class"() {
        given:
        Renderer renderer = Mock();

        def point = new Point(4, 2)

        when:
        point.draw()

        then:
        4 * renderer.drawLine()

    }
//todo: https://www.youtube.com/watch?v=i5Qu3qYOfsM&t=1213s

}
