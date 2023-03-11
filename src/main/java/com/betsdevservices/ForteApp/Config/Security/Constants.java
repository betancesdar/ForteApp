package com.betsdevservices.ForteApp.Config.Security;

import java.text.SimpleDateFormat;

public class Constants {
    public static final String SECRET_KEY = "GAGWu7ypY3a4hsDqnL7KtTQ";
    public static final String TOKEN_ID = "Diamond_id_jwt";
    public static final String TOKEN_CLAIM = "authorities";
    public static final String HEADER_AUTHENTICATION = "Authorization";
    public static final String PREFIX = "Bearer ";
    public static final long TOKEN_EXPIRATION_TIME = 10_800_000;

    public static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
}
