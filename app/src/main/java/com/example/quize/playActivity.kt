package com.example.quize

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quize.databinding.ActivityMainBinding
import com.example.quize.databinding.ActivityPlayBinding

class playActivity : AppCompatActivity() {

    lateinit var binding: ActivityPlayBinding


    val quizList = listOf<quiz>(

        quiz ("What is the capital of Bangladesh",
            "Dhaka ",
            "Khulna ",
            "Rajshahi",
            "Borishal",
            "Dhaka"
        ),

        quiz ("What are the official language of Bangladesh?",
            "Bangla ",
            "English ",
            "Arabic",
            "Hindhi",
            "Bangla"
        ),

        quiz ("What is the total area of the Saint Martin Island?",
            "2 square kilometre ",
            "5 square kilometre ",
            "3 square kilometre",
            "4 square kilometre",
            "2 square kilometre"
        ),

        quiz ("What is the number of City Corporations in Bangladesh?",
            "11",
            "12 ",
            "13",
            "14",
            "15"
        )


        )

    var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayBinding.inflate(layoutInflater)

        setContentView(binding.root)

        initQuestion()



    }

    private fun initQuestion() {

        val quizQuestion = quizList[index]

       binding.apply {
           questiontv.text = quizQuestion.question
           option1.text = quizQuestion.option1
           option2.text = quizQuestion.option2
           option3.text = quizQuestion.option3
           option4.text = quizQuestion.option4



       }



    }
}