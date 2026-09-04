package com.varuntalwar.petshop

class Happy(date:String): Mood(date) {
    override fun returnMood():String{
        return "I am Happy"
    }
}