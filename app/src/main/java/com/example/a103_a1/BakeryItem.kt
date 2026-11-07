package com.example.a103_a1

data class BakeryItem (
    var name: String,
    var sold: Double,
    var price: Double
){
    fun revenue(): Double {
        return sold * price
    }
}