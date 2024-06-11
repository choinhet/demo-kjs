import mui.material.Button
import react.FC
import react.create
import react.dom.client.createRoot
import react.dom.html.ReactHTML.div
import react.dom.html.ReactHTML.h2

fun main() {
    val container = web.dom.document.getElementById("root") ?: throw IllegalStateException("Couldn't find root div!")
    createRoot(container).render(Popup.create())
}

private val Popup = FC {
    div {
        id = "hello world"
        Button {
            +"Mi Button"
        }
        h2 {
            +"Hello mi mundito"
        }
    }
}
