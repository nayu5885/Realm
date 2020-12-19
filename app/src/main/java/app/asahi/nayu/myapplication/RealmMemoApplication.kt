package app.asahi.nayu.myapplication

import android.app.Application
import android.telecom.Connection
import io.realm.Realm
import io.realm.RealmChangeListener
import io.realm.RealmConfiguration

class RealmMemoApplication : Application(){
    override fun onCreate(){
        super.onCreate()

        Realm.init(this)
        val realmConfig=RealmConfiguration.Builder()
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}