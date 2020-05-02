package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.Падеж

interface Посчитанное : ЧастьРечи<Падеж> {

    override fun format(form: Падеж): String

}