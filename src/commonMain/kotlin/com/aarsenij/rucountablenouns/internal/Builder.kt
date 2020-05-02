package com.aarsenij.rucountablenouns.internal

import com.aarsenij.rucountablenouns.forms.Падеж
import com.aarsenij.rucountablenouns.forms.Род
import com.aarsenij.rucountablenouns.forms.РодПадеж
import com.aarsenij.rucountablenouns.types.ПосчитанноеСуществительное
import com.aarsenij.rucountablenouns.types.Существительное
import com.aarsenij.rucountablenouns.types.Числительное

private fun ifNotZero(data: Long, value: () -> String): String {
    if (data == 0L) return ""
    return value()
}

private fun removeExtraSpaces(s: String): String {
    var res = s
    while (res.contains("  ")) {
        res = res.replace("  ", " ")
    }
    while (res.startsWith(" ")) res = res.substring(1)
    while (res.endsWith(" ")) res = res.substring(0, res.length - 1)
    return res
}

fun getNumeral(count: Long, showNumberAsText: Boolean): Числительное {

    if (!showNumberAsText) {
        return object : Числительное {
            override fun format(form: РодПадеж): String {
                return count.toString()
            }

            override fun getNumber(): Long {
                return count
            }
        }
    }

    if (count == 0L) return __0
    if (count == 1L) return __1
    if (count == 2L) return __2
    if (count == 3L) return __3
    if (count == 4L) return __4
    if (count == 5L) return __5
    if (count == 6L) return __6
    if (count == 7L) return __7
    if (count == 8L) return __8
    if (count == 9L) return __9
    if (count == 10L) return __10
    if (count == 11L) return __11
    if (count == 12L) return __12
    if (count == 13L) return __13
    if (count == 14L) return __14
    if (count == 15L) return __15
    if (count == 16L) return __16
    if (count == 17L) return __17
    if (count == 18L) return __18
    if (count == 19L) return __19
    if (count == 20L) return __20
    if (count == 30L) return __30
    if (count == 40L) return __40
    if (count == 50L) return __50
    if (count == 60L) return __60
    if (count == 70L) return __70
    if (count == 80L) return __80
    if (count == 90L) return __90
    if (count == 100L) return __100
    if (count == 200L) return __200
    if (count == 300L) return __300
    if (count == 400L) return __400
    if (count == 500L) return __500
    if (count == 600L) return __600
    if (count == 700L) return __700
    if (count == 800L) return __800
    if (count == 900L) return __900

    if (count <= 999) {
        val _100 = count / 100
        val _010 = count / 10 % 10
        val _001 = count % 10
        return object : Числительное {
            override fun format(form: РодПадеж): String {
                val res = if (_010 == 1L) {
                    ifNotZero(_100) { getNumeral(_100 * 100, true).format(form) } + " " +
                            getNumeral(_010 * 10 + _001, true).format(form)
                } else {
                    ifNotZero(_100) { getNumeral(_100 * 100, true).format(form) } + " " +
                            ifNotZero(_010) { getNumeral(_010 * 10, true).format(form) } + " " +
                            ifNotZero(_001) { getNumeral(_001, true).format(form) }
                }
                return removeExtraSpaces(res)
            }

            override fun getNumber(): Long {
                return count
            }
        }
    }

    val квинтиллионы = count / 1000000000000000000 % 1000
    val квадриллионы = count / 1000000000000000 % 1000
    val триллионы = count / 1000000000000 % 1000
    val миллиарды = count / 1000000000 % 1000
    val миллионы = count / 1000000 % 1000
    val тысячи = count / 1000 % 1000
    val единицы = count % 1000

    val разряды = listOf(
        квинтиллион to квинтиллионы,
        квадриллион to квадриллионы,
        триллион to триллионы,
        миллиард to миллиарды,
        миллион to миллионы,
        тысяча to тысячи
    )

    return object : Числительное {
        override fun format(form: РодПадеж): String {
            val res = разряды.map {
                ifNotZero(it.second) {
                    ПосчитанноеСуществительное(
                        getNumeral(it.second, true),
                        it.first
                    ).format(form.падеж)
                }
            }.reduce { a, b -> "$a $b" } + " " +
                    ifNotZero(единицы) { getNumeral(единицы, true).format(form) }
            return removeExtraSpaces(res)
        }

        override fun getNumber(): Long {
            return count
        }
    }

}

