function Car(lincense, driver) {
    this.id
    this.lincense = lincense
    this.driver = driver
    this.passenger
}

Car.prototype.printDateCar = function() {
    console.log(this.driver)
    console.log(this.driver.name)
    console.log(this.driver.document)
}