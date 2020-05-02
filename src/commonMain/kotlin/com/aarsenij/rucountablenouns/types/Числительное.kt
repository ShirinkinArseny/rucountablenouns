package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.РодПадеж

interface Числительное: ЧастьРечи<РодПадеж> {

    fun getNumber(): Long

    override fun format(form: РодПадеж): String

}