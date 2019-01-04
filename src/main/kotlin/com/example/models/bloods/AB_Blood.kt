package com.example.models.bloods

import com.example.models.Blood

class AB_Blood: Blood() {

    override fun getKindOfBlood(): String {
        return "AB"
    }
}