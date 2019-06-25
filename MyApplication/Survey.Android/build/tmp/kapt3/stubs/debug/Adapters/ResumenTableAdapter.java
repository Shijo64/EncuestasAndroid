package Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001cH\u0016J\u0018\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018\u00a8\u0006&"}, d2 = {"LAdapters/ResumenTableAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "LAdapters/ResumenTableAdapter$ViewHolder;", "context", "Landroid/content/Context;", "preguntas", "", "LModels/PreguntaModel;", "respuestas", "LModels/EncuestaRespuestas;", "listener", "LHelpers/ResumenTablaListener;", "(Landroid/content/Context;Ljava/util/List;Ljava/util/List;LHelpers/ResumenTablaListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getListener", "()LHelpers/ResumenTablaListener;", "setListener", "(LHelpers/ResumenTablaListener;)V", "getPreguntas", "()Ljava/util/List;", "setPreguntas", "(Ljava/util/List;)V", "getRespuestas", "setRespuestas", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ResumenTableAdapter extends android.support.v7.widget.RecyclerView.Adapter<Adapters.ResumenTableAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends Models.EncuestaRespuestas> respuestas;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends Models.PreguntaModel> preguntas;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private Helpers.ResumenTablaListener listener;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<Models.EncuestaRespuestas> getRespuestas() {
        return null;
    }
    
    public final void setRespuestas(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends Models.EncuestaRespuestas> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<Models.PreguntaModel> getPreguntas() {
        return null;
    }
    
    public final void setPreguntas(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends Models.PreguntaModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public Adapters.ResumenTableAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    Adapters.ResumenTableAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Helpers.ResumenTablaListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    Helpers.ResumenTablaListener p0) {
    }
    
    public ResumenTableAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.PreguntaModel> preguntas, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.EncuestaRespuestas> respuestas, @org.jetbrains.annotations.NotNull()
    Helpers.ResumenTablaListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"LAdapters/ResumenTableAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "vista", "Landroid/view/View;", "listener", "LHelpers/ResumenTablaListener;", "(Landroid/content/Context;Landroid/view/View;LHelpers/ResumenTablaListener;)V", "pregunta", "Landroid/widget/TextView;", "getPregunta", "()Landroid/widget/TextView;", "setPregunta", "(Landroid/widget/TextView;)V", "respuesta", "getRespuesta", "setRespuesta", "getVista", "()Landroid/view/View;", "setVista", "(Landroid/view/View;)V", "onClick", "", "v", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.view.View vista;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView pregunta;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView respuesta;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getVista() {
            return null;
        }
        
        public final void setVista(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getPregunta() {
            return null;
        }
        
        public final void setPregunta(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getRespuesta() {
            return null;
        }
        
        public final void setRespuesta(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.view.View vista, @org.jetbrains.annotations.NotNull()
        Helpers.ResumenTablaListener listener) {
            super(null);
        }
    }
}