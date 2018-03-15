fun main(args: Array<String>) {
    val list = IntArray(20)       //empty array initialized (size 20)
    var run = true     //flag for continuing the program

    while (run) {
        //while run flag is set to true, continue running program
        val c = readLine()     //get user input for command
        val d = c!!.split(" ")

        if (c == "exit") {
            run = false        //terminate program
        } else if (c == "print") {
            printArray(list)       //print array as is
        } else if (d[0] == "insert") {
            //first, get values i and e
            val i = d[1].toInt()
            val e = d[2].toInt()
            //insert element i into index e of array
            list[i] = e
        } else if (d[0] == "remove") {
            //first, get value e to remove
            val e = d[1].toInt()
            //iterate through array until value is found, and remove (set to 0)
            for (i in 0..list.size - 1) {
                if (list[i] == e) {
                    list[i] = 0
                }
            }
        } else if (c == "reverse") {
            list.reverse()
        } else if (c == "sort") {
            list.sort()
        }
    }

    println("Exiting now...")      //print exit msg
}

/**
 * Method to print array (not just the memory address of it)
 * @param arr : the array to print the contents of
 */
fun printArray(arr: IntArray) {
    print("[")
    var count = 0
    for (i in arr) {
        if (count == arr.size - 1) {
            print("${i}]\n")     //if it is last index, print with closing bracket
        } else {
            print("${i},")     //print element with comma
        }
        count++

    }
}