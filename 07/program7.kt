fun main(args: Array<String>) {
    var run = true;     //flag for continuing user operations
    val list = emptyArray<Int>();       //create empty integer array

    while (run) {
        //while run flag is set to true, continue running program
        val c = readLine()     //get user input for command
        val d = c!!.split(" ")

        if (c == "exit") {
            run = false        //terminate program
        }
    }

    print("Exiting now...");        //print exit msg to user
}