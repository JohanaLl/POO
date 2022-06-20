class PayPal extends Payment {

    constructor(email) {
        super()
        this.email = email
    }

    printDataPayment() {
        super.printDataPayment()
        console.log("PayPal")
        console.log("email: ", this.email)
    }
}