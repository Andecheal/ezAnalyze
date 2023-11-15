package com.ezana.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @version 0.0.1
 * @descreption: TODO
 * @author: Andecheal
 * @date 2023/11/16 0:07
 **/
public class JsonUtil {

    private final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    private JsonUtil(){
    }

    public static String toJson(Object o) {
        try {
            return  OBJECT_MAPPER.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }


}
