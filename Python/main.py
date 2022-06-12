from car import Car

if __name__ == "__main__":
    print("Hola mmundo")
    car = Car()
    car.lincense = "AMS234"
    car.driver = "Adres Herrera"
    print(vars(car))

    car2 = Car()
    car2.lincense = "QWN123"
    car2.driver = "Andrea Herrera"
    print(vars(car2))

