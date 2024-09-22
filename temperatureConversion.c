#include <stdio.h>


double CelsiusToFahrenheit(double celsius)
{
    return (celsius * 9 / 5) + 32;
}
double FahrenheitToCelsius(double fahrenheit)
{
    return (fahrenheit - 32) * 5 / 9;
}
double CelsiusToKelvin(double celsius)
{
    return celsius + 273.15;
}
double KelvinToCelsius(double kelvin)
{
    return kelvin - 273.15;
}
double FahrenheitToKelvin(double fahrenheit)
{
    return (fahrenheit - 32) * 5 / 9 + 273.15;
}
double KelvinToFahrenheit(double kelvin)
{
    return (kelvin - 273.15) * 9 / 5 + 32;
}


int main()
{
    int option;
    printf("Enter temperature conversion option:\n");
    printf("1: Celsius to Fahrenheit\n");
    printf("2: Fahrenheit to Celsius\n");
    printf("3: Celsius to Kelvin\n");
    printf("4: Kelvin to Celsius\n");
    printf("5: Fahrenheit to Kelvin\n");
    printf("6: Kelvin to Fahrenheit\n");
    scanf("%d", &option);

    switch (option)
    {
    case 1:
        double celsius;
        printf("Enter Celsuis");
        scanf("%lf", &celsius);
        printf("CelsiusToFahrenheit--->%lf", CelsiusToFahrenheit(celsius));
        break;

    case 2:
        double fahrenheit;
        printf("Enter Fahrenheid");
        scanf("%lf", &fahrenheit);
        printf("FahrenheitToCelsius--->%lf", FahrenheitToCelsius(fahrenheit));
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
}


