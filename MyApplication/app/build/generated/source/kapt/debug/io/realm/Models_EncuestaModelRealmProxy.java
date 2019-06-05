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
public class Models_EncuestaModelRealmProxy extends Models.EncuestaModel
    implements RealmObjectProxy, Models_EncuestaModelRealmProxyInterface {

    static final class EncuestaModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long NameIndex;
        long CreationDateIndex;
        long StatusIndex;
        long DefaultIndex;
        long QuestionsIndex;

        EncuestaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("EncuestaModel");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.NameIndex = addColumnDetails("Name", "Name", objectSchemaInfo);
            this.CreationDateIndex = addColumnDetails("CreationDate", "CreationDate", objectSchemaInfo);
            this.StatusIndex = addColumnDetails("Status", "Status", objectSchemaInfo);
            this.DefaultIndex = addColumnDetails("Default", "Default", objectSchemaInfo);
            this.QuestionsIndex = addColumnDetails("Questions", "Questions", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        EncuestaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new EncuestaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final EncuestaModelColumnInfo src = (EncuestaModelColumnInfo) rawSrc;
            final EncuestaModelColumnInfo dst = (EncuestaModelColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.NameIndex = src.NameIndex;
            dst.CreationDateIndex = src.CreationDateIndex;
            dst.StatusIndex = src.StatusIndex;
            dst.DefaultIndex = src.DefaultIndex;
            dst.QuestionsIndex = src.QuestionsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private EncuestaModelColumnInfo columnInfo;
    private ProxyState<Models.EncuestaModel> proxyState;
    private RealmList<Models.PreguntaModel> QuestionsRealmList;

    Models_EncuestaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (EncuestaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.EncuestaModel>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$Id() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.IdIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.IdIndex);
    }

    @Override
    public void realmSet$Id(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.IdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.IdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.IdIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.IdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$Name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.NameIndex);
    }

    @Override
    public void realmSet$Name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.NameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.NameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.NameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.NameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Date realmGet$CreationDate() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.CreationDateIndex)) {
            return null;
        }
        return (java.util.Date) proxyState.getRow$realm().getDate(columnInfo.CreationDateIndex);
    }

    @Override
    public void realmSet$CreationDate(Date value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.CreationDateIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setDate(columnInfo.CreationDateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.CreationDateIndex);
            return;
        }
        proxyState.getRow$realm().setDate(columnInfo.CreationDateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Integer realmGet$Status() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.StatusIndex)) {
            return null;
        }
        return (int) proxyState.getRow$realm().getLong(columnInfo.StatusIndex);
    }

    @Override
    public void realmSet$Status(Integer value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.StatusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setLong(columnInfo.StatusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.StatusIndex);
            return;
        }
        proxyState.getRow$realm().setLong(columnInfo.StatusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$Default() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.DefaultIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.DefaultIndex);
    }

    @Override
    public void realmSet$Default(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.DefaultIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.DefaultIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.DefaultIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.DefaultIndex, value);
    }

    @Override
    public RealmList<Models.PreguntaModel> realmGet$Questions() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (QuestionsRealmList != null) {
            return QuestionsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.QuestionsIndex);
            QuestionsRealmList = new RealmList<Models.PreguntaModel>(Models.PreguntaModel.class, osList, proxyState.getRealm$realm());
            return QuestionsRealmList;
        }
    }

    @Override
    public void realmSet$Questions(RealmList<Models.PreguntaModel> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("Questions")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<Models.PreguntaModel> original = value;
                value = new RealmList<Models.PreguntaModel>();
                for (Models.PreguntaModel item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.QuestionsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                Models.PreguntaModel linkedObject = value.get(i);
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
                Models.PreguntaModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("EncuestaModel", 6, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("Name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("CreationDate", RealmFieldType.DATE, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("Status", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("Default", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("Questions", RealmFieldType.LIST, "PreguntaModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static EncuestaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new EncuestaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "EncuestaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "EncuestaModel";
    }

    @SuppressWarnings("cast")
    public static Models.EncuestaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("Questions")) {
            excludeFields.add("Questions");
        }
        Models.EncuestaModel obj = realm.createObjectInternal(Models.EncuestaModel.class, true, excludeFields);

        final Models_EncuestaModelRealmProxyInterface objProxy = (Models_EncuestaModelRealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                objProxy.realmSet$Id(null);
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("Name")) {
            if (json.isNull("Name")) {
                objProxy.realmSet$Name(null);
            } else {
                objProxy.realmSet$Name((String) json.getString("Name"));
            }
        }
        if (json.has("CreationDate")) {
            if (json.isNull("CreationDate")) {
                objProxy.realmSet$CreationDate(null);
            } else {
                Object timestamp = json.get("CreationDate");
                if (timestamp instanceof String) {
                    objProxy.realmSet$CreationDate(JsonUtils.stringToDate((String) timestamp));
                } else {
                    objProxy.realmSet$CreationDate(new Date(json.getLong("CreationDate")));
                }
            }
        }
        if (json.has("Status")) {
            if (json.isNull("Status")) {
                objProxy.realmSet$Status(null);
            } else {
                objProxy.realmSet$Status((int) json.getInt("Status"));
            }
        }
        if (json.has("Default")) {
            if (json.isNull("Default")) {
                objProxy.realmSet$Default(null);
            } else {
                objProxy.realmSet$Default((boolean) json.getBoolean("Default"));
            }
        }
        if (json.has("Questions")) {
            if (json.isNull("Questions")) {
                objProxy.realmSet$Questions(null);
            } else {
                objProxy.realmGet$Questions().clear();
                JSONArray array = json.getJSONArray("Questions");
                for (int i = 0; i < array.length(); i++) {
                    Models.PreguntaModel item = Models_PreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$Questions().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.EncuestaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.EncuestaModel obj = new Models.EncuestaModel();
        final Models_EncuestaModelRealmProxyInterface objProxy = (Models_EncuestaModelRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("Id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Id((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Id(null);
                }
            } else if (name.equals("Name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Name(null);
                }
            } else if (name.equals("CreationDate")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$CreationDate(null);
                } else if (reader.peek() == JsonToken.NUMBER) {
                    long timestamp = reader.nextLong();
                    if (timestamp > -1) {
                        objProxy.realmSet$CreationDate(new Date(timestamp));
                    }
                } else {
                    objProxy.realmSet$CreationDate(JsonUtils.stringToDate(reader.nextString()));
                }
            } else if (name.equals("Status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Status((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Status(null);
                }
            } else if (name.equals("Default")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Default((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Default(null);
                }
            } else if (name.equals("Questions")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$Questions(null);
                } else {
                    objProxy.realmSet$Questions(new RealmList<Models.PreguntaModel>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        Models.PreguntaModel item = Models_PreguntaModelRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$Questions().add(item);
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

    private static Models_EncuestaModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.EncuestaModel.class), false, Collections.<String>emptyList());
        io.realm.Models_EncuestaModelRealmProxy obj = new io.realm.Models_EncuestaModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.EncuestaModel copyOrUpdate(Realm realm, EncuestaModelColumnInfo columnInfo, Models.EncuestaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.EncuestaModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.EncuestaModel copy(Realm realm, EncuestaModelColumnInfo columnInfo, Models.EncuestaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.EncuestaModel) cachedRealmObject;
        }

        Models_EncuestaModelRealmProxyInterface realmObjectSource = (Models_EncuestaModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.EncuestaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addString(columnInfo.NameIndex, realmObjectSource.realmGet$Name());
        builder.addDate(columnInfo.CreationDateIndex, realmObjectSource.realmGet$CreationDate());
        builder.addInteger(columnInfo.StatusIndex, realmObjectSource.realmGet$Status());
        builder.addBoolean(columnInfo.DefaultIndex, realmObjectSource.realmGet$Default());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_EncuestaModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<Models.PreguntaModel> QuestionsList = realmObjectSource.realmGet$Questions();
        if (QuestionsList != null) {
            RealmList<Models.PreguntaModel> QuestionsRealmList = realmObjectCopy.realmGet$Questions();
            QuestionsRealmList.clear();
            for (int i = 0; i < QuestionsList.size(); i++) {
                Models.PreguntaModel QuestionsItem = QuestionsList.get(i);
                Models.PreguntaModel cacheQuestions = (Models.PreguntaModel) cache.get(QuestionsItem);
                if (cacheQuestions != null) {
                    QuestionsRealmList.add(cacheQuestions);
                } else {
                    QuestionsRealmList.add(Models_PreguntaModelRealmProxy.copyOrUpdate(realm, (Models_PreguntaModelRealmProxy.PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class), QuestionsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.EncuestaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaModelColumnInfo columnInfo = (EncuestaModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$Id = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Id();
        if (realmGet$Id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, realmGet$Id.longValue(), false);
        }
        String realmGet$Name = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Name();
        if (realmGet$Name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.NameIndex, rowIndex, realmGet$Name, false);
        }
        java.util.Date realmGet$CreationDate = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$CreationDate();
        if (realmGet$CreationDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, realmGet$CreationDate.getTime(), false);
        }
        Number realmGet$Status = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Status();
        if (realmGet$Status != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, realmGet$Status.longValue(), false);
        }
        Boolean realmGet$Default = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Default();
        if (realmGet$Default != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, realmGet$Default, false);
        }

        RealmList<Models.PreguntaModel> QuestionsList = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Questions();
        if (QuestionsList != null) {
            OsList QuestionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.QuestionsIndex);
            for (Models.PreguntaModel QuestionsItem : QuestionsList) {
                Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                if (cacheItemIndexQuestions == null) {
                    cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insert(realm, QuestionsItem, cache);
                }
                QuestionsOsList.addRow(cacheItemIndexQuestions);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaModelColumnInfo columnInfo = (EncuestaModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaModel.class);
        Models.EncuestaModel object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$Id = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Id();
            if (realmGet$Id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, realmGet$Id.longValue(), false);
            }
            String realmGet$Name = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Name();
            if (realmGet$Name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.NameIndex, rowIndex, realmGet$Name, false);
            }
            java.util.Date realmGet$CreationDate = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$CreationDate();
            if (realmGet$CreationDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, realmGet$CreationDate.getTime(), false);
            }
            Number realmGet$Status = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Status();
            if (realmGet$Status != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, realmGet$Status.longValue(), false);
            }
            Boolean realmGet$Default = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Default();
            if (realmGet$Default != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, realmGet$Default, false);
            }

            RealmList<Models.PreguntaModel> QuestionsList = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Questions();
            if (QuestionsList != null) {
                OsList QuestionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.QuestionsIndex);
                for (Models.PreguntaModel QuestionsItem : QuestionsList) {
                    Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                    if (cacheItemIndexQuestions == null) {
                        cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insert(realm, QuestionsItem, cache);
                    }
                    QuestionsOsList.addRow(cacheItemIndexQuestions);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.EncuestaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.EncuestaModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaModelColumnInfo columnInfo = (EncuestaModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Number realmGet$Id = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Id();
        if (realmGet$Id != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, realmGet$Id.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.IdIndex, rowIndex, false);
        }
        String realmGet$Name = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Name();
        if (realmGet$Name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.NameIndex, rowIndex, realmGet$Name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.NameIndex, rowIndex, false);
        }
        java.util.Date realmGet$CreationDate = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$CreationDate();
        if (realmGet$CreationDate != null) {
            Table.nativeSetTimestamp(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, realmGet$CreationDate.getTime(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, false);
        }
        Number realmGet$Status = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Status();
        if (realmGet$Status != null) {
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, realmGet$Status.longValue(), false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.StatusIndex, rowIndex, false);
        }
        Boolean realmGet$Default = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Default();
        if (realmGet$Default != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, realmGet$Default, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.DefaultIndex, rowIndex, false);
        }

        OsList QuestionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.QuestionsIndex);
        RealmList<Models.PreguntaModel> QuestionsList = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Questions();
        if (QuestionsList != null && QuestionsList.size() == QuestionsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = QuestionsList.size();
            for (int i = 0; i < objects; i++) {
                Models.PreguntaModel QuestionsItem = QuestionsList.get(i);
                Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                if (cacheItemIndexQuestions == null) {
                    cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insertOrUpdate(realm, QuestionsItem, cache);
                }
                QuestionsOsList.setRow(i, cacheItemIndexQuestions);
            }
        } else {
            QuestionsOsList.removeAll();
            if (QuestionsList != null) {
                for (Models.PreguntaModel QuestionsItem : QuestionsList) {
                    Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                    if (cacheItemIndexQuestions == null) {
                        cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insertOrUpdate(realm, QuestionsItem, cache);
                    }
                    QuestionsOsList.addRow(cacheItemIndexQuestions);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.EncuestaModel.class);
        long tableNativePtr = table.getNativePtr();
        EncuestaModelColumnInfo columnInfo = (EncuestaModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaModel.class);
        Models.EncuestaModel object = null;
        while (objects.hasNext()) {
            object = (Models.EncuestaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Number realmGet$Id = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Id();
            if (realmGet$Id != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, realmGet$Id.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.IdIndex, rowIndex, false);
            }
            String realmGet$Name = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Name();
            if (realmGet$Name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.NameIndex, rowIndex, realmGet$Name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.NameIndex, rowIndex, false);
            }
            java.util.Date realmGet$CreationDate = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$CreationDate();
            if (realmGet$CreationDate != null) {
                Table.nativeSetTimestamp(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, realmGet$CreationDate.getTime(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.CreationDateIndex, rowIndex, false);
            }
            Number realmGet$Status = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Status();
            if (realmGet$Status != null) {
                Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, realmGet$Status.longValue(), false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.StatusIndex, rowIndex, false);
            }
            Boolean realmGet$Default = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Default();
            if (realmGet$Default != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.DefaultIndex, rowIndex, realmGet$Default, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.DefaultIndex, rowIndex, false);
            }

            OsList QuestionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.QuestionsIndex);
            RealmList<Models.PreguntaModel> QuestionsList = ((Models_EncuestaModelRealmProxyInterface) object).realmGet$Questions();
            if (QuestionsList != null && QuestionsList.size() == QuestionsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = QuestionsList.size();
                for (int i = 0; i < objectCount; i++) {
                    Models.PreguntaModel QuestionsItem = QuestionsList.get(i);
                    Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                    if (cacheItemIndexQuestions == null) {
                        cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insertOrUpdate(realm, QuestionsItem, cache);
                    }
                    QuestionsOsList.setRow(i, cacheItemIndexQuestions);
                }
            } else {
                QuestionsOsList.removeAll();
                if (QuestionsList != null) {
                    for (Models.PreguntaModel QuestionsItem : QuestionsList) {
                        Long cacheItemIndexQuestions = cache.get(QuestionsItem);
                        if (cacheItemIndexQuestions == null) {
                            cacheItemIndexQuestions = Models_PreguntaModelRealmProxy.insertOrUpdate(realm, QuestionsItem, cache);
                        }
                        QuestionsOsList.addRow(cacheItemIndexQuestions);
                    }
                }
            }

        }
    }

    public static Models.EncuestaModel createDetachedCopy(Models.EncuestaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.EncuestaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.EncuestaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.EncuestaModel) cachedObject.object;
            }
            unmanagedObject = (Models.EncuestaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_EncuestaModelRealmProxyInterface unmanagedCopy = (Models_EncuestaModelRealmProxyInterface) unmanagedObject;
        Models_EncuestaModelRealmProxyInterface realmSource = (Models_EncuestaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$Name(realmSource.realmGet$Name());
        unmanagedCopy.realmSet$CreationDate(realmSource.realmGet$CreationDate());
        unmanagedCopy.realmSet$Status(realmSource.realmGet$Status());
        unmanagedCopy.realmSet$Default(realmSource.realmGet$Default());

        // Deep copy of Questions
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$Questions(null);
        } else {
            RealmList<Models.PreguntaModel> managedQuestionsList = realmSource.realmGet$Questions();
            RealmList<Models.PreguntaModel> unmanagedQuestionsList = new RealmList<Models.PreguntaModel>();
            unmanagedCopy.realmSet$Questions(unmanagedQuestionsList);
            int nextDepth = currentDepth + 1;
            int size = managedQuestionsList.size();
            for (int i = 0; i < size; i++) {
                Models.PreguntaModel item = Models_PreguntaModelRealmProxy.createDetachedCopy(managedQuestionsList.get(i), nextDepth, maxDepth, cache);
                unmanagedQuestionsList.add(item);
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
        StringBuilder stringBuilder = new StringBuilder("EncuestaModel = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id() != null ? realmGet$Id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Name:");
        stringBuilder.append(realmGet$Name() != null ? realmGet$Name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{CreationDate:");
        stringBuilder.append(realmGet$CreationDate() != null ? realmGet$CreationDate() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Status:");
        stringBuilder.append(realmGet$Status() != null ? realmGet$Status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Default:");
        stringBuilder.append(realmGet$Default() != null ? realmGet$Default() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Questions:");
        stringBuilder.append("RealmList<PreguntaModel>[").append(realmGet$Questions().size()).append("]");
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
        Models_EncuestaModelRealmProxy aEncuestaModel = (Models_EncuestaModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aEncuestaModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aEncuestaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aEncuestaModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
