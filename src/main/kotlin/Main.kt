fun main() {
  numbers()
    val nums = arrayOf(1, 2, 3, 4)
    var squares = emptyList<Int>()
    nums.forEachIndexed { index, nums ->
        squares
    }
    println(nums(arrayOf(3.33,40,60,4.44,89.43,45)))


    val name="Adalab"
    for(char in name ){
        println(char)
    }
    for(x in 64..74){
        println(x*x)
    }

    var language= arrayOf("Zulu","Kiswahili","Kinyarwanda","Kiburundi")
    for(lang in language){
        println("I can speak $lang")
    }

    ageClassifier(1)
    ageClassifier(3)
    ageClassifier(15)
    ageClassifier(23)

    isPositive(3)
    isPositive(-7)

    countries("Rwanda")
    countries("Ghana")
    countries("Portugal")
    countries("Wales")
    countries("Uganda")

    ageGaps(9)
    ageGaps(59)
    ageGaps(0)
    ageGaps(4)
    ageGaps(10)
    ageGaps(23)
    ageGaps(15)


}


fun ageClassifier(age:Int){
    when (age){
        in 0..1 -> println("you are a baby")
        in 2..3 -> println("you are a toddler")
        in 4..17 -> println("you are a child")
        else -> println("you are an adult")


        }
    if(age in 0..1){
        println("you are a baby")
    }
    else if(age in 2..3){
        println("you are a toddler")
    }
    else if(age in 4..17){
        if(age<13){
            println("you are a child")
        }else{
            println("you are a teeneger")
        }

    }
    else{
        println("you are not a teeneger")
    }

}


fun isPositive(num:Int){
    if(num>0){
        println("Positive")
    }else{
        println("Negative")
    }
}

//write a function that takes in a country and prints out corresponding nationality for each of the following
// countries:
//Rwanda,Ghana,Portugal,Wales.Any other country should default to "Not applicable"
fun countries(name:String){
     when (name){
      "Ghana"-> println(" You are Ghanian")
         "Rwanda"-> println("You areRwandies")
         "Portugal"-> println("You are portugues")
         "Wales"-> println("You are Wallsh")
         else-> println("Not applicable")
     }
     }

//Write a function that takes in an array of random integers and prints out whether each is odd or even.
fun numbers() {
    val nums = arrayOf(1, 2, 4, 6, 10, 24, 17, 9, 5)

    for (num in nums) {
        if (num % 2 == 0) {
            println("$num is even")
        } else {
            println("$num is odd")
        }
    }
}


// write a function that takes in an array of
// mixed types and returns the sum of all
// the decimal elements
fun nums(num:Array<Any>):Double{
     var numbers=0.00
    for (w in num){
        if (w is Double){
            numbers +=w
        }
    }
    return numbers
}


fun ageGaps(age:Int){
    when(age){
        in 0..1 -> println("You are a baby")
        in 1..3 -> println("You are a toddler")
        in 4..17 -> println("You are a child")
        else -> println("You are an adult")
    }

}





