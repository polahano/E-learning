package com.example.domain.repos

import com.example.domain.model.*
import com.microsoft.azure.cognitiveservices.vision.computervision.models.ReadOperationResult
import kotlinx.coroutines.CoroutineScope

interface CoursesRepository{
    suspend fun getCourses():List<CourseDTO>
}

interface CoursesOnlineDataSource{
    suspend fun getCoursesById():List<CourseDTO>
}

interface OCROnlineDataSource{
    suspend fun getTextFromImage(language:String,url:String): OCRResponseDTO
    suspend fun getTextFromImageReadApi(language:String?=null,url:String): ReadOperationResult
}

interface OCRRepository{
    suspend fun getTextFromImage(language:String,url:String):OCRResponseDTO
    suspend fun getTextFromImageReadApi(language: String?=null, url: String): ReadOperationResult
}

interface FeaturesRepository{
    suspend fun getGrades():List<FeatureDTO>
}

interface FeaturesOnlineDataSource{
    suspend fun getCoursesById():List<FeatureDTO>
}

interface ChildrenRepository{
    suspend fun getGrades():List<ChildDTO>
}

interface ChildrenOnlineDataSource{
    suspend fun getChildren():List<ChildDTO>
}
