package com.friday;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;


public class ModelTest {

    @Test
    public void should_get() throws IOException {

        String content = "{\n" +
                "  \"message\": \"Test Message\",\n" +
                "  \"status\": true,\n" +
                "  \"users\": {\n" +
                "    \"user_xy\": [\n" +
                "      {\n" +
                "        \"time\": \"2016-08-25 19:01:20.944614158 +0300 EEST\",\n" +
                "        \"age\": 24,\n" +
                "        \"props\": {\n" +
                "          \"pr1\": 197,\n" +
                "          \"pr2\": 0.75,\n" +
                "          \"pr3\": 0.14,\n" +
                "          \"pr4\": -0.97\n" +
                "        }\n" +
                "      }\n" +
                "    ],\n" +
                "    \"user_zt\": [\n" +
                "      {\n" +
                "        \"time\": \"2016-08-25 17:08:36.920891187 +0300 EEST\",\n" +
                "        \"age\": 29,\n" +
                "        \"props\": {\n" +
                "          \"pr1\": 1.2332131860505051,\n" +
                "          \"pr2\": -0.6628148829634317,\n" +
                "          \"pr3\": -0.11622442112006928\n" +
                "        }\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        ObjectMapper mapper = new ObjectMapper();

       Details details = mapper.readValue(content, Details.class);

       String test = mapper.writeValueAsString(details);

       assertNotNull(test);

    }

}