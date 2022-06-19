from account import Account
from car import Car

if __name__ == "__main__":
    print("Hola mmundo")

    car = Car("AMS123", Account("Adres Herrera", "123456789"))
    print(vars(car))
    print(vars(car.driver))


