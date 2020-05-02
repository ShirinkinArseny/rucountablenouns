package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import kotlin.test.Test
import kotlin.test.assertEquals

class NumberAdjNoun {

    @Test
    fun `Именительный падеж, мужской род, 1`() {
        assertEquals(
            "один долгий год",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, мужской род, 1`() {
        assertEquals(
            "одного долгого года",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, мужской род, 1`() {
        assertEquals(
            "одному долгому году",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, мужской род, 1`() {
        assertEquals(
            "один долгий год",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, мужской род, 1`() {
        assertEquals(
            "одним долгим годом",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, мужской род, 1`() {
        assertEquals(
            "одном долгом годе",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, женский род, 1`() {
        assertEquals(
            "одна долгая неделя",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, женский род, 1`() {
        assertEquals(
            "одной долгой недели",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, женский род, 1`() {
        assertEquals(
            "одной долгой неделе",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, женский род, 1`() {
        assertEquals(
            "одну долгую неделю",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, женский род, 1`() {
        assertEquals(
            "одной долгой неделей",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, женский род, 1`() {
        assertEquals(
            "одной долгой неделе",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, средний род, 1`() {
        assertEquals(
            "одно долгое событие",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, средний род, 1`() {
        assertEquals(
            "одного долгого события",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, средний род, 1`() {
        assertEquals(
            "одному долгому событию",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, средний род, 1`() {
        assertEquals(
            "одно долгое событие",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, средний род, 1`() {
        assertEquals(
            "одним долгим событием",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, средний род, 1`() {
        assertEquals(
            "одном долгом событии",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 1, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, мужской род, 2`() {
        assertEquals(
            "два долгих года",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, мужской род, 2`() {
        assertEquals(
            "двух долгих лет",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, мужской род, 2`() {
        assertEquals(
            "двум долгим годам",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, мужской род, 2`() {
        assertEquals(
            "два долгих года",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, мужской род, 2`() {
        assertEquals(
            "двумя долгими годами",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, мужской род, 2`() {
        assertEquals(
            "двух долгих годах",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, женский род, 2`() {
        assertEquals(
            "две долгие недели",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, женский род, 2`() {
        assertEquals(
            "двух долгих недель",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, женский род, 2`() {
        assertEquals(
            "двум долгим неделям",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, женский род, 2`() {
        assertEquals(
            "две долгие недели",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, женский род, 2`() {
        assertEquals(
            "двумя долгими неделями",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, женский род, 2`() {
        assertEquals(
            "двух долгих неделях",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, средний род, 2`() {
        assertEquals(
            "два долгих события",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, средний род, 2`() {
        assertEquals(
            "двух долгих событий",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, средний род, 2`() {
        assertEquals(
            "двум долгим событиям",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, средний род, 2`() {
        assertEquals(
            "два долгих события",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, средний род, 2`() {
        assertEquals(
            "двумя долгими событиями",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, средний род, 2`() {
        assertEquals(
            "двух долгих событиях",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 2, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, мужской род, 5`() {
        assertEquals(
            "пять долгих лет",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, мужской род, 5`() {
        assertEquals(
            "пяти долгих лет",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, мужской род, 5`() {
        assertEquals(
            "пяти долгим годам",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, мужской род, 5`() {
        assertEquals(
            "пять долгих лет",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, мужской род, 5`() {
        assertEquals(
            "пятью долгими годами",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, мужской род, 5`() {
        assertEquals(
            "пяти долгих годах",
            yearNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, женский род, 5`() {
        assertEquals(
            "пять долгих недель",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, женский род, 5`() {
        assertEquals(
            "пяти долгих недель",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, женский род, 5`() {
        assertEquals(
            "пяти долгим неделям",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, женский род, 5`() {
        assertEquals(
            "пять долгих недель",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, женский род, 5`() {
        assertEquals(
            "пятью долгими неделями",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, женский род, 5`() {
        assertEquals(
            "пяти долгих неделях",
            weekNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, средний род, 5`() {
        assertEquals(
            "пять долгих событий",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, средний род, 5`() {
        assertEquals(
            "пяти долгих событий",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, средний род, 5`() {
        assertEquals(
            "пяти долгим событиям",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, средний род, 5`() {
        assertEquals(
            "пять долгих событий",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, средний род, 5`() {
        assertEquals(
            "пятью долгими событиями",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, средний род, 5`() {
        assertEquals(
            "пяти долгих событиях",
            eventNoun
                .propBy(longAdj)
                .countedBy(amount = 5, numberAsText = true)
                .format(Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

}