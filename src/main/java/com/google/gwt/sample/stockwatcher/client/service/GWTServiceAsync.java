/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.gwt.sample.stockwatcher.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author matheus
 */
public interface GWTServiceAsync {

    public void myMethod(String s, AsyncCallback<String> callback);
}