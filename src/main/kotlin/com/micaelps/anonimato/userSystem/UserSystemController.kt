package com.micaelps.anonimato.userSystem

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.persistence.EntityManager
import javax.transaction.Transactional

@RestController
class UserSystemController(val entityManager: EntityManager) {

    @PostMapping("/users")
    @Transactional
    fun createUserSystem(@RequestBody request:NewUserSystemRequest):ResponseEntity<Void>{
        entityManager.persist(request.toModel())
        return ResponseEntity.ok().build()
    }
}