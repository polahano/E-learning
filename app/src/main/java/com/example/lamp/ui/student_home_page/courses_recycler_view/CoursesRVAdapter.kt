package com.example.lamp.ui.student_home_page.courses_recycler_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lamp.R
import com.example.recyclerviewpracticekotlin.CourseItem

class CoursesRVAdapter(var coursesItemsList : List<CourseItem>?=null,val type:Int): RecyclerView.Adapter<CoursesRVAdapter.CoursesItemViewHolder>() {

    val HOME_SCREEN=R.layout.item_student_home_course_rv
    val COURSES_SCREEN=R.layout.item_student_courses

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesItemViewHolder {
        var screen=HOME_SCREEN
        if(type== 1){
            screen=COURSES_SCREEN
        }
        var view =LayoutInflater.from(parent.context).inflate(screen,parent,false)
        return CoursesItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: CoursesItemViewHolder, position: Int) {
        val item = coursesItemsList?.get(position)
        holder.courseName.text = item?.courseName
        holder.teacherName.text = item?.teacherName
        holder.courseDescription.text = item?.courseDescription
    }

    override fun getItemCount(): Int {
        return coursesItemsList?.size ?:0;
    }


    class CoursesItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var courseName:TextView = itemView.findViewById<TextView>(R.id.course_name)
        var teacherName:TextView = itemView.findViewById<TextView>(R.id.teacher_name)
        var courseDescription: TextView = itemView.findViewById<TextView>(R.id.course_description)



    }

}