package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.Падеж
import com.aarsenij.rucountablenouns.forms.РодПадеж
import com.aarsenij.rucountablenouns.forms.Число
import com.aarsenij.rucountablenouns.forms.ЧислоПадеж
import com.aarsenij.rucountablenouns.internal.NumeralCounty
import com.aarsenij.rucountablenouns.internal.getNumeralCounty

class ПосчитанноеСуществительное(
    числительное: Числительное,
    существительное: Существительное
) : Словосочетание2<Падеж, РодПадеж, ЧислоПадеж, Числительное, Существительное>(
    числительное, существительное
), Посчитанное {

    override fun getForms(form: Падеж): Pair<РодПадеж, ЧислоПадеж> {
        val n = component1.getNumber()
        val numeralCounty = getNumeralCounty(n)
        return РодПадеж(component2.род, form) to when {
            n % 1000 == 0L -> {
                ЧислоПадеж(Число.МНОЖЕСТВЕННОЕ, Падеж.РОДИТЕЛЬНЫЙ)
            }
            numeralCounty == NumeralCounty._1 -> {
                ЧислоПадеж(Число.ЕДИНСТВЕННОЕ, form)
            }
            numeralCounty == NumeralCounty._2 -> {
                when (form) {
                    Падеж.ИМЕНИТЕЛЬНЫЙ -> ЧислоПадеж(Число.ЕДИНСТВЕННОЕ, Падеж.РОДИТЕЛЬНЫЙ)
                    Падеж.ВИНИТЕЛЬНЫЙ -> ЧислоПадеж(Число.ЕДИНСТВЕННОЕ, Падеж.РОДИТЕЛЬНЫЙ)
                    else -> ЧислоПадеж(Число.МНОЖЕСТВЕННОЕ, form)
                }
            }
            else -> when (form) {
                Падеж.ИМЕНИТЕЛЬНЫЙ -> ЧислоПадеж(Число.МНОЖЕСТВЕННОЕ, Падеж.РОДИТЕЛЬНЫЙ)
                Падеж.ВИНИТЕЛЬНЫЙ -> ЧислоПадеж(Число.МНОЖЕСТВЕННОЕ, Падеж.РОДИТЕЛЬНЫЙ)
                else -> ЧислоПадеж(Число.МНОЖЕСТВЕННОЕ, form)
            }
        }
    }

}
