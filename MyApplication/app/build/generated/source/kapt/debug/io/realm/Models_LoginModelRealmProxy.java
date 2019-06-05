package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class Models_LoginModelRealmProxy extends Models.LoginModel
    implements RealmObjectProxy, Models_LoginModelRealmProxyInterface {

    static final class LoginModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idSucursalIndex;
        long passwordIndex;

        LoginModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("LoginModel");
            this.idSucursalIndex = addColumnDetails("idSucursal", "idSucursal", objectSchemaInfo);
            this.passwordIndex = addColumnDetails("password", "password", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        LoginModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new LoginModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final LoginModelColumnInfo src = (LoginModelColumnInfo) rawSrc;
            final LoginModelColumnInfo dst = (LoginModelColumnInfo) rawDst;
            dst.idSucursalIndex = src.idSucursalIndex;
            dst.passwordIndex = src.passwordIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private LoginModelColumnInfo columnInfo;
    private ProxyState<Models.LoginModel> proxyState;

    Models_LoginModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (LoginModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.LoginModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$idSucursal() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idSucursalIndex);
    }

    @Override
    public void realmSet$idSucursal(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idSucursalIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idSucursalIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idSucursalIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idSucursalIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$password() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.passwordIndex);
    }

    @Override
    public void realmSet$password(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.passwordIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.passwordIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.passwordIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.passwordIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("LoginModel", 2, 0);
        builder.addPersistedProperty("idSucursal", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("password", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static LoginModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new LoginModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "LoginModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "LoginModel";
    }

    @SuppressWarnings("cast")
    public static Models.LoginModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        Models.LoginModel obj = realm.createObjectInternal(Models.LoginModel.class, true, excludeFields);

        final Models_LoginModelRealmProxyInterface objProxy = (Models_LoginModelRealmProxyInterface) obj;
        if (json.has("idSucursal")) {
            if (json.isNull("idSucursal")) {
                objProxy.realmSet$idSucursal(null);
            } else {
                objProxy.realmSet$idSucursal((String) json.getString("idSucursal"));
            }
        }
        if (json.has("password")) {
            if (json.isNull("password")) {
                objProxy.realmSet$password(null);
            } else {
                objProxy.realmSet$password((String) json.getString("password"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.LoginModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.LoginModel obj = new Models.LoginModel();
        final Models_LoginModelRealmProxyInterface objProxy = (Models_LoginModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("idSucursal")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idSucursal((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$idSucursal(null);
                }
            } else if (name.equals("password")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$password((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$password(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_LoginModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.LoginModel.class), false, Collections.<String>emptyList());
        io.realm.Models_LoginModelRealmProxy obj = new io.realm.Models_LoginModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.LoginModel copyOrUpdate(Realm realm, LoginModelColumnInfo columnInfo, Models.LoginModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (Models.LoginModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.LoginModel copy(Realm realm, LoginModelColumnInfo columnInfo, Models.LoginModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.LoginModel) cachedRealmObject;
        }

        Models_LoginModelRealmProxyInterface realmObjectSource = (Models_LoginModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.LoginModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idSucursalIndex, realmObjectSource.realmGet$idSucursal());
        builder.addString(columnInfo.passwordIndex, realmObjectSource.realmGet$password());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_LoginModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.LoginModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.LoginModel.class);
        long tableNativePtr = table.getNativePtr();
        LoginModelColumnInfo columnInfo = (LoginModelColumnInfo) realm.getSchema().getColumnInfo(Models.LoginModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$idSucursal = ((Models_LoginModelRealmProxyInterface) object).realmGet$idSucursal();
        if (realmGet$idSucursal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, realmGet$idSucursal, false);
        }
        String realmGet$password = ((Models_LoginModelRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.LoginModel.class);
        long tableNativePtr = table.getNativePtr();
        LoginModelColumnInfo columnInfo = (LoginModelColumnInfo) realm.getSchema().getColumnInfo(Models.LoginModel.class);
        Models.LoginModel object = null;
        while (objects.hasNext()) {
            object = (Models.LoginModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$idSucursal = ((Models_LoginModelRealmProxyInterface) object).realmGet$idSucursal();
            if (realmGet$idSucursal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, realmGet$idSucursal, false);
            }
            String realmGet$password = ((Models_LoginModelRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.LoginModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.LoginModel.class);
        long tableNativePtr = table.getNativePtr();
        LoginModelColumnInfo columnInfo = (LoginModelColumnInfo) realm.getSchema().getColumnInfo(Models.LoginModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$idSucursal = ((Models_LoginModelRealmProxyInterface) object).realmGet$idSucursal();
        if (realmGet$idSucursal != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, realmGet$idSucursal, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, false);
        }
        String realmGet$password = ((Models_LoginModelRealmProxyInterface) object).realmGet$password();
        if (realmGet$password != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.LoginModel.class);
        long tableNativePtr = table.getNativePtr();
        LoginModelColumnInfo columnInfo = (LoginModelColumnInfo) realm.getSchema().getColumnInfo(Models.LoginModel.class);
        Models.LoginModel object = null;
        while (objects.hasNext()) {
            object = (Models.LoginModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$idSucursal = ((Models_LoginModelRealmProxyInterface) object).realmGet$idSucursal();
            if (realmGet$idSucursal != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, realmGet$idSucursal, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idSucursalIndex, rowIndex, false);
            }
            String realmGet$password = ((Models_LoginModelRealmProxyInterface) object).realmGet$password();
            if (realmGet$password != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.passwordIndex, rowIndex, realmGet$password, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.passwordIndex, rowIndex, false);
            }
        }
    }

    public static Models.LoginModel createDetachedCopy(Models.LoginModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.LoginModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.LoginModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.LoginModel) cachedObject.object;
            }
            unmanagedObject = (Models.LoginModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_LoginModelRealmProxyInterface unmanagedCopy = (Models_LoginModelRealmProxyInterface) unmanagedObject;
        Models_LoginModelRealmProxyInterface realmSource = (Models_LoginModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$idSucursal(realmSource.realmGet$idSucursal());
        unmanagedCopy.realmSet$password(realmSource.realmGet$password());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("LoginModel = proxy[");
        stringBuilder.append("{idSucursal:");
        stringBuilder.append(realmGet$idSucursal() != null ? realmGet$idSucursal() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{password:");
        stringBuilder.append(realmGet$password() != null ? realmGet$password() : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Models_LoginModelRealmProxy aLoginModel = (Models_LoginModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aLoginModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aLoginModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aLoginModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
