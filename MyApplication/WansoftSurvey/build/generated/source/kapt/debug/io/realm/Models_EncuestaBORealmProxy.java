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
public class Models_EncuestaBORealmProxy extends Models.EncuestaBO
    implements RealmObjectProxy, Models_EncuestaBORealmProxyInterface {

    static final class EncuestaBOColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long CodigoEncuestaIndex;
        long OrdenIndex;
        long FechaOperacionIndex;
        long EncuestaIdIndex;
        long nombreEncuestaIndex;
        long FechaRegistroIndex;
        long FechaOrdenIndex;
        long respuestasIndex;

        EncuestaBOColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("EncuestaBO");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.CodigoEncuestaIndex = addColumnDetails("CodigoEncuesta", "CodigoEncuesta", objectSchemaInfo);
            this.OrdenIndex = addColumnDetails("Orden", "Orden", objectSchemaInfo);
            this.FechaOperacionIndex = addColumnDetails("FechaOperacion", "FechaOperacion", objectSchemaInfo);
            this.EncuestaIdIndex = addColumnDetails("EncuestaId", "EncuestaId", objectSchemaInfo);
            this.nombreEncuestaIndex = addColumnDetails("nombreEncuesta", "nombreEncuesta", objectSchemaInfo);
            this.FechaRegistroIndex = addColumnDetails("FechaRegistro", "FechaRegistro", objectSchemaInfo);
            this.FechaOrdenIndex = addColumnDetails("FechaOrden", "FechaOrden", objectSchemaInfo);
            this.respuestasIndex = addColumnDetails("respuestas", "respuestas", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        EncuestaBOColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EncuestaBOColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EncuestaBOColumnInfo src = (EncuestaBOColumnInfo) rawSrc;
            final EncuestaBOColumnInfo dst = (EncuestaBOColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.CodigoEncuestaIndex = src.CodigoEncuestaIndex;
            dst.OrdenIndex = src.OrdenIndex;
            dst.FechaOperacionIndex = src.FechaOperacionIndex;
            dst.EncuestaIdIndex = src.EncuestaIdIndex;
            dst.nombreEncuestaIndex = src.nombreEncuestaIndex;
            dst.FechaRegistroIndex = src.FechaRegistroIndex;
            dst.FechaOrdenIndex = src.FechaOrdenIndex;
            dst.respuestasIndex = src.respuestasIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private EncuestaBOColumnInfo columnInfo;
    private ProxyState<Models.EncuestaBO> proxyState;
    private RealmList<Models.EncuestaRespuestas> respuestasRealmList;

    Models_EncuestaBORealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EncuestaBOColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.EncuestaBO>(this);
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
    public String realmGet$CodigoEncuesta() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.CodigoEncuestaIndex);
    }

    @Override
    public void realmSet$CodigoEncuesta(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'CodigoEncuesta' to null.");
            }
            row.getTable().setString(columnInfo.CodigoEncuestaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'CodigoEncuesta' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.CodigoEncuestaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$Orden() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.OrdenIndex);
    }

    @Override
    public void realmSet$Orden(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.OrdenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.OrdenIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$FechaOperacion() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.FechaOperacionIndex);
    }

    @Override
    public void realmSet$FechaOperacion(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'FechaOperacion' to null.");
            }
            row.getTable().setDate(columnInfo.FechaOperacionIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'FechaOperacion' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.FechaOperacionIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$EncuestaId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.EncuestaIdIndex);
    }

    @Override
    public void realmSet$EncuestaId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.EncuestaIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.EncuestaIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$nombreEncuesta() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nombreEncuestaIndex);
    }

    @Override
    public void realmSet$nombreEncuesta(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'nombreEncuesta' to null.");
            }
            row.getTable().setString(columnInfo.nombreEncuestaIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'nombreEncuesta' to null.");
        }
        proxyState.getRow$realm().setString(columnInfo.nombreEncuestaIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$FechaRegistro() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.FechaRegistroIndex);
    }

    @Override
    public void realmSet$FechaRegistro(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'FechaRegistro' to null.");
            }
            row.getTable().setDate(columnInfo.FechaRegistroIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'FechaRegistro' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.FechaRegistroIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$FechaOrden() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.FechaOrdenIndex);
    }

    @Override
    public void realmSet$FechaOrden(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'FechaOrden' to null.");
            }
            row.getTable().setDate(columnInfo.FechaOrdenIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            throw new IllegalArgumentException("Trying to set non-nullable field 'FechaOrden' to null.");
        }
        proxyState.getRow$realm().setDate(columnInfo.FechaOrdenIndex, value);
    }

    @Override
    public RealmList<Models.EncuestaRespuestas> realmGet$respuestas() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (respuestasRealmList != null) {
            return respuestasRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.respuestasIndex);
            respuestasRealmList = new RealmList<Models.EncuestaRespuestas>(Models.EncuestaRespuestas.class, osList, proxyState.getRealm$realm());
            return respuestasRealmList;
        }
    }

    @Override
    public void realmSet$respuestas(RealmList<Models.EncuestaRespuestas> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("respuestas")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<Models.EncuestaRespuestas> original = value;
                value = new RealmList<Models.EncuestaRespuestas>();
                for (Models.EncuestaRespuestas item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.respuestasIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                Models.EncuestaRespuestas linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                Models.EncuestaRespuestas linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("EncuestaBO", 9, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("CodigoEncuesta", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Orden", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("FechaOperacion", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("EncuestaId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("nombreEncuesta", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("FechaRegistro", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("FechaOrden", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("respuestas", RealmFieldType.LIST, "EncuestaRespuestas");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EncuestaBOColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new EncuestaBOColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "EncuestaBO";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EncuestaBO";
    }

    @SuppressWarnings("cast")
    public static Models.EncuestaBO createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("respuestas")) {
            excludeFields.add("respuestas");
        }
        Models.EncuestaBO obj = realm.createObjectInternal(Models.EncuestaBO.class, true, excludeFields);

        final Models_EncuestaBORealmProxyInterface objProxy = (Models_EncuestaBORealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("CodigoEncuesta")) {
            if (json.isNull("CodigoEncuesta")) {
                objProxy.realmSet$CodigoEncuesta(null);
            } else {
                objProxy.realmSet$CodigoEncuesta((String) json.getString("CodigoEncuesta"));
            }
        }
        if (json.has("Orden")) {
            if (json.isNull("Orden")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Orden' to null.");
            } else {
                objProxy.realmSet$Orden((int) json.getInt("Orden"));
            }
        }
        if (json.has("FechaOperacion")) {
            if (json.isNull("FechaOperacion")) {
                objProxy.realmSet$FechaOperacion(null);
            } else {
                Object timestamp = json.get("FechaOperacion");
                if (timestamp instanceof String) {
                    objProxy.realmSet$FechaOperacion(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$FechaOperacion(new Date(json.getLong("FechaOperacion")));
                }
            }
        }
        if (json.has("EncuestaId")) {
            if (json.isNull("EncuestaId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'EncuestaId' to null.");
            } else {
                objProxy.realmSet$EncuestaId((int) json.getInt("EncuestaId"));
            }
        }
        if (json.has("nombreEncuesta")) {
            if (json.isNull("nombreEncuesta")) {
                objProxy.realmSet$nombreEncuesta(null);
            } else {
                objProxy.realmSet$nombreEncuesta((String) json.getString("nombreEncuesta"));
            }
        }
        if (json.has("FechaRegistro")) {
            if (json.isNull("FechaRegistro")) {
                objProxy.realmSet$FechaRegistro(null);
            } else {
                Object timestamp = json.get("FechaRegistro");
                if (timestamp instanceof String) {
                    objProxy.realmSet$FechaRegistro(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$FechaRegistro(new Date(json.getLong("FechaRegistro")));
                }
            }
        }
        if (json.has("FechaOrden")) {
            if (json.isNull("FechaOrden")) {
                objProxy.realmSet$FechaOrden(null);
            } else {
                Object timestamp = json.get("FechaOrden");
                if (timestamp instanceof String) {
                    objProxy.realmSet$FechaOrden(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$FechaOrden(new Date(json.getLong("FechaOrden")));
                }
            }
        }
        if (json.has("respuestas")) {
            if (json.isNull("respuestas")) {
                objProxy.realmSet$respuestas(null);
            } else {
                objProxy.realmGet$respuestas().clear();
                JSONArray array = json.getJSONArray("respuestas");
                for (int i = 0; i < array.length(); i++) {
                    Models.EncuestaRespuestas item = Models_EncuestaRespuestasRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$respuestas().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.EncuestaBO createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.EncuestaBO obj = new Models.EncuestaBO();
        final Models_EncuestaBORealmProxyInterface objProxy = (Models_EncuestaBORealmProxyInterface) obj;
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
            } else if (name.equals("CodigoEncuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$CodigoEncuesta((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$CodigoEncuesta(null);
                }
            } else if (name.equals("Orden")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Orden((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'Orden' to null.");
                }
            } else if (name.equals("FechaOperacion")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$FechaOperacion(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$FechaOperacion(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$FechaOperacion(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("EncuestaId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$EncuestaId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'EncuestaId' to null.");
                }
            } else if (name.equals("nombreEncuesta")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$nombreEncuesta((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$nombreEncuesta(null);
                }
            } else if (name.equals("FechaRegistro")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$FechaRegistro(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$FechaRegistro(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$FechaRegistro(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("FechaOrden")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$FechaOrden(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$FechaOrden(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$FechaOrden(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("respuestas")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$respuestas(null);
                } else {
                    objProxy.realmSet$respuestas(new RealmList<Models.EncuestaRespuestas>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        Models.EncuestaRespuestas item = Models_EncuestaRespuestasRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$respuestas().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    private static Models_EncuestaBORealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.EncuestaBO.class), false, Collections.<String>emptyList());
        io.realm.Models_EncuestaBORealmProxy obj = new io.realm.Models_EncuestaBORealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.EncuestaBO copyOrUpdate(Realm realm, EncuestaBOColumnInfo columnInfo, Models.EncuestaBO object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.EncuestaBO) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.EncuestaBO copy(Realm realm, EncuestaBOColumnInfo columnInfo, Models.EncuestaBO newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.EncuestaBO) cachedRealmObject;
        }

        Models_EncuestaBORealmProxyInterface realmObjectSource = (Models_EncuestaBORealmProxyInterface) newObject;

        Table table = realm.getTable(Models.EncuestaBO.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addString(columnInfo.CodigoEncuestaIndex, realmObjectSource.realmGet$CodigoEncuesta());
        builder.addInteger(columnInfo.OrdenIndex, realmObjectSource.realmGet$Orden());
        builder.addDate(columnInfo.FechaOperacionIndex, realmObjectSource.realmGet$FechaOperacion());
        builder.addInteger(columnInfo.EncuestaIdIndex, realmObjectSource.realmGet$EncuestaId());
        builder.addString(columnInfo.nombreEncuestaIndex, realmObjectSource.realmGet$nombreEncuesta());
        builder.addDate(columnInfo.FechaRegistroIndex, realmObjectSource.realmGet$FechaRegistro());
        builder.addDate(columnInfo.FechaOrdenIndex, realmObjectSource.realmGet$FechaOrden());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_EncuestaBORealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<Models.EncuestaRespuestas> respuestasList = realmObjectSource.realmGet$respuestas();
        if (respuestasList != null) {
            RealmList<Models.EncuestaRespuestas> respuestasRealmList = realmObjectCopy.realmGet$respuestas();
            respuestasRealmList.clear();
            for (int i = 0; i < respuestasList.size(); i++) {
                Models.EncuestaRespuestas respuestasItem = respuestasList.get(i);
                Models.EncuestaRespuestas cacherespuestas = (Models.EncuestaRespuestas) cache.get(respuestasItem);
                if (cacherespuestas != null) {
                    respuestasRealmList.add(cacherespuestas);
                } else {
                    respuestasRealmList.add(Models_EncuestaRespuestasRealmProxy.copyOrUpdate(realm, (Models_EncuestaRespuestasRealmProxy.EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class), respuestasItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.EncuestaBO object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaBO.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaBOColumnInfo columnInfo = (EncuestaBOColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaBO.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Id(), false);
        String realmGet$CodigoEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$CodigoEncuesta();
        if (realmGet$CodigoEncuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, realmGet$CodigoEncuesta, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrdenIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Orden(), false);
        java.util.Date realmGet$FechaOperacion = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOperacion();
        if (realmGet$FechaOperacion != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, realmGet$FechaOperacion.getTime(), false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.EncuestaIdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$EncuestaId(), false);
        String realmGet$nombreEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$nombreEncuesta();
        if (realmGet$nombreEncuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, realmGet$nombreEncuesta, false);
        }
        java.util.Date realmGet$FechaRegistro = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaRegistro();
        if (realmGet$FechaRegistro != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, realmGet$FechaRegistro.getTime(), false);
        }
        java.util.Date realmGet$FechaOrden = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOrden();
        if (realmGet$FechaOrden != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, realmGet$FechaOrden.getTime(), false);
        }

        RealmList<Models.EncuestaRespuestas> respuestasList = ((Models_EncuestaBORealmProxyInterface) object).realmGet$respuestas();
        if (respuestasList != null) {
            OsList respuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.respuestasIndex);
            for (Models.EncuestaRespuestas respuestasItem : respuestasList) {
                Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                if (cacheItemIndexrespuestas == null) {
                    cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insert(realm, respuestasItem, cache);
                }
                respuestasOsList.addRow(cacheItemIndexrespuestas);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaBO.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaBOColumnInfo columnInfo = (EncuestaBOColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaBO.class);
        Models.EncuestaBO object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaBO) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Id(), false);
            String realmGet$CodigoEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$CodigoEncuesta();
            if (realmGet$CodigoEncuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, realmGet$CodigoEncuesta, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrdenIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Orden(), false);
            java.util.Date realmGet$FechaOperacion = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOperacion();
            if (realmGet$FechaOperacion != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, realmGet$FechaOperacion.getTime(), false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.EncuestaIdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$EncuestaId(), false);
            String realmGet$nombreEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$nombreEncuesta();
            if (realmGet$nombreEncuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, realmGet$nombreEncuesta, false);
            }
            java.util.Date realmGet$FechaRegistro = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaRegistro();
            if (realmGet$FechaRegistro != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, realmGet$FechaRegistro.getTime(), false);
            }
            java.util.Date realmGet$FechaOrden = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOrden();
            if (realmGet$FechaOrden != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, realmGet$FechaOrden.getTime(), false);
            }

            RealmList<Models.EncuestaRespuestas> respuestasList = ((Models_EncuestaBORealmProxyInterface) object).realmGet$respuestas();
            if (respuestasList != null) {
                OsList respuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.respuestasIndex);
                for (Models.EncuestaRespuestas respuestasItem : respuestasList) {
                    Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                    if (cacheItemIndexrespuestas == null) {
                        cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insert(realm, respuestasItem, cache);
                    }
                    respuestasOsList.addRow(cacheItemIndexrespuestas);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.EncuestaBO object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaBO.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaBOColumnInfo columnInfo = (EncuestaBOColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaBO.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Id(), false);
        String realmGet$CodigoEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$CodigoEncuesta();
        if (realmGet$CodigoEncuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, realmGet$CodigoEncuesta, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrdenIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Orden(), false);
        java.util.Date realmGet$FechaOperacion = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOperacion();
        if (realmGet$FechaOperacion != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, realmGet$FechaOperacion.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.EncuestaIdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$EncuestaId(), false);
        String realmGet$nombreEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$nombreEncuesta();
        if (realmGet$nombreEncuesta != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, realmGet$nombreEncuesta, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, false);
        }
        java.util.Date realmGet$FechaRegistro = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaRegistro();
        if (realmGet$FechaRegistro != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, realmGet$FechaRegistro.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, false);
        }
        java.util.Date realmGet$FechaOrden = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOrden();
        if (realmGet$FechaOrden != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, realmGet$FechaOrden.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, false);
        }

        OsList respuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.respuestasIndex);
        RealmList<Models.EncuestaRespuestas> respuestasList = ((Models_EncuestaBORealmProxyInterface) object).realmGet$respuestas();
        if (respuestasList != null && respuestasList.size() == respuestasOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = respuestasList.size();
            for (int i = 0; i < objects; i++) {
                Models.EncuestaRespuestas respuestasItem = respuestasList.get(i);
                Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                if (cacheItemIndexrespuestas == null) {
                    cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, respuestasItem, cache);
                }
                respuestasOsList.setRow(i, cacheItemIndexrespuestas);
            }
        } else {
            respuestasOsList.removeAll();
            if (respuestasList != null) {
                for (Models.EncuestaRespuestas respuestasItem : respuestasList) {
                    Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                    if (cacheItemIndexrespuestas == null) {
                        cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, respuestasItem, cache);
                    }
                    respuestasOsList.addRow(cacheItemIndexrespuestas);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaBO.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaBOColumnInfo columnInfo = (EncuestaBOColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaBO.class);
        Models.EncuestaBO object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaBO) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Id(), false);
            String realmGet$CodigoEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$CodigoEncuesta();
            if (realmGet$CodigoEncuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, realmGet$CodigoEncuesta, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.CodigoEncuestaIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrdenIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$Orden(), false);
            java.util.Date realmGet$FechaOperacion = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOperacion();
            if (realmGet$FechaOperacion != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, realmGet$FechaOperacion.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.FechaOperacionIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.EncuestaIdIndex, rowIndex, ((Models_EncuestaBORealmProxyInterface) object).realmGet$EncuestaId(), false);
            String realmGet$nombreEncuesta = ((Models_EncuestaBORealmProxyInterface) object).realmGet$nombreEncuesta();
            if (realmGet$nombreEncuesta != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, realmGet$nombreEncuesta, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nombreEncuestaIndex, rowIndex, false);
            }
            java.util.Date realmGet$FechaRegistro = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaRegistro();
            if (realmGet$FechaRegistro != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, realmGet$FechaRegistro.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.FechaRegistroIndex, rowIndex, false);
            }
            java.util.Date realmGet$FechaOrden = ((Models_EncuestaBORealmProxyInterface) object).realmGet$FechaOrden();
            if (realmGet$FechaOrden != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, realmGet$FechaOrden.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.FechaOrdenIndex, rowIndex, false);
            }

            OsList respuestasOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.respuestasIndex);
            RealmList<Models.EncuestaRespuestas> respuestasList = ((Models_EncuestaBORealmProxyInterface) object).realmGet$respuestas();
            if (respuestasList != null && respuestasList.size() == respuestasOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = respuestasList.size();
                for (int i = 0; i < objectCount; i++) {
                    Models.EncuestaRespuestas respuestasItem = respuestasList.get(i);
                    Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                    if (cacheItemIndexrespuestas == null) {
                        cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, respuestasItem, cache);
                    }
                    respuestasOsList.setRow(i, cacheItemIndexrespuestas);
                }
            } else {
                respuestasOsList.removeAll();
                if (respuestasList != null) {
                    for (Models.EncuestaRespuestas respuestasItem : respuestasList) {
                        Long cacheItemIndexrespuestas = cache.get(respuestasItem);
                        if (cacheItemIndexrespuestas == null) {
                            cacheItemIndexrespuestas = Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, respuestasItem, cache);
                        }
                        respuestasOsList.addRow(cacheItemIndexrespuestas);
                    }
                }
            }

        }
    }

    public static Models.EncuestaBO createDetachedCopy(Models.EncuestaBO realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.EncuestaBO unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.EncuestaBO();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.EncuestaBO) cachedObject.object;
            }
            unmanagedObject = (Models.EncuestaBO) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_EncuestaBORealmProxyInterface unmanagedCopy = (Models_EncuestaBORealmProxyInterface) unmanagedObject;
        Models_EncuestaBORealmProxyInterface realmSource = (Models_EncuestaBORealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$CodigoEncuesta(realmSource.realmGet$CodigoEncuesta());
        unmanagedCopy.realmSet$Orden(realmSource.realmGet$Orden());
        unmanagedCopy.realmSet$FechaOperacion(realmSource.realmGet$FechaOperacion());
        unmanagedCopy.realmSet$EncuestaId(realmSource.realmGet$EncuestaId());
        unmanagedCopy.realmSet$nombreEncuesta(realmSource.realmGet$nombreEncuesta());
        unmanagedCopy.realmSet$FechaRegistro(realmSource.realmGet$FechaRegistro());
        unmanagedCopy.realmSet$FechaOrden(realmSource.realmGet$FechaOrden());

        // Deep copy of respuestas
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$respuestas(null);
        } else {
            RealmList<Models.EncuestaRespuestas> managedrespuestasList = realmSource.realmGet$respuestas();
            RealmList<Models.EncuestaRespuestas> unmanagedrespuestasList = new RealmList<Models.EncuestaRespuestas>();
            unmanagedCopy.realmSet$respuestas(unmanagedrespuestasList);
            int nextDepth = currentDepth + 1;
            int size = managedrespuestasList.size();
            for (int i = 0; i < size; i++) {
                Models.EncuestaRespuestas item = Models_EncuestaRespuestasRealmProxy.createDetachedCopy(managedrespuestasList.get(i), nextDepth, maxDepth, cache);
                unmanagedrespuestasList.add(item);
            }
        }

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("EncuestaBO = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{CodigoEncuesta:");
        stringBuilder.append(realmGet$CodigoEncuesta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Orden:");
        stringBuilder.append(realmGet$Orden());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{FechaOperacion:");
        stringBuilder.append(realmGet$FechaOperacion());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{EncuestaId:");
        stringBuilder.append(realmGet$EncuestaId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{nombreEncuesta:");
        stringBuilder.append(realmGet$nombreEncuesta());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{FechaRegistro:");
        stringBuilder.append(realmGet$FechaRegistro());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{FechaOrden:");
        stringBuilder.append(realmGet$FechaOrden());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{respuestas:");
        stringBuilder.append("RealmList<EncuestaRespuestas>[").append(realmGet$respuestas().size()).append("]");
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
        Models_EncuestaBORealmProxy aEncuestaBO = (Models_EncuestaBORealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEncuestaBO.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEncuestaBO.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEncuestaBO.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
