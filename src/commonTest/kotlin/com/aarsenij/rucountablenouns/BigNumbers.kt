package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import kotlin.test.Test
import kotlin.test.assertEquals

class BigNumbers {

    @Test
    fun `987654321, именительный падеж`() {
        assertEquals(
            "девятьсот восемьдесят семь миллионов шестьсот пятьдесят четыре тысячи триста двадцать один рубль",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `123456789, именительный падеж`() {
        assertEquals(
            "сто двадцать три миллиона четыреста пятьдесят шесть тысяч семьсот восемьдесят девять рублей",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `987654321, родительный падеж`() {
        assertEquals(
            "девятисот восьмидесяти семи миллионов шестисот пятидесяти четырёх тысяч трёхсот двадцати одного рубля",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `123456789, родительный падеж`() {
        assertEquals(
            "ста двадцати трёх миллионов четырёхсот пятидесяти шести тысяч семисот восьмидесяти девяти рублей",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `987654321, дательный падеж`() {
        assertEquals(
            "девятистам восьмидесяти семи миллионам шестистам пятидесяти четырём тысячам трёмстам двадцати одному рублю",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `123456789, дательный падеж`() {
        assertEquals(
            "ста двадцати трём миллионам четырёмстам пятидесяти шести тысячам семистам восьмидесяти девяти рублям",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `987654321, винительный падеж`() {
        assertEquals(
            "девятьсот восемьдесят семь миллионов шестьсот пятьдесят четыре тысячи триста двадцать один рубль",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `123456789, винительный падеж`() {
        assertEquals(
            "сто двадцать три миллиона четыреста пятьдесят шесть тысяч семьсот восемьдесят девять рублей",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `987654321, творительный падеж`() {
        assertEquals(
            "девятьюстами восьмьюдесятью семью миллионами шестьюстами пятьюдесятью четырьмя тысячами тремястами двадцатью одним рублём",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `123456789, творительный падеж`() {
        assertEquals(
            "ста двадцатью тремя миллионами четырьмястами пятьюдесятью шестью тысячами семьюстами восьмьюдесятью девятью рублями",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }


    @Test
    fun `987654321, предложный падеж`() {
        assertEquals(
            "девятистах восьмидесяти семи миллионах шестистах пятидесяти четырёх тысячах трёхстах двадцати одном рубле",
            roubleNoun.countedBy(987654321, numberAsText = true).format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `123456789, предложный падеж`() {
        assertEquals(
            "ста двадцати трёх миллионах четырёхстах пятидесяти шести тысячах семистах восьмидесяти девяти рублях",
            roubleNoun.countedBy(123456789, numberAsText = true).format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

}