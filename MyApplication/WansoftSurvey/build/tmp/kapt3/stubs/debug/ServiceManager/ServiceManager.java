package ServiceManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rJ*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\rJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\u0015"}, d2 = {"LServiceManager/ServiceManager;", "", "()V", "enviarEncuesta", "", "encuesta", "LModels/EncuestaBO;", "respuestas", "", "LModels/EncuestaRespuestas;", "context", "Landroid/content/Context;", "callback", "Lkotlin/Function1;", "Lorg/json/JSONObject;", "getEncuestas", "login", "LModels/LoginModel;", "LModels/LoginResponseClass;", "loginNuevo", "", "WansoftSurvey_debug"})
public final class ServiceManager {
    
    public final void getEncuestas(@org.jetbrains.annotations.NotNull()
    Models.LoginModel login, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super Models.LoginResponseClass, kotlin.Unit> callback) {
    }
    
    public final boolean loginNuevo(@org.jetbrains.annotations.NotNull()
    Models.LoginModel login, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void enviarEncuesta(@org.jetbrains.annotations.NotNull()
    Models.EncuestaBO encuesta, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.EncuestaRespuestas> respuestas, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super org.json.JSONObject, kotlin.Unit> callback) {
    }
    
    public ServiceManager() {
        super();
    }
}