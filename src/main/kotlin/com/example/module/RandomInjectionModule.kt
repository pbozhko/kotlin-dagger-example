package com.example.module

import com.example.models.Blood
import com.example.models.bloods.*
import dagger.Module
import dagger.Provides
import kotlin.random.Random

@Module
class RandomInjectionModule {

    @Provides
    fun provideBlood(): Blood {
        val random = Random.nextInt(0, 3)
        val blood: Blood

        when (random) {
            0 -> blood = A_Blood()
            1 -> blood = B_Blood()
            2 -> blood = AB_Blood()
            3 -> blood = O_Blood()
            else -> blood = A_Blood()
        }

        return blood
    }
}