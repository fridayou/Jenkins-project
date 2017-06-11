package com.friday;

import org.springframework.stereotype.Service;

@Service
public class AboutService {

    public String convert(String src) {
        return src + src;
    }
}
