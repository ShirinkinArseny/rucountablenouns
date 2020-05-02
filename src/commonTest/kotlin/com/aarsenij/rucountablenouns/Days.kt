package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import kotlin.test.Test
import kotlin.test.assertEquals


class Days {

    @Test
    fun `1 день`() {

        assertEquals(
            "1 день",
            dayNoun.countedBy(amount = 1, numberAsText = false).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

        assertEquals(
            "один день",
            dayNoun.countedBy(amount = 1, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

    }

    @Test
    fun `2 дня`() {

        assertEquals(
            "2 дня",
            dayNoun.countedBy(amount = 2, numberAsText = false).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

        assertEquals(
            "два дня",
            dayNoun.countedBy(amount = 2, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

    }

    @Test
    fun `5 дней`() {

        assertEquals(
            "5 дней",
            dayNoun.countedBy(amount = 5, numberAsText = false).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

        assertEquals(
            "пять дней",
            dayNoun.countedBy(amount = 5, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

    }

    @Test
    fun `365 дней`() {

        assertEquals(
            "365 дней",
            dayNoun.countedBy(amount = 365, numberAsText = false).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

        assertEquals(
            "триста шестьдесят пять дней",
            dayNoun.countedBy(amount = 365, numberAsText = true).format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )

    }

}