package practice1;

public class Exam {

}
import java.util.Arrays;

public class EvenOddDivisibleBy3Or5 {

    public static void main(String[] args) {
        int[] list1 = new int[12];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            list1[i] = scanner.nextInt();
        }

        int[] even = new int[size];
        int[] odd = new int[size];

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (list1[i] % 2 == 0) {
                even[evenCount] = list1[i];
                evenCount++;
            } else {
                odd[oddCount] = list1[i];
                oddCount++;
            }
        }

        // Display the even and odd arrays
        System.out.println("The even list: " + Arrays.toString(even));
        System.out.println("The odd list: " + Arrays.toString(odd));

        // Find the numbers that are divisible by 3 or 5
        int[] divisibleBy3Or5 = new int[size];
        int divisibleCount = 0;

        for (int i = 0; i < evenCount; i++) {
            if (even[i] % 3 == 0 || even[i] % 5 == 0) {
                divisibleBy3Or5[divisibleCount] = even[i];
                divisibleCount++;
            }
        }

        for (int i = 0; i < oddCount; i++) {
            if (odd[i] % 3 == 0 || odd[i] % 5 == 0) {
                divisibleBy3Or5[divisibleCount] = odd[i];
                divisibleCount++;
            }
        }

        // Display the numbers that are divisible by 3 or 5
        System.out.println("The numbers that are divisible by 3 or 5 are: ");
        for (int i = 0; i < divisibleCount; i++) {
            System.out.print(divisibleBy3Or5[i] + " ");
        }
        System.out.println();
    }
}

//qstn2
public class Vehicle {
    private String brand;
    private String model;
    private double price;
    private boolean available;

    public Vehicle(String brand, String model, double price, boolean available) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.available = available;
    }

    public void printInfo() {
        System.out.println("Vehicle Details");
        System.out.println("Car brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Availability: " + (available ? "Yes" : "No"));
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class Car extends Vehicle {

    @Override
    public void vehicleInfo() {
        System.out.println("Vehicle Details");
        System.out.println("Car brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Availability: " + (isAvailable() ? "Yes" : "No"));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car brand: ");
        String brand = scanner.nextLine();

        System.out.println("Enter car model: ");
        String model = scanner.nextLine();

        System.out.println("Enter car price: ");
        double price = scanner.nextDouble();

        System.out.println("Car availability: ");
        boolean available = scanner.nextBoolean();

        Car car = new Car(brand, model, price, available);
        car.vehicleInfo();
    }
}


//qstn 3

//data pcpublic class Admin {
private int id;
private String name;
private String email;

// getters and setters
}

public class User {
private int id;
private String name;
private String email;

// getters and setters
}

public class Movie {
private int id;
private String title;
private String genre;
private double rating;
private int seats;

// getters and setters
}

public class Booking {
private int id;
private User user;
private Movie movie;
private int numberOfSeats;

// getters and setters
}

public class Payment {
private int id;
private Booking booking;
private double amount;

// getters and setters
}


//launcher
public class Main {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();

        // Fetch the movie details from the CSV file
        List<Movie> movies = movieService.fetchMovieDetailsFromCSV();

        // Check if there is any null/empty/0 in the CSV file for the rating field
        boolean hasNullRating = movies.stream().anyMatch(movie -> movie.getRating() == 0);
        if (hasNullRating) {
            System.out.println("There is a null/empty/0 rating in the CSV file");
            return;
        }

        // Sort the list of movies in ascending order according to the rating field
        movies.sort((movie1, movie2) -> Double.compare(movie1.getRating(), movie2.getRating()));

        // Display only the movies that has availability which has field seats - “available”
        System.out.println("Movies with available seats:");
        movies.stream().filter(movie -> movie.getSeats() > 0).forEach(movie -> System.out.println(movie));

        // Replace the value of the seats “not available” to “HouseFull” if the rating > 4.5
        movies.stream().filter(movie -> movie.getRating() > 4.5 && movie.getSeats() == 0).forEach(movie -> movie.setSeats("HouseFull"));

        // Display all the movies
        System.out.println("All movies:");
        movies.forEach(movie -> System.out.println(movie));
    }
}


