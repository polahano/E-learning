package com.example.data.repos

import com.example.data.api.microsoft_api.ocr.MicrosoftOCRWebService
import com.example.data.data_classes.URLOCR
import com.example.domain.repos.OCROnlineDataSource
import com.example.domain.repos.OCRResponseDTO
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.IOException

class OCROnlineDataSourceImp(val webService:MicrosoftOCRWebService ):OCROnlineDataSource {
    override suspend fun getTextFromImage(language:String,url:String): OCRResponseDTO {
       var u=URLOCR(url =url )
        var result= webService.getTextFromImage(language=language,url=u)
        return result.toOCRResponseDTO()
    }

}