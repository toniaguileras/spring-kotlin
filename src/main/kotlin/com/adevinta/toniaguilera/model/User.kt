package com.adevinta.toniaguilera.model

import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(@Id val id: Int?, val name: String?)