package com.example.myapplication.Model.Classes

import com.example.myapplication.Model.Interfaces.AnswersVariants
import com.example.myapplication.Model.Interfaces.Questions

class Question(override var text: String, override var listAnswer: AnswersVariants) :
    Questions {

    init{
        this.text = text
        this.listAnswer = listAnswer
    }


}