public class SwitchCaseStatement{
    public static void main(String[] args){
        int day = 2;
        switch (day){
            // day == 0
            case 0:
                System.out.println("Sunday");
                break;
            // day == 1
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown day");
                break;
        }

        int status = 404;
        switch(status){
            // status == 200 || status == 201 || status == 202
            case 200:
            case 201:
            case 202:
                System.out.println("Success");
                break;
            // status == 401 || status == 404
            case 401:
            case 404:
                System.out.println("Not found");
                break;
            case 500, 501, 505:
                System.out.println("Server error");
                break;
            default:
                System.out.println("Unknown status");
                break;
        }

        // Nested swtich case
        String beverage = "Coke";
        char gender = 'F';
        switch(beverage){
            case "Coke":
                switch(gender){
                    // "Coke" and 'M'
                    case 'M':
                        System.out.println("Male");
                        break;
                    case 'F':
                        System.out.println("Female");
                        break;
                }
                System.out.println("Selected Coke");
                break;
            default:
                System.out.println("Unknown beverages");
                break;
        }

        // Task 1
        // make an int month 
        // int month = 5
        // 0 -> "Jan"
        // 1 -> "Feb"
        // 2 -> "Mar"
        // .. continue checking till 11
        // 11 -> "Dec"
        // else -> "Unknown month"

        // Task 2
        // make a variable locale
        // String locale = "np"
        // check the locale
        // "en" or "en/us" or "en/uk" -> "Selected english"
        // "jp" -> "Selected japanese"
        // "ch" -> "Selected chinese"
        // "np" -> "Selected nepali"
        // else -> "Unknown locale"
    }
}