package DataManager;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bJ\u0014\u0010\n\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0010J*\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\b\u00a8\u0006\u0014"}, d2 = {"LDataManager/DataManager;", "", "()V", "deleteEncuestaPendiente", "", "encuesta", "LModels/EncuestaBO;", "callback", "Lkotlin/Function1;", "", "guardarEncuestas", "encuestas", "", "LModels/EncuestaModel;", "guardarLogin", "login", "LModels/LoginModel;", "context", "Landroid/content/Context;", "LModels/LoginResponseClass;", "WansoftSurvey_debug"})
public final class DataManager {
    
    public final void login(@org.jetbrains.annotations.NotNull()
    Models.LoginModel login, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super Models.LoginResponseClass, kotlin.Unit> callback) {
    }
    
    public final void guardarLogin(@org.jetbrains.annotations.NotNull()
    Models.LoginModel login) {
    }
    
    public final void guardarEncuestas(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.EncuestaModel> encuestas) {
    }
    
    public final void deleteEncuestaPendiente(@org.jetbrains.annotations.NotNull()
    Models.EncuestaBO encuesta, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> callback) {
    }
    
    public DataManager() {
        super();
    }
}