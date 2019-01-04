package com.example.models.bloods

import com.example.models.Blood

class B_Blood: Blood() {

    override fun getKindOfBlood(): String {
        return "B"
    }
}