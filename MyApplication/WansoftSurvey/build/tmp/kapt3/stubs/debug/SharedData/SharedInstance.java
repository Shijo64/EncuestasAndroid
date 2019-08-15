package SharedData;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006$"}, d2 = {"LSharedData/SharedInstance;", "", "()V", "codigoOpcional", "", "getCodigoOpcional", "()Z", "setCodigoOpcional", "(Z)V", "fechaOrden", "Ljava/util/Date;", "getFechaOrden", "()Ljava/util/Date;", "setFechaOrden", "(Ljava/util/Date;)V", "fechaSeleccionada", "getFechaSeleccionada", "setFechaSeleccionada", "numeroOrden", "", "getNumeroOrden", "()Ljava/lang/String;", "setNumeroOrden", "(Ljava/lang/String;)V", "realmInstance", "Lio/realm/Realm;", "kotlin.jvm.PlatformType", "getRealmInstance", "()Lio/realm/Realm;", "respuestas", "", "LModels/EncuestaRespuestas;", "getRespuestas", "()Ljava/util/List;", "setRespuestas", "(Ljava/util/List;)V", "WansoftSurvey_debug"})
public final class SharedInstance {
    private static final io.realm.Realm realmInstance = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<Models.EncuestaRespuestas> respuestas;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String numeroOrden;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Date fechaOrden;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Date fechaSeleccionada;
    private static boolean codigoOpcional;
    public static final SharedData.SharedInstance INSTANCE = null;
    
    public final io.realm.Realm getRealmInstance() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Models.EncuestaRespuestas> getRespuestas() {
        return null;
    }
    
    public final void setRespuestas(@org.jetbrains.annotations.NotNull()
    java.util.List<Models.EncuestaRespuestas> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumeroOrden() {
        return null;
    }
    
    public final void setNumeroOrden(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFechaOrden() {
        return null;
    }
    
    public final void setFechaOrden(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFechaSeleccionada() {
        return null;
    }
    
    public final void setFechaSeleccionada(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final boolean getCodigoOpcional() {
        return false;
    }
    
    public final void setCodigoOpcional(boolean p0) {
    }
    
    private SharedInstance() {
        super();
    }
}