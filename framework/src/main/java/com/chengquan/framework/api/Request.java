package com.chengquan.framework.api;

import java.util.HashMap;
import java.util.Map;

public class Request {
    public String apiName;
    public Map<String, String> params;

    private Request(Builder builder) {
        apiName = builder.apiName;
        params = builder.params;
    }

    public static final class Builder {
        private String apiName;
        private Map<String, String> params = new HashMap<>();

        public Builder() {
        }

        public Builder apiName(String name) {
            apiName = name;
            return this;
        }

        public Builder params(String key, String value) {
            params.put(key, value);
            return this;
        }

        public Builder params(Map<String, String> params) {
            if(params != null){
                for (String key : params.keySet()) {
                    this.params.put(key, params.get(key));
                }
            }
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }
}
