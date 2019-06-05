package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(8);
        modelClasses.add(Models.PreguntaModel.class);
        modelClasses.add(Models.EncuestaRespuestas.class);
        modelClasses.add(Models.EncuestaSelectModel.class);
        modelClasses.add(Models.EncuestaModel.class);
        modelClasses.add(Models.OpcionesPreguntaModel.class);
        modelClasses.add(Models.LoginModel.class);
        modelClasses.add(Models.TipoPreguntaModel.class);
        modelClasses.add(Models.EncuestaBO.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(8);
        infoMap.put(Models.PreguntaModel.class, io.realm.Models_PreguntaModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.EncuestaRespuestas.class, io.realm.Models_EncuestaRespuestasRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.EncuestaSelectModel.class, io.realm.Models_EncuestaSelectModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.EncuestaModel.class, io.realm.Models_EncuestaModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.OpcionesPreguntaModel.class, io.realm.Models_OpcionesPreguntaModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.LoginModel.class, io.realm.Models_LoginModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.TipoPreguntaModel.class, io.realm.Models_TipoPreguntaModelRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(Models.EncuestaBO.class, io.realm.Models_EncuestaBORealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(Models.PreguntaModel.class)) {
            return io.realm.Models_PreguntaModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            return io.realm.Models_EncuestaRespuestasRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            return io.realm.Models_EncuestaSelectModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            return io.realm.Models_EncuestaModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            return io.realm.Models_OpcionesPreguntaModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.LoginModel.class)) {
            return io.realm.Models_LoginModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            return io.realm.Models_TipoPreguntaModelRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            return io.realm.Models_EncuestaBORealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(Models.PreguntaModel.class)) {
            return "PreguntaModel";
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            return "EncuestaRespuestas";
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            return "EncuestaSelectModel";
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            return "EncuestaModel";
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            return "OpcionesPreguntaModel";
        }
        if (clazz.equals(Models.LoginModel.class)) {
            return "LoginModel";
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            return "TipoPreguntaModel";
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            return "EncuestaBO";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(Models.PreguntaModel.class)) {
                return clazz.cast(new io.realm.Models_PreguntaModelRealmProxy());
            }
            if (clazz.equals(Models.EncuestaRespuestas.class)) {
                return clazz.cast(new io.realm.Models_EncuestaRespuestasRealmProxy());
            }
            if (clazz.equals(Models.EncuestaSelectModel.class)) {
                return clazz.cast(new io.realm.Models_EncuestaSelectModelRealmProxy());
            }
            if (clazz.equals(Models.EncuestaModel.class)) {
                return clazz.cast(new io.realm.Models_EncuestaModelRealmProxy());
            }
            if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
                return clazz.cast(new io.realm.Models_OpcionesPreguntaModelRealmProxy());
            }
            if (clazz.equals(Models.LoginModel.class)) {
                return clazz.cast(new io.realm.Models_LoginModelRealmProxy());
            }
            if (clazz.equals(Models.TipoPreguntaModel.class)) {
                return clazz.cast(new io.realm.Models_TipoPreguntaModelRealmProxy());
            }
            if (clazz.equals(Models.EncuestaBO.class)) {
                return clazz.cast(new io.realm.Models_EncuestaBORealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(Models.PreguntaModel.class)) {
            Models_PreguntaModelRealmProxy.PreguntaModelColumnInfo columnInfo = (Models_PreguntaModelRealmProxy.PreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.PreguntaModel.class);
            return clazz.cast(io.realm.Models_PreguntaModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.PreguntaModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            Models_EncuestaRespuestasRealmProxy.EncuestaRespuestasColumnInfo columnInfo = (Models_EncuestaRespuestasRealmProxy.EncuestaRespuestasColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaRespuestas.class);
            return clazz.cast(io.realm.Models_EncuestaRespuestasRealmProxy.copyOrUpdate(realm, columnInfo, (Models.EncuestaRespuestas) obj, update, cache, flags));
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            Models_EncuestaSelectModelRealmProxy.EncuestaSelectModelColumnInfo columnInfo = (Models_EncuestaSelectModelRealmProxy.EncuestaSelectModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaSelectModel.class);
            return clazz.cast(io.realm.Models_EncuestaSelectModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.EncuestaSelectModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            Models_EncuestaModelRealmProxy.EncuestaModelColumnInfo columnInfo = (Models_EncuestaModelRealmProxy.EncuestaModelColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaModel.class);
            return clazz.cast(io.realm.Models_EncuestaModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.EncuestaModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            Models_OpcionesPreguntaModelRealmProxy.OpcionesPreguntaModelColumnInfo columnInfo = (Models_OpcionesPreguntaModelRealmProxy.OpcionesPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.OpcionesPreguntaModel.class);
            return clazz.cast(io.realm.Models_OpcionesPreguntaModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.OpcionesPreguntaModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.LoginModel.class)) {
            Models_LoginModelRealmProxy.LoginModelColumnInfo columnInfo = (Models_LoginModelRealmProxy.LoginModelColumnInfo) realm.getSchema().getColumnInfo(Models.LoginModel.class);
            return clazz.cast(io.realm.Models_LoginModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.LoginModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            Models_TipoPreguntaModelRealmProxy.TipoPreguntaModelColumnInfo columnInfo = (Models_TipoPreguntaModelRealmProxy.TipoPreguntaModelColumnInfo) realm.getSchema().getColumnInfo(Models.TipoPreguntaModel.class);
            return clazz.cast(io.realm.Models_TipoPreguntaModelRealmProxy.copyOrUpdate(realm, columnInfo, (Models.TipoPreguntaModel) obj, update, cache, flags));
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            Models_EncuestaBORealmProxy.EncuestaBOColumnInfo columnInfo = (Models_EncuestaBORealmProxy.EncuestaBOColumnInfo) realm.getSchema().getColumnInfo(Models.EncuestaBO.class);
            return clazz.cast(io.realm.Models_EncuestaBORealmProxy.copyOrUpdate(realm, columnInfo, (Models.EncuestaBO) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(Models.PreguntaModel.class)) {
            io.realm.Models_PreguntaModelRealmProxy.insert(realm, (Models.PreguntaModel) object, cache);
        } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
            io.realm.Models_EncuestaRespuestasRealmProxy.insert(realm, (Models.EncuestaRespuestas) object, cache);
        } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
            io.realm.Models_EncuestaSelectModelRealmProxy.insert(realm, (Models.EncuestaSelectModel) object, cache);
        } else if (clazz.equals(Models.EncuestaModel.class)) {
            io.realm.Models_EncuestaModelRealmProxy.insert(realm, (Models.EncuestaModel) object, cache);
        } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            io.realm.Models_OpcionesPreguntaModelRealmProxy.insert(realm, (Models.OpcionesPreguntaModel) object, cache);
        } else if (clazz.equals(Models.LoginModel.class)) {
            io.realm.Models_LoginModelRealmProxy.insert(realm, (Models.LoginModel) object, cache);
        } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
            io.realm.Models_TipoPreguntaModelRealmProxy.insert(realm, (Models.TipoPreguntaModel) object, cache);
        } else if (clazz.equals(Models.EncuestaBO.class)) {
            io.realm.Models_EncuestaBORealmProxy.insert(realm, (Models.EncuestaBO) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(Models.PreguntaModel.class)) {
                io.realm.Models_PreguntaModelRealmProxy.insert(realm, (Models.PreguntaModel) object, cache);
            } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
                io.realm.Models_EncuestaRespuestasRealmProxy.insert(realm, (Models.EncuestaRespuestas) object, cache);
            } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
                io.realm.Models_EncuestaSelectModelRealmProxy.insert(realm, (Models.EncuestaSelectModel) object, cache);
            } else if (clazz.equals(Models.EncuestaModel.class)) {
                io.realm.Models_EncuestaModelRealmProxy.insert(realm, (Models.EncuestaModel) object, cache);
            } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
                io.realm.Models_OpcionesPreguntaModelRealmProxy.insert(realm, (Models.OpcionesPreguntaModel) object, cache);
            } else if (clazz.equals(Models.LoginModel.class)) {
                io.realm.Models_LoginModelRealmProxy.insert(realm, (Models.LoginModel) object, cache);
            } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
                io.realm.Models_TipoPreguntaModelRealmProxy.insert(realm, (Models.TipoPreguntaModel) object, cache);
            } else if (clazz.equals(Models.EncuestaBO.class)) {
                io.realm.Models_EncuestaBORealmProxy.insert(realm, (Models.EncuestaBO) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(Models.PreguntaModel.class)) {
                    io.realm.Models_PreguntaModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
                    io.realm.Models_EncuestaRespuestasRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
                    io.realm.Models_EncuestaSelectModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaModel.class)) {
                    io.realm.Models_EncuestaModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
                    io.realm.Models_OpcionesPreguntaModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.LoginModel.class)) {
                    io.realm.Models_LoginModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
                    io.realm.Models_TipoPreguntaModelRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaBO.class)) {
                    io.realm.Models_EncuestaBORealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(Models.PreguntaModel.class)) {
            io.realm.Models_PreguntaModelRealmProxy.insertOrUpdate(realm, (Models.PreguntaModel) obj, cache);
        } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
            io.realm.Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, (Models.EncuestaRespuestas) obj, cache);
        } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
            io.realm.Models_EncuestaSelectModelRealmProxy.insertOrUpdate(realm, (Models.EncuestaSelectModel) obj, cache);
        } else if (clazz.equals(Models.EncuestaModel.class)) {
            io.realm.Models_EncuestaModelRealmProxy.insertOrUpdate(realm, (Models.EncuestaModel) obj, cache);
        } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            io.realm.Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, (Models.OpcionesPreguntaModel) obj, cache);
        } else if (clazz.equals(Models.LoginModel.class)) {
            io.realm.Models_LoginModelRealmProxy.insertOrUpdate(realm, (Models.LoginModel) obj, cache);
        } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
            io.realm.Models_TipoPreguntaModelRealmProxy.insertOrUpdate(realm, (Models.TipoPreguntaModel) obj, cache);
        } else if (clazz.equals(Models.EncuestaBO.class)) {
            io.realm.Models_EncuestaBORealmProxy.insertOrUpdate(realm, (Models.EncuestaBO) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(Models.PreguntaModel.class)) {
                io.realm.Models_PreguntaModelRealmProxy.insertOrUpdate(realm, (Models.PreguntaModel) object, cache);
            } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
                io.realm.Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, (Models.EncuestaRespuestas) object, cache);
            } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
                io.realm.Models_EncuestaSelectModelRealmProxy.insertOrUpdate(realm, (Models.EncuestaSelectModel) object, cache);
            } else if (clazz.equals(Models.EncuestaModel.class)) {
                io.realm.Models_EncuestaModelRealmProxy.insertOrUpdate(realm, (Models.EncuestaModel) object, cache);
            } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
                io.realm.Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, (Models.OpcionesPreguntaModel) object, cache);
            } else if (clazz.equals(Models.LoginModel.class)) {
                io.realm.Models_LoginModelRealmProxy.insertOrUpdate(realm, (Models.LoginModel) object, cache);
            } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
                io.realm.Models_TipoPreguntaModelRealmProxy.insertOrUpdate(realm, (Models.TipoPreguntaModel) object, cache);
            } else if (clazz.equals(Models.EncuestaBO.class)) {
                io.realm.Models_EncuestaBORealmProxy.insertOrUpdate(realm, (Models.EncuestaBO) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(Models.PreguntaModel.class)) {
                    io.realm.Models_PreguntaModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaRespuestas.class)) {
                    io.realm.Models_EncuestaRespuestasRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaSelectModel.class)) {
                    io.realm.Models_EncuestaSelectModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaModel.class)) {
                    io.realm.Models_EncuestaModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
                    io.realm.Models_OpcionesPreguntaModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.LoginModel.class)) {
                    io.realm.Models_LoginModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.TipoPreguntaModel.class)) {
                    io.realm.Models_TipoPreguntaModelRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(Models.EncuestaBO.class)) {
                    io.realm.Models_EncuestaBORealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(Models.PreguntaModel.class)) {
            return clazz.cast(io.realm.Models_PreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            return clazz.cast(io.realm.Models_EncuestaRespuestasRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaSelectModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_OpcionesPreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.LoginModel.class)) {
            return clazz.cast(io.realm.Models_LoginModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_TipoPreguntaModelRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            return clazz.cast(io.realm.Models_EncuestaBORealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(Models.PreguntaModel.class)) {
            return clazz.cast(io.realm.Models_PreguntaModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            return clazz.cast(io.realm.Models_EncuestaRespuestasRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaSelectModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_OpcionesPreguntaModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.LoginModel.class)) {
            return clazz.cast(io.realm.Models_LoginModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_TipoPreguntaModelRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            return clazz.cast(io.realm.Models_EncuestaBORealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(Models.PreguntaModel.class)) {
            return clazz.cast(io.realm.Models_PreguntaModelRealmProxy.createDetachedCopy((Models.PreguntaModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.EncuestaRespuestas.class)) {
            return clazz.cast(io.realm.Models_EncuestaRespuestasRealmProxy.createDetachedCopy((Models.EncuestaRespuestas) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.EncuestaSelectModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaSelectModelRealmProxy.createDetachedCopy((Models.EncuestaSelectModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.EncuestaModel.class)) {
            return clazz.cast(io.realm.Models_EncuestaModelRealmProxy.createDetachedCopy((Models.EncuestaModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.OpcionesPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_OpcionesPreguntaModelRealmProxy.createDetachedCopy((Models.OpcionesPreguntaModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.LoginModel.class)) {
            return clazz.cast(io.realm.Models_LoginModelRealmProxy.createDetachedCopy((Models.LoginModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.TipoPreguntaModel.class)) {
            return clazz.cast(io.realm.Models_TipoPreguntaModelRealmProxy.createDetachedCopy((Models.TipoPreguntaModel) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(Models.EncuestaBO.class)) {
            return clazz.cast(io.realm.Models_EncuestaBORealmProxy.createDetachedCopy((Models.EncuestaBO) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

}
