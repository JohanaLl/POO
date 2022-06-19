class PayPal extends Payment {

    constructor(email) {
        super()
        this.email = email
    }

    printDataPayment() {
        console.log("payment: PayPal")
        console.log("email: ", this.email)
    }
}