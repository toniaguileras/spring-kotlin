package com.adevinta.toniaguilera.exception

class UserWithErrorException(message:String = "unable to create user")  : RuntimeException(message) {
}