class Cash extends Payment {

    constructor() {
        super()
    }

    printDataPayment() {
        super.printDataPayment()
        console.log("payment: Cash")
    }
}