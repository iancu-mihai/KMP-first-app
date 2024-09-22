package com.example.kmp_first_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform