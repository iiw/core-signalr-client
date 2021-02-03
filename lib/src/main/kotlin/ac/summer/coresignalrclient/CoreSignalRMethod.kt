package ac.summer.coresignalrclient

class CoreSignalRMethod(config: CoreSignalRMethod.() -> Unit) {

    private lateinit var joinMethod: String
    private lateinit var leftMethod: String
    private var eventsHandler: MethodDataHandler? = null

    init {
        config.invoke(this)
    }

    fun setJoinName(method: String) {
        joinMethod = method
    }

    fun setLeftName(method: String) {
        leftMethod = method
    }

    fun setHandler(handler: MethodDataHandler) {
        eventsHandler = handler
    }
}