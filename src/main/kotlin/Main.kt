import react.dom.*
import kotlinx.browser.document
import kotlinx.html.js.onClickFunction

fun main() {
    render(document.getElementById("root")) {
        h1 {
            +"Hello, Kotlin/JS with React!"
        }
        button {
            +"Click me"
            attrs.onClickFunction = {
                window.alert("Button clicked!")
            }
        }
    }
}
