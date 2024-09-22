import java.util.Scanner;

public class temperatureConversion {

    public static void main(String[] args) {

        int option;
        System.out.println("Enter temperature conversion option:\n");
        System.out.println("1: Celsius to Fahrenheit\n");
        System.out.println("2: Fahrenheit to Celsius\n");
        System.out.println("3: Celsius to Kelvin\n");
        System.out.println("4: Kelvin to Celsius\n");
        System.out.println("5: Fahrenheit to Kelvin\n");
        System.out.println("6: Kelvin to Fahrenheit\n");
        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        scanner.nextLine();

        switch (option)
        {
        case 1:
            double celsius;
            System.out.println("Enter Celsuis");
            celsius=scanner.nextDouble();
            scanner.nextLine();
            System.out.println("CelsiusToFahrenheit--->"+CelsiusToFahrenheit(celsius));
            break;
    
        case 2:
            double fahrenheit;
            System.out.println("Enter Fahrenheid");
            fahrenheit=scanner.nextDouble();
            scanner.nextLine();
            System.out.println("FahrenheitToCelsius--->"+ FahrenheitToCelsius(fahrenheit));
            break;
    
        case 3:
            double celsius1;
            printf("Enter Celsuis");
            scanf("%lf", &celsius1);
            printf("CelsiusToKelvin--->%lf", CelsiusToKelvin(celsius1));
            break;
    
        case 4:
            double kelvin;
            printf("Enter Kelvin");
            scanf("%lf", &kelvin);
            printf("KelvinToCelsius--->%lf", KelvinToCelsius(kelvin));
            break;
    
        case 5:
            double fahrenheit1;
            printf("Enter Fahrenheid");
            scanf("%lf", &fahrenheit1);
            printf("FahrenheitToKelvin--->%lf", FahrenheitToKelvin(fahrenheit1));
            break;
    
        case 6:
            double kelvin1;
            printf("Enter Kelvin");
            scanf("%lf", &kelvin1);
            printf("KelvinToFahrenheit--->%lf", KelvinToFahrenheit(kelvin1));
            break;
    
        default:
            printf("invalied option:%d ", option);
            break;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double KelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double FahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double KelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

}