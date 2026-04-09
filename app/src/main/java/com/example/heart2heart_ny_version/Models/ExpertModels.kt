package com.example.heart2heart_ny_version.Models

import androidx.annotation.DrawableRes

data class Question(
    val id: String,
    val title: String,
    val questionText: String,
    val authorInfo: String,
    val answerText: String,
    val category: String
)

data class Expert(
    val id: String,
    val name: String,
    val description: String,
    @DrawableRes val imageRes: Int,
    val questions: List<Question>
)
