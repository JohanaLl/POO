var car = new Car("AWS562", new Account("Andres herrera", "123456"))
car.passenger = 4
car.printDateCar()

var uberX = new UberX("QWE123", new Account("Andrea Ferrant", "789456"), "Chevrolet", "Spark")
uberX.passenger = 4
uberX.printDateCar()

var card = new Card(1234567891234567891, 123, "01/2040")
card.printDataPayment()

var paypal = new PayPal("paypal@correo.com")
paypal.printDataPayment()