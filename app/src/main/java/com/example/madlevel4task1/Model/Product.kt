package com.example.madlevel4task1.Model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ProductTable")
data class Product(
    @ColumnInfo(name = "Name")
    var ProductName: String,

    @ColumnInfo(name = "Quantity")
    var ProductQuantity: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

)