package com.example.myapplication;

import java.lang.System;

/**
 * * A login screen that offers login via email/password.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lcom/example/myapplication/LoginActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "dialog", "Landroid/support/v7/app/AlertDialog;", "getDialog", "()Landroid/support/v7/app/AlertDialog;", "setDialog", "(Landroid/support/v7/app/AlertDialog;)V", "login", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "AsyncLogin", "app_debug"})
public final class LoginActivity extends android.support.v7.app.AppCompatActivity {
    
    /**
     * * Keep track of the login task to ensure we can cancel it if requested.
     */
    @org.jetbrains.annotations.NotNull()
    public android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    public android.support.v7.app.AlertDialog dialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.support.v7.app.AlertDialog getDialog() {
        return null;
    }
    
    public final void setDialog(@org.jetbrains.annotations.NotNull()
    android.support.v7.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void login() {
    }
    
    public LoginActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\r\"\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0010H\u0014R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lcom/example/myapplication/LoginActivity$AsyncLogin;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "(Lcom/example/myapplication/LoginActivity;)V", "callback", "getCallback", "()Ljava/lang/Boolean;", "setCallback", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "doInBackground", "params", "", "([Ljava/lang/Void;)Ljava/lang/Boolean;", "onPostExecute", "", "result", "onPreExecute", "app_debug"})
    public final class AsyncLogin extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Boolean> {
        @org.jetbrains.annotations.Nullable()
        private java.lang.Boolean callback;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Boolean getCallback() {
            return null;
        }
        
        public final void setCallback(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean p0) {
        }
        
        @java.lang.Override()
        protected void onPreExecute() {
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected java.lang.Boolean doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.Void... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.Nullable()
        java.lang.Boolean result) {
        }
        
        public AsyncLogin() {
            super();
        }
    }
}