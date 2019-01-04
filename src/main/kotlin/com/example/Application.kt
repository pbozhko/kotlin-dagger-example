package com.example

import com.example.models.Body
import com.example.models.DaggerDoctor

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        val body = this.createBody()
        println(body.blood.getKindOfBlood())
    }

    private fun createBody(): Body {
        val doctor = DaggerDoctor.builder().build()
        return doctor.injectBlood()
    }
}