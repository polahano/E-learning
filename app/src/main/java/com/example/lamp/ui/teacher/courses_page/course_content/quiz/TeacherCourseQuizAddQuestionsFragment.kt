package com.example.lamp.ui.teacher.courses_page.course_content.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.lamp.R
import com.example.lamp.databinding.FragmentTeacherCourseQuizAddQuestionsBinding
import com.example.lamp.ui.teacher.courses_page.course_content.quiz.questions_recycler_view.QuestionItem
import com.example.lamp.ui.teacher.courses_page.course_content.quiz.questions_recycler_view.TeacherQuizQuestionsAdapter
import com.example.lamp.ui.teacher.courses_page.course_content.quiz.quizzes_recycler_view.TeacherQuizItem

class TeacherCourseQuizAddQuestionsFragment(var quiz:TeacherQuizItem) : Fragment() {

    lateinit var viewBinding: FragmentTeacherCourseQuizAddQuestionsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_teacher_course_quiz_add_questions,
            container,
            false
        )
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        viewBinding.quizEditQuizTitle.setText(quiz.quizName)
        viewBinding.quizInstructions.setText(quiz.instructions)
        val adapter=TeacherQuizQuestionsAdapter(quiz.questions)
        adapter.onQuestionAddedListener=object :TeacherQuizQuestionsAdapter.OnQuestionAddedListener{
            override fun onQuestionAdded(question: QuestionItem) {
                quiz.questions?.add(question)
            }

        }
        viewBinding.quizEditQuestionsList.adapter=adapter

        if(adapter.itemCount==0) {
            viewBinding.createQuestionLayout.visibility = View.VISIBLE
        }

        viewBinding.createQuestionButton.setOnClickListener {
            createQuestion(adapter)
        }
        viewBinding.createQuestionFab.setOnClickListener {
            createQuestion(adapter)
        }
    }

    private fun createQuestion(adapter:TeacherQuizQuestionsAdapter) {
        if (viewBinding.createQuestionLayout.isVisible){
            viewBinding.createQuestionLayout.visibility = View.GONE
            viewBinding.quizEditQuestionsList.visibility=View.VISIBLE
        }
        var question:QuestionItem= QuestionItem(null,null,null)
        adapter.addQuestion(question)
    }


}