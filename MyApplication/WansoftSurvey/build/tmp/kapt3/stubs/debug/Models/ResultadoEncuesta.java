package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001e\u0010\u0018\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001e\u0010\u001e\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR$\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*\u00a8\u0006+"}, d2 = {"LModels/ResultadoEncuesta;", "", "()V", "CodigoEncuesta", "", "getCodigoEncuesta", "()Ljava/lang/String;", "setCodigoEncuesta", "(Ljava/lang/String;)V", "EncuestaId", "", "getEncuestaId", "()I", "setEncuestaId", "(I)V", "FechaOperacion", "Ljava/util/Date;", "getFechaOperacion", "()Ljava/util/Date;", "setFechaOperacion", "(Ljava/util/Date;)V", "FechaOrden", "getFechaOrden", "setFechaOrden", "FechaRegistro", "getFechaRegistro", "setFechaRegistro", "Id", "getId", "setId", "Orden", "getOrden", "setOrden", "nombreEncuesta", "getNombreEncuesta", "setNombreEncuesta", "respuestas", "", "LModels/DetalleResultadoEncuesta;", "getRespuestas", "()Ljava/util/List;", "setRespuestas", "(Ljava/util/List;)V", "WansoftSurvey_debug"})
public final class ResultadoEncuesta {
    @com.google.gson.annotations.SerializedName(value = "Id")
    private int Id;
    @com.google.gson.annotations.SerializedName(value = "Order")
    private int Orden;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SurveyCode")
    private java.lang.String CodigoEncuesta;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "OperationDate")
    private java.util.Date FechaOperacion;
    @com.google.gson.annotations.SerializedName(value = "SurveyId")
    private int EncuestaId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "RegistrationDate")
    private java.util.Date FechaRegistro;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "OrderDate")
    private java.util.Date FechaOrden;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "SurveyDetailResultList")
    private java.util.List<Models.DetalleResultadoEncuesta> respuestas;
    @org.jetbrains.annotations.NotNull()
    private transient java.lang.String nombreEncuesta;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getOrden() {
        return 0;
    }
    
    public final void setOrden(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodigoEncuesta() {
        return null;
    }
    
    public final void setCodigoEncuesta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFechaOperacion() {
        return null;
    }
    
    public final void setFechaOperacion(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    public final int getEncuestaId() {
        return 0;
    }
    
    public final void setEncuestaId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFechaRegistro() {
        return null;
    }
    
    public final void setFechaRegistro(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getFechaOrden() {
        return null;
    }
    
    public final void setFechaOrden(@org.jetbrains.annotations.NotNull()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Models.DetalleResultadoEncuesta> getRespuestas() {
        return null;
    }
    
    public final void setRespuestas(@org.jetbrains.annotations.NotNull()
    java.util.List<Models.DetalleResultadoEncuesta> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombreEncuesta() {
        return null;
    }
    
    public final void setNombreEncuesta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ResultadoEncuesta() {
        super();
    }
}