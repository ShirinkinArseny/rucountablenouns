package com.aarsenij.rucountablenouns.internal

enum class NumeralCounty(val value: Int) {
    _1(1),
    _2(2),
    _5(5)
}

fun getNumeralCounty(value: Long): NumeralCounty {
    val _001 = value % 10
    val _010 = value / 10 % 10
    if (_001 == 1L && _010 != 1L) {
        return NumeralCounty._1
    }
    if (_010 != 1L && _001 >= 2 && _001 <= 4) {
        return NumeralCounty._2
    }
    return NumeralCounty._5
}