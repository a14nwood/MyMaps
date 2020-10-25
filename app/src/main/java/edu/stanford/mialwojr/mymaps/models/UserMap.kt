package edu.stanford.mialwojr.mymaps.models

import java.io.Serializable

data class UserMap(val title: String, val places: List<Place>) : Serializable