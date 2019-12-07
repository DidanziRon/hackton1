package com.example.myapplication.Model.Classes

import com.example.myapplication.Model.Interfaces.Answers
import com.example.myapplication.Model.Interfaces.AnswersVariants

class AnswersVariant(override var node: ArrayList<Answers>) : AnswersVariants {

    init {
        this.node = node
    }

    override fun addAnswer(answer: Answers) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}