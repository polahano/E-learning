package com.example.lamp.ui.teacher.students_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.lamp.R
import com.example.lamp.test_data.TestData
import com.example.lamp.ui.teacher.students_page.students_recycler_view.TeacherStudentsAdapter

class TeacherStudentsFragment:Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: TeacherStudentsAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_teacher_students,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }


    private fun initViews() {
        recyclerView=requireView().findViewById(R.id.teacher_students_recycler_view)
        adapter= TeacherStudentsAdapter(TestData.STUDENTS)
        recyclerView.adapter=adapter
    }

}