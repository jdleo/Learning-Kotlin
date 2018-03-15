fun main(args: Array<String>) {

    //get user input and parse to integer for a
    print("Enter an integer for value a: ");
    val a = readLine()!!.toInt();

    //get user input and parse to integer for b
    print("Enter an integer for value b: ");
    val b = readLine()!!.toInt();

    println("(a + b) = ${a + b}");      //print a+b

    println("(a - b) = ${a - b}");      //print a-b

    println("(a * b) = ${a * b}");      //print a*b
}