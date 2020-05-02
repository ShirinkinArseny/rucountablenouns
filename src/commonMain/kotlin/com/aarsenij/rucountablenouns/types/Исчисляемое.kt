package com.aarsenij.rucountablenouns.types

interface Исчисляемое {

    fun countedBy(amount: Number, numberAsText: Boolean = false): Посчитанное

}