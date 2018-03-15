fun main(args: Array<String>) {
    //get user input and parse to int
    print("Enter an integer for value N: ");
    val n = readLine()!!.toInt();

    //first, check if N is greater than or equal to 1
    if (n >= 1) {
        //loop from 1 to N
        for (i in 1..n) {
            print(i);       //print i every time i is incremented to N
        }
    } else {
        println("Value N must be greater than or equal to 1...");
    }
}