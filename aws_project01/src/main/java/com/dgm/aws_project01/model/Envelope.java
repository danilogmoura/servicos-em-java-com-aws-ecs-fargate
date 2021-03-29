package com.dgm.aws_project01.model;

import com.dgm.aws_project01.enums.EventType;
import lombok.Data;

@Data
public class Envelope {

    private EventType eventType;
    
    private String data;
}
