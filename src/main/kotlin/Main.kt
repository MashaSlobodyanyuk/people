fun main() {

    var likes = 11


    val person = if ((likes % 10).equals(1) && (!(likes).equals(11))){
        println("Понравилось $likes человеку")
    } else{
        println("Понравилось $likes людям")
    }
}