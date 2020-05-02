package com.aarsenij.rucountablenouns.forms

data class РодПадеж(val род: Род, val падеж: Падеж)

data class ЧислоПадеж(val число: Число, val падеж: Падеж)

data class РодЧислоПадеж(val род: Род, val число: Число, val падеж: Падеж)