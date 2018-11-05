package com.example.bd0631.baseproject.Database

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull


@Entity(tableName = "BaseApplication")
data class BaseModel(
    @PrimaryKey @NonNull var id: Long = 0)