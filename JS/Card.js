class Card extends Payment {

    constructor(number, cvv, date) {
        super()
        this.number = number
        this.cvv = cvv
        this.date = date
    }

    //Polimorfismo
    printDataPayment() {
        super.printDataPayment()
        console.log("payment: Card")
        console.log("number: ", this.number, " cvv: ", this.cvv, " date: ", this.date)
    }
}