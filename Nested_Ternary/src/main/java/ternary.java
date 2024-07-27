public class ternary {
    public static void main(String[] args) {
        String day = "Saturday";
        boolean isRaining = false;
        boolean isWarm = true;

        // Nested ternary operator
        String activity = (day.equals("Saturday") || day.equals("Sunday")) ?
                (isRaining ?
                        "Watch a movie at home" :
                        (isWarm ? "Go to the beach" : "Go for a hike")
                ) :
                (isRaining ?
                        "Take an umbrella to work" :
                        "Have a normal work day"
                );

        System.out.println("Today's activity: " + activity);
    }
}
