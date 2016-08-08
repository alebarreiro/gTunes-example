package com.gtunes

class Artist {
    String name

    static hasMany = [songs:Album]

    static constraints = {
    }
}
