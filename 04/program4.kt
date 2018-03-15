fun main(args: Array<String>) {

    //get user input for N and parse to int
    print("Enter an integer value for N: ");
    val n = readLine()!!.toInt();

    //first, check if n is greater or equal to 1
    if (n >= 1) {

        //loop from i starting at 1, to n
        for (i in 1..n) {
            println(i*i);       //print i * i which is i^2
        }
    } else {
        println("Value N must be greater or equal to 1");
    }
}