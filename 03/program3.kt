fun main(args: Array<String>) {

    //get user inputs for a and b and parse to int
    print("Enter an integer value for a: ");
    val a = readLine()!!.toInt();
    print("Enter an integer value for b: ");
    val b = readLine()!!.toInt();

    println("Integer division result: ${a / b}");       //regular integer division is simple

    println("Float division result: ${a.toFloat() / b}");       //only one has to be a float, so we converted a
}