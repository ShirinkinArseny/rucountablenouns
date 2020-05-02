package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.forms.Падеж
import com.aarsenij.rucountablenouns.forms.Число
import kotlin.test.Test
import kotlin.test.assertEquals

class AdjNoun {

    @Test
    fun `Именительный падеж, мужской род, единственное`() {
        assertEquals(
            "долгий год",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, мужской род, единственное`() {
        assertEquals(
            "долгого года",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, мужской род, единственное`() {
        assertEquals(
            "долгому году",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, мужской род, единственное`() {
        assertEquals(
            "долгий год",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, мужской род, единственное`() {
        assertEquals(
            "долгим годом",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, мужской род, единственное`() {
        assertEquals(
            "долгом годе",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, женский род, единственное`() {
        assertEquals(
            "долгая неделя",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, женский род, единственное`() {
        assertEquals(
            "долгой недели",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, женский род, единственное`() {
        assertEquals(
            "долгой неделе",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, женский род, единственное`() {
        assertEquals(
            "долгую неделю",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, женский род, единственное`() {
        assertEquals(
            "долгой неделей",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, женский род, единственное`() {
        assertEquals(
            "долгой неделе",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, средний род, единственное`() {
        assertEquals(
            "долгое событие",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, средний род, единственное`() {
        assertEquals(
            "долгого события",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, средний род, единственное`() {
        assertEquals(
            "долгому событию",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, средний род, единственное`() {
        assertEquals(
            "долгое событие",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, средний род, единственное`() {
        assertEquals(
            "долгим событием",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, средний род, единственное`() {
        assertEquals(
            "долгом событии",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.ЕДИНСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, мужской род, множественное`() {
        assertEquals(
            "долгие годы",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, мужской род, множественное`() {
        assertEquals(
            "долгих лет",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, мужской род, множественное`() {
        assertEquals(
            "долгим годам",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, мужской род, множественное`() {
        assertEquals(
            "долгие годы",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, мужской род, множественное`() {
        assertEquals(
            "долгими годами",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, мужской род, множественное`() {
        assertEquals(
            "долгих годах",
            yearNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, женский род, множественное`() {
        assertEquals(
            "долгие недели",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, женский род, множественное`() {
        assertEquals(
            "долгих недель",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, женский род, множественное`() {
        assertEquals(
            "долгим неделям",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, женский род, множественное`() {
        assertEquals(
            "долгие недели",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, женский род, множественное`() {
        assertEquals(
            "долгими неделями",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, женский род, множественное`() {
        assertEquals(
            "долгих неделях",
            weekNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

    @Test
    fun `Именительный падеж, средний род, множественное`() {
        assertEquals(
            "долгие события",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ИМЕНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Родительный падеж, средний род, множественное`() {
        assertEquals(
            "долгих событий",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.РОДИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Дательный падеж, средний род, множественное`() {
        assertEquals(
            "долгим событиям",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ДАТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Винительный падеж, средний род, множественное`() {
        assertEquals(
            "долгие события",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ВИНИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Творительный падеж, средний род, множественное`() {
        assertEquals(
            "долгими событиями",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ТВОРИТЕЛЬНЫЙ)
        )
    }

    @Test
    fun `Предложный падеж, средний род, множественное`() {
        assertEquals(
            "долгих событиях",
            eventNoun
                .propBy(longAdj)
                .format(число = Число.МНОЖЕСТВЕННОЕ, падеж = Падеж.ПРЕДЛОЖНЫЙ)
        )
    }

}