fun main(args: Array<String>) {

    print("Enter an integer: ");        //print message
    val n = readLine()!!.toInt();       //get user input, force unwrap using !!, and parse to int

    if (n % 2 != 0) {
        println("Weird.");      //if n mod 2 is not 0, then it's always odd
    } else {
        //all of these are cases for even numbers
        if (n >= 2 && n <= 5) {
            println("Not Weird.");        //in the inclusive range of [2,5]
        } else if (n >= 6 && n <= 20) {
            println("Weird.");      //in the inclusive range of [6,20]
        } else if (n > 20) {
            println("Not Weird.");      //n is even and greater than 20
        }
    }
}
