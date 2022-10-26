/**
 * Two inputs: x items + percentage of wanted
 */


class PercentageCalc {

    fun findValueOf(per: Int, x: Double): Double {
        return (per / 100) * x
    }


    fun findValueOf(per: Int, x: Int): Int {
        return (per / 100) * x
    }


    fun findPercentAndAddOrg(per: Int, x: Int): Int {

        return x + findValueOf(per, x)

    }

    fun findPercentAndAddOrg(per: Int, x: Double): Double {

        return x + findValueOf(per, x)

    }
}


fun main() {


}