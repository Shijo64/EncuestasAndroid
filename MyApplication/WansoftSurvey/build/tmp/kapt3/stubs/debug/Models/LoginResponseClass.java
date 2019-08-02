package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2 = {"LModels/LoginResponseClass;", "", "()V", "message", "", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "messageType", "", "getMessageType", "()I", "setMessageType", "(I)V", "suerveyList", "", "LModels/EncuestaModel;", "getSuerveyList", "()Ljava/util/List;", "setSuerveyList", "(Ljava/util/List;)V", "WansoftSurvey_debug"})
public final class LoginResponseClass {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "surveyList")
    private java.util.List<Models.EncuestaModel> suerveyList;
    @com.google.gson.annotations.SerializedName(value = "MessageType")
    private int messageType;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Message")
    private java.lang.String message;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Models.EncuestaModel> getSuerveyList() {
        return null;
    }
    
    public final void setSuerveyList(@org.jetbrains.annotations.NotNull()
    java.util.List<Models.EncuestaModel> p0) {
    }
    
    public final int getMessageType() {
        return 0;
    }
    
    public final void setMessageType(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public LoginResponseClass() {
        super();
    }
}