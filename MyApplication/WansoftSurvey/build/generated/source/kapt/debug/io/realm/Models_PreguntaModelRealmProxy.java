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
public class Models_PreguntaModelRealmProxy extends Models.PreguntaModel
    implements RealmObjectProxy, Models_PreguntaModelRealmProxyInterface {

    static final class PreguntaModelColumnInfo extends ColumnInfo {
        long maxColumnIndexValue;
        long IdIndex;
        long SurveyIdIndex;
        long DescriptionIndex;
        long OrderIndex;
        long StatusIndex;
        long QuestionTypeIndex;
        long OptionalIndex;
        long AnswerOptionsIndex;

        PreguntaModelColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PreguntaModel");
            this.IdIndex = addColumnDetails("Id", "Id", objectSchemaInfo);
            this.SurveyIdIndex = addColumnDetails("SurveyId", "SurveyId", objectSchemaInfo);
            this.DescriptionIndex = addColumnDetails("Description", "Description", objectSchemaInfo);
            this.OrderIndex = addColumnDetails("Order", "Order", objectSchemaInfo);
            this.StatusIndex = addColumnDetails("Status", "Status", objectSchemaInfo);
            this.QuestionTypeIndex = addColumnDetails("QuestionType", "QuestionType", objectSchemaInfo);
            this.OptionalIndex = addColumnDetails("Optional", "Optional", objectSchemaInfo);
            this.AnswerOptionsIndex = addColumnDetails("AnswerOptions", "AnswerOptions", objectSchemaInfo);
            this.maxColumnIndexValue = objectSchemaInfo.getMaxColumnIndex();
        }

        PreguntaModelColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PreguntaModelColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PreguntaModelColumnInfo src = (PreguntaModelColumnInfo) rawSrc;
            final PreguntaModelColumnInfo dst = (PreguntaModelColumnInfo) rawDst;
            dst.IdIndex = src.IdIndex;
            dst.SurveyIdIndex = src.SurveyIdIndex;
            dst.DescriptionIndex = src.DescriptionIndex;
            dst.OrderIndex = src.OrderIndex;
            dst.StatusIndex = src.StatusIndex;
            dst.QuestionTypeIndex = src.QuestionTypeIndex;
            dst.OptionalIndex = src.OptionalIndex;
            dst.AnswerOptionsIndex = src.AnswerOptionsIndex;
            dst.maxColumnIndexValue = src.maxColumnIndexValue;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PreguntaModelColumnInfo columnInfo;
    private ProxyState<Models.PreguntaModel> proxyState;
    private RealmList<Models.OpcionesPreguntaModel> AnswerOptionsRealmList;

    Models_PreguntaModelRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PreguntaModelColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<Models.PreguntaModel>(this);
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
    public int realmGet$SurveyId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.SurveyIdIndex);
    }

    @Override
    public void realmSet$SurveyId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.SurveyIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.SurveyIdIndex, value);
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
    public Models.TipoPreguntaModel realmGet$QuestionType() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.QuestionTypeIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(Models.TipoPreguntaModel.class, proxyState.getRow$realm().getLink(columnInfo.QuestionTypeIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$QuestionType(Models.TipoPreguntaModel value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("QuestionType")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.QuestionTypeIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.QuestionTypeIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.QuestionTypeIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.QuestionTypeIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public Boolean realmGet$Optional() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNull(columnInfo.OptionalIndex)) {
            return null;
        }
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.OptionalIndex);
    }

    @Override
    public void realmSet$Optional(Boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.OptionalIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setBoolean(columnInfo.OptionalIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.OptionalIndex);
            return;
        }
        proxyState.getRow$realm().setBoolean(columnInfo.OptionalIndex, value);
    }

    @Override
    public RealmList<Models.OpcionesPreguntaModel> realmGet$AnswerOptions() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (AnswerOptionsRealmList != null) {
            return AnswerOptionsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.AnswerOptionsIndex);
            AnswerOptionsRealmList = new RealmList<Models.OpcionesPreguntaModel>(Models.OpcionesPreguntaModel.class, osList, proxyState.getRealm$realm());
            return AnswerOptionsRealmList;
        }
    }

    @Override
    public void realmSet$AnswerOptions(RealmList<Models.OpcionesPreguntaModel> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("AnswerOptions")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<Models.OpcionesPreguntaModel> original = value;
                value = new RealmList<Models.OpcionesPreguntaModel>();
                for (Models.OpcionesPreguntaModel item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.AnswerOptionsIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                Models.OpcionesPreguntaModel linkedObject = value.get(i);
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
                Models.OpcionesPreguntaModel linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PreguntaModel", 8, 0);
        builder.addPersistedProperty("Id", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("SurveyId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Description", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Order", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("Status", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("QuestionType", RealmFieldType.OBJECT, "TipoPreguntaModel");
        builder.addPersistedProperty("Optional", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("AnswerOptions", RealmFieldType.LIST, "OpcionesPreguntaModel");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PreguntaModelColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PreguntaModelColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PreguntaModel";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PreguntaModel";
    }

    @SuppressWarnings("cast")
    public static Models.PreguntaModel createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("QuestionType")) {
            excludeFields.add("QuestionType");
        }
        if (json.has("AnswerOptions")) {
            excludeFields.add("AnswerOptions");
        }
        Models.PreguntaModel obj = realm.createObjectInternal(Models.PreguntaModel.class, true, excludeFields);

        final Models_PreguntaModelRealmProxyInterface objProxy = (Models_PreguntaModelRealmProxyInterface) obj;
        if (json.has("Id")) {
            if (json.isNull("Id")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'Id' to null.");
            } else {
                objProxy.realmSet$Id((int) json.getInt("Id"));
            }
        }
        if (json.has("SurveyId")) {
            if (json.isNull("SurveyId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'SurveyId' to null.");
            } else {
                objProxy.realmSet$SurveyId((int) json.getInt("SurveyId"));
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
        if (json.has("QuestionType")) {
            if (json.isNull("QuestionType")) {
                objProxy.realmSet$QuestionType(null);
            } else {
                Models.TipoPreguntaModel QuestionTypeObj = Models_TipoPreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("QuestionType"), update);
                objProxy.realmSet$QuestionType(QuestionTypeObj);
            }
        }
        if (json.has("Optional")) {
            if (json.isNull("Optional")) {
                objProxy.realmSet$Optional(null);
            } else {
                objProxy.realmSet$Optional((boolean) json.getBoolean("Optional"));
            }
        }
        if (json.has("AnswerOptions")) {
            if (json.isNull("AnswerOptions")) {
                objProxy.realmSet$AnswerOptions(null);
            } else {
                objProxy.realmGet$AnswerOptions().clear();
                JSONArray array = json.getJSONArray("AnswerOptions");
                for (int i = 0; i < array.length(); i++) {
                    Models.OpcionesPreguntaModel item = Models_OpcionesPreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$AnswerOptions().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static Models.PreguntaModel createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final Models.PreguntaModel obj = new Models.PreguntaModel();
        final Models_PreguntaModelRealmProxyInterface objProxy = (Models_PreguntaModelRealmProxyInterface) obj;
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
            } else if (name.equals("SurveyId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$SurveyId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'SurveyId' to null.");
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
            } else if (name.equals("QuestionType")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$QuestionType(null);
                } else {
                    Models.TipoPreguntaModel QuestionTypeObj = Models_TipoPreguntaModelRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$QuestionType(QuestionTypeObj);
                }
            } else if (name.equals("Optional")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$Optional((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$Optional(null);
                }
            } else if (name.equals("AnswerOptions")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$AnswerOptions(null);
                } else {
                    objProxy.realmSet$AnswerOptions(new RealmList<Models.OpcionesPreguntaModel>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        Models.OpcionesPreguntaModel item = Models_OpcionesPreguntaModelRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$AnswerOptions().add(item);
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

    private static Models_PreguntaModelRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating uexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(Models.PreguntaModel.class), false, Collections.<String>emptyList());
        io.realm.Models_PreguntaModelRealmProxy obj = new io.realm.Models_PreguntaModelRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static Models.PreguntaModel copyOrUpdate(Realm realm, PreguntaModelColumnInfo columnInfo, Models.PreguntaModel object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (Models.PreguntaModel) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static Models.PreguntaModel copy(Realm realm, PreguntaModelColumnInfo columnInfo, Models.PreguntaModel newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (Models.PreguntaModel) cachedRealmObject;
        }

        Models_PreguntaModelRealmProxyInterface realmObjectSource = (Models_PreguntaModelRealmProxyInterface) newObject;

        Table table = realm.getTable(Models.PreguntaModel.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, columnInfo.maxColumnIndexValue, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.IdIndex, realmObjectSource.realmGet$Id());
        builder.addInteger(columnInfo.SurveyIdIndex, realmObjectSource.realmGet$SurveyId());
        builder.addString(columnInfo.DescriptionIndex, realmObjectSource.realmGet$Description());
        builder.addInteger(columnInfo.OrderIndex, realmObjectSource.realmGet$Order());
        builder.addInteger(columnInfo.StatusIndex, realmObjectSource.realmGet$Status());
        builder.addBoolean(columnInfo.OptionalIndex, realmObjectSource.realmGet$Optional());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.Models_PreguntaModelRealmProxy realmObjectCopy = newProxyInstance(realm, row);
        cache.put(newObject, realmObjectCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        Models.TipoPreguntaModel QuestionTypeObj = realmObjectSource.realmGet$QuestionType();
        if (QuestionTypeObj == null) {
            realmObjectCopy.realmSet$QuestionType(null);
        } else {
            Models.TipoPreguntaModel cacheQuestionType = (Models.TipoPreguntaModel) cache.get(QuestionTypeObj);
            if (cacheQuestionType != null) {
                realmObjectCopy.realmSet$QuestionType(cacheQuestionType);
            } else {
                realmObjectCopy.realmSet$QuestionType(Models_TipoPreguntaModelRealmProxy.copyOrUpdate(realm, (Models_TipoPreguntaModelRealmProxy.TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class), QuestionTypeObj, update, cache, flags));
            }
        }

        RealmList<Models.OpcionesPreguntaModel> AnswerOptionsList = realmObjectSource.realmGet$AnswerOptions();
        if (AnswerOptionsList != null) {
            RealmList<Models.OpcionesPreguntaModel> AnswerOptionsRealmList = realmObjectCopy.realmGet$AnswerOptions();
            AnswerOptionsRealmList.clear();
            for (int i = 0; i < AnswerOptionsList.size(); i++) {
                Models.OpcionesPreguntaModel AnswerOptionsItem = AnswerOptionsList.get(i);
                Models.OpcionesPreguntaModel cacheAnswerOptions = (Models.OpcionesPreguntaModel) cache.get(AnswerOptionsItem);
                if (cacheAnswerOptions != null) {
                    AnswerOptionsRealmList.add(cacheAnswerOptions);
                } else {
                    AnswerOptionsRealmList.add(Models_OpcionesPreguntaModelRealmProxy.copyOrUpdate(realm, (Models_OpcionesPreguntaModelRealmProxy.OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class), AnswerOptionsItem, update, cache, flags));
                }
            }
        }

        return realmObjectCopy;
    }

    public static long insert(Realm realm, Models.PreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.PreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        PreguntaModelColumnInfo columnInfo = (PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.SurveyIdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$SurveyId(), false);
        String realmGet$Description = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Status(), false);

        Models.TipoPreguntaModel QuestionTypeObj = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$QuestionType();
        if (QuestionTypeObj != null) {
            Long cacheQuestionType = cache.get(QuestionTypeObj);
            if (cacheQuestionType == null) {
                cacheQuestionType = Models_TipoPreguntaModelRealmProxy.insert(realm, QuestionTypeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.QuestionTypeIndex, rowIndex, cacheQuestionType, false);
        }
        Boolean realmGet$Optional = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Optional();
        if (realmGet$Optional != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.OptionalIndex, rowIndex, realmGet$Optional, false);
        }

        RealmList<Models.OpcionesPreguntaModel> AnswerOptionsList = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$AnswerOptions();
        if (AnswerOptionsList != null) {
            OsList AnswerOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.AnswerOptionsIndex);
            for (Models.OpcionesPreguntaModel AnswerOptionsItem : AnswerOptionsList) {
                Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                if (cacheItemIndexAnswerOptions == null) {
                    cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insert(realm, AnswerOptionsItem, cache);
                }
                AnswerOptionsOsList.addRow(cacheItemIndexAnswerOptions);
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.PreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        PreguntaModelColumnInfo columnInfo = (PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class);
        Models.PreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.PreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.SurveyIdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$SurveyId(), false);
            String realmGet$Description = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Status(), false);

            Models.TipoPreguntaModel QuestionTypeObj = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$QuestionType();
            if (QuestionTypeObj != null) {
                Long cacheQuestionType = cache.get(QuestionTypeObj);
                if (cacheQuestionType == null) {
                    cacheQuestionType = Models_TipoPreguntaModelRealmProxy.insert(realm, QuestionTypeObj, cache);
                }
                table.setLink(columnInfo.QuestionTypeIndex, rowIndex, cacheQuestionType, false);
            }
            Boolean realmGet$Optional = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Optional();
            if (realmGet$Optional != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.OptionalIndex, rowIndex, realmGet$Optional, false);
            }

            RealmList<Models.OpcionesPreguntaModel> AnswerOptionsList = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$AnswerOptions();
            if (AnswerOptionsList != null) {
                OsList AnswerOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.AnswerOptionsIndex);
                for (Models.OpcionesPreguntaModel AnswerOptionsItem : AnswerOptionsList) {
                    Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                    if (cacheItemIndexAnswerOptions == null) {
                        cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insert(realm, AnswerOptionsItem, cache);
                    }
                    AnswerOptionsOsList.addRow(cacheItemIndexAnswerOptions);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, Models.PreguntaModel object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(Models.PreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        PreguntaModelColumnInfo columnInfo = (PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.SurveyIdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$SurveyId(), false);
        String realmGet$Description = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Description();
        if (realmGet$Description != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Status(), false);

        Models.TipoPreguntaModel QuestionTypeObj = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$QuestionType();
        if (QuestionTypeObj != null) {
            Long cacheQuestionType = cache.get(QuestionTypeObj);
            if (cacheQuestionType == null) {
                cacheQuestionType = Models_TipoPreguntaModelRealmProxy.insertOrUpdate(realm, QuestionTypeObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.QuestionTypeIndex, rowIndex, cacheQuestionType, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.QuestionTypeIndex, rowIndex);
        }
        Boolean realmGet$Optional = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Optional();
        if (realmGet$Optional != null) {
            Table.nativeSetBoolean(tableNativePtr, columnInfo.OptionalIndex, rowIndex, realmGet$Optional, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.OptionalIndex, rowIndex, false);
        }

        OsList AnswerOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.AnswerOptionsIndex);
        RealmList<Models.OpcionesPreguntaModel> AnswerOptionsList = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$AnswerOptions();
        if (AnswerOptionsList != null && AnswerOptionsList.size() == AnswerOptionsOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = AnswerOptionsList.size();
            for (int i = 0; i < objects; i++) {
                Models.OpcionesPreguntaModel AnswerOptionsItem = AnswerOptionsList.get(i);
                Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                if (cacheItemIndexAnswerOptions == null) {
                    cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, AnswerOptionsItem, cache);
                }
                AnswerOptionsOsList.setRow(i, cacheItemIndexAnswerOptions);
            }
        } else {
            AnswerOptionsOsList.removeAll();
            if (AnswerOptionsList != null) {
                for (Models.OpcionesPreguntaModel AnswerOptionsItem : AnswerOptionsList) {
                    Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                    if (cacheItemIndexAnswerOptions == null) {
                        cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, AnswerOptionsItem, cache);
                    }
                    AnswerOptionsOsList.addRow(cacheItemIndexAnswerOptions);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(Models.PreguntaModel.class);
        long tableNativePtr = table.getNativePtr();
        PreguntaModelColumnInfo columnInfo = (PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class);
        Models.PreguntaModel object = null;
        while (objects.hasNext()) {
            object = (Models.PreguntaModel) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            Table.nativeSetLong(tableNativePtr, columnInfo.IdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Id(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.SurveyIdIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$SurveyId(), false);
            String realmGet$Description = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Description();
            if (realmGet$Description != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, realmGet$Description, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.DescriptionIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.OrderIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Order(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.StatusIndex, rowIndex, ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Status(), false);

            Models.TipoPreguntaModel QuestionTypeObj = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$QuestionType();
            if (QuestionTypeObj != null) {
                Long cacheQuestionType = cache.get(QuestionTypeObj);
                if (cacheQuestionType == null) {
                    cacheQuestionType = Models_TipoPreguntaModelRealmProxy.insertOrUpdate(realm, QuestionTypeObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.QuestionTypeIndex, rowIndex, cacheQuestionType, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.QuestionTypeIndex, rowIndex);
            }
            Boolean realmGet$Optional = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$Optional();
            if (realmGet$Optional != null) {
                Table.nativeSetBoolean(tableNativePtr, columnInfo.OptionalIndex, rowIndex, realmGet$Optional, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.OptionalIndex, rowIndex, false);
            }

            OsList AnswerOptionsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.AnswerOptionsIndex);
            RealmList<Models.OpcionesPreguntaModel> AnswerOptionsList = ((Models_PreguntaModelRealmProxyInterface) object).realmGet$AnswerOptions();
            if (AnswerOptionsList != null && AnswerOptionsList.size() == AnswerOptionsOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = AnswerOptionsList.size();
                for (int i = 0; i < objectCount; i++) {
                    Models.OpcionesPreguntaModel AnswerOptionsItem = AnswerOptionsList.get(i);
                    Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                    if (cacheItemIndexAnswerOptions == null) {
                        cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, AnswerOptionsItem, cache);
                    }
                    AnswerOptionsOsList.setRow(i, cacheItemIndexAnswerOptions);
                }
            } else {
                AnswerOptionsOsList.removeAll();
                if (AnswerOptionsList != null) {
                    for (Models.OpcionesPreguntaModel AnswerOptionsItem : AnswerOptionsList) {
                        Long cacheItemIndexAnswerOptions = cache.get(AnswerOptionsItem);
                        if (cacheItemIndexAnswerOptions == null) {
                            cacheItemIndexAnswerOptions = Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, AnswerOptionsItem, cache);
                        }
                        AnswerOptionsOsList.addRow(cacheItemIndexAnswerOptions);
                    }
                }
            }

        }
    }

    public static Models.PreguntaModel createDetachedCopy(Models.PreguntaModel realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        Models.PreguntaModel unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new Models.PreguntaModel();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (Models.PreguntaModel) cachedObject.object;
            }
            unmanagedObject = (Models.PreguntaModel) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        Models_PreguntaModelRealmProxyInterface unmanagedCopy = (Models_PreguntaModelRealmProxyInterface) unmanagedObject;
        Models_PreguntaModelRealmProxyInterface realmSource = (Models_PreguntaModelRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$Id(realmSource.realmGet$Id());
        unmanagedCopy.realmSet$SurveyId(realmSource.realmGet$SurveyId());
        unmanagedCopy.realmSet$Description(realmSource.realmGet$Description());
        unmanagedCopy.realmSet$Order(realmSource.realmGet$Order());
        unmanagedCopy.realmSet$Status(realmSource.realmGet$Status());

        // Deep copy of QuestionType
        unmanagedCopy.realmSet$QuestionType(Models_TipoPreguntaModelRealmProxy.createDetachedCopy(realmSource.realmGet$QuestionType(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$Optional(realmSource.realmGet$Optional());

        // Deep copy of AnswerOptions
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$AnswerOptions(null);
        } else {
            RealmList<Models.OpcionesPreguntaModel> managedAnswerOptionsList = realmSource.realmGet$AnswerOptions();
            RealmList<Models.OpcionesPreguntaModel> unmanagedAnswerOptionsList = new RealmList<Models.OpcionesPreguntaModel>();
            unmanagedCopy.realmSet$AnswerOptions(unmanagedAnswerOptionsList);
            int nextDepth = currentDepth + 1;
            int size = managedAnswerOptionsList.size();
            for (int i = 0; i < size; i++) {
                Models.OpcionesPreguntaModel item = Models_OpcionesPreguntaModelRealmProxy.createDetachedCopy(managedAnswerOptionsList.get(i), nextDepth, maxDepth, cache);
                unmanagedAnswerOptionsList.add(item);
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
        StringBuilder stringBuilder = new StringBuilder("PreguntaModel = proxy[");
        stringBuilder.append("{Id:");
        stringBuilder.append(realmGet$Id());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{SurveyId:");
        stringBuilder.append(realmGet$SurveyId());
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
        stringBuilder.append("{QuestionType:");
        stringBuilder.append(realmGet$QuestionType() != null ? "TipoPreguntaModel" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{Optional:");
        stringBuilder.append(realmGet$Optional() != null ? realmGet$Optional() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{AnswerOptions:");
        stringBuilder.append("RealmList<OpcionesPreguntaModel>[").append(realmGet$AnswerOptions().size()).append("]");
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
        Models_PreguntaModelRealmProxy aPreguntaModel = (Models_PreguntaModelRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aPreguntaModel.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPreguntaModel.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aPreguntaModel.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
