package com.example.lamp.test_data

import com.example.lamp.R
import com.example.lamp.ui.parent.parent_communicate_page.communicate_recycler_view.TeacherItem
import com.example.lamp.ui.parent.parent_courses_page.course_recycler_view.ParentCourseItem
import com.example.lamp.ui.student.student_features_page.recitation.recite_words.reciteWordsRV.ReciteWordsItem
import com.example.lamp.ui.student.student_home_page.courses_recycler_view.CourseItem
import com.example.lamp.ui.student.student_home_page.features_recycler_view.FeatureItem
import com.example.lamp.ui.teacher.students_page.students_recycler_view.StudentItem


object TestData {
    val TRANSLATIONAPIKEY="fdacb2ce0bmshb0a36e2081822c8p1e7ae6jsn82387bc6a932"
    var COURSES: MutableList<CourseItem> = initCourses()
    val FEATURES:MutableList<FeatureItem> = mutableListOf(
        FeatureItem("translate", R.drawable.ic_translate),
        FeatureItem("summary",R.drawable.ic_summary),
        FeatureItem("Recite",R.drawable.ic_edit_text)
    )
    val WEBSITES:MutableList<String> = mutableListOf(
        "www.google.com"
        ,"www.youtube.com"
        ,"www.facebook.com")
    val TOOLS:MutableList<String> = mutableListOf(
        "whatsApp"
        ,"youtube"
        ,"facebook")

    var STUDENTS:MutableList<StudentItem> =initStudents()
    var TEACHERS:MutableList<TeacherItem> =initTeachers()
    val CHILDREN:MutableList<String> = mutableListOf(
        "child 1",
        "child 2",
        "child 3"
    )
    var PARENTCOURSES:MutableList<ParentCourseItem> =initParentCourse()

    val RECITATIONWORD:MutableList<ReciteWordsItem> = mutableListOf(ReciteWordsItem("عربي","english"))
    val WORDs:MutableList<ReciteWordsItem> = mutableListOf(ReciteWordsItem("عربي","english"))
    private fun initParentCourse(): MutableList<ParentCourseItem> {
        PARENTCOURSES= mutableListOf()
        for (i in 1..100){
            PARENTCOURSES.add(
               ParentCourseItem("child "+i,"course "+i,"teacher")
            )
        }
        return PARENTCOURSES
    }

    private fun initTeachers(): MutableList<TeacherItem> {
        TEACHERS= mutableListOf()
        for (i in 1..100){
            TEACHERS.add(
                TeacherItem("name "+i,"01000"+i,"name"+i+"@gmail.com","name "+i)
            )
        }
        return TEACHERS
    }

    private fun initStudents(): MutableList<StudentItem> {
        STUDENTS= mutableListOf()
        for (i in 1..100){
            STUDENTS.add(
                StudentItem("name "+i
                    ,R.drawable.ic_profile,"sdfdsfsdfsd","sdfdsfsdfdsf","sdfsdfsdfs")
            )
        }
        return STUDENTS
    }

    private fun initCourses(): MutableList<CourseItem> {
        COURSES= mutableListOf()
        for (i in 1..100){
            COURSES.add(
                CourseItem("course "+i
                ,"teacher "+i
                ,"description "+i
                ,""+(1000+i))
            )
        }
        return COURSES
    }

}