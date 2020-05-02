package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.*
import com.aarsenij.rucountablenouns.internal.NumeralCounty
import com.aarsenij.rucountablenouns.internal.getNumeralCounty

class ПосчитанноеОхарактеризованноеСуществительное(
    числительное: Числительное,
    существительное: Существительное,
    прилагательное: Прилагательное
) : Словосочетание3<Падеж, РодПадеж, РодЧислоПадеж, ЧислоПадеж, Числительное, Прилагательное, Существительное>(
    числительное, прилагательное, существительное
), Посчитанное {

    override fun getForms(form: Падеж): Triple<РодПадеж, РодЧислоПадеж, ЧислоПадеж> {
        val (a, c) = ПосчитанноеСуществительное(component1, component3).getForms(form)
        val числоПадеж = when (getNumeralCounty(component1.getNumber())) {
            NumeralCounty._1 -> c
            NumeralCounty._2 -> {
                ЧислоПадеж(
                    Число.МНОЖЕСТВЕННОЕ,
                    if (form == Падеж.ИМЕНИТЕЛЬНЫЙ)
                        if (component3.род != Род.ЖЕНСКИЙ) {
                            Падеж.РОДИТЕЛЬНЫЙ
                        } else {
                            Падеж.ИМЕНИТЕЛЬНЫЙ
                        }
                    else
                        if (form == Падеж.ВИНИТЕЛЬНЫЙ && component3.род == Род.ЖЕНСКИЙ) {
                            Падеж.ИМЕНИТЕЛЬНЫЙ
                        } else
                            c.падеж
                )
            }
            NumeralCounty._5 -> {
                ЧислоПадеж(
                    c.число,
                    if (c.падеж == Падеж.ВИНИТЕЛЬНЫЙ)
                        Падеж.РОДИТЕЛЬНЫЙ
                    else
                        c.падеж
                )
            }
        }
        return Triple(a, РодЧислоПадеж(component3.род, числоПадеж.число, числоПадеж.падеж), c)
    }


}