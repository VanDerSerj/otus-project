import org.junit.Test
import kotlin.test.assertEquals

class StubTest {

    var x = false

    @Test
    fun firstTest() {
        x = true
        assertEquals(x, 1 == 1)
    }

    @Test
    fun secondTest() {
        assertEquals(false,  1 == 2)
    }


}