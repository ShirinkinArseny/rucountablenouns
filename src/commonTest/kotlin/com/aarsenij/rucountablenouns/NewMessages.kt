package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import kotlin.test.Test
import kotlin.test.assertEquals

class NewMessagesTests {

    @Test
    fun `1 - text`() {
        assertEquals(
            "одно новое сообщение",
            messageNoun
                .propBy(newAdjective)
                .countedBy(1, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `2 - text`() {
        assertEquals(
            "два новых сообщения",
            messageNoun
                .propBy(newAdjective)
                .countedBy(2, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `5 - text`() {
        assertEquals(
            "пять новых сообщений",
            messageNoun
                .propBy(newAdjective)
                .countedBy(5, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `1 - digit`() {
        assertEquals(
            "1 новое сообщение",
            messageNoun
                .propBy(newAdjective)
                .countedBy(1, numberAsText = false)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `2 - digit`() {
        assertEquals(
            "2 новых сообщения",
            messageNoun
                .propBy(newAdjective)
                .countedBy(2, numberAsText = false)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `5 - digit`() {
        assertEquals(
            "5 новых сообщений",
            messageNoun
                .propBy(newAdjective)
                .countedBy(5, numberAsText = false)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }
}