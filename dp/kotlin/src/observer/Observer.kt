package observer

// The Observers update method is called when the Subject changes

interface Observer {

    fun update(ibmPrice: Double, aaplPrice: Double, googPrice: Double)

}