package ac.summer.coresignalrclient

interface MethodDataHandler {
    fun onEvent(event: DataEvent, data: String)
}