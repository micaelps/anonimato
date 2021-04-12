package com.micaelps.anonimato.userSystem

import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.NotBlank

class NewUserSystemRequest(
        @JsonProperty
        @field:NotBlank
        val username:String,
        @JsonProperty
        @field:NotBlank
        val password:String){

    fun toModel():UserSystem{
        return UserSystem(username, password)
    }
}