package com.varuntalwar.petshop

class Sad(date:String): Mood(date) {
    override fun returnMood():String{
        return "I am sad"
    }
}