private fun buildShortChislitelnoye(
    именительный: String,
    родительный: String,
    дательный: String,
    винительный: String,
    творительный: String,
    предложный: String,
    number: Int
): Числительное {
    return object : Числительное {
        override fun format(form: РодПадеж): String {
            return when (form.падеж) {
                Падеж.ИМЕНИТЕЛЬНЫЙ -> именительный
                Падеж.РОДИТЕЛЬНЫЙ -> родительный
                Падеж.ДАТЕЛЬНЫЙ -> дательный
                Падеж.ВИНИТЕЛЬНЫЙ -> винительный
                Падеж.ТВОРИТЕЛЬНЫЙ -> творительный
                Падеж.ПРЕДЛОЖНЫЙ -> предложный
            }
        }

        override fun getNumber(): Long {
            return number.toLong()
        }
    }
}

private fun buildShortChislitelnoye(
    именительныйМужской: String,
    родительныйМужской: String,
    дательныйМужской: String,
    винительныйМужской: String,
    творительныйМужской: String,
    предложныйМужской: String,
    именительныйЖенский: String,
    родительныйЖенский: String,
    дательныйЖенский: String,
    винительныйЖенский: String,
    творительныйЖенский: String,
    предложныйЖенский: String,
    именительныйСредний: String,
    родительныйСредний: String,
    дательныйСредний: String,
    винительныСредний: String,
    творительныйСредний: String,
    предложныйСредний: String,
    number: Int
): Числительное {
    return object : Числительное {
        override fun format(form: РодПадеж): String {
            return when (form.род) {
                Род.МУЖСКОЙ -> {
                    when (form.падеж) {
                        Падеж.ИМЕНИТЕЛЬНЫЙ -> именительныйМужской
                        Падеж.РОДИТЕЛЬНЫЙ -> родительныйМужской
                        Падеж.ДАТЕЛЬНЫЙ -> дательныйМужской
                        Падеж.ВИНИТЕЛЬНЫЙ -> винительныйМужской
                        Падеж.ТВОРИТЕЛЬНЫЙ -> творительныйМужской
                        Падеж.ПРЕДЛОЖНЫЙ -> предложныйМужской
                    }
                }
                Род.ЖЕНСКИЙ -> {
                    when (form.падеж) {
                        Падеж.ИМЕНИТЕЛЬНЫЙ -> именительныйЖенский
                        Падеж.РОДИТЕЛЬНЫЙ -> родительныйЖенский
                        Падеж.ДАТЕЛЬНЫЙ -> дательныйЖенский
                        Падеж.ВИНИТЕЛЬНЫЙ -> винительныйЖенский
                        Падеж.ТВОРИТЕЛЬНЫЙ -> творительныйЖенский
                        Падеж.ПРЕДЛОЖНЫЙ -> предложныйЖенский
                    }
                }
                Род.СРЕДНИЙ -> {
                    when (form.падеж) {
                        Падеж.ИМЕНИТЕЛЬНЫЙ -> именительныйСредний
                        Падеж.РОДИТЕЛЬНЫЙ -> родительныйСредний
                        Падеж.ДАТЕЛЬНЫЙ -> дательныйСредний
                        Падеж.ВИНИТЕЛЬНЫЙ -> винительныСредний
                        Падеж.ТВОРИТЕЛЬНЫЙ -> творительныйСредний
                        Падеж.ПРЕДЛОЖНЫЙ -> предложныйСредний
                    }
                }
            }
        }

        override fun getNumber(): Long {
            return number.toLong()
        }
    }
}

