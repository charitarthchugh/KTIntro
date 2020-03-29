import java.util.Arrays;//Same As java
fun main(args:Array<String>){
    /*
    *Kotlin does not need a semicolon- just go on to a new line
    *Only use them when need 2 statements on the same line
    */

    var name:String="Yello";
    // var declaration can be explicit or implicit
    var includeName ="$name Mello";
    //vars can be evaluated like above, within quotes (Spacing restrictions apply!)
    println(includeName);
    //or like plain ol' Java, where the quotes are broken for strings
    includeName=name+"Mello"
    println(includeName);
    /*
    * Basic Math Functionality is SAME AS JAVA.(Including Shortcut operators)
    * Default to Int(not lowercase int)
    * then Double(for decimals
    */
    var m:Int=2
    m++
    m+=3
    println(m)
    /*
    * If else functionality SAME AS JAVA
    */
    if (m==2) {
        println("true")
    }
    else
        println(false)
    /*
    * Arrays are DIFFERENT though
    * Kotlin has NATIVE ArrayList functionality
    * ArrayLists cannot be used- but use mutableListOf to get that functionality
    */
    var arrays= listOf<Int>(1,2,3)//Immutable (can't change)
    println(arrays)
    var change= mutableListOf<Int>()
    change.add(4)//Same as ArrayList
    println(change)

}