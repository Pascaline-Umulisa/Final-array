fun main(){
    var x=product(arrayOf(3,4,2,6))
    println(x)
    var y=mixed(arrayOf(2.0f,12,'h',"Paccy",3.6,1.3))
    println(y)
    var f=giveVowels(arrayOf('s','a','g','u','h'))
    println(f)

}
fun product(numbers:Array<Int>):Int{
    var theirProduct=1
    numbers.forEach { num->
        theirProduct*=num
    }
    return theirProduct

}
fun mixed(things:Array<Any>):Double{
    var a=0.0
    things.forEach{mix->
        if( mix is Double||mix is Float) {
            a += mix.toString().toDouble()
        }
    }
    return a

}
fun giveVowels(word:Array<Char>):Int{
    var b=0
        word.forEach{
        if(it=='a'||it=='i'||it=='u'||it=='e'||it=='o'){
            b++
        }
    }
    return b
}