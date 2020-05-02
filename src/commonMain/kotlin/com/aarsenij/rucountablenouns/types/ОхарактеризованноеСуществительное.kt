package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.Падеж
import com.aarsenij.rucountablenouns.forms.РодЧислоПадеж
import com.aarsenij.rucountablenouns.forms.Число
import com.aarsenij.rucountablenouns.forms.ЧислоПадеж
import com.aarsenij.rucountablenouns.internal.getNumeral

class ОхарактеризованноеСуществительное(
    прилагательное: Прилагательное,
    существительное: Существительное
) : Словосочетание2<ЧислоПадеж, РодЧислоПадеж, ЧислоПадеж, Прилагательное, Существительное>(
    прилагательное,
    существительное
),
    Исчисляемое {

    override fun countedBy(amount: Number, numberAsText: Boolean): ПосчитанноеОхарактеризованноеСуществительное {
        return ПосчитанноеОхарактеризованноеСуществительное(
            getNumeral(
                amount.toLong(),
                numberAsText
            ), this.component2, this.component1
        )
    }

    override fun getForms(form: ЧислоПадеж): Pair<РодЧислоПадеж, ЧислоПадеж> {
        return Pair(РодЧислоПадеж(component2.род, form.число, form.падеж), form)
    }

    fun format(
        падеж: Падеж,
        число: Число
    ): String = format(ЧислоПадеж(падеж = падеж, число = число))

}