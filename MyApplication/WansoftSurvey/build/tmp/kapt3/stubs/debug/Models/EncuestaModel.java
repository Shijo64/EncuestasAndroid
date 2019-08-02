package Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010+\u001a\u00020\u0015H\u0016J\u0018\u0010,\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\u0015H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R \u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001e\u0010(\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b)\u0010\u0017\"\u0004\b*\u0010\u0019\u00a8\u00060"}, d2 = {"LModels/EncuestaModel;", "Lio/realm/RealmObject;", "Landroid/os/Parcelable;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "CreationDate", "Ljava/util/Date;", "getCreationDate", "()Ljava/util/Date;", "setCreationDate", "(Ljava/util/Date;)V", "Default", "", "getDefault", "()Ljava/lang/Boolean;", "setDefault", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "Id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "Questions", "Lio/realm/RealmList;", "LModels/PreguntaModel;", "getQuestions", "()Lio/realm/RealmList;", "setQuestions", "(Lio/realm/RealmList;)V", "Status", "getStatus", "setStatus", "describeContents", "writeToParcel", "", "flags", "CREATOR", "WansoftSurvey_debug"})
public class EncuestaModel extends io.realm.RealmObject implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Id;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Name;
    @org.jetbrains.annotations.Nullable()
    private java.util.Date CreationDate;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer Status;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean Default;
    @org.jetbrains.annotations.NotNull()
    private io.realm.RealmList<Models.PreguntaModel> Questions;
    public static final Models.EncuestaModel.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date getCreationDate() {
        return null;
    }
    
    public final void setCreationDate(@org.jetbrains.annotations.Nullable()
    java.util.Date p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getDefault() {
        return null;
    }
    
    public final void setDefault(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.realm.RealmList<Models.PreguntaModel> getQuestions() {
        return null;
    }
    
    public final void setQuestions(@org.jetbrains.annotations.NotNull()
    io.realm.RealmList<Models.PreguntaModel> p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public EncuestaModel() {
        super();
    }
    
    public EncuestaModel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"LModels/EncuestaModel$CREATOR;", "Landroid/os/Parcelable$Creator;", "LModels/EncuestaModel;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[LModels/EncuestaModel;", "WansoftSurvey_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<Models.EncuestaModel> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public Models.EncuestaModel createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public Models.EncuestaModel[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}