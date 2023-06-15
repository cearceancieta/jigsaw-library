package com.ceaa.jigsawlibrary.controllers;

import java.util.Map;

public record Error(ErrorCode code, String message, Map<String, String> details) {
    public Error(ErrorCode code, String message) {
        this(code, message, null);
    }
}
