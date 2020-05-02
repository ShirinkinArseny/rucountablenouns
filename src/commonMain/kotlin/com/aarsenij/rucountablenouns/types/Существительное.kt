package com.aarsenij.rucountablenouns.types

import com.aarsenij.rucountablenouns.forms.Падеж
import com.aarsenij.rucountablenouns.forms.Род
import com.aarsenij.rucountablenouns.forms.Число
import com.aarsenij.rucountablenouns.forms.ЧислоПадеж
import com.aarsenij.rucountablenouns.internal.getNumeral

class Существительное(
    val именительныйЕдинственное: String,
    val родительныйЕдинственное: String,
    val дательныйЕдинственное: String,
    val винительныйЕдинственное: String,
    val творительныйЕдинственное: String,
    val предложныйЕдинственное: String,
    val именительныйМножественное: String,
    val родительныйМножественное: String,
    val дательныйМножественное: String,
    val винительныйМножественное: String,
    val творительныйМножественное: String,
    val предложныйМножественное: String,
    val род: Род
) : Исчисляемое, ЧастьРечи<ЧислоПадеж> {

    override fun format(form: ЧислоПадеж): String {
        fun om(a: String, b: String): String = if (form.число == Число.ЕДИНСТВЕННОЕ) a else b
        return when (form.падеж) {
            Падеж.ИМЕНИТЕЛЬНЫЙ -> om(именительныйЕдинственное, именительныйМножественное)
            Падеж.РОДИТЕЛЬНЫЙ -> om(родительныйЕдинственное, родительныйМножественное)
            Падеж.ДАТЕЛЬНЫЙ -> om(дательныйЕдинственное, дательныйМножественное)
            Падеж.ВИНИТЕЛЬНЫЙ -> om(винительныйЕдинственное, винительныйМножественное)
            Падеж.ТВОРИТЕЛЬНЫЙ -> om(творительныйЕдинственное, творительныйМножественное)
            Падеж.ПРЕДЛОЖНЫЙ -> om(предложныйЕдинственное, предложныйМножественное)
        }
    }

    override fun countedBy(amount: Number, numberAsText: Boolean): ПосчитанноеСуществительное {
        return ПосчитанноеСуществительное(
            getNumeral(
                amount.toLong(),
                numberAsText
            ), this
        )
    }

    fun propBy(прилагательное: Прилагательное) =
        ОхарактеризованноеСуществительное(прилагательное, this)

}

