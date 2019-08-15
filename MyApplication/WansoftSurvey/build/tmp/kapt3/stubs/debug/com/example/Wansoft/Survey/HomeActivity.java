package com.example.Wansoft.Survey;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u0012\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001eJ\u000e\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020\u001eJ\"\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010)H\u0015J\b\u0010*\u001a\u00020\u001eH\u0016J\u0012\u0010+\u001a\u00020\u001e2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020/2\u0006\u00103\u001a\u000204H\u0016J\b\u00106\u001a\u00020\u001eH\u0014J\b\u00107\u001a\u00020\u001eH\u0014J\b\u00108\u001a\u00020\u001eH\u0014J\u000e\u00109\u001a\u00020\u001e2\u0006\u0010:\u001a\u00020;R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006<"}, d2 = {"Lcom/example/Wansoft/Survey/HomeActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/support/design/widget/NavigationView$OnNavigationItemSelectedListener;", "()V", "datePicker", "Landroid/app/DatePickerDialog;", "getDatePicker", "()Landroid/app/DatePickerDialog;", "setDatePicker", "(Landroid/app/DatePickerDialog;)V", "encuestaSeleccionada", "LModels/EncuestaModel;", "getEncuestaSeleccionada", "()LModels/EncuestaModel;", "setEncuestaSeleccionada", "(LModels/EncuestaModel;)V", "encuestasGuardadas", "", "getEncuestasGuardadas", "()Ljava/util/List;", "setEncuestasGuardadas", "(Ljava/util/List;)V", "inputName", "Landroid/widget/EditText;", "getInputName", "()Landroid/widget/EditText;", "setInputName", "(Landroid/widget/EditText;)V", "getCurrentDate", "Ljava/util/Calendar;", "", "getEncuestasPendientes", "hideKeyboard", "activity", "Landroid/app/Activity;", "logout", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onOptionsItemSelected", "onPause", "onRestart", "onResume", "showDatePicker", "view", "Landroid/view/View;", "WansoftSurvey_debug"})
public final class HomeActivity extends android.support.v7.app.AppCompatActivity implements android.support.design.widget.NavigationView.OnNavigationItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends Models.EncuestaModel> encuestasGuardadas;
    @org.jetbrains.annotations.Nullable()
    private Models.EncuestaModel encuestaSeleccionada;
    @org.jetbrains.annotations.Nullable()
    private android.app.DatePickerDialog datePicker;
    @org.jetbrains.annotations.Nullable()
    private android.widget.EditText inputName;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<Models.EncuestaModel> getEncuestasGuardadas() {
        return null;
    }
    
    public final void setEncuestasGuardadas(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends Models.EncuestaModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final Models.EncuestaModel getEncuestaSeleccionada() {
        return null;
    }
    
    public final void setEncuestaSeleccionada(@org.jetbrains.annotations.Nullable()
    Models.EncuestaModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.app.DatePickerDialog getDatePicker() {
        return null;
    }
    
    public final void setDatePicker(@org.jetbrains.annotations.Nullable()
    android.app.DatePickerDialog p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.EditText getInputName() {
        return null;
    }
    
    public final void setInputName(@org.jetbrains.annotations.Nullable()
    android.widget.EditText p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onRestart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Calendar getCurrentDate() {
        return null;
    }
    
    public final void showDatePicker(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void getEncuestasPendientes() {
    }
    
    @java.lang.Override()
    @android.support.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void getEncuestasGuardadas() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void logout() {
    }
    
    public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    public HomeActivity() {
        super();
    }
}