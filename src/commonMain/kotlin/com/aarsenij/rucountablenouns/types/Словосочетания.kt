package com.aarsenij.rucountablenouns.types

abstract class Словосочетание2<FORM, F1, F2, W1 : ЧастьРечи<F1>, W2 : ЧастьРечи<F2>>(
    val component1: W1,
    val component2: W2
) : ЧастьРечи<FORM> {

    abstract fun getForms(form: FORM): Pair<F1, F2>

    override fun format(form: FORM): String {
        val forms = getForms(form)
        val w1 = component1.format(forms.first)
        val w2 = component2.format(forms.second)
        return "$w1 $w2"
    }

}

abstract class Словосочетание3<FORM, F1, F2, F3, W1 : ЧастьРечи<F1>, W2 : ЧастьРечи<F2>, W3 : ЧастьРечи<F3>>(
    val component1: W1,
    val component2: W2,
    val component3: W3
) : ЧастьРечи<FORM> {

    abstract fun getForms(form: FORM): Triple<F1, F2, F3>

    override fun format(form: FORM): String {
        val forms = getForms(form)
        val w1 = component1.format(forms.first)
        val w2 = component2.format(forms.second)
        val w3 = component3.format(forms.third)
        return "$w1 $w2 $w3"
    }

}