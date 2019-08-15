package Models

import io.realm.RealmObject

open class LoginModel: RealmObject() {
    var idSucursal:String? = null
    var password:String? = null
}