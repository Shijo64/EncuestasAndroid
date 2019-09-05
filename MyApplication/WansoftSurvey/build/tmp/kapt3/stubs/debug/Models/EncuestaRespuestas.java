package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020\bH\u0016J\u0006\u0010,\u001a\u00020\bJ\u0018\u0010-\u001a\u00020.2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\bH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\n\"\u0004\b\u0016\u0010\fR\u001a\u0010\u0017\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\n\"\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\n\"\u0004\b\u001c\u0010\fR\u001a\u0010\u001d\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\n\"\u0004\b\u001f\u0010\fR\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u00061"}, d2 = {"LModels/EncuestaRespuestas;", "Lio/realm/RealmObject;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "Id", "", "getId", "()I", "setId", "(I)V", "arrayRespuestas", "Lio/realm/RealmList;", "", "getArrayRespuestas", "()Lio/realm/RealmList;", "setArrayRespuestas", "(Lio/realm/RealmList;)V", "idEncuesta", "getIdEncuesta", "setIdEncuesta", "idEncuestaBO", "getIdEncuestaBO", "setIdEncuestaBO", "idPregunta", "getIdPregunta", "setIdPregunta", "numeroPregunta", "getNumeroPregunta", "setNumeroPregunta", "respondida", "", "getRespondida", "()Z", "setRespondida", "(Z)V", "respuesta", "getRespuesta", "()Ljava/lang/String;", "setRespuesta", "(Ljava/lang/String;)V", "describeContents", "idIncrement", "writeToParcel", "", "flags", "CREATOR", "WansoftSurvey_debug"})
public class EncuestaRespuestas extends io.realm.RealmObject implements android.os.Parcelable {
    private int Id;
    private int idEncuestaBO;
    private int idEncuesta;
    private int idPregunta;
    private int numeroPregunta;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String respuesta;
    private boolean respondida;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<java.lang.String> arrayRespuestas;
    public static final Models.EncuestaRespuestas.CREATOR CREATOR = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getIdEncuestaBO() {
        return 0;
    }
    
    public final void setIdEncuestaBO(int p0) {
    }
    
    public final int getIdEncuesta() {
        return 0;
    }
    
    public final void setIdEncuesta(int p0) {
    }
    
    public final int getIdPregunta() {
        return 0;
    }
    
    public final void setIdPregunta(int p0) {
    }
    
    public final int getNumeroPregunta() {
        return 0;
    }
    
    public final void setNumeroPregunta(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRespuesta() {
        return null;
    }
    
    public final void setRespuesta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getRespondida() {
        return false;
    }
    
    public final void setRespondida(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<java.lang.String> getArrayRespuestas() {
        return null;
    }
    
    public final void setArrayRespuestas(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<java.lang.String> p0) {
    }
    
    public final int idIncrement() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public EncuestaRespuestas() {
        super();
    }
    
    public EncuestaRespuestas(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"LModels/EncuestaRespuestas$CREATOR;", "Landroid/os/Parcelable$Creator;", "LModels/EncuestaRespuestas;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[LModels/EncuestaRespuestas;", "WansoftSurvey_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<Models.EncuestaRespuestas> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public Models.EncuestaRespuestas createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public Models.EncuestaRespuestas[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}