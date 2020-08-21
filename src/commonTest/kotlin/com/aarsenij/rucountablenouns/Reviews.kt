package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import kotlin.test.Test
import kotlin.test.assertEquals

class ReviewsTest {

    @Test
    fun `1 отзыв`() {
        val reviews = reviewNoun.countedBy(amount = 1, numberAsText = false)
            .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        assertEquals("1 отзыв", reviews)
    }

    @Test
    fun `2 отзыва`() {
        val reviews = reviewNoun.countedBy(amount = 2, numberAsText = false)
            .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        assertEquals("2 отзыва", reviews)
    }

    @Test
    fun `127 отзывов`() {
        val reviews = reviewNoun.countedBy(amount = 127, numberAsText = false)
            .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        assertEquals("127 отзывов", reviews)
    }

}