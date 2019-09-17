fun main(){
    //print("Hello World")


    /*var var1 = "First Variable"
    var1 = "Changed"

    val val1 = 34
    val1 = 5*/


    /*var arr = arrayOf<Int>(3,4,5,6,7)
    arr[4] = 10*/
   /* var a = 5
    var b = 9
    var greater = if(a>b){
        println("a is greater")
        a
        34
    }else{
        println("b is greater")
        43
        b
    }
    println(greater)
*/

    /*var str = "match"
    var result :String
     result = when(str){
         "dismatch" -> "str is dismatch"
         "another" -> "str is another"
         "match" -> {
             "str is match"
             "another statement"
         }
         else -> "str was not determined"
     }*/


    /*var myRange = 10.downTo(1) step 2
    for(element in myRange){
        print("" + element + " ")
    }
*/

    /*var object1 = Batch4(46)
    object1.strength*/

    /*var ob = A(5,"Hello")
    print(ob)*/

}

abstract class Phone{
    abstract var model:String
}
interface Landline{
    var model:String
}

class SmartPhone : Phone(), Landline {
    override var model: String = "S7"

}


//data class A(var att1: Int, var str:String)

/*
open class Batch4{
    open var att1 = 34
}

class SuperClass : Batch4(){
    override var att1: Int = 35
    var att2 = "super"
    fun meth(){

    }
}*/
