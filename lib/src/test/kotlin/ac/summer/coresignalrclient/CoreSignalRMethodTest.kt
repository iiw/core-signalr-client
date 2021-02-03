package ac.summer.coresignalrclient

import org.junit.Assert.*
import org.junit.Test

class CoreSignalRMethodTest {
    @Test
    fun testCreatingMethod() {
        val instance = CoreSignalRMethod {
            setJoinName("JoinTickersAsync")
            setLeftName("LeftTickersAsync")
            setHandler(object : MethodDataHandler {
                override fun onEvent(event: DataEvent, data: String) {
                    when (event) {
                        DataEvent.INITIAL -> {}//
                        DataEvent.UPDATE -> {}
                    }
                }
            })
        }
    }
}