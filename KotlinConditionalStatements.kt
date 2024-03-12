fun main(args: Array<String>) {
    var age: Int
    age = 20
    if (age < 20) {
        println("sorry,$age is below the target range")
    } else {
        println("your $age is above the target range and you qualify")
    }
    var number:Int
    number = 5
    if(number==1){
        println("oops,you lost the guess")
    }else if(number==2){
        println("oops you almost got it right")
    }else if(number==3){
        println("wow,congratulations you won")
    }else if(number==4) {
        println("oh my, you got it wrong")
    }else if(number==5){
        println("keep going,your almost a champion")
    }else{
        println("$number is not valid,please enter again")
    }
    //WHEN STATEMENT
    var y:Int
    y = 0
    when(y){
        1 -> println("oops ,you lost the game")
        2 -> println("oops, you almost got it right")
        3 -> println("wow,congratulations")
        else-> println("$y is not valid. please try again")
    }
//declare a height and weight variable.
//perform the BMI of the person using the two variables above
//using theirBMI perform the output below;
//BMI less than 18,output is "you are underweight"
//BMI between 18-25 output is "you are average
//BMI between 25-30 output iS "you are overweight"
//BMI above 30, output is "you are obese


// declare a height and weight variable.
var height:Int
var weight:Int
height = 35
weight = 90
var BMI= weight/(height*height)
BMI = 35
//perform the BMI of the person using the two variables above
    when(BMI) {
        18 -> println("you are underweight")
        18 - 25 -> println("you are underweight")
        25 - 30 -> println("you are overweight")
        else -> println("$BMI you are obese")


    }
}
