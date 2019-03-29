
fun main(args: Array<String>){
    val scope = "World!!"

    println("Hello, $scope")


    val name: String? = null
    val len  = name?.length

    println(len)
}