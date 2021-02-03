package ac.summer.coresignalrclient

import com.microsoft.signalr.HubConnection

/**
 * SignalRClient implementation for ASP.NET Core.
 *
 * It works on top of Microsoft SignalR ASP.NET Java client.
 */
class CoreSignalRClient  {
    private val connections = arrayListOf<CoreSignalRConnection>()
    private val reconnect: Boolean

    private constructor(reconnect: Boolean, connections: List<CoreSignalRConnection>) {
        this.reconnect = reconnect
        this.connections.addAll(connections)
    }

    fun connect() {

    }

    fun connect(connection: CoreSignalRConnection) {}

    /**
     * Closes all connections
     */
    fun disconnect() {

    }

    fun disconnect(connection: CoreSignalRConnection) {

    }

    fun addAndConnect(connection: CoreSignalRConnection) {

    }

    fun removeAndDisconnect(connection: CoreSignalRConnection) {

    }

    /**
     * Helper class used to create client instance
     */
    class Builder {
        private var reconnect: Boolean = false
        private val connections = arrayListOf<CoreSignalRConnection>()

        /**
         * Set signalr client automatically reconnect
         */
        fun withReconnecting(): Builder {
            reconnect = true
            return this
        }

        fun withConnections(vararg connection: CoreSignalRConnection): Builder {
            this.connections.addAll(connection)
            return this
        }

        fun build(): CoreSignalRClient {
            return CoreSignalRClient(reconnect = reconnect, connections = connections)
        }
    }
}
