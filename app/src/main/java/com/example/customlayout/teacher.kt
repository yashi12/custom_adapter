package com.example.customlayout

class teacher (var name:String="" ,  var cource:String=""){


    fun randomteacher():ArrayList<teacher>{
        var e:teacher
        var ar : ArrayList<teacher> = arrayListOf<teacher>()
        ar.add(teacher("praddep","cp"))
        ar.add(teacher("yashi","link"))
        ar.add(teacher("anshu","maths"))
        ar.add(teacher("sam","english"))
        ar.add(teacher("adi","flutter"))
        return ar
    }
}