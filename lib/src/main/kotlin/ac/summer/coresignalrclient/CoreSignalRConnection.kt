package ac.summer.coresignalrclient

class CoreSignalRConnection(config: CoreSignalRConnection.() -> Unit) {
    private lateinit var url: String
    private val methods = hashSetOf<CoreSignalRMethod>()

    init {
        config.invoke(this)
    }

    fun setUrl(url: String) {
        this.url = url
    }

    fun addMethod(method: CoreSignalRMethod) {
        methods.add(method)
    }

}