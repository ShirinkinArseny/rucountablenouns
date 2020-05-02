package com.aarsenij.rucountablenouns

import com.aarsenij.rucountablenouns.internal.NumeralCounty
import com.aarsenij.rucountablenouns.internal.NumeralCounty._1
import com.aarsenij.rucountablenouns.internal.NumeralCounty._2
import com.aarsenij.rucountablenouns.internal.NumeralCounty._5
import com.aarsenij.rucountablenouns.internal.getNumeralCounty
import kotlin.test.Test
import kotlin.test.assertEquals

class NumeralCountyTests {

    private fun check(
        county: NumeralCounty,
        number: Int
    ) {
        assertEquals(county,
            getNumeralCounty(number.toLong())
        )
    }

    @Test
    fun testNumberalCounty() {
        check(_1, 1)

        check(_2, 2)
        check(_2, 3)
        check(_2, 4)

        check(_5, 5)
        check(_5, 6)
        check(_5, 7)
        check(_5, 8)
        check(_5, 9)
        check(_5, 10)
        check(_5, 11)
        check(_5, 12)
        check(_5, 13)
        check(_5, 14)
        check(_5, 15)
        check(_5, 16)
        check(_5, 17)
        check(_5, 18)
        check(_5, 19)
        check(_5, 20)

        check(_1, 21)

        check(_2, 22)
        check(_2, 23)
        check(_2, 24)

        check(_5, 25)
        check(_5, 26)
        check(_5, 27)
        check(_5, 28)
        check(_5, 29)
        check(_5, 30)

        check(_1, 31)
        check(_2, 32)
        check(_5, 35)

        check(_1, 41)
        check(_2, 42)
        check(_5, 45)

        check(_1, 51)
        check(_2, 52)
        check(_5, 55)

        check(_5, 99)
        check(_5, 100)
        check(_1, 101)
        check(_2, 102)
        check(_2, 103)
        check(_2, 104)
        check(_5, 105)

        check(_5, 111)
        check(_5, 112)
        check(_5, 115)

        check(_1, 121)
        check(_2, 122)
        check(_5, 125)
    }

}