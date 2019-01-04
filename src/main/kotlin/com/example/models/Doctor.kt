package com.example.models

import com.example.module.RandomInjectionModule
import dagger.Component

@Component(modules = [(RandomInjectionModule::class)])
interface Doctor {
    fun injectBlood(): Body
}