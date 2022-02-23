package com.example.lamp.ui.parent.parent_communicate_page

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.lamp.R
import com.example.lamp.test_data.TestData
import com.example.lamp.ui.parent.parent_communicate_page.communicate_recycler_view.TeacherAdapter

class CommunicateFragment:Fragment() {
    lateinit var teachersRecyclerView: RecyclerView
    lateinit var teacherAdapter: TeacherAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_parent_communicate,container,false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        teachersRecyclerView=requireView().findViewById(R.id.parent_student_courses_recycler_view)
        teacherAdapter=TeacherAdapter(TestData.TEACHERS)
        teachersRecyclerView.adapter=teacherAdapter
    }
}