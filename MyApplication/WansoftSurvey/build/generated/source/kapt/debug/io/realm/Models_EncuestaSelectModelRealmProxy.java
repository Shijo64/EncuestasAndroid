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
public class Models_EncuestaSelectModelRealmProxy extends Models.EncuestaSelectModel
    implements RealmObjectProxy, Models_EncuestaSelectModelRealmProxyInterface {

    static final class EncuestaSelectModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long idIndex;
        long idEncuestaIndex;

        EncuestaSelectModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("EncuestaSelectModel");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.idEncuestaIndex = addColumnDetails("idEncuesta", "idEncuesta", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        EncuestaSelectModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EncuestaSelectModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EncuestaSelectModelColumnInfo src = (EncuestaSelectModelColumnInfo) rawSrc;
            final EncuestaSelectModelColumnInfo dst = (EncuestaSelectModelColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.idEncuestaIndex = src.idEncuestaIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private EncuestaSelectModelColumnInfo columnInfo;
    private ProxyState<Models.EncuestaSelectModel> proxyState;

    Models_EncuestaSelectModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EncuestaSelectModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.EncuestaSelectModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idEncuesta() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idEncuestaIndex);
    }

    @Override
    public void realmSet$idEncuesta(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idEncuestaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idEncuestaIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("EncuestaSelectModel", 2, 0);
        builder.addPersistedProperty("id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("idEncuesta", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EncuestaSelectModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new EncuestaSelectModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "EncuestaSelectModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EncuestaSelectModel";
    }

    @SuppressWarnings("cast")
    public static Models.EncuestaSelectModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        Models.EncuestaSelectModel obj = realm.createObjectInternal(Models.EncuestaSelectModel.class, true, excludeFields);

        final Models_EncuestaSelectModelRealmProxyInterface objProxy = (Models_EncuestaSelectModelRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
            } else {
                objProxy.realmSet$id((int) json.getInt("id"));
            }
        }
        if (json.has("idEncuesta")) {
            if (json.isNull("idEncuesta")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuesta' to null.");
            } else {
                objProxy.realmSet$idEncuesta((int) json.getInt("idEncuesta"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.EncuestaSelectModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.EncuestaSelectModel obj = new Models.EncuestaSelectModel();
        final Models_EncuestaSelectModelRealmProxyInterface objProxy = (Models_EncuestaSelectModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (name.equals("idEncuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idEncuesta((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuesta' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_EncuestaSelectModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class), false, Collections.<String>emptyList());
        io.realm.Models_EncuestaSelectModelRealmProxy obj = new io.realm.Models_EncuestaSelectModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.EncuestaSelectModel copyOrUpdate(Realm realm, EncuestaSelectModelColumnInfo columnInfo, Models.EncuestaSelectModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.EncuestaSelectModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.EncuestaSelectModel copy(Realm realm, EncuestaSelectModelColumnInfo columnInfo, Models.EncuestaSelectModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.EncuestaSelectModel) cachedRealmObject;
        }

        Models_EncuestaSelectModelRealmProxyInterface realmObjectSource = (Models_EncuestaSelectModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.EncuestaSelectModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.idIndex, realmObjectSource.realmGet$id());
        builder.addInteger(columnInfo.idEncuestaIndex, realmObjectSource.realmGet$idEncuesta());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_EncuestaSelectModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.EncuestaSelectModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaSelectModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaSelectModelColumnInfo columnInfo = (EncuestaSelectModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$idEncuesta(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaSelectModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaSelectModelColumnInfo columnInfo = (EncuestaSelectModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class);
        Models.EncuestaSelectModel object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaSelectModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$idEncuesta(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, Models.EncuestaSelectModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaSelectModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaSelectModelColumnInfo columnInfo = (EncuestaSelectModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$idEncuesta(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaSelectModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaSelectModelColumnInfo columnInfo = (EncuestaSelectModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class);
        Models.EncuestaSelectModel object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaSelectModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.idIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaSelectModelRealmProxyInterface) object).realmGet$idEncuesta(), false);
        }
    }

    public static Models.EncuestaSelectModel createDetachedCopy(Models.EncuestaSelectModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.EncuestaSelectModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.EncuestaSelectModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.EncuestaSelectModel) cachedObject.object;
            }
            unmanagedObject = (Models.EncuestaSelectModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_EncuestaSelectModelRealmProxyInterface unmanagedCopy = (Models_EncuestaSelectModelRealmProxyInterface) unmanagedObject;
        Models_EncuestaSelectModelRealmProxyInterface realmSource = (Models_EncuestaSelectModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$idEncuesta(realmSource.realmGet$idEncuesta());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("EncuestaSelectModel = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idEncuesta:");
        stringBuilder.append(realmGet$idEncuesta());
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
        Models_EncuestaSelectModelRealmProxy aEncuestaSelectModel = (Models_EncuestaSelectModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEncuestaSelectModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEncuestaSelectModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEncuestaSelectModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
