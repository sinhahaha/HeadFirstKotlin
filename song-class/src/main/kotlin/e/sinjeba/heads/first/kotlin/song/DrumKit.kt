package e.sinjeba.heads.first.kotlin.song

fun main() {
    // ding ding ba-da-bing!
    // bang bang bang!
    // ding ding ba-da-bing!
    val d = DrumKit(hasTopHat = true, hasSnare = true)
    d.playTopHat()
    d.playSnare()

    d.hasSnare = false
    d.playTopHat()
    d.playSnare()
}

class DrumKit(var hasTopHat: Boolean, var hasSnare: Boolean) {

    fun playSnare() {
        if (hasSnare) {
            println("ding ding ba-da-bing!")
        }
    }

    fun playTopHat() {
        if (hasTopHat) {
            println("bang bang bang!")
        }
    }

}
