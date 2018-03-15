fun main(args: Array<String>) {
    //get user input and parse to int
    print("Enter any year: ");
    val y = readLine()!!.toInt();

    //check if that year is a Leap Year and print appropriate message
    if (isLeapYear(y = y)) {
        println("${y} is a Leap Year!");
    } else {
        println("${y} is NOT a Leap Year.");
    }
}

/**
 * Method to determine if a given year is a Leap Year
 * @param y : the year integer
 * @return boolean : true or false depending on if leap year or not
 */
fun isLeapYear(y: Int): Boolean {
    //first, check if year is divisible by 4
    if (y % 4 == 0) {
        if (y % 100 == 0) {
            if (y % 400 == 0) {
                return true;        //if y is divisible by 400, it's always a Leap Year
            }
            return false;       //if y mod 100 = 0 , but y mod 400 != 0, it's no Leap Year
        }

        return true;        //if y mod 4 = 0 is only case that passes, its a Leap Year
    }

    return false;       //if no checks pass, then it's just not a Leap Year
}