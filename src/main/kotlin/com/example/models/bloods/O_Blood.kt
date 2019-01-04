package com.example.models.bloods

import com.example.models.Blood

class O_Blood: Blood() {

    override fun getKindOfBlood(): String {
        return "O"
    }
}