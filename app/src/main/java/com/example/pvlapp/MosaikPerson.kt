package com.example.pvlapp

import android.provider.ContactsContract

class MosaikPerson(nickname: String?, haircolor: String?, birthyear: Int) {
    var nickname : String? = null
    var haircolor : String? = null
    var birthyear : Int = 0

    init {
        this.nickname = nickname
        this.haircolor = haircolor
        this.birthyear = birthyear
    }

}