private val __0 = buildShortChislitelnoye(
    "ноль", "ноля", "нолю", "ноль", "нолём", "ноле", 0
)

private val __1 = buildShortChislitelnoye(
    "один", "одного", "одному", "один", "одним", "одном",
    "одна", "одной", "одной", "одну", "одной", "одной",
    "одно", "одного", "одному", "одно", "одним", "одном",
    1
)

private val __2 = buildShortChislitelnoye(
    "два", "двух", "двум", "два", "двумя", "двух",
    "две", "двух", "двум", "две", "двумя", "двух",
    "два", "двух", "двум", "два", "двумя", "двух",
    2
)

private val __3 = buildShortChislitelnoye(
    "три", "трёх", "трём", "три", "тремя", "трёх", 3
)

private val __4 = buildShortChislitelnoye(
    "четыре", "четырёх", "четырём", "четыре", "четырьмя", "четырёх", 4
)

private val __5 = buildShortChislitelnoye(
    "пять", "пяти", "пяти", "пять", "пятью", "пяти", 5
)

private val __6 = buildShortChislitelnoye(
    "шесть", "шести", "шести", "шесть", "шестью", "шести", 6
)

private val __7 = buildShortChislitelnoye(
    "семь", "семи", "семи", "семь", "семью", "семи", 7
)

private val __8 = buildShortChislitelnoye(
    "восемь", "восьми", "восьми", "восемь", "восьмью", "восьми", 8
)

private val __9 = buildShortChislitelnoye(
    "девять", "девяти", "девяти", "девять", "девятью", "девяти", 9
)

private val __10 = buildShortChislitelnoye(
    "десять", "десяти", "десяти", "десять", "десятью", "десяти", 10
)

private val __11 = buildShortChislitelnoye(
    "одиннадцать", "одиннадцати", "одиннадцати", "одиннадцать", "одиннадцатью", "одиннадцати", 11
)

private val __12 = buildShortChislitelnoye(
    "двенадцать", "двенадцати", "двенадцати", "двенадцать", "двенадцатью", "двенадцати", 12
)

private val __13 = buildShortChislitelnoye(
    "тринадцать", "тринадцати", "тринадцати", "тринадцать", "тринадцатью", "тринадцати", 13
)

private val __14 = buildShortChislitelnoye(
    "четырнадцать", "четырнадцати", "четырнадцати", "четырнадцать", "четырнадцатью", "четырнадцати", 14
)

private val __15 = buildShortChislitelnoye(
    "пятнадцать", "пятнадцати", "пятнадцати", "пятнадцать", "пятнадцатью", "пятнадцати", 15
)

private val __16 = buildShortChislitelnoye(
    "шестнадцать", "шестнадцати", "шестнадцати", "шестнадцать", "шестнадцатью", "шестнадцати", 16
)

private val __17 = buildShortChislitelnoye(
    "семнадцать", "семнадцати", "семнадцати", "семнадцать", "семнадцатью", "семнадцати", 17
)

private val __18 = buildShortChislitelnoye(
    "восемнадцать", "восемнадцати", "восемнадцати", "восемнадцать", "восемнадцатью", "восемнадцати", 18
)

private val __19 = buildShortChislitelnoye(
    "девятнадцать", "девятнадцати", "девятнадцати", "девятнадцать", "девятнадцатью", "девятнадцати", 19
)

private val __20 = buildShortChislitelnoye(
    "двадцать", "двадцати", "двадцати", "двадцать", "двадцатью", "двадцати", 20
)

private val __30 = buildShortChislitelnoye(
    "тридцать", "тридцати", "тридцати", "тридцать", "тридцатью", "тридцати", 30
)

private val __40 = buildShortChislitelnoye(
    "сорок", "сорока", "сорока", "сорок", "сорока", "сорока", 40
)

private val __50 = buildShortChislitelnoye(
    "пятьдесят", "пятидесяти", "пятидесяти", "пятьдесят", "пятьюдесятью", "пятидесяти", 50
)

