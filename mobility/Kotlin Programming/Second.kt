/*
fun main(){
    var ob = Employee(1,"XYZ",90000)
    var ob1 = Employee("ABC")

    ob.ename

    ob1.eno

    Employee.salary
    Employee.job()

    Bluetooth.meth1()


    //Object Expression
    var ob5 = object{
        var att1 = 5
        var att2 = "try"
    }

    ob5.att1







}

//Object Declaration
object Bluetooth{
    var att1 = ""
    var att2 = "empty"
    fun meth1(){

    }
}






//Object Extension
open class Employee{
    var eno = 0
    var ename = "dummy"
    companion object {
        var salary = 0
        fun job(){
            print("Doing Job")
        }
    }

    constructor(eno:Int,ename:String,salary:Int){
        this.eno = eno
        this.ename = ename
        //this.salary = salary
    }

    constructor(ename: String){
        this.ename = ename
    }



}*/


fun main(){
//    print(action(3,6,::compare))


    /*var result = 0
    var addition = { a:Int,b:Int -> result = a+b}
    addition(4,5)
    print(result)*/

    //var ob = Test()
    //ob.meth3()

    var var5 = "Infosys"
    print(var5.myFunction())


}

fun String.myFunction(): String{
    return this.substring(1..(this.length-2))
}


fun Test.meth3(){
    print("In Meth3")
}

class Test{
    fun meth1(){
        print("in meth1")
    }
    fun meth2(){
        print("in meth2")
    }
}







fun printLine(s:String){
    print(s)
}





fun compare(a:Int,b:Int):Int {
    return if(a>b) a else b
}

fun sum(a:Int,b:Int):Int {
    return a+b
}

fun action(x:Int, y:Int, act: (Int,Int)-> Int):Int{
    return act(x,y)
}