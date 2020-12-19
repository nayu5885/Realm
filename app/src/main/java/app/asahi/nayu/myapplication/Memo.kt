package app.asahi.nayu.myapplication

import io.realm.RealmObject

open class Memo(
    open var title: String ="",
    open var content:String =""
):RealmObject()
