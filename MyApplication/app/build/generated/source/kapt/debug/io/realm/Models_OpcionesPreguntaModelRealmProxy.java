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
public class Models_OpcionesPreguntaModelRealmProxy extends Models.OpcionesPreguntaModel
    implements RealmObjectProxy, Models_OpcionesPreguntaModelRealmProxyInterface {

    static final class OpcionesPreguntaModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long QuestionIdIndex;
        long DescriptionIndex;
        long OrderIndex;
        long StatusIndex;
        long DefaultIndex;
        long ValueIndex;

        OpcionesPreguntaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("OpcionesPreguntaModel");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.QuestionIdIndex = addColumnDetails("QuestionId", "QuestionId", objectSchemaInfo);
            this.DescriptionIndex = addColumnDetails("Description", "Description", objectSchemaInfo);
            this.OrderIndex = addColumnDetails("Order", "Order", objectSchemaInfo);
            this.StatusIndex = addColumnDetails("Status", "Status", objectSchemaInfo);
            this.DefaultIndex = addColumnDetails("Default", "Default", objectSchemaInfo);
            this.ValueIndex = addColumnDetails("Value", "Value", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        OpcionesPreguntaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new OpcionesPreguntaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final OpcionesPreguntaModelColumnInfo src = (OpcionesPreguntaModelColumnInfo) rawSrc;
            final OpcionesPreguntaModelColumnInfo dst = (OpcionesPreguntaModelColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.QuestionIdIndex = src.QuestionIdIndex;
            dst.DescriptionIndex = src.DescriptionIndex;
            dst.OrderIndex = src.OrderIndex;
            dst.StatusIndex = src.StatusIndex;
            dst.DefaultIndex = src.DefaultIndex;
            dst.ValueIndex = src.ValueIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private OpcionesPreguntaModelColumnInfo columnInfo;
    private ProxyState<Models.OpcionesPreguntaModel> proxyState;

    Models_OpcionesPreguntaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (OpcionesPreguntaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.OpcionesPreguntaModel>(this);
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
    public int realmGet$QuestionId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.QuestionIdIndex);
    }

    @Override
    public void realmSet$QuestionId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.QuestionIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.QuestionIdIndex, value);
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$Order() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.OrderIndex);
    }

    @Override
    public void realmSet$Order(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.OrderIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.OrderIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$Status() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.StatusIndex);
    }

    @Override
    public void realmSet$Status(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.StatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.StatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$Default() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.DefaultIndex);
    }

    @Override
    public void realmSet$Default(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.DefaultIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.DefaultIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$Value() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.ValueIndex);
    }

    @Override
    public void realmSet$Value(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.ValueIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.ValueIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("OpcionesPreguntaModel", 7, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("QuestionId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Order", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Status", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Default", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Value", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static OpcionesPreguntaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new OpcionesPreguntaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "OpcionesPreguntaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "OpcionesPreguntaModel";
    }

    @SuppressWarnings("cast")
    public static Models.OpcionesPreguntaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        Models.OpcionesPreguntaModel obj = realm.createObjectInternal(Models.OpcionesPreguntaModel.class, true, excludeFields);

        final Models_OpcionesPreguntaModelRealmProxyInterface objProxy = (Models_OpcionesPreguntaModelRealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("QuestionId")) {
            if (json.isNull("QuestionId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'QuestionId' to null.");
            } else {
                objProxy.realmSet$QuestionId((int) json.getInt("QuestionId"));
            }
        }
        if (json.has("Description")) {
            if (json.isNull("Description")) {
                objProxy.realmSet$Description(null);
            } else {
                objProxy.realmSet$Description((String) json.getString("Description"));
            }
        }
        if (json.has("Order")) {
            if (json.isNull("Order")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Order' to null.");
            } else {
                objProxy.realmSet$Order((int) json.getInt("Order"));
            }
        }
        if (json.has("Status")) {
            if (json.isNull("Status")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Status' to null.");
            } else {
                objProxy.realmSet$Status((int) json.getInt("Status"));
            }
        }
        if (json.has("Default")) {
            if (json.isNull("Default")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Default' to null.");
            } else {
                objProxy.realmSet$Default((boolean) json.getBoolean("Default"));
            }
        }
        if (json.has("Value")) {
            if (json.isNull("Value")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Value' to null.");
            } else {
                objProxy.realmSet$Value((int) json.getInt("Value"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.OpcionesPreguntaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.OpcionesPreguntaModel obj = new Models.OpcionesPreguntaModel();
        final Models_OpcionesPreguntaModelRealmProxyInterface objProxy = (Models_OpcionesPreguntaModelRealmProxyInterface) obj;
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
            } else if (name.equals("QuestionId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$QuestionId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'QuestionId' to null.");
                }
            } else if (name.equals("Description")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Description((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Description(null);
                }
            } else if (name.equals("Order")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Order((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Order' to null.");
                }
            } else if (name.equals("Status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Status((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Status' to null.");
                }
            } else if (name.equals("Default")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Default((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Default' to null.");
                }
            } else if (name.equals("Value")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Value((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Value' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_OpcionesPreguntaModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class), false, Collections.<String>emptyList());
        io.realm.Models_OpcionesPreguntaModelRealmProxy obj = new io.realm.Models_OpcionesPreguntaModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.OpcionesPreguntaModel copyOrUpdate(Realm realm, OpcionesPreguntaModelColumnInfo columnInfo, Models.OpcionesPreguntaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.OpcionesPreguntaModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.OpcionesPreguntaModel copy(Realm realm, OpcionesPreguntaModelColumnInfo columnInfo, Models.OpcionesPreguntaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.OpcionesPreguntaModel) cachedRealmObject;
        }

        Models_OpcionesPreguntaModelRealmProxyInterface realmObjectSource = (Models_OpcionesPreguntaModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.OpcionesPreguntaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addInteger(columnInfo.QuestionIdIndex, realmObjectSource.realmGet$QuestionId());
        builder.addString(columnInfo.DescriptionIndex, realmObjectSource.realmGet$Description());
        builder.addInteger(columnInfo.OrderIndex, realmObjectSource.realmGet$Order());
        builder.addInteger(columnInfo.StatusIndex, realmObjectSource.realmGet$Status());
        builder.addBoolean(columnInfo.DefaultIndex, realmObjectSource.realmGet$Default());
        builder.addInteger(columnInfo.ValueIndex, realmObjectSource.realmGet$Value());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_OpcionesPreguntaModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.OpcionesPreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.OpcionesPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        OpcionesPreguntaModelColumnInfo columnInfo = (OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.QuestionIdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$QuestionId(), false);
        String realmGet$Description = ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Status(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Default(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ValueIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Value(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.OpcionesPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        OpcionesPreguntaModelColumnInfo columnInfo = (OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class);
        Models.OpcionesPreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.OpcionesPreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.QuestionIdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$QuestionId(), false);
            String realmGet$Description = ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Status(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Default(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ValueIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Value(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, Models.OpcionesPreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.OpcionesPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        OpcionesPreguntaModelColumnInfo columnInfo = (OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.QuestionIdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$QuestionId(), false);
        String realmGet$Description = ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Status(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Default(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.ValueIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Value(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.OpcionesPreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        OpcionesPreguntaModelColumnInfo columnInfo = (OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class);
        Models.OpcionesPreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.OpcionesPreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.QuestionIdIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$QuestionId(), false);
            String realmGet$Description = ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Status(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Default(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.ValueIndex, rowIndex, ((Models_OpcionesPreguntaModelRealmProxyInterface) object).realmGet$Value(), false);
        }
    }

    public static Models.OpcionesPreguntaModel createDetachedCopy(Models.OpcionesPreguntaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.OpcionesPreguntaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.OpcionesPreguntaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.OpcionesPreguntaModel) cachedObject.object;
            }
            unmanagedObject = (Models.OpcionesPreguntaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_OpcionesPreguntaModelRealmProxyInterface unmanagedCopy = (Models_OpcionesPreguntaModelRealmProxyInterface) unmanagedObject;
        Models_OpcionesPreguntaModelRealmProxyInterface realmSource = (Models_OpcionesPreguntaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$QuestionId(realmSource.realmGet$QuestionId());
        unmanagedCopy.realmSet$Description(realmSource.realmGet$Description());
        unmanagedCopy.realmSet$Order(realmSource.realmGet$Order());
        unmanagedCopy.realmSet$Status(realmSource.realmGet$Status());
        unmanagedCopy.realmSet$Default(realmSource.realmGet$Default());
        unmanagedCopy.realmSet$Value(realmSource.realmGet$Value());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("OpcionesPreguntaModel = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{QuestionId:");
        stringBuilder.append(realmGet$QuestionId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Description:");
        stringBuilder.append(realmGet$Description());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Order:");
        stringBuilder.append(realmGet$Order());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Status:");
        stringBuilder.append(realmGet$Status());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Default:");
        stringBuilder.append(realmGet$Default());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Value:");
        stringBuilder.append(realmGet$Value());
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
        Models_OpcionesPreguntaModelRealmProxy aOpcionesPreguntaModel = (Models_OpcionesPreguntaModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aOpcionesPreguntaModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aOpcionesPreguntaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aOpcionesPreguntaModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
