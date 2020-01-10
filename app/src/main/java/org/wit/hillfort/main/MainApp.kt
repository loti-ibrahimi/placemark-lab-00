package org.wit.hillfort.main

import android.app.Application
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.wit.hillfort.models.json.HillfortJSONStore
//import org.wit.hillfort.models.mem.HillfortMemStore
import org.wit.hillfort.models.HillfortStore

class MainApp : Application(), AnkoLogger {

    lateinit var hillforts: HillfortStore

    override fun onCreate() {
        super.onCreate()
//         hillforts = HillfortMemStore()
        hillforts = HillfortJSONStore(applicationContext)
        info("Hillfort Tracker started")
    }
}