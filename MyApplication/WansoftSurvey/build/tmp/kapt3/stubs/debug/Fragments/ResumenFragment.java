package Fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R.\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u0017\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR.\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0016j\n\u0012\u0004\u0012\u00020\u001e\u0018\u0001`\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c\u00a8\u0006+"}, d2 = {"LFragments/ResumenFragment;", "Landroid/support/v4/app/Fragment;", "()V", "adaptador", "LAdapters/ResumenTableAdapter;", "getAdaptador", "()LAdapters/ResumenTableAdapter;", "setAdaptador", "(LAdapters/ResumenTableAdapter;)V", "encuesta", "LModels/EncuestaModel;", "getEncuesta", "()LModels/EncuestaModel;", "setEncuesta", "(LModels/EncuestaModel;)V", "layoutManager", "Landroid/support/v7/widget/RecyclerView$LayoutManager;", "getLayoutManager", "()Landroid/support/v7/widget/RecyclerView$LayoutManager;", "setLayoutManager", "(Landroid/support/v7/widget/RecyclerView$LayoutManager;)V", "preguntas", "Ljava/util/ArrayList;", "LModels/PreguntaModel;", "Lkotlin/collections/ArrayList;", "getPreguntas", "()Ljava/util/ArrayList;", "setPreguntas", "(Ljava/util/ArrayList;)V", "respuestas", "LModels/EncuestaRespuestas;", "getRespuestas", "setRespuestas", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "WansoftSurvey_debug"})
public final class ResumenFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private Adapters.ResumenTableAdapter adaptador;
    @org.jetbrains.annotations.Nullable()
    private android.support.v7.widget.RecyclerView.LayoutManager layoutManager;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<Models.EncuestaRespuestas> respuestas;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<Models.PreguntaModel> preguntas;
    @org.jetbrains.annotations.Nullable()
    private Models.EncuestaModel encuesta;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final Adapters.ResumenTableAdapter getAdaptador() {
        return null;
    }
    
    public final void setAdaptador(@org.jetbrains.annotations.Nullable()
    Adapters.ResumenTableAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v7.widget.RecyclerView.LayoutManager getLayoutManager() {
        return null;
    }
    
    public final void setLayoutManager(@org.jetbrains.annotations.Nullable()
    android.support.v7.widget.RecyclerView.LayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<Models.EncuestaRespuestas> getRespuestas() {
        return null;
    }
    
    public final void setRespuestas(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<Models.EncuestaRespuestas> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<Models.PreguntaModel> getPreguntas() {
        return null;
    }
    
    public final void setPreguntas(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<Models.PreguntaModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final Models.EncuestaModel getEncuesta() {
        return null;
    }
    
    public final void setEncuesta(@org.jetbrains.annotations.Nullable()
    Models.EncuestaModel p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public ResumenFragment() {
        super();
    }
}