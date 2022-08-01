//convert temprature celcius to ferenheit
class Temprature {
    constructor(
        celcius: Double
    ){
        this.celcius = celcius
    }
    private  var _celcius : Double = 0.0 // private variable
    var celcius : Double
        get() {
            return this._celcius // get the  current value from get metthod
        }
        set(value) {
            this._celcius = value
        }
    var  fernhiet : Double
        get() {
            //(0°C × 9/5) + 32 = 32°F
            return (this.celcius * 9 /5) +32
        }
        set(value) {
            //(0°F − 32) × 5/9 = -17.78°C
            this._celcius = (value -32) * 5/9
        }

}



