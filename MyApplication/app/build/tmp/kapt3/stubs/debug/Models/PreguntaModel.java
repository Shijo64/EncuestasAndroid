package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010)\u001a\u00020\u0015H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0015H\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0017\"\u0004\b(\u0010\u0019\u00a8\u0006."}, d2 = {"LModels/PreguntaModel;", "Lio/realm/RealmObject;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "AnswerOptions", "Lio/realm/RealmList;", "LModels/OpcionesPreguntaModel;", "getAnswerOptions", "()Lio/realm/RealmList;", "setAnswerOptions", "(Lio/realm/RealmList;)V", "Description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "Id", "", "getId", "()I", "setId", "(I)V", "Order", "getOrder", "setOrder", "QuestionType", "LModels/TipoPreguntaModel;", "getQuestionType", "()LModels/TipoPreguntaModel;", "setQuestionType", "(LModels/TipoPreguntaModel;)V", "Status", "getStatus", "setStatus", "SurveyId", "getSurveyId", "setSurveyId", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public class PreguntaModel extends io.realm.RealmObject implements android.os.Parcelable {
    private int Id;
    private int SurveyId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Description;
    private int Order;
    private int Status;
    @org.jetbrains.annotations.Nullable()
    private Models.TipoPreguntaModel QuestionType;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<Models.OpcionesPreguntaModel> AnswerOptions;
    public static final Models.PreguntaModel.CREATOR CREATOR = null;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final int getSurveyId() {
        return 0;
    }
    
    public final void setSurveyId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getOrder() {
        return 0;
    }
    
    public final void setOrder(int p0) {
    }
    
    public final int getStatus() {
        return 0;
    }
    
    public final void setStatus(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final Models.TipoPreguntaModel getQuestionType() {
        return null;
    }
    
    public final void setQuestionType(@org.jetbrains.annotations.Nullable()
    Models.TipoPreguntaModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<Models.OpcionesPreguntaModel> getAnswerOptions() {
        return null;
    }
    
    public final void setAnswerOptions(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<Models.OpcionesPreguntaModel> p0) {
    }
    
    @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public PreguntaModel() {
        super();
    }
    
    @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public PreguntaModel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"LModels/PreguntaModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "LModels/PreguntaModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[LModels/PreguntaModel;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<Models.PreguntaModel> {
        
        @org.jetbrains.annotations.NotNull()
        @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
        @java.lang.Override()
        public Models.PreguntaModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public Models.PreguntaModel[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}