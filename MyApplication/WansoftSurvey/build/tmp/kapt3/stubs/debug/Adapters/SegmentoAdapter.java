package Adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010$\u001a\u00020\u001bH\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u001bH\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001bH\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u00a8\u0006."}, d2 = {"LAdapters/SegmentoAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "LAdapters/SegmentoAdapter$ViewHolder;", "context", "Landroid/content/Context;", "opcionSeleccionada", "", "opciones", "", "LModels/OpcionesPreguntaModel;", "listener", "LHelpers/TablaListener;", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;LHelpers/TablaListener;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getListener", "()LHelpers/TablaListener;", "setListener", "(LHelpers/TablaListener;)V", "mPosition", "", "getMPosition", "()I", "setMPosition", "(I)V", "getOpcionSeleccionada", "()Ljava/lang/String;", "setOpcionSeleccionada", "(Ljava/lang/String;)V", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "WansoftSurvey_debug"})
public final class SegmentoAdapter extends android.support.v7.widget.RecyclerView.Adapter<Adapters.SegmentoAdapter.ViewHolder> {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<? extends Models.OpcionesPreguntaModel> items;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String opcionSeleccionada;
    @org.jetbrains.annotations.Nullable()
    private android.content.Context context;
    private int mPosition;
    @org.jetbrains.annotations.NotNull()
    private Helpers.TablaListener listener;
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<Models.OpcionesPreguntaModel> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends Models.OpcionesPreguntaModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOpcionSeleccionada() {
        return null;
    }
    
    public final void setOpcionSeleccionada(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.Nullable()
    android.content.Context p0) {
    }
    
    public final int getMPosition() {
        return 0;
    }
    
    public final void setMPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public Adapters.SegmentoAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    Adapters.SegmentoAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final Helpers.TablaListener getListener() {
        return null;
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    Helpers.TablaListener p0) {
    }
    
    public SegmentoAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String opcionSeleccionada, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.OpcionesPreguntaModel> opciones, @org.jetbrains.annotations.NotNull()
    Helpers.TablaListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\bH\u0016R\u0019\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006$"}, d2 = {"LAdapters/SegmentoAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "opcionSeleccionada", "", "vista", "Landroid/view/View;", "listener", "LHelpers/TablaListener;", "mPosition", "", "(Landroid/content/Context;Ljava/lang/String;Landroid/view/View;LHelpers/TablaListener;I)V", "checkbox", "Landroid/widget/CheckBox;", "kotlin.jvm.PlatformType", "getCheckbox", "()Landroid/widget/CheckBox;", "getListener", "()LHelpers/TablaListener;", "setListener", "(LHelpers/TablaListener;)V", "nombre", "Landroid/widget/TextView;", "getNombre", "()Landroid/widget/TextView;", "setNombre", "(Landroid/widget/TextView;)V", "getVista", "()Landroid/view/View;", "setVista", "(Landroid/view/View;)V", "onClick", "", "v", "WansoftSurvey_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
        @org.jetbrains.annotations.NotNull()
        private android.view.View vista;
        @org.jetbrains.annotations.Nullable()
        private android.widget.TextView nombre;
        @org.jetbrains.annotations.Nullable()
        private Helpers.TablaListener listener;
        private final android.widget.CheckBox checkbox = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.view.View getVista() {
            return null;
        }
        
        public final void setVista(@org.jetbrains.annotations.NotNull()
        android.view.View p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.widget.TextView getNombre() {
            return null;
        }
        
        public final void setNombre(@org.jetbrains.annotations.Nullable()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final Helpers.TablaListener getListener() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.Nullable()
        Helpers.TablaListener p0) {
        }
        
        public final android.widget.CheckBox getCheckbox() {
            return null;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        android.view.View v) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String opcionSeleccionada, @org.jetbrains.annotations.NotNull()
        android.view.View vista, @org.jetbrains.annotations.NotNull()
        Helpers.TablaListener listener, int mPosition) {
            super(null);
        }
    }
}