package com.example.madlevel4task1.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.madlevel4task1.Model.Product

@Dao
interface ProductDao {

    @Query("SELECT * FROM ProductTable")
    suspend fun getAllProducts(): List<Product>

    @Insert
    suspend fun insertProduct(product: Product)

    @Delete
    suspend fun deleteProduct(product: Product)

    @Query("DELETE FROM ProductTable")
    suspend fun deleteAllProducts()

}
