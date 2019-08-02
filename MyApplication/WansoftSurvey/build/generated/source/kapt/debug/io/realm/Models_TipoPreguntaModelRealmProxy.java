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
public class Models_TipoPreguntaModelRealmProxy extends Models.TipoPreguntaModel
    implements RealmObjectProxy, Models_TipoPreguntaModelRealmProxyInterface {

    static final class TipoPreguntaModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long DescriptionIndex;

        TipoPreguntaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TipoPreguntaModel");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.DescriptionIndex = addColumnDetails("Description", "Description", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        TipoPreguntaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TipoPreguntaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TipoPreguntaModelColumnInfo src = (TipoPreguntaModelColumnInfo) rawSrc;
            final TipoPreguntaModelColumnInfo dst = (TipoPreguntaModelColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.DescriptionIndex = src.DescriptionIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TipoPreguntaModelColumnInfo columnInfo;
    private ProxyState<Models.TipoPreguntaModel> proxyState;

    Models_TipoPreguntaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TipoPreguntaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.TipoPreguntaModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$Id() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.IdIndex);
    }

    @Override
    public void realmSet$Id(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.IdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.IdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Description() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.DescriptionIndex);
    }

    @Override
    public void realmSet$Description(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Description' to null.");
            }
            row.getTable().setString(columnInfo.DescriptionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'Description' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.DescriptionIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TipoPreguntaModel", 2, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TipoPreguntaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TipoPreguntaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TipoPreguntaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TipoPreguntaModel";
    }

    @SuppressWarnings("cast")
    public static Models.TipoPreguntaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        Models.TipoPreguntaModel obj = realm.createObjectInternal(Models.TipoPreguntaModel.class, true, excludeFields);

        final Models_TipoPreguntaModelRealmProxyInterface objProxy = (Models_TipoPreguntaModelRealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("Description")) {
            if (json.isNull("Description")) {
                objProxy.realmSet$Description(null);
            } else {
                objProxy.realmSet$Description((String) json.getString("Description"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.TipoPreguntaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.TipoPreguntaModel obj = new Models.TipoPreguntaModel();
        final Models_TipoPreguntaModelRealmProxyInterface objProxy = (Models_TipoPreguntaModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("Id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
                }
            } else if (name.equals("Description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Description(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_TipoPreguntaModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class), false, Collections.<String>emptyList());
        io.realm.Models_TipoPreguntaModelRealmProxy obj = new io.realm.Models_TipoPreguntaModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.TipoPreguntaModel copyOrUpdate(Realm realm, TipoPreguntaModelColumnInfo columnInfo, Models.TipoPreguntaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.TipoPreguntaModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.TipoPreguntaModel copy(Realm realm, TipoPreguntaModelColumnInfo columnInfo, Models.TipoPreguntaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.TipoPreguntaModel) cachedRealmObject;
        }

        Models_TipoPreguntaModelRealmProxyInterface realmObjectSource = (Models_TipoPreguntaModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.TipoPreguntaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addString(columnInfo.DescriptionIndex, realmObjectSource.realmGet$Description());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_TipoPreguntaModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.TipoPreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.TipoPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        TipoPreguntaModelColumnInfo columnInfo = (TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        String realmGet$Description = ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.TipoPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        TipoPreguntaModelColumnInfo columnInfo = (TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class);
        Models.TipoPreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.TipoPreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            String realmGet$Description = ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.TipoPreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.TipoPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        TipoPreguntaModelColumnInfo columnInfo = (TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        String realmGet$Description = ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.TipoPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        TipoPreguntaModelColumnInfo columnInfo = (TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class);
        Models.TipoPreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.TipoPreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            String realmGet$Description = ((Models_TipoPreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
            }
        }
    }

    public static Models.TipoPreguntaModel createDetachedCopy(Models.TipoPreguntaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.TipoPreguntaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.TipoPreguntaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.TipoPreguntaModel) cachedObject.object;
            }
            unmanagedObject = (Models.TipoPreguntaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_TipoPreguntaModelRealmProxyInterface unmanagedCopy = (Models_TipoPreguntaModelRealmProxyInterface) unmanagedObject;
        Models_TipoPreguntaModelRealmProxyInterface realmSource = (Models_TipoPreguntaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$Description(realmSource.realmGet$Description());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TipoPreguntaModel = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Description:");
        stringBuilder.append(realmGet$Description());
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
        Models_TipoPreguntaModelRealmProxy aTipoPreguntaModel = (Models_TipoPreguntaModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aTipoPreguntaModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTipoPreguntaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aTipoPreguntaModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