private val __60 = buildShortChislitelnoye(
    "шестьдесят", "шестидесяти", "шестидесяти", "шестьдесят", "шестьюдесятью", "шестидесяти", 60
)

private val __70 = buildShortChislitelnoye(
    "семьдесят", "семидесяти", "семидесяти", "семьдесят", "семьюдесятью", "семидесяти", 70
)

private val __80 = buildShortChislitelnoye(
    "восемьдесят", "восьмидесяти", "восьмидесяти", "восемьдесят", "восьмьюдесятью", "восьмидесяти", 80
)

private val __90 = buildShortChislitelnoye(
    "девяносто", "девяноста", "девяноста", "девяносто", "девяноста", "девяноста", 90
)

private val __100 = buildShortChislitelnoye(
    "сто", "ста", "ста", "сто", "ста", "ста", 100
)

private val __200 = buildShortChislitelnoye(
    "двести", "двухсот", "двумстам", "двести", "двумястами", "двухстах", 200
)

private val __300 = buildShortChislitelnoye(
    "триста", "трёхсот", "трёмстам", "триста", "тремястами", "трёхстах", 300
)

private val __400 = buildShortChislitelnoye(
    "четыреста", "четырёхсот", "четырёмстам", "четыреста", "четырьмястами", "четырёхстах", 400
)

private val __500 = buildShortChislitelnoye(
    "пятьсот", "пятисот", "пятистам", "пятьсот", "пятьюстами", "пятистах", 500
)

private val __600 = buildShortChislitelnoye(
    "шестьсот", "шестисот", "шестистам", "шестьсот", "шестьюстами", "шестистах", 600
)

private val __700 = buildShortChislitelnoye(
    "семьсот", "семисот", "семистам", "семьсот", "семьюстами", "семистах", 700
)

private val __800 = buildShortChislitelnoye(
    "восемьсот", "восьмисот", "восьмистам", "восемьсот", "восьмьюстами", "восьмистах", 800
)

private val __900 = buildShortChislitelnoye(
    "девятьсот", "девятисот", "девятистам", "девятьсот", "девятьюстами", "девятистах", 900
)

//10^3
val тысяча = Существительное(
    "тысяча", "тысячи", "тысяче", "тысячу", "тысячей", "тысяче",
    "тысячи", "тысяч", "тысячам", "тысячи", "тысячами", "тысячах",
    Род.ЖЕНСКИЙ
)

//10^6
val миллион = Существительное(
    "миллион", "миллиона", "миллиону", "миллион", "миллионом", "миллионе",
    "миллионы", "миллионов", "миллионам", "миллионы", "миллионами", "миллионах",
    Род.МУЖСКОЙ
)

//10^9
val миллиард = Существительное(
    "миллиард", "миллиарда", "миллиарду", "миллиард", "миллиардом", "миллиарде",
    "миллиарды", "миллиардов", "миллиардам", "миллиарды", "миллиардами", "миллиардах",
    Род.МУЖСКОЙ
)

//10^12
val триллион = Существительное(
    "триллион", "триллиона", "триллиону", "триллион", "триллионом", "триллионе",
    "триллионы", "триллионов", "триллионам", "триллионы", "триллионами", "триллионах",
    Род.МУЖСКОЙ
)

//10^15
val квадриллион = Существительное(
    "квадриллион", "квадриллиона", "квадриллиону", "квадриллион", "квадриллионом", "квадриллионе",
    "квадриллионы", "квадриллионов", "квадриллионам", "квадриллионы", "квадриллионами", "квадриллионах",
    Род.МУЖСКОЙ
)

//10^18
val квинтиллион = Существительное(
    "квинтиллион", "квинтиллиона", "квинтиллиону", "квинтиллион", "квинтиллионом", "квинтиллионе",
    "квинтиллионы", "квинтиллионов", "квинтиллионам", "квинтиллионы", "квинтиллионами", "квинтиллионах",
    Род.МУЖСКОЙ
)