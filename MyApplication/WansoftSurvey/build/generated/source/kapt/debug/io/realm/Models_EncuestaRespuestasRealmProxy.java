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
public class Models_EncuestaRespuestasRealmProxy extends Models.EncuestaRespuestas
    implements RealmObjectProxy, Models_EncuestaRespuestasRealmProxyInterface {

    static final class EncuestaRespuestasColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long idEncuestaBOIndex;
        long idEncuestaIndex;
        long idPreguntaIndex;
        long numeroPreguntaIndex;
        long respuestaIndex;
        long arrayRespuestasIndex;

        EncuestaRespuestasColumnInfo(OsSchemaInfo schemaInfo) {
            super(7);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("EncuestaRespuestas");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.idEncuestaBOIndex = addColumnDetails("idEncuestaBO", "idEncuestaBO", objectSchemaInfo);
            this.idEncuestaIndex = addColumnDetails("idEncuesta", "idEncuesta", objectSchemaInfo);
            this.idPreguntaIndex = addColumnDetails("idPregunta", "idPregunta", objectSchemaInfo);
            this.numeroPreguntaIndex = addColumnDetails("numeroPregunta", "numeroPregunta", objectSchemaInfo);
            this.respuestaIndex = addColumnDetails("respuesta", "respuesta", objectSchemaInfo);
            this.arrayRespuestasIndex = addColumnDetails("arrayRespuestas", "arrayRespuestas", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        EncuestaRespuestasColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EncuestaRespuestasColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EncuestaRespuestasColumnInfo src = (EncuestaRespuestasColumnInfo) rawSrc;
            final EncuestaRespuestasColumnInfo dst = (EncuestaRespuestasColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.idEncuestaBOIndex = src.idEncuestaBOIndex;
            dst.idEncuestaIndex = src.idEncuestaIndex;
            dst.idPreguntaIndex = src.idPreguntaIndex;
            dst.numeroPreguntaIndex = src.numeroPreguntaIndex;
            dst.respuestaIndex = src.respuestaIndex;
            dst.arrayRespuestasIndex = src.arrayRespuestasIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private EncuestaRespuestasColumnInfo columnInfo;
    private ProxyState<Models.EncuestaRespuestas> proxyState;
    private RealmList<String> arrayRespuestasRealmList;

    Models_EncuestaRespuestasRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EncuestaRespuestasColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.EncuestaRespuestas>(this);
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
    public int realmGet$idEncuestaBO() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idEncuestaBOIndex);
    }

    @Override
    public void realmSet$idEncuestaBO(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idEncuestaBOIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idEncuestaBOIndex, value);
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

    @Override
    @SuppressWarnings("cast")
    public int realmGet$idPregunta() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.idPreguntaIndex);
    }

    @Override
    public void realmSet$idPregunta(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.idPreguntaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.idPreguntaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$numeroPregunta() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.numeroPreguntaIndex);
    }

    @Override
    public void realmSet$numeroPregunta(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.numeroPreguntaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.numeroPreguntaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$respuesta() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.respuestaIndex);
    }

    @Override
    public void realmSet$respuesta(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'respuesta' to null.");
            }
            row.getTable().setString(columnInfo.respuestaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'respuesta' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.respuestaIndex, value);
    }

    @Override
    public RealmList<String> realmGet$arrayRespuestas() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (arrayRespuestasRealmList != null) {
            return arrayRespuestasRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.arrayRespuestasIndex, RealmFieldType.STRING_LIST);
            arrayRespuestasRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return arrayRespuestasRealmList;
        }
    }

    @Override
    public void realmSet$arrayRespuestas(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("arrayRespuestas")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.arrayRespuestasIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("EncuestaRespuestas", 7, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("idEncuestaBO", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("idEncuesta", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("idPregunta", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("numeroPregunta", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("respuesta", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedValueListProperty("arrayRespuestas", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EncuestaRespuestasColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new EncuestaRespuestasColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "EncuestaRespuestas";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EncuestaRespuestas";
    }

    @SuppressWarnings("cast")
    public static Models.EncuestaRespuestas createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("arrayRespuestas")) {
            excludeFields.add("arrayRespuestas");
        }
        Models.EncuestaRespuestas obj = realm.createObjectInternal(Models.EncuestaRespuestas.class, true, excludeFields);

        final Models_EncuestaRespuestasRealmProxyInterface objProxy = (Models_EncuestaRespuestasRealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("idEncuestaBO")) {
            if (json.isNull("idEncuestaBO")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuestaBO' to null.");
            } else {
                objProxy.realmSet$idEncuestaBO((int) json.getInt("idEncuestaBO"));
            }
        }
        if (json.has("idEncuesta")) {
            if (json.isNull("idEncuesta")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuesta' to null.");
            } else {
                objProxy.realmSet$idEncuesta((int) json.getInt("idEncuesta"));
            }
        }
        if (json.has("idPregunta")) {
            if (json.isNull("idPregunta")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'idPregunta' to null.");
            } else {
                objProxy.realmSet$idPregunta((int) json.getInt("idPregunta"));
            }
        }
        if (json.has("numeroPregunta")) {
            if (json.isNull("numeroPregunta")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'numeroPregunta' to null.");
            } else {
                objProxy.realmSet$numeroPregunta((int) json.getInt("numeroPregunta"));
            }
        }
        if (json.has("respuesta")) {
            if (json.isNull("respuesta")) {
                objProxy.realmSet$respuesta(null);
            } else {
                objProxy.realmSet$respuesta((String) json.getString("respuesta"));
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$arrayRespuestas(), json, "arrayRespuestas");
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.EncuestaRespuestas createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.EncuestaRespuestas obj = new Models.EncuestaRespuestas();
        final Models_EncuestaRespuestasRealmProxyInterface objProxy = (Models_EncuestaRespuestasRealmProxyInterface) obj;
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
            } else if (name.equals("idEncuestaBO")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idEncuestaBO((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuestaBO' to null.");
                }
            } else if (name.equals("idEncuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idEncuesta((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idEncuesta' to null.");
                }
            } else if (name.equals("idPregunta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$idPregunta((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'idPregunta' to null.");
                }
            } else if (name.equals("numeroPregunta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$numeroPregunta((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'numeroPregunta' to null.");
                }
            } else if (name.equals("respuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$respuesta((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$respuesta(null);
                }
            } else if (name.equals("arrayRespuestas")) {
                objProxy.realmSet$arrayRespuestas(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_EncuestaRespuestasRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class), false, Collections.<String>emptyList());
        io.realm.Models_EncuestaRespuestasRealmProxy obj = new io.realm.Models_EncuestaRespuestasRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.EncuestaRespuestas copyOrUpdate(Realm realm, EncuestaRespuestasColumnInfo columnInfo, Models.EncuestaRespuestas object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.EncuestaRespuestas) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.EncuestaRespuestas copy(Realm realm, EncuestaRespuestasColumnInfo columnInfo, Models.EncuestaRespuestas newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.EncuestaRespuestas) cachedRealmObject;
        }

        Models_EncuestaRespuestasRealmProxyInterface realmObjectSource = (Models_EncuestaRespuestasRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.EncuestaRespuestas.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addInteger(columnInfo.idEncuestaBOIndex, realmObjectSource.realmGet$idEncuestaBO());
        builder.addInteger(columnInfo.idEncuestaIndex, realmObjectSource.realmGet$idEncuesta());
        builder.addInteger(columnInfo.idPreguntaIndex, realmObjectSource.realmGet$idPregunta());
        builder.addInteger(columnInfo.numeroPreguntaIndex, realmObjectSource.realmGet$numeroPregunta());
        builder.addString(columnInfo.respuestaIndex, realmObjectSource.realmGet$respuesta());
        builder.addStringList(columnInfo.arrayRespuestasIndex, realmObjectSource.realmGet$arrayRespuestas());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_EncuestaRespuestasRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.EncuestaRespuestas object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaRespuestas.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaRespuestasColumnInfo columnInfo = (EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaBOIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuestaBO(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuesta(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idPregunta(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numeroPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$numeroPregunta(), false);
        String realmGet$respuesta = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$respuesta();
        if (realmGet$respuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.respuestaIndex, rowIndex, realmGet$respuesta, false);
        }

        RealmList<java.lang.String> arrayRespuestasList = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$arrayRespuestas();
        if (arrayRespuestasList != null) {
            OsList arrayRespuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.arrayRespuestasIndex);
            for (java.lang.String arrayRespuestasItem : arrayRespuestasList) {
                if (arrayRespuestasItem == null) {
                    arrayRespuestasOsList.addNull();
                } else {
                    arrayRespuestasOsList.addString(arrayRespuestasItem);
                }
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaRespuestas.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaRespuestasColumnInfo columnInfo = (EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class);
        Models.EncuestaRespuestas object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaRespuestas) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaBOIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuestaBO(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuesta(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idPregunta(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numeroPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$numeroPregunta(), false);
            String realmGet$respuesta = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$respuesta();
            if (realmGet$respuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.respuestaIndex, rowIndex, realmGet$respuesta, false);
            }

            RealmList<java.lang.String> arrayRespuestasList = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$arrayRespuestas();
            if (arrayRespuestasList != null) {
                OsList arrayRespuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.arrayRespuestasIndex);
                for (java.lang.String arrayRespuestasItem : arrayRespuestasList) {
                    if (arrayRespuestasItem == null) {
                        arrayRespuestasOsList.addNull();
                    } else {
                        arrayRespuestasOsList.addString(arrayRespuestasItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.EncuestaRespuestas object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaRespuestas.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaRespuestasColumnInfo columnInfo = (EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaBOIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuestaBO(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuesta(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.idPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idPregunta(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.numeroPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$numeroPregunta(), false);
        String realmGet$respuesta = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$respuesta();
        if (realmGet$respuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.respuestaIndex, rowIndex, realmGet$respuesta, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.respuestaIndex, rowIndex, false);
        }

        OsList arrayRespuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.arrayRespuestasIndex);
        arrayRespuestasOsList.removeAll();
        RealmList<java.lang.String> arrayRespuestasList = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$arrayRespuestas();
        if (arrayRespuestasList != null) {
            for (java.lang.String arrayRespuestasItem : arrayRespuestasList) {
                if (arrayRespuestasItem == null) {
                    arrayRespuestasOsList.addNull();
                } else {
                    arrayRespuestasOsList.addString(arrayRespuestasItem);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaRespuestas.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaRespuestasColumnInfo columnInfo = (EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class);
        Models.EncuestaRespuestas object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaRespuestas) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaBOIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuestaBO(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idEncuestaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idEncuesta(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.idPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$idPregunta(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.numeroPreguntaIndex, rowIndex, ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$numeroPregunta(), false);
            String realmGet$respuesta = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$respuesta();
            if (realmGet$respuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.respuestaIndex, rowIndex, realmGet$respuesta, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.respuestaIndex, rowIndex, false);
            }

            OsList arrayRespuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.arrayRespuestasIndex);
            arrayRespuestasOsList.removeAll();
            RealmList<java.lang.String> arrayRespuestasList = ((Models_EncuestaRespuestasRealmProxyInterface) object).realmGet$arrayRespuestas();
            if (arrayRespuestasList != null) {
                for (java.lang.String arrayRespuestasItem : arrayRespuestasList) {
                    if (arrayRespuestasItem == null) {
                        arrayRespuestasOsList.addNull();
                    } else {
                        arrayRespuestasOsList.addString(arrayRespuestasItem);
                    }
                }
            }

        }
    }

    public static Models.EncuestaRespuestas createDetachedCopy(Models.EncuestaRespuestas realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.EncuestaRespuestas unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.EncuestaRespuestas();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.EncuestaRespuestas) cachedObject.object;
            }
            unmanagedObject = (Models.EncuestaRespuestas) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_EncuestaRespuestasRealmProxyInterface unmanagedCopy = (Models_EncuestaRespuestasRealmProxyInterface) unmanagedObject;
        Models_EncuestaRespuestasRealmProxyInterface realmSource = (Models_EncuestaRespuestasRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$idEncuestaBO(realmSource.realmGet$idEncuestaBO());
        unmanagedCopy.realmSet$idEncuesta(realmSource.realmGet$idEncuesta());
        unmanagedCopy.realmSet$idPregunta(realmSource.realmGet$idPregunta());
        unmanagedCopy.realmSet$numeroPregunta(realmSource.realmGet$numeroPregunta());
        unmanagedCopy.realmSet$respuesta(realmSource.realmGet$respuesta());

        unmanagedCopy.realmSet$arrayRespuestas(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$arrayRespuestas().addAll(realmSource.realmGet$arrayRespuestas());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("EncuestaRespuestas = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idEncuestaBO:");
        stringBuilder.append(realmGet$idEncuestaBO());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idEncuesta:");
        stringBuilder.append(realmGet$idEncuesta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{idPregunta:");
        stringBuilder.append(realmGet$idPregunta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{numeroPregunta:");
        stringBuilder.append(realmGet$numeroPregunta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{respuesta:");
        stringBuilder.append(realmGet$respuesta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{arrayRespuestas:");
        stringBuilder.append("RealmList<String>[").append(realmGet$arrayRespuestas().size()).append("]");
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
        Models_EncuestaRespuestasRealmProxy aEncuestaRespuestas = (Models_EncuestaRespuestasRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEncuestaRespuestas.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEncuestaRespuestas.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEncuestaRespuestas.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
