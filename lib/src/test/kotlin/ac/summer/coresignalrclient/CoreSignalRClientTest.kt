package ac.summer.coresignalrclient

import org.junit.Assert.*
import org.junit.Test

class CoreSignalRClientTest {
    @Test
    fun testCreateInstance() {
        val instance = CoreSignalRClient.Builder().withReconnecting().build()
        kotlin.test.assertNotNull(instance, "CoreSignalRClient instance must be not null")
    }
}