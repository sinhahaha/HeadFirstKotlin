package e.sinjeba.heads.first.kotlin.song

fun main() {
    val song1 = Song("Lala", "Foo")
    val song2 = Song("Mmmhhh", "Bar")
    val song3 = Song("juhu", "artist")

    song2.play()
    song2.stop()
    song3.play()

}

class Song(val title: String, val artist: String) {

    fun play() {
        println("Playing the song $title by $artist")
    }

    fun stop() {
        println("Stopped playing $title by $artist")
    }
}
