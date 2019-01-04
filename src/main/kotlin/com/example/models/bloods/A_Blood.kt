package com.example.models.bloods

import com.example.models.Blood

class A_Blood: Blood() {

    override fun getKindOfBlood(): String {
        return "A"
    }
}