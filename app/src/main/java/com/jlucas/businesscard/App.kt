package com.jlucas.businesscard

import android.app.Application
import com.jlucas.businesscard.data.AppDatabase
import com.jlucas.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy {  AppDatabase.getDtabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}