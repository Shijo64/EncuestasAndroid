package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0006\"\u0004\b\u0012\u0010\bR\u001e\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001e\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001e\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006!"}, d2 = {"LModels/DetalleResultadoEncuesta;", "", "()V", "Id", "", "getId", "()I", "setId", "(I)V", "arrayRespuestas", "", "", "getArrayRespuestas", "()Ljava/util/List;", "setArrayRespuestas", "(Ljava/util/List;)V", "idEncuesta", "getIdEncuesta", "setIdEncuesta", "idEncuestaBO", "getIdEncuestaBO", "setIdEncuestaBO", "idPregunta", "getIdPregunta", "setIdPregunta", "numeroPregunta", "getNumeroPregunta", "setNumeroPregunta", "respuesta", "getRespuesta", "()Ljava/lang/String;", "setRespuesta", "(Ljava/lang/String;)V", "WansoftSurvey_debug"})
public class DetalleResultadoEncuesta {
    @com.google.gson.annotations.SerializedName(value = "Id")
    private int Id;
    @com.google.gson.annotations.SerializedName(value = "SurveyResultId")
    private int idEncuestaBO;
    @com.google.gson.annotations.SerializedName(value = "QuestionId")
    private int idPregunta;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Answer")
    private java.lang.String respuesta;
    private transient int numeroPregunta;
    private transient int idEncuesta;
    @org.jetbrains.annotations.NotNull()
    private transient java.util.List<java.lang.String> arrayRespuestas;
    
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
    
    public final int getIdPregunta() {
        return 0;
    }
    
    public final void setIdPregunta(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRespuesta() {
        return null;
    }
    
    public final void setRespuesta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getNumeroPregunta() {
        return 0;
    }
    
    public final void setNumeroPregunta(int p0) {
    }
    
    public final int getIdEncuesta() {
        return 0;
    }
    
    public final void setIdEncuesta(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getArrayRespuestas() {
        return null;
    }
    
    public final void setArrayRespuestas(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public DetalleResultadoEncuesta() {
        super();
    }
}